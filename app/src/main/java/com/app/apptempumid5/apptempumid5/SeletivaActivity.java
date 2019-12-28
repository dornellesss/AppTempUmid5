package com.app.apptempumid5.apptempumid5;

import android.content.Intent;
import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.appindexing.Action;
import com.google.firebase.appindexing.FirebaseUserActions;
import com.google.firebase.appindexing.builders.Actions;

import java.text.DateFormatSymbols;

import static android.icu.util.Calendar.getInstance;
import static java.text.DateFormat.getDateInstance;

public class SeletivaActivity extends AppCompatActivity {

    private static final DateFormatSymbols FirebaseUserActions = ;
    EditText Equipamento;
    EditText Certificado;
    EditText NumeroCertificado;
    EditText CriterioAcTemp;
    EditText ErroTemp;
    EditText InCertezaTemp;
    EditText Temp01;
    EditText Temp02;
    EditText Temp03;
    EditText Temp04;
    EditText CriterioAcUmid;
    EditText ErroUmid;
    EditText InCertezaUmid;
    EditText Umid01;
    EditText Umid02;
    EditText Umid03;
    EditText Umid04;
    EditText Responsavel;
    EditText Email;
    EditText Relatorio;

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seletiva);

        Equipamento = (EditText) findViewById(R.id.ediEquipamento);
        Certificado = (EditText) findViewById(R.id.ediCertificado);
        NumeroCertificado = (EditText) findViewById(R.id.ediNumeCertificado);
        CriterioAcTemp = (EditText) findViewById(R.id.EdCriterioAceitacaoTemp);
        ErroTemp = (EditText) findViewById(R.id.EdImIncertezaTemp);
        InCertezaTemp = (EditText) findViewById(R.id.EdImIncertezaTemp);
        Temp01 = (EditText) findViewById(R.id.EdTemp1);
        Temp02 = (EditText) findViewById(R.id.EdTemp2);
        Temp03 = (EditText) findViewById(R.id.EdTemp3);
        Temp04 = (EditText) findViewById(R.id.EdTemp4);
        CriterioAcUmid = (EditText) findViewById(R.id.EdCriterioAceitacaoUmid);
        ErroUmid = (EditText) findViewById(R.id.EdImIncertezaUmid);
        InCertezaUmid = (EditText) findViewById(R.id.EdImIncertezaUmid);
        Umid01 = (EditText) findViewById(R.id.EdUmid1);
        Umid02 = (EditText) findViewById(R.id.EdUmid2);
        Umid03 = (EditText) findViewById(R.id.EdUmid3);
        Umid04 = (EditText) findViewById(R.id.EdUmid4);
        Responsavel = (EditText) findViewById(R.id.ediResponsavel);
        Email = (EditText) findViewById(R.id.ediEmail);
        Relatorio = (EditText) findViewById(R.id.ediRelatorio);

        /////////////////////////////////////////////////////////////

        final float[] tempe = new float[1]; //Calculo de temperatura
        final float[] temper = new float[1]; //Calculo de temperatura
        final float[] tempera = new float[1]; //Calculo de temperatura
        final float[] temperat = new float[1]; //Calculo de temperatura

        //////////////////////////////////////////////////////////////

        final float[] tempeb = new float[1]; //Calculo de temperatura
        final float[] temperb = new float[1]; //Calculo de temperatura
        final float[] temperab = new float[1]; //Calculo de temperatura
        final float[] temperatb = new float[1]; //Calculo de temperatura

        ///////////////////////////////////////////////////////////////

        final float[] tempebc = new float[1]; //Calculo de temperatura
        final float[] temperbc = new float[1]; //Calculo de temperatura
        final float[] temperabc = new float[1]; //Calculo de temperatura
        final float[] temperatbc = new float[1]; //Calculo de temperatura

        //////////////////////////////////////////////////////////////////

        final float[] tempebcd = new float[1]; //Calculo de temperatura
        final float[] temperbcd = new float[1]; //Calculo de temperatura
        final float[] temperabcd = new float[1]; //Calculo de temperatura
        final float[] temperatbcd = new float[1]; //Calculo de temperatura

        //////////////////////////////////////////////////////////////

        final float[] umida = new float[1]; //Calculo de temperatura
        final float[] umidab = new float[1]; //Calculo de temperatura
        final float[] umidac = new float[1]; //Calculo de temperatura
        final float[] umidad = new float[1]; //Calculo de temperatura

        //////////////////////////////////////////////////////////////

        final float[] umideb = new float[1]; //Calculo de temperatura
        final float[] umiderb = new float[1]; //Calculo de temperatura
        final float[] umiderab = new float[1]; //Calculo de temperatura
        final float[] umideratb = new float[1]; //Calculo de temperatura

        ///////////////////////////////////////////////////////////////

        final float[] umidebc = new float[1]; //Calculo de temperatura
        final float[] umiderbc = new float[1]; //Calculo de temperatura
        final float[] umiderabc = new float[1]; //Calculo de temperatura
        final float[] umideratbc = new float[1]; //Calculo de temperatura

        //////////////////////////////////////////////////////////////////

        final float[] umidebcd = new float[1]; //Calculo de temperatura
        final float[] umiderbcd = new float[1]; //Calculo de temperatura
        final float[] umiderabcd = new float[1]; //Calculo de temperatura
        final float[] umideratbcd = new float[1]; //Calculo de temperatura

        ///////////////////////////////////////////////////////////////////Q

        Button btCalcular = (Button) findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView EdTemp1 = (TextView) findViewById(R.id.EdTemp1);
                TextView EdTemp2 = (TextView) findViewById(R.id.EdTemp2);
                TextView EdTemp3 = (TextView) findViewById(R.id.EdTemp3);
                TextView EdTemp4 = (TextView) findViewById(R.id.EdTemp4);
                TextView EdUmid1 = (TextView) findViewById(R.id.EdUmid1);
                TextView EdUmid2 = (TextView) findViewById(R.id.EdUmid2);
                TextView EdUmid3 = (TextView) findViewById(R.id.EdUmid3);
                TextView EdUmid4 = (TextView) findViewById(R.id.EdUmid4);
                TextView EdCriterioAceitacaoTemp = (TextView) findViewById(R.id.EdCriterioAceitacaoTemp);
                TextView EdErroImTemp = (TextView) findViewById(R.id.EdErroImTemp);
                TextView EdImIncertezaTemp = (TextView) findViewById(R.id.EdImIncertezaTemp);

                //////////////////////////////////////////////////////////////////////////////////

                TextView EdCriterioAceitacaoUmid = (TextView) findViewById(R.id.EdCriterioAceitacaoUmid);
                TextView EdErroImUmid = (TextView) findViewById(R.id.EdErroImUmid);
                TextView EdImIncertezaUmid = (TextView) findViewById(R.id.EdImIncertezaUmid);

                ////////////////////////////////////////////////////////////////////////////////

                TextView tvResultadotemp1 = (TextView) findViewById(R.id.tvResultadotemp1);
                TextView tvDescricaotemp1 = (TextView) findViewById(R.id.tvDescricaotemp1);
                TextView tvResultadotemp2 = (TextView) findViewById(R.id.tvResultadotemp2);
                TextView tvDescricaotemp2 = (TextView) findViewById(R.id.tvDescricaotemp2);
                TextView tvAcaotemp1 = (TextView) findViewById(R.id.tvAcaotemp1);
                TextView tvAcaotemp2 = (TextView) findViewById(R.id.tvAcaotemp2);

                ////////////////////////////////////////////////////////////////////////////////

                TextView tvResultadotemp3 = (TextView) findViewById(R.id.tvResultadotemp3);
                TextView tvDescricaotemp3 = (TextView) findViewById(R.id.tvDescricaotemp3);
                TextView tvResultadotemp4 = (TextView) findViewById(R.id.tvResultadotemp4);
                TextView tvDescricaotemp4 = (TextView) findViewById(R.id.tvDescricaotemp4);
                TextView tvAcaotemp3 = (TextView) findViewById(R.id.tvAcaotemp3);
                TextView tvAcaotemp4 = (TextView) findViewById(R.id.tvAcaotemp4);

                ///////////////////////////////////////////////////////////////////////

                TextView tvResultadoumid1 = (TextView) findViewById(R.id.tvResultadoumid1);
                TextView tvDescricaoumid1 = (TextView) findViewById(R.id.tvDescricaoumid1);
                TextView tvResultadoumid2 = (TextView) findViewById(R.id.tvResultadoumid2);
                TextView tvDescricaoumid2 = (TextView) findViewById(R.id.tvDescricaoumid2);
                TextView tvAcaoumid1 = (TextView) findViewById(R.id.tvAcaoumid1);
                TextView tvAcaoumid2 = (TextView) findViewById(R.id.tvAcaoumid2);

                /////////////////////////////////////////////////////////////////////////

                TextView tvResultadoumid3 = (TextView) findViewById(R.id.tvResultadoumid3);
                TextView tvDescricaoumid3 = (TextView) findViewById(R.id.tvDescricaoumid3);
                TextView tvResultadoumid4 = (TextView) findViewById(R.id.tvResultadoumid4);
                TextView tvDescricaoumid4 = (TextView) findViewById(R.id.tvDescricaoumid4);
                TextView tvAcaoumid3 = (TextView) findViewById(R.id.tvAcaoumid3);
                TextView tvAcaoumid4 = (TextView) findViewById(R.id.tvAcaoumid4);

                //////////////////////////////////////////////////////////////////////

                int CriterioAceitacaoTemp = Integer.parseInt(EdCriterioAceitacaoTemp.getText().toString());
                int ErroImTemp = Integer.parseInt(EdErroImTemp.getText().toString());
                int ImIncertezaTemp = Integer.parseInt(EdImIncertezaTemp.getText().toString());

                //////////////////////////////////////////////////////////////////////

                int CriterioAceitacaoUmid = Integer.parseInt(EdCriterioAceitacaoUmid.getText().toString());
                int ErroImUmid = Integer.parseInt(EdErroImUmid.getText().toString());
                int ImIncertezaUmid = Integer.parseInt(EdImIncertezaUmid.getText().toString());

                ////////////////////////////////////////////////////////////////////////

                float temp1 = Float.parseFloat(EdTemp1.getText().toString());
                float temp2 = Float.parseFloat(EdTemp2.getText().toString());
                float temp3 = Float.parseFloat(EdTemp3.getText().toString());
                float temp4 = Float.parseFloat(EdTemp4.getText().toString());

                ///////////////////////////////////////////////////////////////////////

                float umid1 = Float.parseFloat(EdUmid1.getText().toString());
                float umid2 = Float.parseFloat(EdUmid2.getText().toString());
                float umid3 = Float.parseFloat(EdUmid3.getText().toString());
                float umid4 = Float.parseFloat(EdUmid4.getText().toString());

                ////////////////////////////////////////////////////////////////////////////

                tempe[0] = (temp1 - ErroImTemp);
                temper[0] = (temp1 + ErroImTemp + ImIncertezaTemp);
                tempera[0] = (temp1 - CriterioAceitacaoTemp);
                temperat[0] = (temp1 + CriterioAceitacaoTemp);

                //////////////////////////////////////

                tempeb[0] = (temp2 - ErroImTemp);
                temperb[0] = (temp2 + ErroImTemp + ImIncertezaTemp);
                temperab[0] = (temp2 - CriterioAceitacaoTemp);
                temperatb[0] = (temp2 + CriterioAceitacaoTemp);

                ////////////////////////////////////////

                tempebc[0] = (temp3 - ErroImTemp);
                temperbc[0] = (temp3 + ErroImTemp + ImIncertezaTemp);
                temperabc[0] = (temp3 - CriterioAceitacaoTemp);
                temperatbc[0] = (temp3 + CriterioAceitacaoTemp);

                //////////////////////////////////////////////////

                tempebcd[0] = (temp4 - ErroImTemp);
                temperbcd[0] = (temp4 + ErroImTemp + ImIncertezaTemp);
                temperabcd[0] = (temp4 - CriterioAceitacaoTemp);
                temperatbcd[0] = (temp4 + CriterioAceitacaoTemp);

                //////////////////////////////////////////////////////////

                umida[0] = (umid1 - ErroImTemp);
                umidab[0] = (umid1 + ErroImTemp + ImIncertezaTemp);
                umidac[0] = (umid1 - CriterioAceitacaoTemp);
                umidad[0] = (umid1 + CriterioAceitacaoTemp);

                //////////////////////////////////////

                umideb[0] = (umid2 - ErroImTemp);
                umiderb[0] = (umid2 + ErroImTemp + ImIncertezaTemp);
                umiderab[0] = (umid2 - CriterioAceitacaoTemp);
                umideratb[0] = (umid2 + CriterioAceitacaoTemp);

                ////////////////////////////////////////

                umidebc[0] = (umid3 - ErroImTemp);
                umiderbc[0] = (umid3 + ErroImTemp + ImIncertezaTemp);
                umiderabc[0] = (umid3 - CriterioAceitacaoTemp);
                umideratbc[0] = (umid3 + CriterioAceitacaoTemp);

                //////////////////////////////////////////////////

                umidebcd[0] = (umid4 - ErroImTemp);
                umiderbcd[0] = (umid4 + ErroImTemp + ImIncertezaTemp);
                umiderabcd[0] = (umid4 - CriterioAceitacaoTemp);
                umideratbcd[0] = (umid4 + CriterioAceitacaoTemp);

                ////////////////////////////////////////////////////

                if (tempe[0] < tempera[0]) //Indica que quando for menor reprovado
                {
                    tvResultadotemp1.setText(tempe[0] + "");
                    tvDescricaotemp1.setText("Fora de Especificação!");
                    tvAcaotemp1.setText("Requer 2, Ação Preventiva!");
                } else {
                    if ((tempe[0] > tempera[0]) && (tempe[0] < temperat[0])) //Indica que quando for menor igual ou maior que 2 e menor que 6  reprovado
                    {
                        tvResultadotemp1.setText(tempe[0] + "");
                        tvDescricaotemp1.setText("Faixa Adequada!");
                        tvAcaotemp1.setText("Situação normal");
                    } else {
                        if (tempe[0] > temperat[0]) {
                            tvResultadotemp1.setText(tempe[0] + "");
                            tvDescricaotemp1.setText("Fora de Especificação!");
                            tvAcaotemp1.setText("Requer 1, Ação Corretiva");
                        } else {
                            tvResultadotemp1.setText(tempe[0] + "");
                            tvDescricaotemp1.setText("Faixa Ideal!");
                            tvAcaotemp1.setText("Situação Estável");
                        }
                    }
                }
                ////////////////////////////////////////////////////////////////////////////////////

                if (tempeb[0] < temperab[0]) //Indica que quando for menor reprovado
                {
                    tvResultadotemp2.setText(tempeb[0] + "");
                    tvDescricaotemp2.setText("Fora de Especificação!");
                    tvAcaotemp2.setText("Requer 2, Ação Preventiva!");
                } else {
                    if ((tempeb[0] > temperab[0]) && (tempeb[0] < temperatb[0])) //Indica que quando for menor igual ou maior que 2 e menor que 6  reprovado
                    {
                        tvResultadotemp2.setText(tempeb[0] + "");
                        tvDescricaotemp2.setText("Faixa Adequada!");
                        tvAcaotemp2.setText("Situação normal");
                    } else {
                        if (tempeb[0] > temperatb[0]) {
                            tvResultadotemp2.setText(tempeb[0] + "");
                            tvDescricaotemp2.setText("Fora de Especificação!");
                            tvAcaotemp2.setText("Requer 1, Ação Corretiva");
                        } else {
                            tvResultadotemp2.setText(tempeb[0] + "");
                            tvDescricaotemp2.setText("Faixa Ideal!");
                            tvAcaotemp2.setText("Situação Estável");
                        }
                    }
                }

                //////////////////////////////////////////////////////////

                if (tempebc[0] < temperabc[0]) //Indica que quando for menor reprovado
                {
                    tvResultadotemp3.setText(tempebc[0] + "");
                    tvDescricaotemp3.setText("Fora de Especificação!");
                    tvAcaotemp3.setText("Requer 2, Ação Preventiva!");
                } else {
                    if ((tempebc[0] > temperabc[0]) && (tempebc[0] < temperatbc[0])) //Indica que quando for menor igual ou maior que 2 e menor que 6  reprovado
                    {
                        tvResultadotemp3.setText(tempebc[0] + "");
                        tvDescricaotemp3.setText("Faixa Adequada!");
                        tvAcaotemp3.setText("Situação Normal");
                    } else {
                        if (tempebc[0] > temperatbc[0]) {
                            tvResultadotemp3.setText(tempebc[0] + "");
                            tvDescricaotemp3.setText("Fora de Especificação!");
                            tvAcaotemp3.setText("Requer 1, Ação Corretiva");
                        } else {
                            tvResultadotemp3.setText(tempebc[0] + "");
                            tvDescricaotemp3.setText("Faixa Ideal!");
                            tvAcaotemp3.setText("Situação Estável");
                        }
                    }
                }

                ////////////////////////////////////////////////////////////////

                if (tempebcd[0] < temperabcd[0]) //Indica que quando for menor reprovado
                {
                    tvResultadotemp4.setText(tempebcd[0] + "");
                    tvDescricaotemp4.setText("Fora de Especificação!");
                    tvAcaotemp4.setText("Requer 2, Ação Preventiva!");
                } else {
                    if ((tempebcd[0] > temperabcd[0]) && (tempebcd[0] < temperatbcd[0])) //Indica que quando for menor igual ou maior que 2 e menor que 6  reprovado
                    {
                        tvResultadotemp4.setText(tempebcd[0] + "");
                        tvDescricaotemp4.setText("Faixa Adequada!");
                        tvAcaotemp4.setText("Situação Normal");
                    } else {
                        if (tempebcd[0] > temperatbcd[0]) {
                            tvResultadotemp4.setText(tempebcd[0] + "");
                            tvDescricaotemp4.setText("Fora de Especificação!");
                            tvAcaotemp4.setText("Requer 1, Ação Corretiva");
                        } else {
                            tvResultadotemp4.setText(tempebcd[0] + "");
                            tvDescricaotemp4.setText("Faixa Ideal!");
                            tvAcaotemp4.setText("Situação Estável");
                        }
                    }
                }

                ////////////////////////////////////////////////////////////

                if (umida[0] < umidab[0]) //Indica que quando for menor reprovado
                {
                    tvResultadoumid1.setText(umida[0] + "");
                    tvDescricaoumid1.setText("Fora de Especificação!");
                    tvAcaoumid1.setText("Requer 2, Ação Preventiva!");
                } else {
                    if ((umida[0] > umidac[0]) && (umida[0] < umidad[0])) //Indica que quando for menor igual ou maior que 2 e menor que 6  reprovado
                    {
                        tvResultadoumid1.setText(umida[0] + "");
                        tvDescricaoumid1.setText("Faixa Adequada!");
                        tvAcaoumid1.setText("Situação Normal");
                    } else {
                        if (umida[0] > umidad[0]) {
                            tvResultadoumid1.setText(umida[0] + "");
                            tvDescricaoumid1.setText("Fora de Especificação!");
                            tvAcaoumid1.setText("Requer 1, Ação Corretiva");
                        } else {
                            tvResultadoumid1.setText(umida[0] + "");
                            tvDescricaoumid1.setText("Faixa Ideal!");
                            tvAcaoumid1.setText("Situação Estável");
                        }
                    }
                }

                ////////////////////////////////////////////////////////////////////////////////////

                if (umideb[0] < umiderab[0]) //Indica que quando for menor reprovado
                {
                    tvResultadoumid2.setText(umideb[0] + "");
                    tvDescricaoumid2.setText("Fora de Especificação!");
                    tvAcaoumid2.setText("Requer 2, Ação Preventiva!");
                } else {
                    if ((umideb[0] > umiderab[0]) && (umideb[0] < umideratb[0])) //Indica que quando for menor igual ou maior que 2 e menor que 6  reprovado
                    {
                        tvResultadoumid2.setText(umideb[0] + "");
                        tvDescricaoumid2.setText("Faixa Adequada!");
                        tvAcaoumid2.setText("Situação Normal");
                    } else {
                        if (umideb[0] > umideratb[0]) {
                            tvResultadoumid2.setText(umideb[0] + "");
                            tvDescricaoumid2.setText("Fora de Especificação!");
                            tvAcaoumid2.setText("Requer 1, Ação Corretiva");
                        } else {
                            tvResultadoumid2.setText(umideb[0] + "");
                            tvDescricaoumid2.setText("Faixa Ideal!");
                            tvAcaoumid2.setText("Situação Estável");
                        }
                    }
                }

                //////////////////////////////////////////////////////////

                if (umidebc[0] < umiderabc[0]) //Indica que quando for menor reprovado
                {
                    tvResultadoumid3.setText(umidebc[0] + "");
                    tvDescricaoumid3.setText("Fora de Especificação!");
                    tvAcaoumid3.setText("Requer 2, Ação Preventiva!");
                } else {
                    if ((umidebc[0] > umiderabc[0]) && (umidebc[0] < umideratbc[0])) //Indica que quando for menor igual ou maior que 2 e menor que 6  reprovado
                    {
                        tvResultadoumid3.setText(umidebc[0] + "");
                        tvDescricaoumid3.setText("Faixa Adequada!");
                        tvAcaoumid3.setText("Situação Normal");
                    } else {
                        if (umidebc[0] > umideratbc[0]) {
                            tvResultadoumid3.setText(umidebc[0] + "");
                            tvDescricaoumid3.setText("Fora de Especificação!");
                            tvAcaoumid3.setText("Requer 1, Ação Corretiva");
                        } else {
                            tvResultadoumid3.setText(umidebc[0] + "");
                            tvDescricaoumid3.setText("Faixa Ideal!");
                            tvAcaoumid3.setText("Situação Estável");
                        }
                    }
                }

                ////////////////////////////////////////////////////////////////

                if (umidebcd[0] < umiderabcd[0]) //Indica que quando for menor reprovado
                {
                    tvResultadoumid4.setText(umidebcd[0] + "");
                    tvDescricaoumid4.setText("Fora de Especificação!");
                    tvAcaoumid4.setText("Requer 2, Ação Preventiva!");
                } else {
                    if ((umidebcd[0] > umiderabcd[0]) && (umidebcd[0] < umideratbcd[0])) //Indica que quando for menor igual ou maior que 2 e menor que 6  reprovado
                    {
                        tvResultadoumid4.setText(umidebcd[0] + "");
                        tvDescricaoumid4.setText("Faixa Adequada!");
                        tvAcaoumid4.setText("Situação Normal");
                    } else {
                        if (umidebcd[0] > umideratbcd[0]) {
                            tvResultadoumid4.setText(umidebcd[0] + "");
                            tvDescricaoumid4.setText("Fora de Especificação!");
                            tvAcaoumid4.setText("Requer 1, Ação Corretiva");
                        } else {
                            tvResultadoumid4.setText(umidebcd[0] + "");
                            tvDescricaoumid4.setText("Faixa Ideal!");
                            tvAcaoumid4.setText("Situação Estável");
                        }
                    }
                }
            }
        });

        Button save = (Button) findViewById(R.id.btnSave);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String equipamento = Equipamento.getText().toString();
                String certificado = Certificado.getText().toString();
                String numerocertificado = NumeroCertificado.getText().toString();

                String criterioaceitacaotemp = CriterioAcTemp.getText().toString();
                String errotemp = ErroTemp.getText().toString();
                String criterioincertemp = InCertezaTemp.getText().toString();

                String temp01 = Temp01.getText().toString();
                String temp02 = Temp02.getText().toString();
                String temp03 = Temp03.getText().toString();
                String temp04 = Temp04.getText().toString();

                String criterioaceitacaoumid = CriterioAcTemp.getText().toString();
                String erroumid = ErroUmid.getText().toString();
                String criterioincerumid = InCertezaUmid.getText().toString();

                String umid01 = Umid01.getText().toString();
                String umid02 = Umid02.getText().toString();
                String umid03 = Umid03.getText().toString();
                String umid04 = Umid04.getText().toString();

                String responsavel = Responsavel.getText().toString();
                String email = Email.getText().toString();
                String relatorio = Relatorio.getText().toString();

                Intent intent = new Intent(SeletivaActivity.this, Seletiva2Activity.class);
                intent.putExtra("EQUIPAMENTO", equipamento);
                intent.putExtra("CERTIFICADO", certificado);
                intent.putExtra("NUMEROCERTIFICADO", numerocertificado);

                intent.putExtra("CRITERIOACEITACAOTEMP", criterioaceitacaotemp);
                intent.putExtra("ERROTEMP", errotemp);
                intent.putExtra("CRITERIOINCERTEMP", criterioincertemp);

                intent.putExtra("TEMPERATURA_01", temp01);
                intent.putExtra("TEMPERATURA_02", temp02);
                intent.putExtra("TEMPERATURA_03", temp03);
                intent.putExtra("TEMPERATURA_04", temp04);

                intent.putExtra("CRITERIOACEITACAOUMID", criterioaceitacaoumid);
                intent.putExtra("ERROUMID", erroumid);
                intent.putExtra("CRITERIOINCERUMID", criterioincerumid);

                intent.putExtra("UMIDADE_01", umid01);
                intent.putExtra("UMIDADE_02", umid02);
                intent.putExtra("UMIDADE_03", umid03);
                intent.putExtra("UMIDADE_04", umid04);
                intent.putExtra("RESPONSAVEL", responsavel);
                intent.putExtra("EMAIL", email);
                intent.putExtra("RELATORIO", relatorio);
                startActivity(intent);
            }
        });

        Calendar calendar = getInstance();
        String currentDate = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            currentDate = getDateInstance(DateFormat.FULL).format(calendar.getTime());
        }

        TextView textViewDate = (TextView) findViewById(R.id.textViewDate);
        textViewDate.setText(currentDate);
    }
        /*
        Button save = (Button) findViewById(R.id.btn_save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String
            }
        });
*/

        /*
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseStorage = FirebaseStorage.getInstance();
        storageReference = firebaseStorage.getReference();

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()) {
                    //Carregar dados para o banco de dados
                    String user_email = userEmail.getText().toString().trim();
                    String user_password = userPassword.getText().toString().trim();

                    firebaseAuth.createUserWithEmailAndPassword(user_email, user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                //sendEmailVerification();
                                sendUserData();
                                Toast.makeText(SeletivaActivity.this, "Registrado com sucesso!", Toast.LENGTH_SHORT).show();
                                firebaseAuth.signOut();
                                finish();
                                startActivity(new Intent(SeletivaActivity.this, MainActivity.class));
                            } else {
                                Toast.makeText(SeletivaActivity.this, "Falha ao efetuara o Registro!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
    }

    private void setupUIViews() {
        userName = (EditText) findViewById(R.id.etUserName);
        userPassword = (EditText) findViewById(R.id.etUserPassword);
        userEmail = (EditText) findViewById(R.id.etUserEmail);
        ediEquipamento = (EditText) findViewById(R.id.ediEquipamento);
        userLogin = (TextView) findViewById(R.id.tvUserLogin);
        userAge = (EditText) findViewById(R.id.etAge);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
        tvDescricao = (TextView) findViewById(R.id.tvDescricao);
    }

    private Boolean validate() {
        Boolean result = false;

        name = userName.getText().toString();
        password = userPassword.getText().toString();
        email = userEmail.getText().toString();
        age = userAge.getText().toString();

        if (name.isEmpty() || password.isEmpty() || email.isEmpty() || age.isEmpty()){
            Toast.makeText(this, "Por favor, preencha todos os campos de cadastro!", Toast.LENGTH_SHORT).show();
        } else {
            result = true;
        }
        return result;
    }

    private void sendEmailVerification() {
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if (firebaseUser != null) {
            firebaseUser.sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()) {
                        sendUserData();
                        Toast.makeText(SeletivaActivity.this, "Registro efetuado com sucesso. Verifique seu email, e os dados do Relatório", Toast.LENGTH_SHORT).show();
                        firebaseAuth.signOut();
                        finish();
                        startActivity(new Intent(SeletivaActivity.this, MainActivity.class));
                    } else {
                        Toast.makeText(SeletivaActivity.this, "Não foi prossivel confirmar o envio de dados!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void sendUserData() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference myRef = firebaseDatabase.getReference(firebaseAuth.getUid());
        UserProfile userProfile = new UserProfile(age, email, name);
        myRef.setValue(userProfile);

    }
        /**
         * ATTENTION: This was auto-generated to implement the App Indexing API.
         * See https://g.co/AppIndexing/AndroidStudio for more information.
         */
      /*
    public Action getIndexApiAction() {
        return Actions.newView("Seletiva", "http://[ENTER-YOUR-URL-HERE]");
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        FirebaseUserActions.getInstance().start(getIndexApiAction());
    }

    @Override
    public void onStop() {

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        FirebaseUserActions.getInstance().end(getIndexApiAction());
        super.onStop();

        */

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        return Actions.newView("Seletiva", "http:www.google.com.br");
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        FirebaseUserActions.getInstance().start(getIndexApiAction());
    }

    @Override
    public void onStop() {

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        FirebaseUserActions.getInstance().end(getIndexApiAction());
        super.onStop();
    }

    ///////////////////////////////////////////////////////////////

    public void telaSeletiva2(View view) {
        Intent intent = new Intent(this, Seletiva2Activity.class);
        startActivity(intent);
    }

    public void telaSegund(View view) {
        Intent intent = new Intent(this, SecundActivity.class);
        startActivity(intent);
    }

    public void MenuTela(View view) {
        Intent intent = new Intent(this, SeletivaActivity.class);
        startActivity(intent);
    }
}


