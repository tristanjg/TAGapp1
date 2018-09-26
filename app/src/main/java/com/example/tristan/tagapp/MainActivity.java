package com.example.tristan.tagapp;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button buttontwo;
    private Button buttonthree;
    private Button buttonfour;
    private Button buttonfive;
    private Button buttonsix;
    ConstraintLayout myLayout;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLayout = (ConstraintLayout) findViewById(R.id.myLayout);

        animationDrawable = (AnimationDrawable) myLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCallUs();
            }
        });

        buttontwo = (Button) findViewById(R.id.button3);
        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openservice();
            }
        });

        buttonthree = (Button) findViewById(R.id.button6);
        buttonthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openspecials();
            }
        });

        buttonfour = (Button) findViewById(R.id.button7);
        buttonfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openinventory();
            }
        });

        buttonfive = (Button) findViewById(R.id.button5);
        buttonfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentradein();
            }
        });

        buttonsix = (Button) findViewById(R.id.button4);
        buttonsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrefernearn();
            }
        });
    }

    public void openCallUs() {
        Intent intent = new Intent(this, callmee.class);
        startActivity(intent);
    }

    public void openservice() {
        Intent intent = new Intent(this, service.class);
        startActivity(intent);
    }

    public void openspecials() {
        Intent intent = new Intent(this, specials.class);
        startActivity(intent);
    }

    public void openinventory() {
        Intent intent = new Intent(this, inventory.class);
        startActivity(intent);
    }

    public void openrefernearn() {
        Intent intent = new Intent(this, refernearn.class);
        startActivity(intent);
    }

    public void opentradein() {
        Intent intent = new Intent(this, tradein.class);
        startActivity(intent);
    }
}
