package com.example.controledeprodutos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterProduto extends RecyclerView.Adapter<AdapterProduto.MyViewHolder> {

    private List<ProdutoModel> produtoModelList;

    public AdapterProduto(List<ProdutoModel> produtoModelList) {
        this.produtoModelList = produtoModelList;
    }

    //Adapter faz a ponte entre as informações trazidas do banco de dados com a visualização em tela do app

    @NonNull
    @Override
    //Nesse metodo é introduzido o fragmento do layout que será tratado
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item_produto, parent, false);

        return new MyViewHolder(itemView);
    }


    //Configuro os dados do fragmento da linha (fragmento)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    }


    //retorna a quantidade de produtos na lista
    @Override
    public int getItemCount() {
        return produtoModelList.size();
    }


    // inerclas/class interna - declara os components que terá no layout
    static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textViewProduct, textViewStockProduct, textViewValueProduct;

        //Define as informações exibida no fragmento
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            //Atraves do layout (itemView) acessamos os textViews;
            textViewProduct = itemView.findViewById(R.id.textView_name_product);
            textViewStockProduct = itemView.findViewById(R.id.textView_stock_product);
            textViewValueProduct = itemView.findViewById(R.id.textView_value_product);

        }
    }
}
