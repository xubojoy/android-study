package com.xubojoy.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button myButton;
    private TextView myText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button)findViewById(R.id.button);
        myText = (TextView)findViewById(R.id.textView);

        myButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                myText.setText("Hello World!");
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });
    }
}
