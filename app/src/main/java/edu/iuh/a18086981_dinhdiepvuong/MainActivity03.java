package edu.iuh.a18086981_dinhdiepvuong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main03);

        Intent intent = getIntent();
        Giay giay = (Giay) intent.getSerializableExtra("giaychitiet");

        ImageView imvCt = findViewById(R.id.imgvCt);
        TextView tvNameCt = findViewById(R.id.tvNameCt);
        TextView tvPriceCt = findViewById(R.id.tvPriceCt);

        imvCt.setImageResource(giay.getImgGiay());
        tvNameCt.setText(giay.getNameGiay());
        tvPriceCt.setText(giay.getPriceGiay());
    }
}