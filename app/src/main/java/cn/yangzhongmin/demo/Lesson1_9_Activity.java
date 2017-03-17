package cn.yangzhongmin.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ToggleButton;

/**
 * Created by yzm on 2017/3/17.
 */

public class Lesson1_9_Activity extends Activity implements OnCheckedChangeListener{

    /**
     * ToggleButton按钮，是一个多状态按钮（1. 被点击了"on", 2.取消点击"off"）;
     * ToggleButton按钮的监听接口是OnCheckedChangeListener();
     */

    private ToggleButton mToggleButton;
    private ImageView mImageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_lession1_9);

        mToggleButton = (ToggleButton) findViewById(R.id.tgbt_switch);
        mImageView = (ImageView) findViewById(R.id.iv_flashlight);

        mToggleButton.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        mImageView.setBackgroundResource(isChecked?R.mipmap.on:R.mipmap.off);
    }
}
