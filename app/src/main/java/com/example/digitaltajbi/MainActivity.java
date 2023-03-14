package com.example.digitaltajbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Vibrator;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
//variable declaration
    TextView countText;
    Button btnAdd , btnSub, btnReset ;
    int count ; //initial value o
//    vibrate

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        connection activity element with id
        countText = findViewById(R.id.countText);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnReset = findViewById(R.id.btnReset);
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
//        click event hare------------------------------------------------

//        count add handler
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               count++;// count = count+1;
                countText.setText(""+count);
                vibrator.vibrate(100);
            }
        });

//count sub handler

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               count--; // count = count-1;
//                countText.setText(""+count);

                if (count > 0){
                    count--; // count = count-1;
                    countText.setText(""+count);
                    vibrator.vibrate(100);
                }else {
                    Toast.makeText(getApplicationContext(), "Please Plus on button Click", Toast.LENGTH_SHORT).show();
                    vibrator.vibrate(1000); // Vibrate for 1000 milliseconds (1 second)
                }
            }
        });

//        count reset handler

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                countText.setText(""+count);
            }
        });



    }
}