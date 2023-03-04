package com.example.hm_3mon_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textThird, textFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findId();
        getFirst();
    }

    private void getFirst() {
        textThird.setText(getIntent().getStringExtra("name"));
        textFive.setText(getIntent().getStringExtra("surname"));
    }

    private void findId() {
        textThird = findViewById(R.id.text_third);
        textFive = findViewById(R.id.text_five);
    }
}