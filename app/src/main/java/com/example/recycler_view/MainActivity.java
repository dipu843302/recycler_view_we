package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList<modelclass> studentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        buildStudentList();
        setRecyclerView();
    }
    private void initviews(){
        recyclerView=findViewById(R.id.recyclerview);

    }
    private void buildStudentList(){
        studentList=new ArrayList<modelclass>();
        modelclass student1=new modelclass("Anush",22,"EMP123");
        studentList.add(student1);
        modelclass student2=new modelclass("Kunar",23,"SDF123");
        studentList.add(student2);
        modelclass student3=new modelclass("Anil",25,"EMP133");
        studentList.add(student3);
        for (int i=0;i<12;i++){
            modelclass student=new modelclass("xyz"+1,21,"EMP125");
            studentList.add(student);
        }

    }
    private void setRecyclerView(){
        studentAdapter sstudentAdapter=new studentAdapter(studentList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(sstudentAdapter);
    }

}