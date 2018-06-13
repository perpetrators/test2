package com.example.administrator.test_2_1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private android.widget.ImageView guidebuttform;
    private android.widget.ImageView guidebuttadd;
    private android.widget.ImageView guidebuttsca;
    private android.widget.ImageView guidebuttatt;
    private android.widget.LinearLayout guideviewcontainer;
    private android.widget.ListView listitem;
//    private String content;
//    public MainActivity(String content) {
//        this.content = content;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.listitem = (ListView) findViewById(R.id.list_item);
        this.guideviewcontainer = (LinearLayout) findViewById(R.id.guide_view_container);
        this.guidebuttatt = (ImageView) findViewById(R.id.guide_butt_att);
        this.guidebuttsca = (ImageView) findViewById(R.id.guide_butt_sca);
        this.guidebuttadd = (ImageView) findViewById(R.id.guide_butt_add);
        this.guidebuttform = (ImageView) findViewById(R.id.guide_butt_form);
        setList();
        this.guidebuttadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this,RedactActivity.class);
                intent.putExtra("data","测试");
                startActivity(intent);
            }
        });
    }


    public void setList(){
        ArrayList<ListData> listData = new ArrayList<>();
        listData.add(new ListData(1,"卧底","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(2,"上单","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(3,"中单","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(4,"辅助","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(5,"射手","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(6,"打野","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(7,"大龙","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(1,"卧底","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(2,"上单","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(3,"中单","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(4,"辅助","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(5,"射手","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(6,"打野","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(7,"大龙","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(1,"卧底","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(2,"上单","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(3,"中单","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(4,"辅助","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(5,"射手","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(6,"打野","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(7,"大龙","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(1,"卧底","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(2,"上单","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(3,"中单","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(4,"辅助","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(5,"射手","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(6,"打野","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(7,"大龙","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(1,"卧底","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(2,"上单","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(3,"中单","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(4,"辅助","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(5,"射手","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(6,"打野","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(7,"大龙","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(1,"卧底","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(2,"上单","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(3,"中单","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(4,"辅助","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(5,"射手","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(6,"打野","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        listData.add(new ListData(7,"大龙","asdsdfalifbbbdflabvd",R.mipmap.email_filling_blue));
        MyAdapter myAdapter= new MyAdapter(listData,MainActivity.this);
        this.listitem.setAdapter(myAdapter);
    }
    class MyAdapter extends BaseAdapter{
        private ArrayList<ListData> listData;
        private Context mainActivity;
        private ViewHolder holder;

        public MyAdapter(ArrayList<ListData> listData, Context mainActivity){

            this.listData = listData;
            this.mainActivity = mainActivity;
        }
        @Override
        public int getCount() {
            return this.listData.size();
        }

        @Override
        public Object getItem(int position) {
            return listData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView==null){
                this.holder = new ViewHolder();
                convertView = LayoutInflater.from(this.mainActivity).inflate(R.layout.list_style_main,null);
                holder.imageViewHead = convertView.findViewById(R.id.list_item_butt_head);
                holder.textViewTitle = convertView.findViewById(R.id.list_item_title);
                holder.imageViewDel = convertView.findViewById(R.id.list_item_butt_del);
                holder.imageViewRedact = convertView.findViewById(R.id.list_item_butt_redact);
                convertView.setTag(holder);
            }else {
                holder = (ViewHolder) convertView.getTag();
            }
            holder.imageViewHead.setImageResource( this.listData.get(position).picturePath);
            holder.textViewTitle.setText(this.listData.get(position).title);
            return convertView;
        }
    }

    class ViewHolder{
        ImageView imageViewHead;
        TextView textViewTitle;
        ImageView imageViewDel;
        ImageView imageViewRedact;
    }


}
