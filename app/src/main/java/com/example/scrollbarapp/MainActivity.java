package com.example.scrollbarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTextView = findViewById(R.id.text);

        String[] myText = Text.getText();

        for (String text : myText){
            textTextView.append(text + "\n\n");
         }
    }
}