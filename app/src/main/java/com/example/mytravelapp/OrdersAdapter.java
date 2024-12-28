package com.example.mytravelapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.OrderViewHolder> {

    private List<String> orderDetails;

    public OrdersAdapter(List<String> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        holder.detailTextView.setText(orderDetails.get(position));
    }

    @Override
    public int getItemCount() {
        return orderDetails.size();
    }

    static class OrderViewHolder extends RecyclerView.ViewHolder {
        TextView detailTextView;

        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
            detailTextView = itemView.findViewById(android.R.id.text1);
        }
    }
}
