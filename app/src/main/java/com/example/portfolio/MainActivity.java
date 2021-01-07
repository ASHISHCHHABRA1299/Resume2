package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button opengtub,openlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opengtub=(Button)findViewById(R.id.opengithub);
        openlink=(Button)findViewById(R.id.openlinkedin);
        opengtub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://github.com/ASHISHCHHABRA1299"));
                startActivity(i);
            }
        });
        openlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(Intent.CATEGORY_BROWSABLE);
                i.setData(Uri.parse("https://www.linkedin.com/in/ashish-chhabra-131104156/"));
                startActivity(i);
            }
        });
    }
}