package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewDicy ;
    Random randomNumber = new Random();
//    this variable is to generate random numbers


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDicy = findViewById(R.id.imageView);
//        this variable is for image

        imageViewDicy.setOnClickListener(new View.OnClickListener()
        {public void onClick(View view)
            {
                rollOurDice();
            }
        });


    }

    public void rollOurDice()
    {
        int integer = randomNumber.nextInt(6)+1;
        switch(integer)
        {
            case 1:
                imageViewDicy.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDicy.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDicy.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDicy.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDicy.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDicy.setImageResource(R.drawable.dice6);
                break;
        }

    }
}
