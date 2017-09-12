package com.xks.espressodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private List<String> mDatas=new ArrayList<>();

    {

        for(char c='a';c<='z';c++){
            mDatas.add(String.valueOf(c));
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.xks.espressodemo.R.layout.activity_second);

        ListView listView= (ListView) findViewById(com.xks.espressodemo.R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,mDatas);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView tv= (TextView) view.findViewById(android.R.id.text1);
                tv.setText(String.valueOf((char)(position+'A')));

            }
        });


    }
}
