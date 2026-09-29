package com.example.calculator;
import android.view.View;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int number_1=0;
    private int number_2=0;

    private int result=0;

    private EditText numberView1;
    private EditText numberView2;
    private TextView mShowResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        mShowResult=findViewById(R.id.textView_result);
        numberView1=findViewById(R.id.text_input_1);
        numberView2=findViewById(R.id.text_input_2);
    }

    public void sum(View view){

        if (numberView1 != null && numberView2 != null) {
            number_1=Integer.parseInt(numberView1.getText().toString());
            number_2=Integer.parseInt(numberView2.getText().toString());

            result=number_1+number_2;

            mShowResult.setText(result);


        }

        ;



    }


}