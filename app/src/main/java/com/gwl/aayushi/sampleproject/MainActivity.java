package com.gwl.aayushi.sampleproject;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    Button mButton;
    TextView mNoTV;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();
    }

    private void initialization() {

        mContext = MainActivity.this;
        mNoTV = (TextView) findViewById(R.id.textView);
        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNoTV.setText(String.valueOf(randomNo()));
            }
        });
    }

    private int randomNo()
    {
        Random random = new Random(System.currentTimeMillis());
        return random.nextInt(100);
    }
}
