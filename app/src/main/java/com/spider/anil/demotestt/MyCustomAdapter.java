package com.spider.anil.demotestt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Anil on 08-09-2016.
 */
public class MyCustomAdapter extends BaseAdapter {
    Context context;
    List<Student> list;
    LayoutInflater layoutInflater;


    public MyCustomAdapter(Context context, List<Student> list) {
        this.context = context;
        this.list = list;
        layoutInflater = LayoutInflater.from(context);

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
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder viewHolder;
        if (view != null) {


            viewHolder = (ViewHolder) view.getTag();

        } else {
            view = layoutInflater.inflate(R.layout.hello, parent, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }

        viewHolder.textView.setText(list.get(position).name);

        viewHolder.textView2.setText(list.get(position).loc);
        return view;
    }


    static class ViewHolder {
        @BindView(R.id.textView)
        TextView textView;
        @BindView(R.id.textView2)
        TextView textView2;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
