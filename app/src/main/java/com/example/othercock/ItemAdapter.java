package com.example.othercock;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.othercock.ui.menu.Detail_MenuFragment;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private ArrayList<Item> itemList;

    public ItemAdapter(ArrayList<Item> itemList) {
        super();
        this.itemList = itemList;
    }

    public ItemAdapter() {
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") int position) {
        viewHolder.tvTitle.setText(itemList.get(position).getTitle());
        viewHolder.ivIcon.setImageResource(itemList.get(position).getIconResourceId());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*final int pos = position;*/
                Intent intent = new Intent(v.getContext(), Detail_MenuFragment.class);
                /*intent.putExtra("number", pos);
                intent.putExtra("title",itemList.get(position).getItem_title());  // 이부분이 클릭시 신호를 다른 액티비티로 보내줄수 있는 부분이라고 함.*/
                v.getContext().startActivity(intent);


            }
        });
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = View.inflate(parent.getContext(), R.layout.fragment_menu_list, null);
        return new ViewHolder(itemView);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitle;
        public ImageView ivIcon;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            tvTitle = (TextView) itemLayoutView.findViewById(R.id.item_title);
            ivIcon = (ImageView) itemLayoutView.findViewById(R.id.item_icon);
        }
    }
}