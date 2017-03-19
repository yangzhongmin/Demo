package cn.yangzhongmin.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by yzm on 2017/3/19.
 */

public class ReturnDataActivity extends Activity implements View.OnClickListener{

    /**
     * 用来给前一个页面返回数据
     * 返回的数据实际上封装在一个Intent对象，返回的是一个Intent对象
     */
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_retrun_data);

        button = (Button) findViewById(R.id.btn_return_data);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent();
        intent.putExtra("data","这是ReturnDataActivity返回的内容，哈哈哈成功");
        /**
        *使用setResult(resultCode,intent)给上一个页面返回数据。
         * resultCode：返回的标识。
        */
        setResult(222,intent);
        //结束当前页面
        finish();
    }
}
