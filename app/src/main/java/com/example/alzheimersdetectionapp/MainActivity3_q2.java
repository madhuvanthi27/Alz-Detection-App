package com.example.alzheimersdetectionapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3_q2 extends AppCompatActivity {

    TextView tv_jumword_q2, tv_done_q2;
    EditText et_anagram_q2;
    Button btn_q2;
    String current_text_q2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_q2);

        tv_jumword_q2 = (TextView)findViewById(R.id.tv_3_q2);
        tv_done_q2 = (TextView)findViewById(R.id.tv_done_q2);
        et_anagram_q2 = (EditText)findViewById(R.id.et_anagram_q2);
        btn_q2 = (Button)findViewById(R.id.btn_anagram_q2);

        current_text_q2 = tv_jumword_q2.getText().toString();

        et_anagram_q2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String final_text = et_anagram_q2.getText().toString();
                if(final_text.equals("tooth")){
                    tv_done_q2.setText("SUCCESS !!");
                    //increase points
                    btn_q2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity3_q2.this, MainActivity4.class);
                            startActivity(intent);
                        }
                    });
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }
}