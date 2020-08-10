package com.example.alzheimersdetectionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5_q2 extends AppCompatActivity {
    Button btn_q2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5_q2);

        btn_q2 = (Button) findViewById(R.id.btn_nextq);

        btn_q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5_q2.this, MainActivity5_q3.class);
                startActivity(intent);
            }
        });

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q2o1:
                if (checked)
                    //increase points
                    break;
            case R.id.q2o2:
                if (checked)
                    break;
        }
    }

}