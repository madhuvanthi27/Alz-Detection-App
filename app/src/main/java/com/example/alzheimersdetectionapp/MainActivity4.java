package com.example.alzheimersdetectionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    Button btn_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn_image = (Button) findViewById(R.id.btn_image);

        btn_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity5_q1.class);
                startActivity(intent);
            }
        });


    }
    //
    //@Override
    //public boolean onKeyDown(int key_code, KeyEvent key_event) {
      //  if (key_code == KeyEvent.KEYCODE_BACK) {
        //    super.onKeyDown(key_code, key_event);
          //  return true;
        //}
        //return false;
    //}
}


