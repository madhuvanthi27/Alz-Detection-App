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

public class MainActivity2 extends AppCompatActivity {
TextView tv_text, tv_result;
EditText et_text;
Button btn_2;


long start_time, end_time;
String fullstory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_text = (TextView)findViewById(R.id.tv_text);
        tv_result = (TextView)findViewById(R.id.tv_result);
        et_text = (EditText)findViewById(R.id.et_text);
        btn_2 = (Button)findViewById(R.id.btn_2);


        fullstory = tv_text.getText().toString();

        et_text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String currentStory = et_text.getText().toString();
                if(currentStory.length() == 1){

                    start_time = System.currentTimeMillis();
                }
                if(currentStory.equals(fullstory)){
                    end_time = System.currentTimeMillis();

                    long time_taken = (end_time - start_time)/1000;
                    //tv_result.setText("FINISHED in " + time_taken + " seconds");
                    tv_result.setText("Thats's AWESOME !! Move on...");
                    et_text.setEnabled(false);
                    et_text.clearFocus();

                    if(time_taken >= 10 && time_taken <= 50){
                        //increase points by 10

                    }

                    btn_2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
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