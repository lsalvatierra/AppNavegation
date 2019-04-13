package pe.edu.idat.appnavegation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPregunta1, btnPregunta2, btnPregunta3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPregunta1 = findViewById(R.id.btnPregunta1);
        btnPregunta2 = findViewById(R.id.btnPregunta2);
        btnPregunta3 = findViewById(R.id.btnPregunta3);

        btnPregunta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intPreg1 = new Intent(
                        MainActivity.this,
                        Pregunta1Activity.class);
                startActivity(intPreg1);

            }
        });

        btnPregunta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intPreg2 = new Intent(
                        MainActivity.this,
                        Pregunta2Activity.class);
                startActivity(intPreg2);
            }
        });

        btnPregunta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intPreg3 = new Intent(
                        MainActivity.this,
                        Pregunta3Activity.class);
                startActivity(intPreg3);
            }
        });

    }
}
