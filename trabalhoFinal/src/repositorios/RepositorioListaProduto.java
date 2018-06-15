package repositorios;
import classesbasicas.Produto;
import interfaces.repositorioProduto;

public class RepositorioListaProduto implements repositorioProduto {
	
	private Produto produto;
	private RepositorioListaProduto next;
	
	RepositorioListaProduto(){
		this.produto = null;
		this.next = null;
	}

	public void inserir(Produto produto) {
		if (this.produto == null) {
			this.produto = produto;
			this.next = new RepositorioListaProduto();
		} else {
			this.next.inserir(produto);
		}
	}

	public void remover(Produto produto) {
		if (this.produto.getId().equals(produto.getId())) {
			this.produto = this.next.produto;
			this.next = this.next.next;
		} else if (this.next.produto != null) {
			this.next.remover(produto);
		}
	}

	public boolean existe(String id) {
		if (this.produto.getId().equals(id)) {
			return true;
		} else if (this.next.produto != null) {
			return this.next.existe(id);
		} else {
			return false;
		}
	}

	
	
}
