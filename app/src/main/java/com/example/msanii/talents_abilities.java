package com.example.msanii;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class talents_abilities extends AppCompatActivity {
private CheckBox act,music,hiphop,rnb,model,vixen,meme,script;
    Boolean actor = false;
    Boolean mu = false;
    Boolean hip=false;
    Boolean rn=false;
    Boolean mo=false;
    Boolean vi=false;
    Boolean me=false;
    Boolean sc=false;

private Button Next;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.talents_abilities);
        act=findViewById(R.id.actor);
        music=findViewById(R.id.musician);
        hiphop=findViewById(R.id.hiphop);
        rnb=findViewById(R.id.rnb);
        model=findViewById(R.id.mode);
        vixen=findViewById(R.id.vixen);
        meme=findViewById(R.id.memer);
        script=findViewById(R.id.writer);
        Next=findViewById(R.id.next);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (act.isChecked())
                {
                    actor = true;
                }
                else {
                    actor=false;
                }



            }
        });



    }
}
