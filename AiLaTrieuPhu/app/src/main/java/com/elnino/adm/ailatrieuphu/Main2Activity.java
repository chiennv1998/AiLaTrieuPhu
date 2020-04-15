package com.elnino.adm.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.elnino.adm.ailatrieuphu.adapter.TienThuongAdapter;
import com.elnino.adm.ailatrieuphu.object.Cauhoi;
import com.elnino.adm.ailatrieuphu.object.FaceData;

import java.util.ArrayList;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {
   ListView lsvTienThuong;
   TienThuongAdapter tienThuongAdapter;
   ArrayList<String> arrTienThuong;
   Cauhoi cauHoi;
   int viTriCauHoi = 1;
   ArrayList<TextView> arrTxvCauTraLoi;
   TextView txvCauHoi,txvCauTl1,txvCauTl2,txvCauTl3,txvCauTl4,txvThuaGame;
    String cauTraLoi;
    FaceData faceData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        anhxa();
        setUp();
        setClick();
    }
    public void init(){
        arrTienThuong = new ArrayList<>();
        arrTienThuong.add("1000000");
        arrTienThuong.add("500000");
        arrTienThuong.add("250000");
        arrTienThuong.add("125000");
        arrTienThuong.add("64000");
        arrTienThuong.add("32000");
        arrTienThuong.add("16000");
        arrTienThuong.add("8000");
        arrTienThuong.add("4000");
        arrTienThuong.add("2000");
        arrTienThuong.add("1000");
        arrTienThuong.add("500");
        arrTienThuong.add("300");
        arrTienThuong.add("200");
        arrTienThuong.add("100");


        tienThuongAdapter = new TienThuongAdapter(this,0,arrTienThuong);
        cauHoi = new Cauhoi();

        arrTxvCauTraLoi = new ArrayList<>();
        faceData = new FaceData();

    }
    public void anhxa(){
        lsvTienThuong = findViewById(R.id.lsvTienThuong);
        txvCauHoi = findViewById(R.id.txvCauHoi);
        txvCauTl1 = findViewById(R.id.txvCauTl1);
        txvCauTl2 = findViewById(R.id.txvCauTl2);
        txvCauTl3 = findViewById(R.id.txvCauTl3);
        txvCauTl4 = findViewById(R.id.txvCauTl4);
        txvThuaGame = findViewById(R.id.txv_ThuaGame);

        arrTxvCauTraLoi.add(txvCauTl1);
        arrTxvCauTraLoi.add(txvCauTl2);
        arrTxvCauTraLoi.add(txvCauTl3);
        arrTxvCauTraLoi.add(txvCauTl4);
    }
    public void setUp(){
        txvThuaGame.setVisibility(View.GONE);

        lsvTienThuong.setAdapter(tienThuongAdapter);
        hienCauHoi();
    }
    public void setClick(){
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 checkCauTraLoi(((TextView)view));
            }
        };
        for (TextView t:arrTxvCauTraLoi){
            t.setOnClickListener(listener);
        }
    }
    public void checkCauTraLoi(final TextView txv){
        cauTraLoi = txv.getText().toString();
        txv.setBackgroundResource(R.drawable.bg_cau_chon);
        new CountDownTimer(2000,100) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                for (TextView t:arrTxvCauTraLoi){
                    String s = t.getText().toString();
                    if (s.equals(cauHoi.getDapAnDung())){
                        t.setBackgroundResource(R.drawable.bg_cau_dung);
                        break;
                    }
                }
                new CountDownTimer(2000,100){

                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {
                        if (cauTraLoi.equals(cauHoi.getDapAnDung())){
                            viTriCauHoi++;
                            if (viTriCauHoi>15){
                                viTriCauHoi =15;
                                txvThuaGame.setVisibility(View.VISIBLE);
                                txvThuaGame.setText("Bạn đã trở thành triệu phú \n"+arrTienThuong.get(0)+"$");
                                return;
                            }
                            hienCauHoi();
                        }else {
                            txvThuaGame.setVisibility(View.VISIBLE);
                            int viTritienThuong = (viTriCauHoi/5)*5;
                            txvThuaGame.setText("Bạn sẽ ra về với số tiền thưởng \n"+arrTienThuong.get(14-viTritienThuong)+"$");
                        }

                    }
                }.start();

            }
        }.start();

    }
    public void setCauHoi(){
        cauHoi = faceData.taoCauHoi(viTriCauHoi);
    }
    public void hienCauHoi(){
        setCauHoi();
        txvCauHoi.setText(cauHoi.getNoiDung());
        ArrayList<String> arrCauTraLoi = new ArrayList<>(cauHoi.getArrDapAnSai());
        arrCauTraLoi.add(cauHoi.getDapAnDung());
        Random r = new Random();
        for (int i=0 ;i<5 ; i++){
            int vt1 = r.nextInt(arrCauTraLoi.size());
            int vt2 = r.nextInt(arrCauTraLoi.size());
            String a = arrCauTraLoi.get(vt1);
            arrCauTraLoi.set(vt1,arrCauTraLoi.get(vt2));
            arrCauTraLoi.set(vt2,a);
        }
        for (int i=0;i<arrTxvCauTraLoi.size();i++){
            arrTxvCauTraLoi.get(i).setBackgroundResource(R.drawable.bg_btn);
            arrTxvCauTraLoi.get(i).setText(arrCauTraLoi.get(i));
        }
        tienThuongAdapter.setViTriCauHoi(viTriCauHoi);
    }
}
