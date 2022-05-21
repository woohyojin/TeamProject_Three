package com.example.othercock.ui.coopone;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.othercock.R;
import com.example.othercock.items.OnOrderItem;

import java.util.ArrayList;

public class CouponAdapter extends RecyclerView.Adapter<CouponAdapter.ViewHolder> {

    private ArrayList<OnOrderItem> itemList;

    public CouponAdapter(ArrayList<OnOrderItem> itemList) {
        super();
        this.itemList = itemList;
    }

    public CouponAdapter() {
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.title.setText(itemList.get(position).getTitle());
        viewHolder.date.setText(itemList.get(position).getDate());
        viewHolder.product.setImageResource(itemList.get(position).getProductId());
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = View.inflate(parent.getContext(), R.layout.shaved_ice_coupon, null);
        return new ViewHolder(itemView);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView date;
        public TextView title;
        public ImageView product;
        public Button cancle;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            date = (TextView) itemLayoutView.findViewById(R.id.order_his_date);
            title = (TextView) itemLayoutView.findViewById(R.id.order_his_title);
            product = (ImageView) itemLayoutView.findViewById(R.id.order_his_product);
            cancle = (Button) itemLayoutView.findViewById(R.id.order_his_cancle);
        }
    }
}
