package br.com.dlweb.listaseadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
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

        ListView listViewTimes = findViewById(R.id.listViewTimes);
        //Ao selecionar um spinner
        spinnerSeries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0: //Série A
                        String[] timesSerieA = new String[] {
                                "Avaí",
                                "Corinthians",
                                "Flamengo",
                                "Palmeiras"
                        };
                        ArrayAdapter<String> tvTimesSeriaAAdaptador =
                                new ArrayAdapter<>(getApplicationContext(),
                                        android.R.layout.simple_list_item_checked, timesSerieA);
                        listViewTimes.setAdapter(tvTimesSeriaAAdaptador);
                        break;
                    case 1: //Série B
                        ArrayAdapter tvTimesSeriaBAdaptador =
                                ArrayAdapter.createFromResource(getApplicationContext(),
                                        R.array.serieB, android.R.layout.simple_list_item_checked);
                        listViewTimes.setAdapter(tvTimesSeriaBAdaptador);
                        break;
                    default: //Série C
                        ArrayAdapter tvTimesSeriaCAdaptador =
                                ArrayAdapter.createFromResource(getApplicationContext(),
                                        R.array.serieC, android.R.layout.simple_list_item_checked);

                        listViewTimes.setAdapter(tvTimesSeriaCAdaptador);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    /* Criar um método visualizarSelecoes para imprimir a série e o time selecionados.
       Da seguinte forma '"Série selecionada: " + nomeSerie + " - Time selecionado: " + nomeTime'
       O método deverá ser executado no XML do botão visualizar.

       Tempo: 20 minutos
       Em duplas
       Até 1000 pontos de gamificação.

       Assim que terminar, chamar o professor para a verificação.
    */

}