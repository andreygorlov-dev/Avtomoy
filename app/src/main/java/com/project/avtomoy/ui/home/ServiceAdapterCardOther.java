package com.project.avtomoy.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.avtomoy.R;
import com.project.avtomoy.ServicesClass;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ServiceAdapterCardOther extends RecyclerView.Adapter<ServicesViewHolderCardOther> {
    private ArrayList<ServicesClass> duties;
    private ArrayList<Integer> SelectServices;

    public ServiceAdapterCardOther(ArrayList<ServicesClass> duties, ArrayList<Integer> selectServices) {
        this.duties = duties;
        this.SelectServices = selectServices;
    }

    @NonNull
    @Override
    public ServicesViewHolderCardOther onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.services_card,parent,false);
        return  new ServicesViewHolderCardOther(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ServicesViewHolderCardOther holder, int position) {
        holder.bindData(this.duties.get(position),SelectServices);
    }

    @Override
    public int getItemCount() {
        return duties.size();
    }

}

