package com.example.recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class studentAdapter extends RecyclerView.Adapter<student> {
    private ArrayList<modelclass>studentList;
    public studentAdapter(ArrayList<modelclass>studentList){
        this.studentList=studentList;
    }
    @Override
    public student onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new student(view);
    }

    @Override
    public void onBindViewHolder(student holder, int position) {
        modelclass modelclass=studentList.get(position);
     holder.setData(modelclass);
    }

    @Override
    public int getItemCount() {

        return studentList.size();
    }
}
