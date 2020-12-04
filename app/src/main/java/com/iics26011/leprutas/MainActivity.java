package com.iics26011.leprutas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        BottomNavigationView bottomNavigationView = findViewById(R.id.nav);
        NavController navController = Navigation.findNavController(this, R.id.fragment);

        // Setup
        bottomNavigationView.setOnNavigationItemReselectedListener(v -> {});
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}