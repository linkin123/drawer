package com.example.administrador.drawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1 = findViewById(R.id.text_uno);
        TextView text2 = findViewById(R.id.text_dos);
        text1.setText("texto en rama master");
        
    }
}
