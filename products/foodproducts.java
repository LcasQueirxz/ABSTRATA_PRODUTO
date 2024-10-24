package products;

import java.util.Date;

public class foodproducts extends product {
    private Date dataValidade;
    private String informacoesNutricionais;

    public foodproducts(String nome, double precoCusto, double precoVenda, Date dataValidade, String informacoesNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.informacoesNutricionais = informacoesNutricionais;
    }
    public Date getDataValidade() {
    	return dataValidade;
    	
    }
    public String getinformacoesNutricionais() {
    	return informacoesNutricionais;
    }

    @Override
    public void salvar() {
        System.out.println("Produto alimentício salvo.");
    }

    @Override
    public void deletar() {
        System.out.println("Produto alimentício deletado.");
    }

    @Override
    public void atualizar() {
        System.out.println("Produto alimentício atualizado.");
    }
}
