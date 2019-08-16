package com.example.msanii;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.google.firebase.events.Event;

public class MyIntentService  extends IntentService {


    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("OnHandleIntent","The method has been called");

        background backgroundactivities = new background(this);


        String action = intent.getAction();

        if(backgroundactivities.addAnEventToTheDatabase.equals(action))
        {
            publicinfomod mine = intent.getParcelableExtra("info");
            backgroundactivities.addEventToDatabase(mine);
        }

    }


}

