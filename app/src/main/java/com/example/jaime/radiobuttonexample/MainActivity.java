package com.example.jaime.radiobuttonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

/**
 * Clase de ejemplo de cómo funciona RadioButton y RadioGroup.
 * @author Jaime Jiménez Agudo.
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity {
    private View constraintParticular;
    private View constraintBussines;
    private RadioGroup rgTypeClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintParticular = findViewById(R.id.constraint_particular);
        constraintBussines = findViewById(R.id.constraint_bussines);

        rgTypeClient = findViewById(R.id.rg_typeClient);
        rgTypeClient.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {    //int i es el id del CheckBox seleccionado.
                switch (id) {
                    case R.id.rdb_bussines:
                        viewParticular(false);
                        break;

                    case R.id.rdb_particular:
                        viewParticular(true);
                        break;
                }
            }
        });
    }


    /**
     * Método que indica qué constraintLayout ha de estar visible según la opción seleccionada.
     * @param isParticular
     */
    private void viewParticular(Boolean isParticular) {
        constraintParticular.setVisibility(isParticular ? View.VISIBLE : View.GONE);
        constraintBussines.setVisibility(isParticular ? View.GONE : View.VISIBLE);
    }
}
