package com.example.controledeprodutos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterProduto.OnClick {

    AdapterProduto adapterProduto;
    List<ProdutoModel> produtoModelList = new ArrayList<>();
    private RecyclerView rvProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProdutos = findViewById(R.id.rv_produtos);
        carregaLista();
        configRecycleView();
    }

    private void configRecycleView() {
        rvProdutos.setLayoutManager(new LinearLayoutManager(this));
        rvProdutos.setHasFixedSize(true);
        adapterProduto = new AdapterProduto(produtoModelList, this);
        rvProdutos.setAdapter(adapterProduto);
    }

    private void carregaLista() {

        ProdutoModel produtoModel1 = new ProdutoModel();
        produtoModel1.setNome("Monitor LG");
        produtoModel1.setEstoque(45);
        produtoModel1.setValor(800.00);

        ProdutoModel produtoModel2 = new ProdutoModel();
        produtoModel2.setNome("Monitor SAMSUNG");
        produtoModel2.setEstoque(12);
        produtoModel2.setValor(1000.00);

        ProdutoModel produtoModel3 = new ProdutoModel();
        produtoModel3.setNome("Monitor TCL");
        produtoModel3.setEstoque(2);
        produtoModel3.setValor(650.00);

        produtoModelList.add(produtoModel1);
        produtoModelList.add(produtoModel2);
        produtoModelList.add(produtoModel3);
        produtoModelList.add(produtoModel1);
        produtoModelList.add(produtoModel2);
        produtoModelList.add(produtoModel3);
        produtoModelList.add(produtoModel1);
        produtoModelList.add(produtoModel2);
        produtoModelList.add(produtoModel3);
        produtoModelList.add(produtoModel1);
        produtoModelList.add(produtoModel2);
        produtoModelList.add(produtoModel3);
    }

    @Override
    public void onClickListener(ProdutoModel produtoModel) {
        Toast.makeText(this, produtoModel.getNome(), Toast.LENGTH_SHORT).show();
    }
}