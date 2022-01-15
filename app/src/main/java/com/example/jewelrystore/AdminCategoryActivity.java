package com.example.jewelrystore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AdminCategoryActivity extends AppCompatActivity {
    private CardView school,laptop,botle,tourist;
    private CardView college,university,office,botleCover;
    private ImageView img1,img2,img3,img4,img5,img6,img7,img8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);
        school=findViewById(R.id.school);
       laptop=findViewById(R.id.laptop);
        botle=findViewById(R.id.botle);
        tourist=findViewById(R.id.tourist);
        college=findViewById(R.id.college);
       university=findViewById(R.id.university);
        office=findViewById(R.id.office);
        botleCover=findViewById(R.id.botleCover);

        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);
        img7=findViewById(R.id.img7);
        img8=findViewById(R.id.img8);

        Picasso.get().load(R.drawable.img1).into(img1);
        Picasso.get().load(R.drawable.img2).into(img2);
        Picasso.get().load(R.drawable.img3).into(img3);
        Picasso.get().load(R.drawable.img4).into(img4);
        Picasso.get().load(R.drawable.img5).into(img5);
        Picasso.get().load(R.drawable.img6).into(img6);
        Picasso.get().load(R.drawable.img7).into(img7);
        Picasso.get().load(R.drawable.img8).into(img8);
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProdcutActivity.class);
                intent.putExtra("category","SchoolBeg");
                startActivity(intent);
            }
        });
        laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProdcutActivity.class);
                intent.putExtra("category","Laptop");
                startActivity(intent);
            }
        });
        botle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProdcutActivity.class);
                intent.putExtra("category","Botle");
                startActivity(intent);
            }
        });
        tourist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProdcutActivity.class);
                intent.putExtra("category","Tourist");
                startActivity(intent);
            }
        });
        college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProdcutActivity.class);
                intent.putExtra("category","College");
                startActivity(intent);
            }
        });
        university.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProdcutActivity.class);
                intent.putExtra("category","University");
                startActivity(intent);
            }
        });
        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProdcutActivity.class);
                intent.putExtra("category","OfficeBeg");
                startActivity(intent);
            }
        });
        botleCover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,AdminAddNewProdcutActivity.class);
                intent.putExtra("category","BotleCover");
                startActivity(intent);
            }
        });
    }
}
