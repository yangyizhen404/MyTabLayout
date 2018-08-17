package com.yang.mytablaytout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yang.mytab.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout mtab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTab((TabLayout) findViewById(R.id.m_tab));
        initTab((TabLayout) findViewById(R.id.m_tab1));
        initTab((TabLayout) findViewById(R.id.m_tab2));
        initTab((TabLayout) findViewById(R.id.m_tab3));
        initTab((TabLayout) findViewById(R.id.m_tab4));
    }

    private void initTab(TabLayout view) {
        String[] title = {"北京朝阳", "四川成都","广州深圳","上海外滩"};
        for (int i = 0; i < title.length; i++) {
            TabLayout.Tab tab = view.newTab();
            tab.setText(title[i]);
            // tab.setIcon(R.mipmap.ic_launcher);//icon会显示在文字上面
            view.addTab(tab);
        }
    }


}
