package com.example.misfragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleCorreo extends AppCompatActivity {


    TextView txtdetalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_correo);
        txtdetalle=findViewById(R.id.TxtDetalle);
        txtdetalle.setText("DE: "+getIntent().getExtras().getString("de")+
                "Asunto: "+getIntent().getExtras().getString("asunto")+
                "Contenido: "+getIntent().getExtras().getString("texto"));
    }
}