package com.example.msanii;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.events.Event;

import java.util.ArrayList;
import java.util.List;

public class talents_count<viewModel> extends AppCompatActivity implements clicklistener_interface{
    List<publicinfomod> talentList=new ArrayList<>();
    RecyclerView recyclerView;
    adapter talentlistadapter;
    public view_model viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.talents_count);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView = (RecyclerView) findViewById(R.id.recycletalents);
        recyclerView.setLayoutManager(linearLayoutManager);
        talentlistadapter = new adapter();
        talentlistadapter.setClickListener(this);

        recyclerView.setAdapter(talentlistadapter);
        viewModel = ViewModelProviders.of(this).get(view_model.class);
        LiveData<DataSnapshot> livedata = viewModel.getDataSnapshotLiveData();
        livedata.observe(this, new Observer<DataSnapshot>() {
            @Override
            public void onChanged(@Nullable DataSnapshot dataSnapshot) {
                DataSnapshot talentsdetails = dataSnapshot.child("database").child("events");
                Boolean exist = talentsdetails.exists();
                Log.d("Confirming", "This confirms that the datasnapshot exists " + exist);
                Iterable<DataSnapshot> eventsDatasnapshot = talentsdetails.getChildren();
                for (DataSnapshot eventsList : eventsDatasnapshot)
                {
                    publicinfomod event = new publicinfomod();
                    event = eventsList.getValue(publicinfomod.class);
                    talentList.add(event);


                }
            talentlistadapter.setDealList(talentList);
            }



        });
    }

    @Override
    public void onClick(View view, int position) {
        Log.d("position","no." + position);

    }
}

