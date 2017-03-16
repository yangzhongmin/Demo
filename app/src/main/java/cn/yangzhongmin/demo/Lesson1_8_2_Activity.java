package cn.yangzhongmin.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

/**
 * Created by yzm on 2017/3/16.
 */

public class Lesson1_8_2_Activity extends Activity{

    private MultiAutoCompleteTextView macTextView;
    private String[] resource = {"xiaoming","xiaohong","xiaohua","jacky","yoyo","jimmy","lisa","sharon"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_lession1_8_2);
        /*
        1. 初始化AutoCompleteTextView控件；
        2. 创建一个适配器Adapter.
            ArrayAdapter的三个参数（1. content 上下文对象；2.layout ID,模板文件的id；3.匹配用到的数据源）
        3. 将Adapter和视图控件绑定
        4. 设置分隔符
         */
        macTextView = (MultiAutoCompleteTextView) findViewById(R.id.mactv_sendto);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,resource);
        macTextView.setAdapter(adapter);
        //设置以逗号为分隔符
        macTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }
}
