package com.example.er_j_class2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {


    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private Button buttonAdd,next;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

//        Initialize variables
        editTextNumber1 = findViewById(R.id.firstnumber);
        editTextNumber2 = findViewById(R.id.secondnumber);
        buttonAdd = findViewById(R.id.submitbtn);
        next=findViewById(R.id.next);
        textViewResult = findViewById(R.id.resultstxtview);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    buttonAdd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int number1 = Integer.parseInt(editTextNumber1.getText().toString());
            int number2 = Integer.parseInt(editTextNumber2.getText().toString());                // Perform addition
            int result = number1 + number2;                // Display the result
            textViewResult.setText("Result: " + result);
            textViewResult.getVisibility();
        }
    });

    next.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    startActivity(new Intent(MainActivity2.this, MainActivity3.class));
                                   startActivity(new Intent(MainActivity2.this, MainActivity3.class));
                                    Toast.makeText(getApplicationContext(),"Hello ", Toast.LENGTH_SHORT).show();
                                }
                            }

    );
    }
}