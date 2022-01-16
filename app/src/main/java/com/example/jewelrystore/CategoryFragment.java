package com.example.jewelrystore;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {

    public CategoryFragment() {
        // Required empty public constructor
    }


    private CardView SchoolBeg,Laptop,Botle,Tourist;
    private CardView College,University,OfficeBeg,BotleCover;
    private ImageView img1,img2,img3,img4,img5,img6,img7,img8;
    private int flag=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_category, container, false);
        SchoolBeg=view.findViewById(R.id.SchoolBeg);
        Laptop=view.findViewById(R.id.Laptops);
        Botle=view.findViewById(R.id.Botle);
        Tourist=view.findViewById(R.id.TouristBeg);
        College=view.findViewById(R.id.College);
        University=view.findViewById(R.id.University);
        OfficeBeg=view.findViewById(R.id.Office);
        BotleCover=view.findViewById(R.id.BotleCover);

        img1=view.findViewById(R.id.img1);
        img2=view.findViewById(R.id.img2);
        img3=view.findViewById(R.id.img3);
        img4=view.findViewById(R.id.img4);
        img7=view.findViewById(R.id.img7);
        img6=view.findViewById(R.id.img6);
        img5=view.findViewById(R.id.img5);
        img8=view.findViewById(R.id.img8);

        Picasso.get().load(R.drawable.img1).into(img1);
        Picasso.get().load(R.drawable.img2).into(img2);
        Picasso.get().load(R.drawable.img3).into(img3);
        Picasso.get().load(R.drawable.img4).into(img4);
        Picasso.get().load(R.drawable.img7).into(img7);
        Picasso.get().load(R.drawable.img6).into(img6);
        Picasso.get().load(R.drawable.img5).into(img5);
        Picasso.get().load(R.drawable.img8).into(img8);

        SchoolBeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),UserCategoryActivity.class);
                intent.putExtra("category","SchoolBeg");
                startActivity(intent);
            }
        });
        Laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),UserCategoryActivity.class);
                intent.putExtra("category","Laptop");
                startActivity(intent);
            }
        });
        Tourist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),UserCategoryActivity.class);
                intent.putExtra("category","Tourist");
                startActivity(intent);
            }
        });
        Botle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),UserCategoryActivity.class);
                intent.putExtra("category","Botle");
                startActivity(intent);
            }
        });
        College.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),UserCategoryActivity.class);
                intent.putExtra("category","College");
                startActivity(intent);
            }
        });
        University.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),UserCategoryActivity.class);
                intent.putExtra("category","University");
                startActivity(intent);
            }
        });
        OfficeBeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),UserCategoryActivity.class);
                intent.putExtra("category","OfficeBeg");
                startActivity(intent);
            }
        });
        BotleCover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),UserCategoryActivity.class);
                intent.putExtra("category","BotleCover");
                startActivity(intent);
            }
        });
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    if (keyCode == KeyEvent.KEYCODE_BACK) {
                        if (flag==1)
                        {
                            getActivity().finish();

                        }
                        else if (flag==0)
                        {
                            Toast.makeText(getActivity(), "Press Back again to Exit.", Toast.LENGTH_SHORT).show();
                            flag=1;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    flag=0;
                                }
                            }, 3 * 1000);
                        }
                        return true;
                    }
                }
                return false;
            }
        });

        return view;
    }
}
