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
    private OnClick onClick;

    public AdapterProduto(List<ProdutoModel> produtoModelList, OnClick onClick) {
        this.produtoModelList = produtoModelList;
        this.onClick = onClick;
    }

    //Adapter faz a ponte entre as informações trazidas do banco de dados com a visualização em tela do app
    //-----Criar suporte de exibição

    @NonNull
    @Override
    //Nesse metodo é introduzido o fragmento do layout que será tratado
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item_produto, parent, false);

        return new MyViewHolder(itemView);
    }

    //Configuro os dados do fragmento da linha (fragmento)
    //-----No Titular da Vista Vinculada
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ProdutoModel produtoModel = produtoModelList.get(position);

        holder.textViewProduct.setText(produtoModel.getNome());
        holder.textViewStockProduct.setText("Em Estoque: " + String.valueOf(produtoModel.getEstoque()));
        holder.textViewValueProduct.setText("R$ " + String.valueOf(produtoModel.getValor()));

        holder.itemView.setOnClickListener(view -> onClick.onClickListener(produtoModel));
    }

    //retorna a quantidade de produtos na lista
    //-----Obter a contagem de itens
    @Override
    public int getItemCount() {
        return produtoModelList.size();
    }


    public interface OnClick {
        void onClickListener(ProdutoModel produtoModel);
    }

    // inerclas/class interna - declara os components que terá no layout
    //-----Titular da minha visão
    static class MyViewHolder extends RecyclerView.ViewHolder {

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
