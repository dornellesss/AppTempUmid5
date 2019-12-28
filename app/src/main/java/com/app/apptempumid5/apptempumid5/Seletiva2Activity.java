package com.app.apptempumid5.apptempumid5;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Seletiva2Activity extends AppCompatActivity {

    String Equipamento;
    String Certificado;
    String NumeroCertificado;
    String CriterioAcTemp;
    String ErroTemp;
    String IncertezaTemp;
    String Temp01;
    String Temp02;
    String Temp03;
    String Temp04;
    String CriterioAcUmid;
    String ErroUmid;
    String IncertezaUmid;
    String Umid01;
    String Umid02;
    String Umid03;
    String Umid04;
    String Responsavel;
    String Email;
    String Relatorio;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seletiva2);

        Equipamento = getIntent().getExtras().getString("EQUIPAMENTO");
        Certificado = getIntent().getExtras().getString("CERTIFICADO");
        NumeroCertificado = getIntent().getExtras().getString("NUMEROCERTIFICADO");

        CriterioAcTemp = getIntent().getExtras().getString("CRITERIOACEITACAOTEMP");
        ErroTemp = getIntent().getExtras().getString("ERROTEMP");
        IncertezaTemp = getIntent().getExtras().getString("INCERTEZATEMP");

        Temp01 = getIntent().getExtras().getString("TEMPERATURA_01");
        Temp02 = getIntent().getExtras().getString("TEMPERATURA_02");
        Temp03 = getIntent().getExtras().getString("TEMPERATURA_03");
        Temp04 = getIntent().getExtras().getString("TEMPERATURA_04");

        CriterioAcUmid = getIntent().getExtras().getString("CRITERIOACEITACAOUMID");
        ErroUmid = getIntent().getExtras().getString("ERROUMID");
        IncertezaUmid = getIntent().getExtras().getString("INCERTEZAUMID");

        Umid01 = getIntent().getExtras().getString("UMIDADE_01");
        Umid02 = getIntent().getExtras().getString("UMIDADE_02");
        Umid03 = getIntent().getExtras().getString("UMIDADE_03");
        Umid04 = getIntent().getExtras().getString("UMIDADE_04");
        Responsavel = getIntent().getExtras().getString("RESPONSAVEL");
        Email = getIntent().getExtras().getString("EMAIL");
        Relatorio = getIntent().getExtras().getString("RELATORIO");

        TextView txtConfirma = (TextView)findViewById(R.id.txtConfirma);
        txtConfirma.setText("Equipamento: "+" "+Equipamento+'\n'+
                            "Certificado: "+" "+Certificado+'\n'+
                            "Numero Certificado: "+" "+NumeroCertificado+'\n'+
                            "Critério de Aceitação de Temperatura: "+" "+CriterioAcTemp+'\n'+
                            "Erro + IM: "+" "+ErroTemp+'\n'+
                            "IM Incerteza: "+" "+IncertezaTemp+'\n'+
                            "Temperatura 01: "+" "+Temp01+ '\n'+
                            "Temperatura 02: "+" "+Temp02+'\n'+
                            "Temperatura 03: "+" "+Temp03+'\n'+
                            "Temperatura 04: "+" "+Temp04+'\n'+
                            "Critério de Aceitação de Umidade: "+" "+CriterioAcUmid+'\n'+
                            "Erro + IM: "+" "+ErroUmid+'\n'+
                            "IM Incerteza: "+" "+IncertezaUmid+'\n'+
                            "Umidade 01: "+" "+Umid01+'\n'+
                            "Umidade 02: "+" "+Umid02+'\n'+
                            "Umidade 03: "+" "+Umid03+'\n'+
                            "Umidade 04: "+" "+Umid04+'\n'+
                            "Responsavel: "+" "+Responsavel+'\n'+
                            "Email: "+" "+Email+'\n'+
                            "Relatorio: "+" "+Relatorio);
    }

    public void telaGravar(View view) {
        Intent intent = new Intent(this, SeletivaActivity.class);
        startActivity(intent);
    }

    public void telaPlanilhaN(View view) {
        Intent intent = new Intent(this, SeletivaActivity.class);
        startActivity(intent);
    }

    public void telaMenu(View view) {
        Intent intent = new Intent(this, SecundActivity.class);
        startActivity(intent);
    }
}
