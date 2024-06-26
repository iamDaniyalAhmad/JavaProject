package com.example.daniyalahmed;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter {
    public TaskAdapter(MainActivity mainActivity, List<TaskModel> taskList, OnTaskClickListener onTaskClickListener) {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public interface OnTaskClickListener {
        void onUpdateClick(int position);

        void onDeleteClick(int position);

        void onTaskClick(TaskModel task);
    }
}
