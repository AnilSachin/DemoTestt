package com.spider.anil.demotestt;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Anil on 09-09-2016.
 */
public class MyRecAdapter extends RecyclerView.Adapter<MyRecAdapter.ViewHolder> {
    Context context;
    List<Student> list;



    public MyRecAdapter(Context context, List<Student> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mydata, parent, false);

        return new ViewHolder(view);
        //  return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.hello, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.listTitle.setText(list.get(position).name);
        holder.listDesc.setText(list.get(position).loc);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.list_avatar)
        ImageView listAvatar;
        @BindView(R.id.list_title)
        TextView listTitle;
        @BindView(R.id.list_desc)
        TextView listDesc;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
