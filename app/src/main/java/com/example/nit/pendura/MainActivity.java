package com.example.nit.pendura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nit.pendura.Auxiliar.BaseActivity;

public class MainActivity extends BaseActivity {
    private Button bt_mudar_texto;
    private EditText ed_nome, ed_apelido, ed_telefone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar();
        setupNavDrawer();


        //Vinculando o java a interface xml
        ed_nome = (EditText) findViewById(R.id.ed_nome);
        ed_apelido = (EditText) findViewById(R.id.ed_apelido);
        ed_telefone = (EditText) findViewById(R.id.ed_telefone);

        /*bt_mudar_texto = (Button) findViewById(R.id.bt_mudar_texto);



        //Evento usado para usar quando clicar no botão
        bt_mudar_texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky2 is clicked } });
                Log.i("erro", "clicou no botão mudar_texto");
                String msg = "Clicou no botão";
                String nome = ed_nome.getText().toString();
                String apelido = ed_apelido.getText().toString();
                String telefone = ed_telefone.getText().toString();
                Toast.makeText(getBaseContext(), nome + " " + apelido + " " + telefone, Toast.LENGTH_SHORT).show();
            }

        });*/
    }
}
