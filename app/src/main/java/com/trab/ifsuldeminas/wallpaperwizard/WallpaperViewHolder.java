package com.trab.ifsuldeminas.wallpaperwizard;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class WallpaperViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;

    public WallpaperViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageViewItem);
    }
}
