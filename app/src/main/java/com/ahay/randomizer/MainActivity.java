package com.ahay.randomizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView number;
    Button buton;
    int angka = 0;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.number);
        buton = findViewById(R.id.buton);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka = 1 + random.nextInt(10);
                number.setText(String.valueOf(angka));
            }
        });

    }
}
