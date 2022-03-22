package edu.iuh.a18086981_dinhdiepvuong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Screen02Adapter extends BaseAdapter {
    private Context ctx;
    private int layout;
    private ArrayList<Giay> arrayList;
    private List<Giay> listFilter;
    private int positionSelect = -1;

    public Screen02Adapter(Context ctx, int layout, ArrayList<Giay> arrayList) {
        this.ctx = ctx;
        this.layout = layout;
        this.arrayList = arrayList;
        this.listFilter = arrayList;
    }

    @Override
    public int getCount() {
        if(listFilter.size() !=0 && !listFilter.isEmpty()){
            listFilter.size();
        }
        return 0;
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
        ViewHolder viewHolder;

        if(view == null){
            view = LayoutInflater.from(ctx).inflate(layout, viewGroup, false);

            viewHolder = new ViewHolder();
            viewHolder.imvGiay = view.findViewById(R.id.imgvGiay);
            viewHolder.tvName = view.findViewById(R.id.tvName);
            viewHolder.tvPrice = view.findViewById(R.id.tvPrice);

            view.setTag(viewHolder);
        } else{
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.imvGiay.setImageResource(arrayList.get(i).getImgGiay());
        viewHolder.tvName.setText(arrayList.get(i).getNameGiay());
        viewHolder.tvPrice.setText(arrayList.get(i).getPriceGiay());

        return view;
    }
    private class ViewHolder{
        ImageView imvGiay;
        TextView tvName;
        TextView tvPrice;
    }
}
