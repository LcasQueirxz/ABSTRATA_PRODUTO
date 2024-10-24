package products;

public abstract class product {
    protected String nome;
    protected double precoCusto;
    protected double precoVenda;

    public product (String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }
    public double calcularLucro() {
        return precoVenda - precoCusto;
    }
    public abstract void salvar();
    public abstract void deletar();
    public abstract void atualizar();
}
