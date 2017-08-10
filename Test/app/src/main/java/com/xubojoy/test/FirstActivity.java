package com.xubojoy.test;

/**
 * Created by xubojoy on 16/7/29.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity{
    private Button my_button2 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        my_button2 = (Button)findViewById(R.id.my_button2);
        //    my_button2.setText("@string/close");    //setText里面不能采用资源引用
        //资源引用显示文本应该是在xml中的
        my_button2.setText("Close");
        my_button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
//                myText.setText("Hello World!");
                finish();
            }
        });
    }
}
