package com.example.a1894007.class4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {


    String name, pass;
    TextView txt_uname, txt_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);


        Intent i = getIntent();
        name = i.getStringExtra("un");
        pass = i.getStringExtra("ps");

        txt_uname = findViewById(R.id.txt_uname);
        txt_pass=findViewById(R.id.txt_pass);

        txt_uname.setText(name);
        txt_pass.setText(pass);

    }
}
