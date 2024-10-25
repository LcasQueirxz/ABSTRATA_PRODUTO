package classes;

//classe abstrata para representar um produto
public abstract class products {
    protected String nome; //campo para armazenar o nome do produto
    protected double precoCusto; //campo para armazenar o preco de custo do produto
    protected double precoVenda; //campo para armazenar o preco de venda do produto

    //construtor para inicializar os campos nome, precoCusto e precoVenda
    public products (String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    //metodo para calcular o lucro do produto
    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    //metodo abstrato para salvar o produto, deve ser implementado pelas subclasses
    public abstract void salvar();

    //metodo abstrato para deletar o produto, deve ser implementado pelas subclasses
    public abstract void deletar();

    //metodo abstrato para atualizar o produto, deve ser implementado pelas subclasses
    public abstract void atualizar();
}
