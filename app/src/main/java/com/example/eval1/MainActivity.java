package com.example.eval1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void ingresar(View view) {
        EditText nombreEditText = findViewById(R.id.nombreEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);

        Log.i("nombre:",nombreEditText.getText().toString());
        log.i("password:",passwordEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}