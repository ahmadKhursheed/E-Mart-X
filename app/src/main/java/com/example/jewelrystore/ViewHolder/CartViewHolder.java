package com.example.jewelrystore.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jewelrystore.R;

public class CartViewHolder extends RecyclerView.ViewHolder
{
    public TextView txtProductName,txtProductPrice,txtProductQuantity;

    public CartViewHolder(@NonNull View itemView)
    {
        super(itemView);
        txtProductName=itemView.findViewById(R.id.cart_product_name);
        txtProductPrice=itemView.findViewById(R.id.cart_product_price);
        txtProductQuantity=itemView.findViewById(R.id.cart_product_quantity);
    }
}
