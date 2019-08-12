package com.eslam.doctorassistance;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.Holder> {

    private List<Student> studentList;
    private Activity context;

    public StudentsAdapter(List<Student> studentList, Activity context) {
        this.studentList = studentList;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        Student student = studentList.get(position);
        holder.name.setText(student.getName());
        holder.id.setText("ID =" + (position + 1));
        holder.address.setText(student.getAddress());
        holder.age.setText("Age =" + student.getAge());
        holder.grade.setText("Grade =" + student.getGrade());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public void insertItem(Student message) {
        studentList.add(0,message);
        notifyDataSetChanged();
    }

    class Holder extends RecyclerView.ViewHolder {

        TextView name, age, grade, address, id;

        public Holder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
            grade = itemView.findViewById(R.id.grade);
            address = itemView.findViewById(R.id.address);
            id = itemView.findViewById(R.id.id);
        }
    }
}
