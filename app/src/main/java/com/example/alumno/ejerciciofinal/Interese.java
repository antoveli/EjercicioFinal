package com.example.alumno.ejerciciofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;

public class Interese extends AppCompatActivity {

    RadioButton rbAndroidYes, rbJavaYes,rbSpringYes ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interese);
        rbAndroidYes = (RadioButton) findViewById(R.id.rbAndroidYes);
        rbJavaYes = (RadioButton) findViewById(R.id.rbJavaYes);
        rbSpringYes = (RadioButton) findViewById(R.id.rbSpringYes);



    }

    public void enviar()
    {

        if()
    }
}
