package com.example.multipantalla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NOMBRE = "nombre";
    public static final String EXTRA_HABITANTES = "habitantes";
    private EditText edt_nombre = null;
    private EditText edt_habitantes = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_nombre = findViewById(R.id.edt_nombre);
        edt_habitantes = findViewById(R.id.edt_habitantes);
    }

    public void irAPantalla2(View view) {
        String nombreCiudad = edt_nombre.getText().toString();
        int habitantes = Integer.valueOf(String.valueOf(edt_habitantes.getText()));

        Intent intent = new Intent(this, pantalla2.class);

        //intent.putExtra(EXTRA_NOMBRE, nombreCiudad);
        //intent.putExtra(EXTRA_HABITANTES, habitantes);
        Bundle extras = new Bundle();
        extras.putString(EXTRA_NOMBRE, nombreCiudad);
        extras.putInt(EXTRA_HABITANTES, habitantes);
        intent.putExtras(extras);

        startActivity(intent);


    }
}