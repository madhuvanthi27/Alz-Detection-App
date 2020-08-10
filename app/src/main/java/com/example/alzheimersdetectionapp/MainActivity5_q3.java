package com.example.alzheimersdetectionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5_q3 extends AppCompatActivity {
    Button btn_q3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5_q3);

        btn_q3 = (Button) findViewById(R.id.btn_nextq3);

        btn_q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5_q3.this, MainActivity6.class);
                startActivity(intent);
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q3o2:
                if (checked)
                    //increase points
                    break;
            case R.id.q3o1:
                if (checked)
                    break;
        }
    }

}