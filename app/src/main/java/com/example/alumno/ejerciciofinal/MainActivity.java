package com.example.alumno.ejerciciofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellido, password, confirmarPassword;
    Button btnCancelar, btnAgregar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre= (EditText) findViewById(R.id.nombre);
        apellido= (EditText) findViewById(R.id.apellido);
        password= (EditText) findViewById(R.id.password);
        confirmarPassword= (EditText) findViewById(R.id.confirmarPassword);

    }

    public void agregar()
    {
       if( password.getText().toString().equals( confirmarPassword.getText().toString() ) )
       {
           Intent intent = new Intent( this, Interese.class);

           startActivity(intent);

       }
       else {
           Toast.makeText(this, "Credenciales invalidas", Toast.LENGTH_SHORT).show();
       }
    }

    public void cancelar()
    {
        nombre.setText("");
        apellido.setText("");
        password.setText("");
        confirmarPassword.setText("");

    }
}
