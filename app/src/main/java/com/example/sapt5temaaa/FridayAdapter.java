package com.example.sapt5temaaa;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import static com.example.sapt5temaaa.FridayViewHolder.*;

public class FridayAdapter extends RecyclerView.Adapter<FridayViewHolder> {

    private List<FridayModel> modelList;


    public FridayAdapter(List<FridayModel> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public FridayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_friday_adapter, parent, false);
        return new FridayViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FridayViewHolder holder, int position) {
        FridayModel newModel = modelList.get(position);
        holder.setValues(newModel.getName(), newModel.getFirstName());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}