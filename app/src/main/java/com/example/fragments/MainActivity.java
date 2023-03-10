package com.example.fragments;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btnOne, btnTwo, btnThree;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTwo=findViewById(R.id.buttonFragmentTwo);
        btnOne = findViewById(R.id.buttonFragmentOne);
        btnThree=findViewById(R.id.buttonFragmentThree);
        //linearLayout = findViewById(R.id.layoutMainActivity);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                FragmentOne fragmentOne = new FragmentOne();
//                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
//                transaction.replace(R.id.layoutMainActivity, fragmentOne);
//                transaction.commit();
                ITAfternoonFragment fragmentOne = new ITAfternoonFragment();
                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layoutMainActivity, fragmentOne);
                transaction.commit();
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CSMFragment fragment = new CSMFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layoutMainActivity,fragment);
                transaction.commit();
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CSAfternoonFragment f3=new CSAfternoonFragment();
                FragmentTwo fragment = new FragmentTwo();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layoutMainActivity2,fragment);
                transaction.commit();
            }
        });
    }
}