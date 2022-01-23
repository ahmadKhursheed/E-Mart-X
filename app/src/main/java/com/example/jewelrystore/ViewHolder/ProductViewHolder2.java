package com.example.jewelrystore.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.jewelrystore.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProductViewHolder2 extends RecyclerView.ViewHolder
{
    public TextView item_name,item_desc;
    public CircleImageView item_pic;
    public ProductViewHolder2(@NonNull View itemView) {
        super(itemView);

        item_pic=itemView.findViewById(R.id.item_pic);
        item_name=itemView.findViewById(R.id.item_name);
        item_desc=itemView.findViewById(R.id.item_desc);
    }
}
