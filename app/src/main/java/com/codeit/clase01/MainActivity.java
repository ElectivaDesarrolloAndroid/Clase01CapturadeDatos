package com.codeit.clase01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvUsuario;
    EditText txtUsuario;
    EditText txtPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtPass = findViewById(R.id.txtPass);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String elusuario=txtUsuario.getText().toString().trim();
                String lapass=txtPass.getText().toString().trim();

                Toast.makeText(getApplicationContext(),"El usuario es: " + elusuario,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),"La contraseña es: " + lapass,Toast.LENGTH_LONG).show();
            }
        });

    }
}