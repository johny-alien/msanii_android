package com.example.msanii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class talent_to_pay extends AppCompatActivity {
    private Button talent_to_payment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.talent_to_pay);
        talent_to_payment=(Button)findViewById(R.id.to_payment);
        talent_to_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(talent_to_pay.this,payment.class);
                startActivity(intent);
            }
        });

    }
}
