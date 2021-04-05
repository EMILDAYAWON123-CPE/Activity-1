package com.example.activityno1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_red,button_blue,button_green,button_reset,button_yellow,button_brown;
    View background_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_red = (Button)findViewById(R.id.btn_red);
        button_blue= (Button)findViewById(R.id.btn_blue);
        button_green= (Button)findViewById(R.id.btn_green);
        button_yellow = (Button)findViewById(R.id.btn_yellow);
        button_brown =(Button)findViewById(R.id.btn_brown);
        button_reset= (Button)findViewById(R.id.btn_reset);
        background_view = this.getWindow().getDecorView();

        button_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_red.getText().equals("RED"))
                {
                    background_view.setBackgroundResource(R.color.RED);
                    Toast.makeText(MainActivity.this,"You have change the background color to red",Toast.LENGTH_LONG).show();
                }
            }
        });
        button_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_blue.getText().equals("BLUE"))
                {
                    background_view.setBackgroundResource(R.color.BLUE);
                    Toast.makeText(MainActivity.this,"You have change the background color to blue",Toast.LENGTH_LONG).show();
                }
                }
        });
        button_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_green.getText().equals("GREEN"))
                {
                    background_view.setBackgroundResource(R.color.GREEN);
                    Toast.makeText(MainActivity.this,"You have change the background color to green",Toast.LENGTH_LONG).show();
                }
            }
        });
        button_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background_view.setBackgroundResource(R.color.YELLOW);
                Toast.makeText(MainActivity.this,"You have change the background color to YELLOW",Toast.LENGTH_LONG).show();
            }
        });
        button_brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background_view.setBackgroundResource(R.color.BROWN);
                Toast.makeText(MainActivity.this,"You have change the background color to brown",Toast.LENGTH_LONG).show();
            }
        });
        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background_view.setBackgroundResource(R.color.white);
                Toast.makeText(MainActivity.this,"you have successfully reset the program",Toast.LENGTH_LONG).show();
            }
        });
    }
}