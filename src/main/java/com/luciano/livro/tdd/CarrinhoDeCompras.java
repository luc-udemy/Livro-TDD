package com.luciano.livro.tdd;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;


public class CarrinhoDeCompras {
    
    @Getter
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }
    
    public void adiciona(Produto produto){
        produtos.add(produto);
    }
    
}