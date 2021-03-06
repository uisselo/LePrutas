package com.iics26011.leprutas;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    public static final int UPDATE_FRUIT_ACTIVITY_REQUEST_CODE = 9;
    public static fruitViewModel fruitViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        BottomNavigationView bottomNavigationView = findViewById(R.id.nav);
        NavController navController = Navigation.findNavController(this, R.id.fragment);

        // Setup
        bottomNavigationView.setOnNavigationItemReselectedListener(v -> {
        });
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == UPDATE_FRUIT_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK) {
            // fruitViewModel.update();
        }
    }
}