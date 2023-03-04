package com.example.hm_3mon_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    private Button btn_no, btn_yes;
    private TextView textName, textSurname;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        findId();
        getTextMain();


        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("name", textName.getText());
                intent.putExtra("surname", textSurname.getText());
                startActivity(intent);
            }
        });
        btn_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void findId() {
        btn_no = findViewById(R.id.btn_no);
        btn_yes = findViewById(R.id.btn_yes);
        textName = findViewById(R.id.text_second);
        textSurname = findViewById(R.id.text_forth);
    }

    private void getTextMain() {
        textName.setText(getIntent().getStringExtra("name"));
        textSurname.setText(getIntent().getStringExtra("surname"));
    }
}