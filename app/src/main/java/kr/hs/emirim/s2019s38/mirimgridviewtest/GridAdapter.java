package kr.hs.emirim.s2019s38.mirimgridviewtest;

import android.app.AlertDialog;
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

    String[] title={"벼랑 위의 포뇨","이웃집 토토로","추억의 마니","붉은돼지","바람계곡의 나우시카",
                    "센과 치히로의 행방불명","하울의 움직이는 성","귀를 기울이면","추억은 방울방울",
                    "바다가 들린다","마녀배달부 키키","고양이의 보은","천공의 성 라퓨타",
                    "마루 밑 아리에티","원령공주","게드전기",};
    @Override
    public int getCount() {
        return imgRes.length;
    }

    @Override
    public Object getItem(int position) { return null; }

    @Override
    public long getItemId(int position) { return 0; }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imgV=new ImageView(context);
        imgV.setLayoutParams(new AbsListView.LayoutParams(200,300));
        imgV.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgV.setPadding(5,5,5,5);
        imgV.setImageResource(imgRes[position]);
        final int pos= position;
        imgV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View dialogView = View.inflate(context,R.layout.dialog,null);
                AlertDialog.Builder dlg=new AlertDialog.Builder(context);
                ImageView imgvPoster=dialogView.findViewById(R.id.imgv_dialog);
                imgvPoster.setImageResource(imgRes[pos]);
                dlg.setTitle(title[pos]);
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기",null);
                dlg.show();
            }
        });
        return imgV;
    }
}
