package cn.yangzhongmin.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import static cn.yangzhongmin.demo.R.id.ckbx_woman;

/**
 * Created by yzm on 2017/3/18.
 */

public class Lesson1_10_Activity extends Activity implements CompoundButton.OnCheckedChangeListener{

    /**
     * CheckBox控件是一个选择框控件，可以实现多选功能。
     */
    CheckBox ckbxMan;
    CheckBox ckbxWoman;
    CheckBox ckbxPingPang;
    CheckBox ckbxFootball;
    CheckBox ckbxBasketball;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_lession1_10);

        //初始化控件
        ckbxMan = (CheckBox) findViewById(R.id.ckbx_man);
        ckbxWoman = (CheckBox) findViewById(ckbx_woman);
        ckbxPingPang = (CheckBox) findViewById(R.id.ckbx_pingpang);
        ckbxFootball = (CheckBox) findViewById(R.id.ckbx_football);
        ckbxBasketball = (CheckBox) findViewById(R.id.ckbx_basketball);

        //为CheckBox设置监听器，实现对CheckBox的监听。监听器使用：OnCheckedChangeListener();
        ckbxMan.setOnCheckedChangeListener(this);
        ckbxWoman.setOnCheckedChangeListener(this);
        ckbxPingPang.setOnCheckedChangeListener(this);
        ckbxFootball.setOnCheckedChangeListener(this);
        ckbxBasketball.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(isChecked){
            Toast.makeText(this,"您选择的是:"+buttonView.getText().toString(),Toast.LENGTH_SHORT).show();
        }
    }
}
