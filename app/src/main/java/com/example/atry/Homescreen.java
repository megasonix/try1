package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class Homescreen extends AppCompatActivity {
    private Button detectcolor;
    private Button detectobject;
    public static final int CAMERA_PERMISSIONS_REQUEST = 2;
    public static final int CAMERA_IMAGE_REQUEST = 3;
    public static final String FILE_NAME = "temp.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        detectcolor =(Button) findViewById(R.id.color);
        detectobject= (Button) findViewById(R.id.object);

        detectcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           openColordetect_activity();
            }
        });

        detectobject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCaptureImage_activity();
            }
        });

    }
    public void openColordetect_activity(){
        Intent color = new Intent(this, colordetect.class);
                startActivity(color);
    }

    public void openCaptureImage_activity(){
        Intent object = new Intent(this, Results.class);
        startActivity(object);

}

}