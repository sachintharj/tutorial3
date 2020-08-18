package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);

        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button multi = findViewById(R.id.multi);
        Button div = findViewById(R.id.div);


        Intent i = getIntent();
        final int num_01 = i.getIntExtra("Num_1_val",0);
        final int num_02 = i.getIntExtra("Num_2_val",0);

        textView3.setText(String.valueOf(num_01));
        textView4.setText(String.valueOf(num_02));


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.sum);


                int final_1 = num_01 + num_02;
                answer.setText(String.valueOf(num_01 +" + "+ num_02 +"= " +final_1));


            }
        });




        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.sum);


                int final_1 = num_01 - num_02;
                answer.setText(String.valueOf(num_01 +" - "+ num_02 +"= " +final_1));
            }
        });


        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.sum);


                int final_1 = num_01 * num_02;
                answer.setText(String.valueOf(num_01 +" * "+ num_02 +"= " +final_1));
            }
        });



        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.sum);


                int final_1 = num_01 / num_02;
                answer.setText(String.valueOf(num_01 +" / "+ num_02 +"= " +final_1));
            }
        });

    }
}

