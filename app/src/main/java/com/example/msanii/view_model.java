package com.example.msanii;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class view_model extends ViewModel {


    //    Trying editing the userViewModel so that it can also be used with the displaying of events
    private static final DatabaseReference USER_INFO =
            FirebaseDatabase.getInstance().getReference();

    private final live_data liveData = new live_data (USER_INFO);

    @NonNull
    public LiveData<DataSnapshot> getDataSnapshotLiveData()
    {
        return liveData;
    }
    public live_data getLiveData()
    {

        return liveData;
    }





}




