package com.example.week8assignment;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText inputFirstNumber;
    private EditText inputSecondNumber;

    private TextView textOutput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputFirstNumber = findViewById(R.id.inputFirstNumber);
        inputSecondNumber = findViewById(R.id.inputSecondNumber);

        textOutput = findViewById(R.id.textResult);

    }
    float[] getNumbers(){
        float nr1 = Float.parseFloat(inputFirstNumber.getText().toString());
        float nr2 = Float.parseFloat(inputSecondNumber.getText().toString());
        return new float[]{nr1, nr2};

    }
    public void performAddition(View view){
        float[] numbers = getNumbers();
        textOutput.setText(String.format("%.2f",numbers[0]+numbers[1]));
    }
    public void performSubtraction(View view){
        float[] numbers = getNumbers();
        textOutput.setText(String.format("%.2f",numbers[0]-numbers[1]));
    }
    public void performMultiplication(View view){
        float[] numbers = getNumbers();

        textOutput.setText(String.format("%.2f",numbers[0]*numbers[1]));
    }
    public void performDivision(View view) {
        float[] numbers = getNumbers();

        textOutput.setText(String.format("%.2f", numbers[0] / numbers[1]));
    }
}