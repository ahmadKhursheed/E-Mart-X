package com.example.jewelrystore;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jewelrystore.Prevalent.Prevalent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private TextView check;
    private DatabaseReference orderListRef;
    private Query query;
    private int flag = 0;

    public OrderFragment() {
        // Required empty public constructor
    }

    private Button order_check;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_order, container, false);
        recyclerView = view.findViewById(R.id.order_list);
        check = view.findViewById(R.id.check_order);
        orderListRef = FirebaseDatabase.getInstance().getReference().child("Orders");
        query = orderListRef.child(Prevalent.currentonlineUsers.getPhone());
        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    Log.i("Data Fetching For order", "Successfull");
                } else {
                    check.setText("No Order Found");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getActivity(), "Error While Fetching Data", Toast.LENGTH_SHORT).show();
            }
        });

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    if (keyCode == KeyEvent.KEYCODE_BACK) {
                        if (flag == 1) {
                            getActivity().finish();

                        } else if (flag == 0) {
                            Toast.makeText(getActivity(), "Press Back again to Exit.", Toast.LENGTH_SHORT).show();
                            flag = 1;
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    flag = 0;
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
