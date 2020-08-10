package com.example.alzheimersdetectionapp;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity6<list> extends AppCompatActivity {
    ImageView left, right, middle;
    Button btn_start;
    List<Integer> cards;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        left = (ImageView)findViewById(R.id.imageView3);
        middle = (ImageView)findViewById(R.id.imageView5);
        right = (ImageView)findViewById(R.id.imageView4);

        btn_start = (Button)findViewById(R.id.button2);

        cards = new ArrayList<>();
        cards.add(107);
        cards.add(207);
        cards.add(407);

        Collections.shuffle(cards);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count + 1;
                if(count <= 1) {
                    Collections.shuffle(cards);

                    left.setImageResource(R.drawable.backcard);
                    middle.setImageResource(R.drawable.backcard);
                    right.setImageResource(R.drawable.backcard);

                    Animation anim_left = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left);
                    Animation anim_middle = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.middle);
                    Animation anim_right = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.right);

                    left.startAnimation(anim_left);
                    middle.startAnimation(anim_middle);
                    right.startAnimation(anim_right);
                }
            }

        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cards.get(0) == 107) {
                    left.setImageResource(R.drawable.spades);
                    Toast.makeText(MainActivity6.this, "Guessed", Toast.LENGTH_SHORT).show();
                    //increase points
                } else if(cards.get(0) == 207) {
                    left.setImageResource(R.drawable.hearts);
                } else if(cards.get(0) == 407) {
                    left.setImageResource(R.drawable.diamonds);
                }

                if(cards.get(1) == 107) {
                    middle.setImageResource(R.drawable.spades);
                } else if(cards.get(1) == 207) {
                    middle.setImageResource(R.drawable.hearts);
                } else if(cards.get(1) == 407) {
                    middle.setImageResource(R.drawable.diamonds);
                }

                if(cards.get(2) == 107) {
                    right.setImageResource(R.drawable.spades);
                } else if(cards.get(2) == 207) {
                    right.setImageResource(R.drawable.hearts);
                } else if(cards.get(2) == 407) {
                    right.setImageResource(R.drawable.diamonds);
                }
            }
        });

        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cards.get(0) == 107) {
                    left.setImageResource(R.drawable.spades);
                    //increase points by 10
                } else if(cards.get(0) == 207) {
                    left.setImageResource(R.drawable.hearts);
                } else if(cards.get(0) == 407) {
                    left.setImageResource(R.drawable.diamonds);
                }

                if(cards.get(1) == 107) {
                    middle.setImageResource(R.drawable.spades);
                    Toast.makeText(MainActivity6.this, "Guessed", Toast.LENGTH_SHORT).show();
                } else if(cards.get(1) == 207) {
                    middle.setImageResource(R.drawable.hearts);
                } else if(cards.get(1) == 407) {
                    middle.setImageResource(R.drawable.diamonds);
                }

                if(cards.get(2) == 107) {
                    right.setImageResource(R.drawable.spades);
                    //Toast.makeText(MainActivity6.this, "Guessed", Toast.LENGTH_SHORT).show();
                } else if(cards.get(2) == 207) {
                    right.setImageResource(R.drawable.hearts);
                } else if(cards.get(2) == 407) {
                    right.setImageResource(R.drawable.diamonds);
                }

            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cards.get(0) == 107) {
                    left.setImageResource(R.drawable.spades);
                    //Toast.makeText(MainActivity6.this, "Guessed", Toast.LENGTH_SHORT).show();
                } else if(cards.get(0) == 207) {
                    left.setImageResource(R.drawable.hearts);
                } else if(cards.get(0) == 407) {
                    left.setImageResource(R.drawable.diamonds);
                }

                if(cards.get(1) == 107) {
                    middle.setImageResource(R.drawable.spades);
                    //Toast.makeText(MainActivity6.this, "Guessed", Toast.LENGTH_SHORT).show();
                } else if(cards.get(1) == 207) {
                    middle.setImageResource(R.drawable.hearts);
                } else if(cards.get(1) == 407) {
                    middle.setImageResource(R.drawable.diamonds);
                }

                if(cards.get(2) == 107) {
                    right.setImageResource(R.drawable.spades);
                    Toast.makeText(MainActivity6.this, "Guessed", Toast.LENGTH_SHORT).show();
                } else if(cards.get(2) == 207) {
                    right.setImageResource(R.drawable.hearts);
                } else if(cards.get(2) == 407) {
                    right.setImageResource(R.drawable.diamonds);
                }
            }
        });
    }
}