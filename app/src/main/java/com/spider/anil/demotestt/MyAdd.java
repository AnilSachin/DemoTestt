package com.spider.anil.demotestt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Anil on 08-09-2016.
 */
public class MyAdd extends BaseAdapter {
    Context context;
    List<Student> list;
    LayoutInflater layoutInflater;

    public MyAdd(Context context, List<Student> list) {
        this.context = context;
        this.list = list;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        VH viewHolder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.hello, parent, false);
            viewHolder = new VH();
            viewHolder.t1 = (TextView) convertView.findViewById(R.id.textView);
            viewHolder.t2 = (TextView) convertView.findViewById(R.id.textView2);
            convertView.setTag(viewHolder);


        } else {
            viewHolder = (VH) convertView.getTag();

        }
        viewHolder.t1.setText(list.get(position).name);

        viewHolder.t2.setText(list.get(position).loc);
        return convertView;
    }


    class VH {
        TextView t1, t2;

        public VH() {
        }
    }
}
