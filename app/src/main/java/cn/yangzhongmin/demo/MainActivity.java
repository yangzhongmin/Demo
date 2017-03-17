package cn.yangzhongmin.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by yzm on 2017/3/16.
 */

public class MainActivity extends Activity implements View.OnClickListener{

    Button mBtn_1;
    Button mBtn_2;
    Button mBtn_3;
    Button mBtn_4;
    Button mBtn_5;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_main);

        initView();
        setListener();
    }

    private void setListener() {
        mBtn_1.setOnClickListener(this);
        mBtn_2.setOnClickListener(this);
        mBtn_3.setOnClickListener(this);
        mBtn_4.setOnClickListener(this);
        mBtn_5.setOnClickListener(this);
    }

    private void initView() {
        mBtn_1 = (Button) findViewById(R.id.btn_1);
        mBtn_2 = (Button) findViewById(R.id.btn_2);
        mBtn_3 = (Button) findViewById(R.id.btn_3);
        mBtn_4 = (Button) findViewById(R.id.btn_4);
        mBtn_5 = (Button) findViewById(R.id.btn_5);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_1:jumpToTarget(Lesson1_3_Activity.class);
                break;
            case R.id.btn_2:jumpToTarget(Lesson1_8_Activity.class);
                break;
            case R.id.btn_3:jumpToTarget(Lesson1_8_2_Activity.class);
                break;
            case R.id.btn_4:jumpToTarget(Lesson1_9_Activity.class);
                break;
            case R.id.btn_5:jumpToTarget(Lesson1_3_Activity.class);
                break;
            default:
                break;
        }
    }

    private void jumpToTarget(Class<?> cls) {
        Intent intent = new Intent(this,cls);
        startActivity(intent);
    }
}
