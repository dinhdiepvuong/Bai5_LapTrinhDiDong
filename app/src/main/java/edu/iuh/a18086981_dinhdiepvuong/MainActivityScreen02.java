package edu.iuh.a18086981_dinhdiepvuong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivityScreen02 extends AppCompatActivity {
    GridView glvGiay;
    Screen02Adapter adt;
    ArrayList<Giay> arrayList;
    Button btnBoy, btnGirl, btnAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen02);

        glvGiay = findViewById(R.id.gvList);
        btnBoy = findViewById(R.id.btnBoy);
        btnGirl = findViewById(R.id.btnGirl);
        btnAll = findViewById(R.id.btnAll);
        arrayList = new ArrayList<>();

        arrayList.add(new Giay(R.drawable.shoes_rm_preview_a, "Nike SOS boy", "$ 700"));
        arrayList.add(new Giay(R.drawable.shoes_rm_yellow, "Nylonboy", "$ 560"));
        arrayList.add(new Giay(R.drawable.shoes_rm_preview_b, "Nike SOS girl", "$ 350"));
        arrayList.add(new Giay(R.drawable.shoes_rm_preview, "Nylon", "$ 400"));

        adt = new Screen02Adapter(MainActivityScreen02.this, R.layout.item_girlview, arrayList);
        glvGiay.setAdapter(adt);

        btnBoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adt.filterBoy();
                adt.setActiveButton(btnBoy, btnAll, btnGirl);
            }
        });
        btnGirl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adt.filterGirl();
                adt.setActiveButton(btnGirl, btnAll, btnBoy);
            }
        });
        btnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adt.allGiay();
                adt.setActiveButton(btnAll, btnBoy, btnGirl);
            }
        });

    }
}