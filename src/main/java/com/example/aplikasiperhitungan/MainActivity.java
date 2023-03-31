package com.example.aplikasiperhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText bilangan1;
    EditText bilangan2;
    TextView result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bilangan1 = findViewById(R.id.bilangan1);
        bilangan2 = findViewById(R.id.bilangan2);
        result = findViewById(R.id.result);
        button = findViewById(R.id.button);

        button.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();
            }
        });
    }
    public void sendData() {
        int bil1 = Integer.parseInt(bilangan1.getText().toString());
        int bil2 = Integer.parseInt(bilangan2.getText().toString());
        int hasil = bil1 + bil2;


        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("key", hasil);
        startActivity(intent);
    }
}