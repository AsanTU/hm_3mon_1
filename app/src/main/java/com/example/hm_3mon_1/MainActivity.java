package com.example.hm_3mon_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;
   private EditText surname;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("surname", surname.getText().toString());
                startActivity(intent);
            }
        });
    }

    private void findId() {
        name = findViewById(R.id.et_name);
        surname = findViewById(R.id.et_surname);
        button = findViewById(R.id.btn_first);
    }
}