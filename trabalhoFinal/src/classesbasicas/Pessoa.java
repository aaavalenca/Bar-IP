package classesbasicas;

public abstract class Pessoa {
	private String nome;
	private String id;
	private Integer idade;

	public Pessoa(String nome, String id, Integer idade) {
		this.nome = nome;
		this.id = id;
		this.idade = idade;
	}

	//setters
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	//getters
	
	public String getNome() {
		return this.nome;
	}
	
	public String getId() {
		return this.id;
	}
	
	public Integer getIdade() {
		return this.idade;
	}
	
}