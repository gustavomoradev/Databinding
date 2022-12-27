package com.gustavomoradev.myfirstdatabindingproyect;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.gustavomoradev.myfirstdatabindingproyect.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =  DataBindingUtil.setContentView(this, R.layout.activity_main);

        initActivity();
    }

    private void initActivity() {
        setUpView();
        setUpEvents();
    }

    private void setUpView() {

    }

    private void setUpEvents() {
        binding.header.btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}