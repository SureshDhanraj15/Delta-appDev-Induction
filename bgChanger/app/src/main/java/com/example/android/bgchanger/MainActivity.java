package com.example.android.bgchanger;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{

    int r=0, g=0 ,b=0;
    LinearLayout ll;
    TextView redText, greenText, blueText;
    Button redButton, greenButton, blueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ll = (LinearLayout) findViewById(R.id.activity_main);
        ll.setBackgroundColor(Color.rgb(r,g,b));

        Button redButton = (Button) findViewById(R.id.red_button);
        Button greenButton = (Button) findViewById(R.id.green_button);
        Button blueButton = (Button) findViewById(R.id.blue_button);

        redButton.setBackgroundColor(Color.rgb(255,0,0));
        greenButton.setBackgroundColor(Color.rgb(0,255,0));
        blueButton.setBackgroundColor(Color.rgb(0,0,255));

        TextView redText = (TextView) findViewById(R.id.red_textview);
        TextView greenText = (TextView) findViewById(R.id.green_textview);
        TextView blueText = (TextView) findViewById(R.id.blue_textview);

        redText.setText("" + r);
        greenText.setText("" + g);
        blueText.setText("" + b);
    }

    public void redClick (View v){
        r+=15;
        if(r>255)
            r=0;
        changeColor(r,g,b);
    }

    public void greenClick (View v){
        g+=15;
        if(g>255)
            g=0;
        changeColor(r,g,b);
    }

    public void blueClick (View v){
        b+=15;
        if(b>255)
            b=0;
        changeColor(r,g,b);
    }

    public void resetClick (View v){
        r=0;
        g=0;
        b=0;
        changeColor(r,g,b);
    }


    public void changeColor(int r, int g, int b){

        LinearLayout ll = (LinearLayout) findViewById(R.id.activity_main);
        ll.setBackgroundColor(Color.rgb(r,g,b));

        TextView redText = (TextView) findViewById(R.id.red_textview);
        TextView greenText = (TextView) findViewById(R.id.green_textview);
        TextView blueText = (TextView) findViewById(R.id.blue_textview);

        redText.setText("" + r);
        greenText.setText("" + g);
        blueText.setText("" + b);

    }

    }


