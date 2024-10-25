package classes;

//classe que representa produtos de vestuario, extende products
public class clothingproducts extends products {
    private String tamanho; //campo para armazenar o tamanho do produto
    private String cor; //campo para armazenar a cor do produto
    private String material; //campo para armazenar o material do produto

    //construtor para inicializar os campos nome, precoCusto, precoVenda, tamanho, cor e material
    public clothingproducts(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    //metodo para obter o tamanho do produto
    public String getTamanho() {
        return tamanho;
    }

    //metodo para obter a cor do produto
    public String getCor() {
        return cor;
    }

    //metodo para obter o material do produto
    public String getMaterial() {
        return material;
    }

    //metodo para salvar o produto de vestuario
    @Override
    public void salvar() {
        System.out.println("Produto de vestuário salvo.");
    }

    //metodo para deletar o produto de vestuario
    @Override
    public void deletar() {
        System.out.println("Produto de vestuário deletado.");
    }

    //metodo para atualizar o produto de vestuario
    @Override
    public void atualizar() {
        System.out.println("Produto de vestuário atualizado.");
    }
}
