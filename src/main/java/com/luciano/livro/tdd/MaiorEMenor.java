package com.luciano.livro.tdd;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MaiorEMenor {

    private Produto menor;
    private Produto maior;

    public void encontra(CarrinhoDeCompras carrinho) {

        for (Produto produto : carrinho.getProdutos()) {
            if (menor == null
                    || produto.getValor() < menor.getValor()) {
                menor = produto;
            } else if (maior == null
                    || produto.getValor() > maior.getValor()) {
                maior = produto;
            }
        }
    }
}
