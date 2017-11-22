package com.jonesrandom.belajargit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button textSet;
    EditText textGet;
    TextView textShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textGet = findViewById(R.id.textGet);

        textShow = findViewById(R.id.textShow);

        textSet = findViewById(R.id.textSet);
        textSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = textGet.getText().toString();
                textShow.setText(text);
            }
        });
    }
}
