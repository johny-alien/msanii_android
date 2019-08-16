package com.example.msanii;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class live_data extends LiveData <DataSnapshot> {

        private final Query query;
        private final MyValueEventListener listener = new MyValueEventListener();

        public live_data(Query query) {
            this.query = query;
        }

        public live_data(DatabaseReference ref) {
            this.query = ref;
        }

        @Override
        protected void onActive() {
            Log.d("FireBasseLiveData", "onActive");
            query.addValueEventListener(listener);
        }

        @Override
        protected void onInactive() {
            Log.d("FireBaseLiveData", "onInactive");
            query.removeEventListener(listener);
        }

        private class MyValueEventListener implements ValueEventListener
        {

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                setValue(dataSnapshot);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
                Log.d("FireBaseDatabase","No listening donne");
            }
        }



}
