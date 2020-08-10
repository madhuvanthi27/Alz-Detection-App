package com.example.alzheimersdetectionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5_q1 extends AppCompatActivity {
    Button btn_q1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5_q1);

        btn_q1=(Button)findViewById(R.id.btn_nextq1);

        btn_q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5_q1.this, MainActivity5_q2.class);
                startActivity(intent);
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q1o1:
                if (checked)
                    //increase points since correct option
                    break;
            case R.id.q2o2:
                if (checked)
                    break;
        }
    }
}