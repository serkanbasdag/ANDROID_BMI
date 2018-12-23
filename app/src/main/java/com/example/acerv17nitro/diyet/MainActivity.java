package com.example.acerv17nitro.diyet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rbErkek,rbKadin;
    EditText etBoy,etKilo,etYas;
    Button bHesapla,bTemizle;
    double VucutKitle,VucutYuzey,YagsizVucut,VucutSuyu,IdealKilo;
    String VucutKitle1,VucutYuzey1,YagsizVucut1,VucutSuyu1,IdealKilo1,kilom;

    double boy,kilo,yas;

    Hesaplama h = new Hesaplama();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.rg);
        etBoy = findViewById(R.id.etBoy);
        etKilo = findViewById(R.id.etKilo);
        etYas = findViewById(R.id.etYas);

        bHesapla = findViewById(R.id.bHesapla);
        bHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etBoy.getText().toString().length()>0 || etKilo.getText().toString().length()>0
                        || etYas.getText().toString().length()>0)
                {
                    boy = Double.parseDouble(etBoy.getText().toString());
                    kilo = Double.parseDouble(etKilo.getText().toString());
                    yas = Double.parseDouble(etYas.getText().toString());

                    kilom = etKilo.getText().toString();

                int rgC = rg.getCheckedRadioButtonId();
                switch (rgC){
                   case R.id.rbErkek :
                       {
                           VucutKitle = h.VucutKitle(boy,kilo,yas);
                        VucutYuzey = h.YuzeyAlan(boy,kilo,yas);
                        YagsizVucut = h.ErkekYagsizVucut(boy,kilo,yas);
                        VucutSuyu = h.ErkekVucutSuyu(boy,kilo,yas);
                        IdealKilo = h.ErkekIdealKilo(boy,kilo,yas);

                           VucutKitle1 = String.valueOf(VucutKitle);
                           VucutYuzey1 = String.valueOf(VucutYuzey);
                           YagsizVucut1 = String.valueOf(YagsizVucut);
                           VucutSuyu1 = String.valueOf(VucutSuyu);
                           IdealKilo1 = String.valueOf(IdealKilo);

                           VeriTabani vt = new VeriTabani(MainActivity.this);
                           vt.VeriEkle("Erkek",boy,kilo,yas,VucutKitle,VucutYuzey,YagsizVucut,VucutSuyu,IdealKilo);
                           break;
                       }
                    case R.id.rbKadin:
                    {
                        VucutKitle = h.VucutKitle(boy,kilo,yas);
                        VucutYuzey = h.YuzeyAlan(boy,kilo,yas);
                        YagsizVucut = h.KadinYagsizVucut(boy,kilo,yas);
                        VucutSuyu = h.KadinVucutSuyu(boy,kilo,yas);
                        IdealKilo = h.KadinIdealKilo(boy,kilo,yas);

                        VucutKitle1 = String.valueOf(VucutKitle);
                        VucutYuzey1 = String.valueOf(VucutYuzey);
                        YagsizVucut1 = String.valueOf(YagsizVucut);
                        VucutSuyu1 = String.valueOf(VucutSuyu);
                        IdealKilo1 = String.valueOf(IdealKilo);

                        VeriTabani vt = new VeriTabani(MainActivity.this);
                        vt.VeriEkle("Kadin",boy,kilo,yas,VucutKitle,VucutYuzey,YagsizVucut,VucutSuyu,IdealKilo);
                        break;
                    }
                }
                    Intent intent = new Intent(getApplicationContext(),SonucActivity.class);
                    intent.putExtra("VucutKitle1",VucutKitle1);
                    intent.putExtra("VucutYuzey1",VucutYuzey1);
                    intent.putExtra("YagsizVucut1",YagsizVucut1);
                    intent.putExtra("VucutSuyu1",VucutSuyu1);
                    intent.putExtra("IdealKilo1",IdealKilo1);
                    intent.putExtra("kilom",kilom);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Lütfen Boş Alan Bırakmayınız!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bTemizle = findViewById(R.id.bTemizle);
        bTemizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etBoy.setText("");
                etKilo.setText("");
                etYas.setText("");
            }
        });
    }
}
