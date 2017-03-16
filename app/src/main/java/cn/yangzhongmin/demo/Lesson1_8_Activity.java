package cn.yangzhongmin.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/**
 * Created by yzm on 2017/3/16.
 */

public class Lesson1_8_Activity extends Activity {

    private AutoCompleteTextView mAcTextView;
    private String[] resource={"beijing","shanghai","guangzhou","shenzhen","tianjin","chongqing",
    "beihai","shangqiu","guangxi"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_lession1_8);

        /*
        1. 初始化AutoCompleteTextView控件；
        2. 创建一个适配器Adapter.
            ArrayAdapter的三个参数（1. content 上下文对象；2.layout ID,模板文件的id；3.匹配用到的数据源）
        3. 将Adapter和视图控件绑定
         */
        mAcTextView = (AutoCompleteTextView) findViewById(R.id.actv_search_input);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,resource);
        mAcTextView.setAdapter(adapter);
    }
}
