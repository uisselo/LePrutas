package com.iics26011.leprutas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;

public class fruitPage extends AppCompatActivity {
    ImageView img;
    TextView name, sciName, desc, hb1, hb2, hb3, hb4, hb5, trv1, trv2;
    ImageButton btnLike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_page);

        fruit f = getIntent().getSerializableExtra("fruit") == null ? null : (fruit) getIntent().getSerializableExtra("fruit");

        img = findViewById(R.id.img);
        name = findViewById(R.id.name);
        sciName = findViewById(R.id.sciName);
        desc = findViewById(R.id.desc);
        hb1 = findViewById(R.id.hb1);
        hb2 = findViewById(R.id.hb2);
        hb3 = findViewById(R.id.hb3);
        hb4 = findViewById(R.id.hb4);
        hb5 = findViewById(R.id.hb5);
        trv1 = findViewById(R.id.trv1);
        trv2 = findViewById(R.id.trv2);
        btnLike = findViewById(R.id.btnLike);

        name.setText(f.getName());
        sciName.setText(f.getSciName());
        desc.setText(f.getDesc());
    }
}