package classes;

import java.util.Date;

//classe que representa produtos alimenticios, extende products
public class foodproducts extends products {
    private Date dataValidade; //campo para armazenar a data de validade do produto
    private String informacoesNutricionais; //campo para armazenar as informacoes nutricionais do produto

    //construtor para inicializar os campos nome, precoCusto, precoVenda, dataValidade e informacoesNutricionais
    public foodproducts(String nome, double precoCusto, double precoVenda, Date dataValidade, String informacoesNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.informacoesNutricionais = informacoesNutricionais;
    }

    //metodo para obter a data de validade do produto
    public Date getDataValidade() {
        return dataValidade;
    }

    //metodo para obter as informacoes nutricionais do produto
    public String getinformacoesNutricionais() {
        return informacoesNutricionais;
    }

    //metodo para salvar o produto alimenticio
    @Override
    public void salvar() {
        System.out.println("Produto alimentício salvo.");
    }

    //metodo para deletar o produto alimenticio
    @Override
    public void deletar() {
        System.out.println("Produto alimentício deletado.");
    }

    //metodo para atualizar o produto alimenticio
    @Override
    public void atualizar() {
        System.out.println("Produto alimentício atualizado.");
    }
}
