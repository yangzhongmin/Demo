package cn.yangzhongmin.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by yzm on 2017/3/19.
 */

public class Lesson1_18_Activity extends Activity implements View.OnClickListener{

    /**
     * 利用startActivityForResult(intent,requestCode)方法跳转页面，可以接收目标页面返回的数据
     * 返回数据封装在一个intent中。
     */

    private Button mButtonJump;
    private TextView mTextViewShow;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_lession1_18);

        mButtonJump = (Button) findViewById(R.id.btn_jump);
        mTextViewShow = (TextView) findViewById(R.id.tv_show);

        mButtonJump.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,ReturnDataActivity.class);
        startActivityForResult(intent,111);
    }

    /**
     * 通过startActivityForResult方法跳转，使用onActivityResult()方法接收返回的数据。
     * requestCode:请求的标识
     * resultCode:返回结果的标识
     * data:返回的数据
     */

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==222 && requestCode==111) {
            String str = data.getStringExtra("data");
            mTextViewShow.setText(str);
        }
    }
}
