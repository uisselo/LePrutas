package com.iics26011.leprutas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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

        img.setImageResource(f.getImage());
        name.setText(f.getName());
        sciName.setText(f.getSciName());
        desc.setText(f.getDesc());
        hb1.setText(f.getHb1());
        hb2.setText(f.getHb2());
        hb3.setText(f.getHb3());
        hb4.setText(f.getHb4());
        hb5.setText(f.getHb5());
        trv1.setText(f.getTrv1());
        trv2.setText(f.getTrv2());

        btnLike.setColorFilter(f.isLiked() ? Color.RED : Color.BLACK);
        btnLike.setOnClickListener(view -> {
            btnLike.setColorFilter(f.isLiked() ? Color.BLACK : Color.RED);
            f.setLiked(!f.isLiked());
            MainActivity.fruitViewModel.update(f);
        });
    }
}