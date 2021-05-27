package com.akash.cp.vtu.vtupara5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Base{
    CountDownTimer mCountDownTimer;
    TextView mTextView;
    int count=1;
    public static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        listener();
    }

    @Override
    public void init() {
        mTextView=(TextView)findViewById(R.id.text_view);
    }

    @Override
    public void listener() {

    }
    public void start(View view)
    {
        mCountDownTimer=  new CountDownTimer(100000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTextView.setText(String.valueOf(count));
                count++;
                Log.d(TAG,"Count value "+String.valueOf(count));
            }

            @Override
            public void onFinish() {
                mTextView.setText("Finish");
            }
        };
        mCountDownTimer.start();
    }

    public void stop(View view)
    {
        mCountDownTimer.cancel();
    }
}