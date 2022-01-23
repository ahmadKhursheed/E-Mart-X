package com.example.jewelrystore.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.jewelrystore.R;

public class ProductViewHolder extends RecyclerView.ViewHolder
{
    public TextView txtProductName,txtProductDesc,txtProductPrice;
    public ImageView imgProductPic;
    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        imgProductPic=itemView.findViewById(R.id.pImage);
        txtProductName=itemView.findViewById(R.id.pname);
        txtProductDesc=itemView.findViewById(R.id.pdesc);
        txtProductPrice=itemView.findViewById(R.id.prod_price);
    }
}
