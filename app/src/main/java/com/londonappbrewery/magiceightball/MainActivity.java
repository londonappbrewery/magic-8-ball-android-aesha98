package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask = (Button) findViewById(R.id.askbutton);

      final  ImageView ball=(ImageView) findViewById(R.id.image_ball); //declare and link XML
        // file to
        // java

       final int ballArray[]={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R
                .drawable.ball5}; //array of choices

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Ball : ", " Button is working fine");

                Random choicegenerator = new Random(); // declaration

                int number= choicegenerator.nextInt(4);

                Log.d("ball","Number generated : " + number);

                ball.setImageResource(ballArray[number]);

            }
        });




    }
}
