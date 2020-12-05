package com.iics26011.leprutas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class fruitListAdapter extends RecyclerView.Adapter<fruitListAdapter.fruitViewHolder> {

    private final LayoutInflater layoutInflater;
    private final Context context;
    List<fruit> fruits;

    fruitListAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    void setFruits(List<fruit> fruits) {
        this.fruits = fruits;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public fruitListAdapter.fruitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new fruitListAdapter.fruitViewHolder(layoutInflater.inflate(R.layout.fruit_item, parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull fruitListAdapter.fruitViewHolder holder, int position) {
        fruit current = fruits.get(position);
        holder.fruitName.setText(current.getName());
        holder.fruitThumbnail.setImageDrawable(context.getDrawable(current.getImage()));
    }

    @Override
    public int getItemCount() {
        return fruits == null ? 0 : fruits.size();
    }

    public static class fruitViewHolder extends RecyclerView.ViewHolder {
        final ImageView fruitThumbnail;
        final TextView fruitName;

        public fruitViewHolder(@NonNull View itemView) {
            super(itemView);
            fruitThumbnail = itemView.findViewById(R.id.fruitThumbnail);
            fruitName = itemView.findViewById(R.id.fruitName);
        }
    }
}
