package products;

public class clothingproducts extends product {
    private String tamanho;
    private String cor;
    private String material;

    public clothingproducts(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }
    public String getTamanho() {
    	return tamanho;
    }
   
    public String getCor() {
    	return cor;
    }
    public String getMaterial() {
    	return material;
    }
      
    @Override
    public void salvar() {
        System.out.println("Produto de vestuário salvo.");
    }
    @Override
    public void deletar() {
        System.out.println("Produto de vestuário deletado.");
    }
    @Override
    public void atualizar() {
        System.out.println("Produto de vestuário atualizado.");
    }
}
