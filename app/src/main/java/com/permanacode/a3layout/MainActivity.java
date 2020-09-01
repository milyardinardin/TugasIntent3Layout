package com.permanacode.a3layout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button AboutMe;
    Button Gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AboutMe = (Button)findViewById(R.id.AboutMe);
        AboutMe.setOnClickListener(this);
        Gallery = (Button)findViewById(R.id.Gallery);
        Gallery.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.AboutMe:
                Intent About = new Intent(MainActivity.this, my_biodata.class);
                startActivity(About);
                break;
            case R.id.Gallery:
                Intent Gal = new Intent(MainActivity.this, my_foto.class);
                startActivity(Gal);
                break;
            default:
                break;
        }
    }
}