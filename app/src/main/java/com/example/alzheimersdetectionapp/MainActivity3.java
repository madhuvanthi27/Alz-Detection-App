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

public class MainActivity3 extends AppCompatActivity {

    TextView tv_anagram, tv_jumword, tv_done;
    EditText et_anagram;
    Button btn;
    String current_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv_anagram = (TextView)findViewById(R.id.tv_anagram);
        tv_jumword = (TextView)findViewById(R.id.tv_3);
        tv_done = (TextView)findViewById(R.id.tv_done);
        et_anagram = (EditText)findViewById(R.id.et_anagram);
        btn = (Button)findViewById(R.id.btn_anagram);

        current_text = tv_jumword.getText().toString();

        et_anagram.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String final_text = et_anagram.getText().toString();
                if(final_text.equals("count")){
                    tv_done.setText("SUCCESS !! DONE !!");
                    //increase points
                    btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(MainActivity3.this, MainActivity3_q2.class);
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