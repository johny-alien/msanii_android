package com.example.msanii;

import android.content.Context;
import android.util.Log;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.events.Event;

public class background {
        private Context mContext;
        public FirebaseDatabase mFirebaseDatabase;
        public DatabaseReference mref;
        public FirebaseAuth mAuth;

        public static final String addAnEventToTheDatabase = "Add event to the database";
        public background(Context context)
        {
            this.mContext = context;
        }



        public void addEventToDatabase(final publicinfomod publicinfomod)
        {
            mFirebaseDatabase = FirebaseDatabase.getInstance();
            mref = mFirebaseDatabase.getReference();


            mref.child("database").child("publicinfo").push().setValue(publicinfomod).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void aVoid)
                {
//                Event has been added
                    Log.d("Firebase","Event has been succesfully added");



                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(Exception e) {
                    Log.d("Firebase","No data added");
                }
            });


        }



}
