package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Settings extends AppCompatActivity {
 private Button cancel;
 private Button save;
    EditText  editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cancel = (Button) findViewById(R.id.cancel_btn);
        save= (Button) findViewById(R.id.save_btn);
         editText = findViewById(R.id.editLabel);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencaptureImage_activity();
            }


        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editText.getText().toString().isEmpty()){
                    editText.setError("Please Enter Some Text");
                }else {
                    openHomescreen_activity();
                    Toast.makeText(Settings.this, "Text Saved", Toast.LENGTH_SHORT).show();
                }
            }



        });



    }


    public void opencaptureImage_activity(){
        Intent intent = new Intent(this, Results.class);
        startActivity(intent);
    }
    public void openHomescreen_activity(){
        Intent intent = new Intent(this, Homescreen.class);
        startActivity(intent);
    }

    }
