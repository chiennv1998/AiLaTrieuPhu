package com.elnino.adm.ailatrieuphu.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.elnino.adm.ailatrieuphu.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TienThuongAdapter extends ArrayAdapter<String> {
    Context mct;
    ArrayList<String> arr;
    int viTriCauHoi = 1;

    public TienThuongAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        this.mct = context;
        this.arr = new ArrayList<>(objects);
    }
    public void setViTriCauHoi(int viTriCauHoi){
        this.viTriCauHoi = viTriCauHoi;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView ==null) {
            LayoutInflater inflater = (LayoutInflater)mct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_tien_thuong,null);
        }
        if (arr.size()>0){
            int pos = 15 - position;
            TextView txtTienThuong = convertView.findViewById(R.id.txt_tienthuong);
            if (pos%5==0){
                txtTienThuong.setTextColor(Color.parseColor("#ffffff"));
            }else {
                txtTienThuong.setTextColor(Color.parseColor("#FFFF9800"));
            }
            String khoangtrang;
            if (pos/10>0){
                khoangtrang = "     ";

            }else {
                khoangtrang = "      ";
            }
            String textHienThi = pos +khoangtrang+"$"+arr.get(position);
            txtTienThuong.setText(textHienThi);
            if (pos == viTriCauHoi){
                txtTienThuong.setBackgroundColor(Color.parseColor("#FFFF9800"));
                txtTienThuong.setBackgroundColor(Color.parseColor("#9C27B0"));
            }else {
                txtTienThuong.setBackgroundColor(Color.parseColor("#00FF9800"));
            }
        }
        return convertView;
    }
}
