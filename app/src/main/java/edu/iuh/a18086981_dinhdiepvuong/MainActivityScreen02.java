package edu.iuh.a18086981_dinhdiepvuong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivityScreen02 extends AppCompatActivity {
    GridView glvGiay;
    Screen02Adapter adt;
    ArrayList<Giay> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen02);

        glvGiay = findViewById(R.id.gvList);
        arrayList = new ArrayList<>();

        arrayList.add(new Giay(R.drawable.shoes_rm_preview_a, "Nike SOS", "$ 700"));
        arrayList.add(new Giay(R.drawable.shoes_rm_yellow, "Nylon", "$ 500"));
        arrayList.add(new Giay(R.drawable.shoes_rm_preview_a, "Nike SOS", "$ 700"));
        arrayList.add(new Giay(R.drawable.shoes_rm_yellow, "Nylon", "$ 500"));

        adt = new Screen02Adapter(MainActivityScreen02.this, R.layout.item_girlview, arrayList);
        glvGiay.setAdapter(adt);
    }
}