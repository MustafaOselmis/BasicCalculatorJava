package com.mustafaoselmis.hesapmak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Number1text;
    EditText Number2text;
    TextView Resulttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number1text = findViewById(R.id.Number1text);
        Number2text = findViewById(R.id.Number2text);
        Resulttext = findViewById(R.id.Resulttext);




    }

    public void sum(View view) { // view view görünüm tarafından çağırılcaktır

        if (Number1text.getText().toString().matches("") || Number2text.getText().toString().matches("")){

            Resulttext.setText("Enter Number!");
        }else {

            int number1 = Integer.parseInt(Number1text.getText().toString());
            int number2 = Integer.parseInt(Number2text.getText().toString());

            int result = number1 + number2 ;
            Resulttext.setText("Result : " +  result);

        }



    }

    public void minus(View view) {
        if (Number1text.getText().toString().matches("") || Number2text.getText().toString().matches("")){

            Resulttext.setText("Enter Number!");
        }else {

            int number1 = Integer.parseInt(Number1text.getText().toString());
            int number2 = Integer.parseInt(Number2text.getText().toString());

            int result = number1 - number2 ;
            Resulttext.setText("Result : " +  result);

        }

    }

    public void multiply(View view) {
        if (Number1text.getText().toString().matches("") || Number2text.getText().toString().matches("")){

            Resulttext.setText("Enter Number!");
        }else {

            int number1 = Integer.parseInt(Number1text.getText().toString());
            int number2 = Integer.parseInt(Number2text.getText().toString());

            int result = number1 * number2 ;
            Resulttext.setText("Result : " +  result);

        }
    }

    public void divide(View view) {

        if (Number1text.getText().toString().matches("") || Number2text.getText().toString().matches("")){

            Resulttext.setText("Enter Number!");
        }else {

            int number1 = Integer.parseInt(Number1text.getText().toString());
            int number2 = Integer.parseInt(Number2text.getText().toString());

            int result = number1 / number2 ;
            Resulttext.setText("Result : " +  result);

        }

    }
}