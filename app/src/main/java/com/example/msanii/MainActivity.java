package com.example.msanii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText getPhoneNumber;
private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPhoneNumber=(EditText) findViewById(R.id.getPhoneNumber);
        send=(Button) findViewById(R.id.send);

      send.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String phonenumber=getPhoneNumber.getText().toString();
        Intent intent=new Intent(MainActivity.this,verify.class);
        intent.putExtra("phonenumber",phonenumber);
        startActivity(intent);
    }
});
    }
}
