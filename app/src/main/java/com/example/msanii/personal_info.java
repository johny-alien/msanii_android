package com.example.msanii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class personal_info extends AppCompatActivity {
    String stringnname;
    String stringlastname;
    String stringfname;
    String stringmail;
    Integer intfone;
    Integer intage;
    String stringgen;
    String whichgender;

    EditText nname;
    EditText lastname;
    EditText fname;
    EditText mail;
    EditText fone;
    EditText age;
    AutoCompleteTextView gender;
    Button  nxt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_info);

        nname=(EditText) findViewById(R.id.nickname);
        lastname=(EditText) findViewById(R.id.lname);
        fname=(EditText) findViewById(R.id.firstname);
        mail=(EditText) findViewById(R.id.mail);
        fone=(EditText) findViewById(R.id.phone);
        age=(EditText) findViewById(R.id.eage);
        gender=(AutoCompleteTextView)findViewById(R.id.autogender);
        nxt=(Button) findViewById(R.id.pnext);
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stringnname=nname.getText().toString();
                stringlastname=lastname.getText().toString();
                stringfname=fname.getText().toString();
                stringmail=mail.getText().toString();
                intfone=Integer.parseInt(fone.getText().toString());
                intage=Integer.parseInt(age.getText().toString());

                publicinfomod publicinfo = new publicinfomod(stringnname,stringlastname,stringfname,intfone,stringmail,intage,whichgender);


                Intent addTaskIntent = new Intent(personal_info.this,MyIntentService.class);
                addTaskIntent.setAction(background.addAnEventToTheDatabase);
                addTaskIntent.putExtra("info",publicinfo);
                startService(addTaskIntent);

            }
        });
        String [] Gender = {
                "male","female","other"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_singlechoice,Gender);
        final AutoCompleteTextView genders =findViewById(R.id.autogender);
        genders.setThreshold(1);
        genders.setAdapter(adapter);

        genders.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                whichgender = String.valueOf(parent.getItemAtPosition(position));

            }
        });
    }
}
