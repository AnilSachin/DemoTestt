package com.spider.anil.demotestt;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Anil on 08-09-2016.
 */
public class MyVH {
    @BindView(R.id.textView)
    TextView t1;
    @BindView(R.id.textView2)
    TextView t2;

    MyVH(View view) {
        ButterKnife.bind(this, view);
    }
}

