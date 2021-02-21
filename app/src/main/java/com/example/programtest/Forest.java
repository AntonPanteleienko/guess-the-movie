package com.example.programtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Forest extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4, Next;
    TextView yes, No;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forest);

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        Next = findViewById(R.id.Next);

        yes = findViewById(R.id.yes);
        No = findViewById(R.id.No);

        yes.setVisibility(View.INVISIBLE);
        No.setVisibility(View.INVISIBLE);

        Next.setVisibility(View.INVISIBLE);


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yes.setVisibility(View.VISIBLE);

                Next.setVisibility(View.VISIBLE);

            }

        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                No.setVisibility(View.VISIBLE);
                Next.setVisibility(View.VISIBLE);

                answer1.setBackgroundColor(ContextCompat.getColor(Forest.this, R.color.green));
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                No.setVisibility(View.VISIBLE);
                Next.setVisibility(View.VISIBLE);

                answer1.setBackgroundColor(ContextCompat.getColor(Forest.this, R.color.green));
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                No.setVisibility(View.VISIBLE);
                Next.setVisibility(View.VISIBLE);

                answer1.setBackgroundColor(ContextCompat.getColor(Forest.this, R.color.green));
            }
        });

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Potter.class));
            }
        });
    }
}