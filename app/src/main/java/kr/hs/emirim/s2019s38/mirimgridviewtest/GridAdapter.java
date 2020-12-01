package kr.hs.emirim.s2019s38.mirimgridviewtest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] imgRes= {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,
            R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p};
    public GridAdapter(Context context){
        this.context=context;
    }
    @Override
    public int getCount() {
        return imgRes.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imgV=new ImageView(context);
        imgV.setLayoutParams(new AbsListView.LayoutParams(200,300));
        imgV.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgV.setPadding(5,5,5,5);
        imgV.setImageResource(imgRes[position]);
        return imgV;
    }
}
