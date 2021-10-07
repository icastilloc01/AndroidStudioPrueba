package com.example.pruebagithub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView btn = (ImageView) findViewById(R.id.star);
        TextView ctn = (TextView) findViewById(R.id.Contador);
        btn.setClickable(true);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int aux = Integer.parseInt((String) ctn.getText()) + 1;
                ctn.setText(String.valueOf(aux));
            }
        });
    }
}