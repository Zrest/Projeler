package com.example.sehirtanitmakonya42;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class KonyaAdaptorAlihan extends BaseAdapter {
    private Context Cntxt1;
    private ArrayList<Eser> GelenEserler;
    private static LayoutInflater Ly_inflater=null;

    public KonyaAdaptorAlihan(Context context,ArrayList<Eser> Liste){
        this.Cntxt1=context;
        this.GelenEserler=Liste;
        Ly_inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return GelenEserler.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View K_view=convertView;
        if (K_view==null){
            K_view=Ly_inflater.inflate(R.layout.sablon,null);
        }else{
            K_view=convertView;
        }
        ImageView resim1=(ImageView)K_view.findViewById(R.id.E_resim);
        TextView ad1=(TextView)K_view.findViewById(R.id.E_ad);
        TextView tarih1=(TextView)K_view.findViewById(R.id.E_tarih);
        TextView aciklama1=(TextView)K_view.findViewById(R.id.E_acıklama);

        Eser SecilenEser=GelenEserler.get(position);
        resim1.setImageResource(SecilenEser.eser_resim);
        ad1.setText(SecilenEser.eser_ad);
        tarih1.setText(SecilenEser.eser_tarih);
        aciklama1.setText(SecilenEser.eser_acıklama);

        return K_view;
    }
}
