package com.example.controledeprodutos;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterProduto extends RecyclerView.Adapter<AdapterProduto.MyViewHolder> {


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    //Configuro os dados do fragmento da linha
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    //retorna a quantidade de produtos na lista
    @Override
    public int getItemCount() {
        return 0;
    }

    // inerclas/class interna - declara os components que terá no layout
    static class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
    
    
}
