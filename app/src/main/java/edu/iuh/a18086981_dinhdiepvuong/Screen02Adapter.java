package edu.iuh.a18086981_dinhdiepvuong;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
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
            return listFilter.size();
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
            viewHolder.imvGiay = view.findViewById(R.id.imgGiay);
            viewHolder.tvName = view.findViewById(R.id.tvName);
            viewHolder.tvPrice = view.findViewById(R.id.tvPrice);

            view.setTag(viewHolder);
        } else{
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.imvGiay.setImageResource(arrayList.get(i).getImgGiay());
        viewHolder.tvName.setText(arrayList.get(i).getNameGiay());
        viewHolder.tvPrice.setText(arrayList.get(i).getPriceGiay());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ctx, String.valueOf(i), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ctx, MainActivity03.class);

                intent.putExtra("giaychitiet", listFilter.get(i));
                ctx.startActivity(intent);
            }
        });

        return view;
    }
    private class ViewHolder{
        ImageView imvGiay;
        TextView tvName;
        TextView tvPrice;
    }
    //T??m t???t c??? c??c lo???i b??nh
    public void allGiay(){
        listFilter = arrayList;
        //th??ng b??o d??? li???u thay ?????i d??ng cho tr?????ng h???p cu???i c??ng
        notifyDataSetChanged();
    }
    //T??m lo???i b??nh pink
    public void filterBoy(){
        filterDonut("boy");
    }
    //T??m lo???i b??nh floadting
    public void filterGirl(){
        filterDonut("girl");
    }

    //filter ch??nh l?? ?????i t?????ng c???n t??m pink, floating...
    public void filterDonut(String filter) {
        listFilter = new ArrayList<>();
        for (Giay item : arrayList){
            if(item.getNameGiay().toLowerCase().indexOf(filter) != -1){
                listFilter.add(item);
            }
        }
        notifyDataSetChanged();
    }

    //Thay ?????i m??u c???a btn ???????c ch???n so v???i 2 btn c??n l???i
    public void setActiveButton(Button btnActive, Button btn1, Button btn2){
        btnActive.setBackgroundColor(Color.BLUE);
        btnActive.setTextColor(Color.WHITE);
        btn1.setBackgroundColor(Color.parseColor("#D1CBCB"));
        btn1.setTextColor(Color.BLACK);
        btn2.setBackgroundColor(Color.parseColor("#D1CBCB"));
        btn2.setTextColor(Color.BLACK);
    }
}
