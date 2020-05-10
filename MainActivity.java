package com.example.sehirtanitmakonya42;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView KonyaEserler;
    ArrayList<Eser> Eserler=new ArrayList<>();
    KonyaAdaptorAlihan BaglaAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KonyaEserler=(GridView)findViewById(R.id.esr_grdv);

        Eserler.add(new Eser(R.drawable.catalhoyuk,"Çatalhöyük Neolitik Kenti","1958","Çatalhöyük, Neolitik Dönem’e ait en eski yerleşimlerden bir tanesi olarak tanımlanır."));
        Eserler.add(new Eser(R.drawable.mevlana,"Mevlâna Türbesi Müzesi","1926","Mevlana Müzesi, Konya'da bulunan, eskiden Mevlâna'nın dergâhı olan yapı kompleksinde 1926 yılından beri faaliyet gösteren müzedir."));
        Eserler.add(new Eser(R.drawable.sille,"Sille Köyü","MS 327","Bu eski Rum köyü zengin tarihiyle Konya'nın keşfedilmesi gereken önemli noktalardan biridir."));
        Eserler.add(new Eser(R.drawable.esrefoglu,"Eşrefoğlu Cami","1296-1299","Selçuklu tipi ahşap sütunlu camiler, Osmanlı camilerinden daha bir cezbedici özelliğe sahiptir."));
        Eserler.add(new Eser(R.drawable.inceminaremedrese,"İnce Minareli Medrese","1956","Bir Selçuklu yapıtı olan İnce Minareli Medrese, Konya'da turistlerin en çok ziyaret ettiği yerlerden biridir."));
        Eserler.add(new Eser(R.drawable.selcuklukosk,"Selçuklu Köşkü","1156-1192","Konya'nın tarihi dokusunu gözler önüne seren Selçuklu Köşkü, II. Sultan Kılıç Arslan döneminde yapılmıştır."));
        Eserler.add(new Eser(R.drawable.tinaztepe,"Tınaztepe Mağarası","1968"," Mağaranın uzunluğu 22 km'dir ve bu özelliği onu ülkemizin en büyük mağarası olma unvanını getirmiştir."));
        Eserler.add(new Eser(R.drawable.beysehirgol,"Beyşehir Gölü","---","Konya'nın Beyşehir ilçesinde bulunan Beyşehir Gölü, Türkiye'nin ikinci büyük gölü olma özelliğine sahiptir."));
        Eserler.add(new Eser(R.drawable.selimiyecami,"Konya Selimiye Camisi","1567","Birçok şehzadenin sancağa çıktığı bu şehir, o dönemlerde inşa edilen yapıların bazılarını günümüze kadar ulaştırmayı başarmıştır."));
        Eserler.add(new Eser(R.drawable.eflatunpinari,"Eflatun Pınarı","1275-1285","Hititler döneminde yapılmış kutsal bir su anıtı olan Eflatun Pınarı, Konya'nın Beyşehir ilçesine 22 km mesafede yer alıyor."));
        Eserler.add(new Eser(R.drawable.sahipata,"Sahipata Külliyesi","1259-1279","Selçuklu mimarisinin en güzel örneklerinden biri olan Sahipata Külliyesi yerli ve yabancı turistlere tarihi izlerini göstermeye devam ediyor."));

        BaglaAdaptor=new KonyaAdaptorAlihan(this,Eserler);
        KonyaEserler.setAdapter(BaglaAdaptor);

        KonyaEserler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Seçilen Eser:"+position, Toast.LENGTH_SHORT).show();
            }
        });






    }
}
