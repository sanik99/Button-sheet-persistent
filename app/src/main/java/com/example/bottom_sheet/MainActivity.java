package com.example.bottom_sheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity {

    private Button showSheet;
    private Button hideSheet;
    private BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        showSheet = findViewById(R.id.showSheet);
        hideSheet = findViewById(R.id.hideSheet);

        LinearLayout bottomSheetLayout = findViewById(R.id.buttonSheet);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetLayout);

        //visible part of button sheet default
        bottomSheetBehavior.setPeekHeight(320);


        showSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);   //showing the bottom sheet pressed on Button SHOW

            }
        });

        hideSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);   //hiding the bottom sheet pressed on button HIDE

            }
        });
    }
}