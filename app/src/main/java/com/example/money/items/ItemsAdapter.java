package com.example.money.items;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.money.R;

import java.util.ArrayList;
import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemViewHolder> {
    private List<Item> itemList = new ArrayList<>();

    public void setData(List<Item> items) {
        itemList.clear();
        itemList.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new ItemViewHolder(layoutInflater.inflate(R.layout.item_money, parent, false));
    }
    
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.bind(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView price;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.item_title);
            this.price = itemView.findViewById(R.id.item_price);
        }

        public void bind(Item item) {
            title.setText(item.getTitle());
            price.setText(item.getPrice());
        }
    }
}
