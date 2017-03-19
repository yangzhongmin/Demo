package cn.yangzhongmin.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by yzm on 2017/3/18.
 */

public class Lesson1_11_Activity extends Activity implements RadioGroup.OnCheckedChangeListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * RadioButton 是一个选择后再次点击无法取消选择状态的选择按钮
         * 一个RadioGroup可以包含多个RadioButton，并且这一组RadioButton同时只能有一个被选中
         * RadioGroup可以实现单选控件
         *
         * 对RadioButton进行监听使用android.widget.RadioGroup包下的OnCheckedChangeListener()监听器。
         */

        RadioGroup mRadioGroupSex;

        setContentView(R.layout.layout_lession1_11);

        mRadioGroupSex = (RadioGroup) findViewById(R.id.rdgp_sex);

        mRadioGroupSex.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

        switch (checkedId){
            case R.id.rdbt_man:
                Toast.makeText(this,"你的性别是：男",Toast.LENGTH_SHORT).show();
                break;
            case R.id.rdbt_woman:
                Toast.makeText(this,"你的性别是：女",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
