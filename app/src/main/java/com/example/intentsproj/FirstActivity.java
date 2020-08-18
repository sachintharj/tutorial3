package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button btnok = findViewById(R.id.btnok);
        final EditText num1_input = findViewById(R.id.number1);
        final EditText num2_input = findViewById(R.id.number2);


        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creating the LayoutInflater instance
                LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file
                View layout = li.inflate(R.layout.customertoast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));

                //Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);
                toast.show();


                String num_1= num1_input.getText().toString();
                int finalnum_1=Integer.parseInt(num_1);

                String num_2= num2_input.getText().toString();
                int finalnum_2=Integer.parseInt(num_2);

                Intent i = new Intent(getApplicationContext(),SecondActivity.class);

                i.putExtra("Num_1_val", finalnum_1);
                i.putExtra("Num_2_val", finalnum_2);

                startActivity(i);
            }
        });


    }
}

