package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbrir = findViewById(R.id.btnAbrir);

        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(
                        view,
                        "Clicar aqui",
                        Snackbar.LENGTH_INDEFINITE
                ).setAction("confirmar", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        btnAbrir.setText("trocando nome de botao");
                    }
                }).setActionTextColor(getResources().getColor(R.color.design_default_color_secondary)).show();
            }
        });
    }
}