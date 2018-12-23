package com.example.acerv17nitro.diyet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DiyetListesi extends SonucActivity {

    Button bMail;
    EditText etMail;
    String kilo,VucutKitle,VucutYuzey,YagsizVucut,VucutSuyu,IdealKilo,message,durum;
    int kilom;
    TextView tvMessage;
    Context context = con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);

        tvMessage = findViewById(R.id.tvMessage);
        final Intent intent = this.getIntent();
        kilo = intent.getStringExtra("kilom");
        VucutKitle = intent.getStringExtra("VucutKitle1");
        VucutYuzey = intent.getStringExtra("VucutYuzey1");
        YagsizVucut = intent.getStringExtra("YagsizVucut1");
        VucutSuyu = intent.getStringExtra("VucutSuyu1");
        IdealKilo = intent.getStringExtra("IdealKilo1");
        durum = intent.getStringExtra("durum");

        kilom = Integer.parseInt(kilo);
        etMail = findViewById(R.id.etMail);
        bMail = findViewById(R.id.bMail);


        message = durum+"\n"+
                "Vücut Kitle Endeksi : "+ VucutKitle+"\n"+
                "Vücut Yüzey Alanı : "+ VucutYuzey+"\n"+
                "Yağsız Vücut Ağırlığı : "+ YagsizVucut+"\n"+
                "Vücut Su Miktarı : "+ VucutSuyu+"\n"+
                "İdeal Kilonuz : "+ IdealKilo+"\n\n"+
                "SİZE ÖZEL HAZIRLANMIŞ DİYET LİSTENİZ AŞAĞIDAKİ GİBİDİR: \n\n";

        if(kilom >= 50 || kilom <= 65)
        {
            message += "1. Gün\n" +
                    "Sabah: 1 tane haşlanmış yumurta, 2 dilim kızarmış kepek ekmek, 8 tane sapları ile beraber maydanoz ve kibrit kutusu büyüklüğünde yağsız beyaz peynir ve domates, salatalık\n" +
                    "fasıla: 1 kase light yoğurt (içerisine üç tane ceviz, yarım tatlı kaşığı tarçın ve 1.5 tatlı kaşığı kabaca öğütülmüş keten tohumu konulacak), kabuklarıyla 1 tane yeşil elma\n" +
                    "ara: 1 bardak zencefill ve tarçınlı, şekersiz ve az yağlı süt\n" +
                    "Akşam: 200 gram az yağsız ızgara balık, 1.5 porsiyon taze fasulye ve yeşil salata\n" +
                    "Gece: 4 tane kuru kayısı\n" +
                    "2. Gün\n" +
                    "Sabah: 5 kaşık yalın müsli, 5 kaşık orta yağlı yoğurt üzerine bol tarçın, 5 adet fındık\n" +
                    "ara: 1 tane kabuğu ile beraber yeşil elma\n" +
                    "öğle: 1 kase patates ve havuç konulmadan oluşturulmuş olan sebze çorbası, 100 gram tavuk göğüs ızgara\n" +
                    "fasıla: 2 tane kivi\n" +
                    "ara: 1 kase taze yağsız yoğurt\n" +
                    "Akşam: 5 kaşık bulgur pilavı, 5 kaşık az yağlı nohut ve söğüş salata\n" +
                    "Gece:1 adet kabuklu yeşil elma\n" +
                    "3. Gün\n" +
                    "Sabah vakti : 2 dilim kızarmış tam tahıl ekmeğinden taze kaşarlı yağsız tost yapın , şekersiz çay\n" +
                    "ara: 2 tane orta boy salatalık\n" +
                    "öğle: 1 kase süzülmemiş mercimek çorbası, 4 adet orta boy az yağlı ızgara köfte, üç adet hafif acı sivri biber\n" +
                    "fasıla: 1 kase light yoğurt (içine az miktarda yulaf ezmesi konulacak)\n" +
                    "Akşam: 4 kaşık esmer makarna, 5 kaşık bol soğanlı, sarımsaklı ıspanak kavurma\n" +
                    "Gece: Yarım avuç tuzsuz kabak çekirdeği\n" +
                    "4. Gün\n" +
                    "Sabah: üç kaşık yalın müsli, 2 kaşık yulaf ezmesi, 1 bardak yağsız süt, üç tane ceviz\n" +
                    "ara: 2 dilim taze ananas\n" +
                    "öğle: 1 kase sebze çorbası, 3 tane haşlanmış yumurta beyazı, 1 yumurta sarısında bol maydanozlu, acı sivri biberli yağsız omlet, söğüş roka\n" +
                    "ara: 1 bardak yağsız orta tuzlu ayran\n" +
                    "Akşam: 1 kase etsiz, az yağlı, bol kırmızı biberli yeşil mercimek yemeği, 1 dilim kızarmış kepek ekmeği\n" +
                    "Gece: Küçük bir avuç elma kurusu ve 1 çorba kaşığı tuzsuz sarı leblebi\n" +
                    "5. Gün\n" +
                    "Sabah: 1 tane küçük muz, 1 tane greyfurt\n" +
                    "öğle: 1 porsiyon tavuk şiş, 1 porsiyon ızgara sebze (kabak, kırmızı biber, yeşil biber, ıspanak, pazı, brokoli gibi)\n" +
                    "fasıla: 1 bardak yağsız ayran\n" +
                    "ara: 6-7 adet mürdüm eriği\n" +
                    "Akşam: 4-5 kaşık bulgur pilavı, 1 porsiyon brokoli\n" +
                    "Gece: Küçük bir avuç sarı leblebi, 1 tane kabuklu yeşil elma\n" +
                    "6. Gün\n" +
                    "Gün boyunca lahana çorbası içilecek\n" +
                    "7. Gün\n" +
                    "Sabah: 1 tane haşlanmış yumurta, 2 dilim kepek ekmek, 7 tane saplarıyla beraber maydanoz, 7 adet az yağlı zeytin, 1 tatlı kaşığı az şekerli kayısı marmelatı\n" +
                    "fasıla: 1 kase yağsız yoğurdun içine 3 ceviz içi, bol tarçın, zencefil, üç kayısı doğranacak\n" +
                    "ara: 1 tane yeşil elma\n" +
                    "Akşam: 1 kase ıspanak çorbası, 100 gram ızgara bonfile, yeşil salata\n" +
                    "Gece: Küçük bir avuç çekirdekli siyah üzüm\n" +
                    "Diyetin Kuralları\n" +
                    "Yemek yerken sıvı alınmayacak.\n" +
                    "Yemek yedikten 20 dakika sonrası nedeni ile bol miktarda yeşil çay veya yasemin çayı içilecek.\n" +
                    "Yemekler küçük lokmalar biçiminde yenecek.\n" +
                    "Her gün sabah erken yahut akşam üstü 45 dakika, orta tempoda, iyice ter atacak biçimde tempolu yürüyüş veya spor yapılacak.\n" +
                    "Yemeklerde başta zencefil, pul biber, acı yeşil sivri biber olmak üzere belli miktarda acı artırılacak.\n" +
                    "1 hafta süresince tok karnına tatlı kesinlikle beyaz un, beyaz şeker, domates, kızartma, alkol tüketilmeyecek.";
            tvMessage.setText(message);
        }
        else if(kilom >= 66 || kilom <= 80)
        {
            message += "1. gün\n" +
                    "Sabah: 1 dilim tam buğday ekmeği, 1 adet haşlanmış yumurta, 1 bardak şekersiz çay\n" +
                    "\n" +
                    "Öğlen: 1 porsiyon az yağlı ya da yağsız sebze yemeği, 1 kase yoğurt\n" +
                    "\n" +
                    "Akşam: 1 kase sebze çorbası (kremasız), 1 büyük kase bol yeşillikli salata (bol yağ içeren malzemelerle hazırlanan salata sosları kullanılmamalı)\n" +
                    "\n" +
                    "2. gün\n" +
                    "Sabah: 1 dilim tam buğday ekmeği, 2 dilim beyaz peynir, 1 bardak şekersiz çay\n" +
                    "\n" +
                    "Öğlen: 100 gram kırmızı et, 1 büyük kase bol yeşillikli salata\n" +
                    "\n" +
                    "Akşam: 1 porsiyon haşlanmış sebze\n" +
                    "\n" +
                    "3. gün\n" +
                    "Sabah: 1 su bardağı az yağlı süt, 1 adet haşlanmış yumurta, 1 bardak şekersiz çay\n" +
                    "\n" +
                    "Öğlen: 1 kase sebze çorbası, 1 büyük kase bol yeşillikli salata\n" +
                    "\n" +
                    "Akşam: 200 gram ızgara balık, 1 büyük kase bol yeşillikli salata\n" +
                    "\n" +
                    "Tüm bunlara ek olarak 3 gün sürecek diyet boyunca ara öğünlerde bol bol ayran ve bitki çayı içebilir, kendinizi zor durumda kalacak kadar aç hissettiğiniz anlarda işlem görmemiş ceviz içi, fındık, badem gibi kuru yemişlerden çok az miktarda yiyebilirsiniz. Yine diyet boyunca gün içinde bol bol su içmeyi de asla ihmal etmemelisiniz.";
                    tvMessage.setText(message);
        }
        else if(kilom >= 81 || kilom <= 95)
        {
             message += "Sabah\n" +
                    "Kepekli ekmek ( 1 dilim )\n" +
                    "Çilek reçeli ( 1 tatlı kaşığı )\n" +
                    "Salatalık ( 1 adet )\n" +
                    "Meyve ( 1 adet )\n" +
                    "Kahvaltı saat 9’dan önce yapılmalıdır.\n" +
                    "\n" +
                    "Öğle\n" +
                    "Tam buğday ekmeği ( 1 dilim )\n" +
                    "Et haşlama ( 1 porsiyon )\n" +
                    "Domates ( 1 adet )\n" +
                    "Yoğurt ( 1 kase )\n" +
                    "Öğle yemeğinizi yedikten 15 dakika sonra 1 fincan kahve ya da çay içilebilir.\n" +
                    "\n" +
                    "Akşam\n" +
                    "Kızarmış ekmek ( 1 dilim )\n" +
                    "Salata ( 1 kase )\n" +
                    "Ayran ( 1 bardak )\n" +
                    "Uyumadan önce 1 fincan ıhlamur içilebilir.";
            tvMessage.setText(message);
        }
        else if(kilom >= 96 || kilom<= 110)
        {
             message += "Kahvaltı Vakti: Göbek Eriten kahvaltı Sandviçi – Kalori Miktarı: 350\n" +
                    "\n" +
                    "2 dilim tam tahıllı ekmek\n" +
                    "1 tane haşlanmış yumurta\n" +
                    "Süzme peynir 1 dilim\n" +
                    "1 marul yaprağı\n" +
                    "Dilim domates\n" +
                    "1/4 kase avokado dilimi\n" +
                    "\n" +
                    "Öğle Yemeği Vakti: Köfte – Kalori Miktarı: 343\n" +
                    "\n" +
                    "2 tane köfte\n" +
                    "Yarım tam tahıllı lavaş veya tam tahıllı ekmek\n" +
                    "Lor peyniri 1 çorba kaşığı\n" +
                    "1 çorba kaşığı kadar zeytinyağı\n" +
                    "\n" +
                    "Akşam Yemeği: Tavuklu Makarna – Kalori Miktarı: 344\n" +
                    "\n" +
                    "1/3 paket kepekli makarna\n" +
                    "80-100 gram ızgara tavuk göğüs\n" +
                    "5-6 adet çeri domates\n" +
                    "Yarım kase kadar rendelenmiş havuç\n" +
                    "Lor peyniri 1 çorba kaşığı\n" +
                    "\n" +
                    "Diyet Programı / 2. Gün\n" +
                    "Kahvaltı Vakti: Yoğurtlu Meyve ve Badem – Kalori Miktarı: 345\n" +
                    "\n" +
                    "Tahıllı mısır gevreği 1 kase\n" +
                    "125 gram az yağlı yoğurt\n" +
                    "Yaban mersini yarım kase\n" +
                    "2 çorba kaşığı kadar badem\n" +
                    "\n" +
                    "Öğle Yemeği Zamanı: Tavuklu Marul Sandviçi – Kalori Miktarı: 356\n" +
                    "\n" +
                    "50 gram tavuk göğüsü ızgara\n" +
                    "1 tane rendelenmiş havuç\n" +
                    "4 adet marul yaprağı\n" +
                    "Yanında bir kase içerisinde:\n" +
                    "1 tane dilimlenmiş havuç\n" +
                    "2 çorba kaşığı kadar humus\n" +
                    "1 çorba kaşığı kadar çam fıstığı\n" +
                    "\n" +
                    "Akşam Yemeği Vakti: California Burger – Kalori Miktarı: 358\n" +
                    "\n" +
                    "Burger köfteyi 2 dilim tam tahıllı ekmek arasına koyu\n" +
                    "İçine 1 çorba kaşığı kadar hardal\n" +
                    "3 tane büyük marul yaprağı\n" +
                    "Yarım dilimlenmiş domates\n" +
                    "Azcıkta dilimlenmiş soğan\n" +
                    "\n" +
                    "Diyet Programı / 3. Gün\n" +
                    "Kahvaltı Vakti: Çilekli Cevizli Yulaf – Kalori Miktarı: 341\n" +
                    "\n" +
                    "2/3 kase yulafı suda haşlayın\n" +
                    "4-5 çilek ekleyin\n" +
                    "Üzerine 2 tam ceviz koyun\n" +
                    "\n" +
                    "Öğle Yemeği: Somon Sandviç – Kalori Miktarı: 334\n" +
                    "\n" +
                    "2 dilim tam tahıllı ekmek\n" +
                    "2 çorba kaşığı siyah zeytin ezmesi\n" +
                    "85gr somon\n" +
                    "Yarım domates\n" +
                    "2 büyük marul yaprağı\n" +
                    "\n" +
                    "Akşam Yemeği: Tavuk Yemeği – Kalori Miktarı: 325\n" +
                    "\n" +
                    "50gr ızgara tavuk göğüs\n" +
                    "Yanında salata için:\n" +
                    "Haşlanmış Yarım kase kadar kepekli pirinç\n" +
                    "1 Domates\n" +
                    "2 yemek kaşığı Lor Peyniri\n" +
                    "2 taze fesleğen yaprağı\n" +
                    "1 çorba kaşığı zeytinyağı\n" +
                    "1 çorba kaşığı balsamik sirke\n" +
                    "\n" +
                    "Diyet Programı / 4. Gün\n" +
                    "Kahvaltı Vakti: Muz Parçalı Yulaf Yemeği – Kalori Miktarı: 356\n" +
                    "\n" +
                    "Yarım kase kadar yulafı suda haşlayın\n" +
                    "Üzerine 3-4 tane çilek ekleyin\n" +
                    "1 tane muzu dilimleyin\n" +
                    "2 parça bitter çikolatayı bıçakla küçük parçalar olucak şekilde kesin ve üzerine serpin\n" +
                    "badem ekleyin 2 çorba kaşığı kadar\n" +
                    "\n" +
                    "Öğle Yemeği Vakti: Acılı Tavuklu Makarna – Kalori Miktarı: 348\n" +
                    "\n" +
                    "1/4 paket kepekli penne makarna\n" +
                    "85 gram ızgara tavuk göğüsü\n" +
                    "5-6 tane çeri domates\n" +
                    "2 rendelenmiş havuç\n" +
                    "2 çorba kaşığı kadar rendelenmiş parmesan peyniri\n" +
                    "\n" +
                    "Akşam Yemeği Vakti: Meksika Salatası – Kalori Miktarı: 351\n" +
                    "\n" +
                    "1 kase karışık yeşillik\n" +
                    "Yarım konserve suyu süzülmüş fasulye\n" +
                    "2 tane yeşil biber\n" +
                    "3/4 kase tatlı mısır\n" +
                    "Dilimlenmiş yarım soğan\n" +
                    "\n" +
                    "Diyet Programı / 5. Gün\n" +
                    "Kahvaltı Vakti: Fındık Ezmeli Menü – Kalori Miktarı: 318\n" +
                    "\n" +
                    "1 tam tahıllı ekmek diliminin üzerine 2 çorba fındık ezmesi sürün\n" +
                    "Yanında 1 çorba kaşığı kuru üzüm tüketin\n" +
                    "\n" +
                    "Öğle Yemeği Vakti: Ton Balığı Sandviçi – Kalori Miktarı: 337\n" +
                    "\n" +
                    "1 dilim tam tahıllı ekmek\n" +
                    "80 gram ton balığı\n" +
                    "4 çorba kaşığı kadar rendelenmiş parmesan peyniri\n" +
                    "Tüm malzemeleri ekmek diliminin üstüne koyup fırında ısıtarak da yiyebilirsiniz.\n" +
                    "\n" +
                    "Akşam Yemeği Vakti: Sucuklu Pizza – Kalori Miktarı: 325\n" +
                    "\n" +
                    "Yarım lavaş ekmeğiningüzelce bir tarafını zeytinyağı ile yağlayın ardından üzerine domates püresi veya sosu sürün\n" +
                    "13 dilimkadar  sucuk serpin\n" +
                    "Mozarella peyniri ekleyin yoksa parmesan peyniri de olur\n" +
                    "Fırına atın ve peynirlerimiz eriyince afiyetle yiyin.\n" +
                    "\n" +
                    "Diyet Programı / 6. Gün\n" +
                    "Kahvaltı Vakti: Peynirli Tost – Kalori Miktarı: 364\n" +
                    "\n" +
                    "Tam tahıllı tost ekmeği 1 dilim\n" +
                    "Üzerine 1 çorba kaşığı kadar ricotta peyniri (bulamazsanız normal market peyniride olur)\n" +
                    "2 çorba kaşığı kadar ceviz\n" +
                    "Yanında 1 elma ile servise hazır\n" +
                    "\n" +
                    "Öğle Yemeği Vakti: Vejeteryan Lavaş – Kalori Miktarı: 314\n" +
                    "\n" +
                    "1 lavaşın arasına 1 köfte koyun\n" +
                    "İçine diğer ek malzemeler:\n" +
                    "Yarım kase kadar dilimlenmiş ıspanak\n" +
                    "1 yeşil soğan (dilimlenmiş)\n" +
                    "Dilimlenmiş yarım avokado\n" +
                    "\n" +
                    "Akşam Yemeği Vakti: Somon Bifteği – Kalori Miktarı: 359\n" +
                    "\n" +
                    "100 gram ızgara somon\n" +
                    "Haşlanmış yeşil bezelye\n" +
                    "2 çorba kaşığı kadar badem\n" +
                    "\n" +
                    "Diyet Programı / 7. Gün\n" +
                    "Kahvaltı Vakti: Lavaşlı Kahvaltı – Kalori Miktarı: 327\n" +
                    "\n" +
                    "Yarım lavaş ekmeğini ısıtın\n" +
                    "İçine de:\n" +
                    "Süt çırpılmış 2 yumurta beyazı\n" +
                    "Yarım kase kadar dilimlenmiş ıspanak\n" +
                    "Dilimlenmiş yarım avokado\n" +
                    "\n" +
                    "Öğle Yemeği Vakti: Piknik – Kalori Miktarı: 355\n" +
                    "\n" +
                    "tam tahıllı ekmek dilimi 2 tane\n" +
                    "1 çorba kaşığı kadar hardal\n" +
                    "10 dilim sucuk\n" +
                    "8 tane siyah üzüm\n" +
                    "2-3 dilimlenmiş havuç\n" +
                    "2 çorba kaşığı kadar humus\n" +
                    "\n" +
                    "Akşam Yemeği Vakti: Fırında Peynirli Ispanaklı Makarna – Kalori Miktarı: 327\n" +
                    "\n" +
                    "Penne makarna yarım kase\n" +
                    "1 çorba kaşığı kadar zeytinyağı\n" +
                    "1 çorba kaşığı kadar ricotta peyniri\n" +
                    "2 çorba kaşığı kadar lor peyniri\n" +
                    "Yarım kase dilimlenmiş ıspanak\n" +
                    "Yarım soğan dilimlenmiş\n" +
                    "Yarım kase kadar domates püresi & sosu\n" +
                    "Tüm malzemeleri güzelce bir fırın kabına alın sonra karıştırın ve peynirler eriyinceye kadar ısıtın servise hazır. Öğün aralarında çok acıkırsanız 1 avuç ceviz içi ve badem yiyebilirsiniz.";
            tvMessage.setText(message);
        }
        else if(kilom >= 111 || kilom <= 130)
        {
            message += "sabah Vakti\n" +
                    "*1 dilim tam buğday ekmeği ile\n" +
                    "*Az yağlı peynir\n" +
                    "*Lop yumurta ve\n" +
                    "*Maydanoz, sivri biber\n" +
                    "*1 tatlıkaşığı kadar bal\n" +
                    "Öğlen Vakti\n" +
                    "*1porsiyon tavuk yada balık veya\n" +
                    "* Yeşillikleri bol bir salata ile\n" +
                    "*1Porsiyon kadar zeytin yağlı kabak yada ıspanak yiyin yada pazı yemeği\n" +
                    "Ara Öğün\n" +
                    "*Sütlaç yada puding bol tarcınlı olabilir\n" +
                    "*1kivi veya muz ile\n" +
                    "*1 avuç ceviz yada badem yiyebilirsiniz\n" +
                    "Akşam Vakti\n" +
                    "*Çorba(mercimek veya diğer baklagillerden) tüketebilirisniz\n" +
                    "*ıspanaklı börek(sıvı yağ ile yapılmış) olsun\n" +
                    "*Közlenmiş biber ile\n" +
                    "*Zeytin yağlı taze fasulye\n" +
                    "Gece Vakti\n" +
                    "*Fırında meyve veya tarçınlı cevizli meyve salatası yiyebilirsiniz\n" +
                    "*çekirdekli siyah üzümde yiyebilirisiniz sindiriminizi rahatlatacaktır.\n" +
                    "\n" +
                    "Not :  Ayrıca gün içersinde 4-5 bardak yeşil çayveya rezene içerseniz hızlı sonuç alabilir sindirim sistemini düzeltebilirsiniz. Sağlıklı ve Formda bir hayat geçirmeniz dileklerimizle.";
            tvMessage.setText(message);
        }

        bMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String mail = etMail.getText().toString();
                String aEmailList[] = { mail };
                int et = mail.indexOf('@');
                int com = mail.indexOf(".com");

                if (mail.length() <= 0 && et==-1 && com==-1) {
                    Toast.makeText(con, "Geçerli Bir Mail Adresi Giriniz!", Toast.LENGTH_LONG).show();
                } else {
                    Intent email = new Intent(Intent.ACTION_SEND);
                    email.setType("plain/text");
                    email.putExtra(Intent.EXTRA_SUBJECT, "Verileriniz ve Diyet Listeniz");//Email konusu.
                    email.putExtra(Intent.EXTRA_TEXT, message);// Email içeriği.
                    startActivity(Intent.createChooser(email, "E-mail Göndermek için Seçiniz:"));
                    email.putExtra(Intent.EXTRA_EMAIL, aEmailList);
                    startActivity(email);
                }
            }
        });
    }

}
