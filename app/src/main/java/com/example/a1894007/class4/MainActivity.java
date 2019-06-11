package com.example.a1894007.class4;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_uname, edt_pass;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt_uname = findViewById(R.id.edt_uname);
        edt_pass = findViewById(R.id.edt_psw);
        btn_submit = findViewById(R.id.button);

        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);


        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                alertDialog.setMessage(R.string.alert);
               // alertDialog.setMessage("demo");

                alertDialog.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        String uname, pass;
                        uname = edt_uname.getText().toString();
                        pass= edt_pass.getText().toString();

                        Intent i = new Intent(MainActivity.this,activity2.class);
                        i.putExtra("un",uname);
                        i.putExtra("ps",pass);
                        startActivity(i);



                        Toast.makeText(getApplicationContext(),uname+"thanks",Toast.LENGTH_LONG).show();


                    }
                });








        alertDialog.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
                alertDialog.show();
            }
        });

    }
}
