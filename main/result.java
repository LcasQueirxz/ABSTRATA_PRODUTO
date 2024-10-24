package main;

import products.*;

import java.util.Date;

public class result {


    public static void main(String[] args) {
        product produtoAlimenticio = new foodproducts("abacate", 1.00, 1.50, new Date(), "Vitaminas A, C, E, K, B6, niacina, ácido pantatênico, riboflavina e folato");
        product produtoVestuario = new clothingproducts("camiseta", 10.00, 20.00, "M", "Azul", "Algodao");

        produtoAlimenticio.salvar();
        produtoVestuario.salvar();

        System.out.println("Lucro do produto alimentício: R$" + produtoAlimenticio.calcularLucro());
        System.out.println("Lucro do produto de vestuário: R$" + produtoVestuario.calcularLucro());

        produtoAlimenticio.deletar();
        produtoVestuario.deletar();
    }
}
