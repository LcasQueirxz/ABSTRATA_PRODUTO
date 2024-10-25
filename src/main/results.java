package main;

import classes.*;

import java.util.Date;

//classe principal para executar o programa
public class results {

    public static void main(String[] args) {
        //criando instancias de produtos alimenticios e de vestuario com seus respectivos atributos
        products produtoAlimenticio = new foodproducts("abacate", 1.00, 1.50, new Date(), "Vitaminas A, C, E, K, B6, niacina, ácido pantatênico, riboflavina e folato");
        products produtoVestuario = new clothingproducts("camiseta", 10.00, 20.00, "M", "Azul", "Algodao");

        //salvando os produtos
        produtoAlimenticio.salvar();
        produtoVestuario.salvar();

        //calculando e exibindo o lucro dos produtos
        System.out.println("Lucro do produto alimentício: R$" + produtoAlimenticio.calcularLucro());
        System.out.println("Lucro do produto de vestuário: R$" + produtoVestuario.calcularLucro());

        //deletando os produtos
        produtoAlimenticio.deletar();
        produtoVestuario.deletar();
    }
}
