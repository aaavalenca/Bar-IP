package classesbasicas;

public abstract class Produto {
	private String id;
	private double preco;
	private String nome;
	private Integer estoque;

	public Produto(String id, double preco, String nome, Integer estoque){
		this.id = id;
		this.preco = preco;
		this.nome = nome;
		this.estoque = estoque;
	}


	//setters

	public void setId(String id){
		this.id = id;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setEstoque(int estoque){
		this.estoque = estoque;
	}	


	//getters

	public String getId(){
		return id;
	}

	public double getPreco(){
		return preco;
	}

	public String getNome(){
		return nome;
	}

	public Integer getEstoque(){
		return estoque;
	}


	// outros metodos

	public void estocar(int qtd){
		this.estoque += qtd;
	}

	public void retirarEstoque(int qtd){
		this.estoque -= qtd;
	}

}
