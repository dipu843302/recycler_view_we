package com.example.recycler_view;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class student extends RecyclerView.ViewHolder {
    private TextView mtvName;
    private TextView mTvage;
    private TextView mtvroll;

    public student( View itemView) {

        super(itemView);
        iniviews(itemView);

    }

    private void iniviews(View itemView) {
        mtvName=itemView.findViewById(R.id.tvName);
        mTvage=itemView.findViewById(R.id.tvAge);
        mtvroll=itemView.findViewById(R.id.tvRollNo);
    }
    public void setData(modelclass sstudent){
        mtvName.setText(sstudent.getName());
        mTvage.setText(sstudent.getAge()+"");
        mtvroll.setText(sstudent.getRollno());
    }
}
