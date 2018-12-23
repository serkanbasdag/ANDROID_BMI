package com.example.acerv17nitro.diyet;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class SonucActivity extends MainActivity{
    TextView tvKitle,tvYuzey,tvYag,tvSu,tvIdealKilo,tvMessage,tvDurum;
    String VucutKitle,VucutYuzey,YagsizVucut,VucutSuyu,IdealKilo,kilom,durum;
    Double vucutKitle1;
    Button bDiyet;

    Context con = this;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);

        tvKitle = findViewById(R.id.tvKitle);
        tvYuzey = findViewById(R.id.tvYuzey);
        tvYag = findViewById(R.id.tvYag);
        tvSu = findViewById(R.id.tvSu);
        tvIdealKilo = findViewById(R.id.tvIdealKilo);
        tvMessage = findViewById(R.id.tvMessage);
        tvDurum = findViewById(R.id.tvDurum);
        bDiyet = findViewById(R.id.bDiyet);

        Intent intent = this.getIntent();
        VucutKitle = intent.getStringExtra("VucutKitle1");
        VucutYuzey = intent.getStringExtra("VucutYuzey1");
        YagsizVucut = intent.getStringExtra("YagsizVucut1");
        VucutSuyu = intent.getStringExtra("VucutSuyu1");
        IdealKilo = intent.getStringExtra("IdealKilo1");
        kilom = intent.getStringExtra("kilom");
        vucutKitle1 = Double.parseDouble(VucutKitle);

        if(vucutKitle1<=18.5)
        {
            durum = "Durumunuz : Zayıf";
        }
        if(vucutKitle1>=18.6 && vucutKitle1<=24.9)
        {
            durum = "Durumunuz : Normal Kilolu";
        }
        if(vucutKitle1>=25.0 && vucutKitle1<=29.9)
        {
            durum = "Durumunuz : Fazla Kilolu";
        }
        if(vucutKitle1>=30.0 && vucutKitle1<34.9)
        {
            durum = "Durumunuz : I.Derece Obez";
        }
        if(vucutKitle1>=35 && vucutKitle1<=39.9)
        {
            durum = "Durumunuz : II.Derece Obez";
        }
        if(vucutKitle1>=40.0)
        {
            durum = "Durumunuz : III.Derece Morbid Obez";
        }

        AlertDialog.Builder uyari = new AlertDialog.Builder(con);
        uyari.setTitle("İşleminiz gerçekleştirilmiştir");
        uyari.setMessage(durum);
        uyari.setCancelable(false);
        uyari.setPositiveButton("DEVAM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        uyari.setNegativeButton("GERİ DÖN", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                VeriTabani vt = new VeriTabani(SonucActivity.this);
                vt.VeriSil(VucutKitle);
            }
        });
        AlertDialog alertDialog = uyari.create();
        alertDialog.show();

        tvKitle.setText(VucutKitle+" kg/m2");
        tvYuzey.setText(VucutYuzey+" m2");
        tvYag.setText(YagsizVucut+" kg");
        tvSu.setText(VucutSuyu+" lt");
        tvIdealKilo.setText(IdealKilo+" kg");
        tvDurum.setText(durum);

        bDiyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DiyetListesi.class);
                intent.putExtra("kilom",kilom);
                intent.putExtra("VucutKitle1",VucutKitle);
                intent.putExtra("VucutYuzey1",VucutYuzey);
                intent.putExtra("YagsizVucut1",YagsizVucut);
                intent.putExtra("VucutSuyu1",VucutSuyu);
                intent.putExtra("IdealKilo1",IdealKilo);
                intent.putExtra("durum",durum);
                startActivity(intent);
            }
        });

        String message = "\n" +
                "Vücut Kitle Endeksiniz :\n" +
                "\n" +
                "18.5 kg/m2’nin altında ise\n" +
                "\n" +
                "Durumunuz : zayıf\n" +
                "\n" +
                "18.5-24.9 kg/m2 arasında ise\n" +
                "\n" +
                "Durumunuz : normal kilolu\n" +
                "\n" +
                "25-29.9 kg/m2 arasında ise\n" +
                "\n" +
                "Durumunuz : fazla kilolu\n" +
                "\n" +
                "30-34.9 kg/m2 arasında ise\n" +
                "\n" +
                "Durumunuz : I.Derece obez\n" +
                "\n" +
                "35-39.9 kg/m2 arasında ise\n" +
                "\n" +
                "Durumunuz : II.Derece obez\n" +
                "\n" +
                "40 kg/m2 üzerinde ise\n" +
                "\n" +
                "Durumunuz : III.Derece morbid obez";
        tvMessage.setText(message);
    }
}
