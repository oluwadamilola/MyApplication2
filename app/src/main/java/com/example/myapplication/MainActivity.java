package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import static com.example.myapplication.R.id.profileButton;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.aboutButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                if (v instanceof Button) {
                    ((Button) v).setBackgroundColor(Color.YELLOW);
                    ((Button) v).setTextColor(Color.BLACK);
                }
            }


        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);

    }


    public void sendMessage(View view) {
        Intent intent = new Intent(MainActivity.this, aboutActivity.class);
        startActivity(intent);

    }

}