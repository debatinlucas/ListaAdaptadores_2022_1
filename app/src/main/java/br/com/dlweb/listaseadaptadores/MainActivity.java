package br.com.dlweb.listaseadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinnerSeries = findViewById(R.id.spinnerSeries);

        //Criar o array de dados estáticos
        String[] series = new String[] {
                "Série A",
                "Série B",
                "Série C"
        };

        //Criar adaptador
        ArrayAdapter<String> spinnerAdapter = new
                ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                series);

        //Setar o adaptador
        spinnerSeries.setAdapter(spinnerAdapter);

    }
}