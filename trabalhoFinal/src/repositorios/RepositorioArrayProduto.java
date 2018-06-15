package repositorios;

import classesbasicas.Produto;
import interfaces.repositorioProduto;

public class RepositorioArrayProduto implements repositorioProduto {

	private Produto[] produtos;
	private int contador;

	RepositorioArrayProduto(){
		this.contador = 0;
		this.produtos = new Produto[contador + 1];
	}

	public void inserir(Produto produto) {
		this.produtos[contador] = produto;
		contador++;
	}

	public void remover(Produto produto) {
		boolean achou = true;
		for (int i = 0; i < (contador + 1) && achou; i++) {
			if (this.produtos[i] == produto) {
				this.produtos[i] = this.produtos[contador];
				contador--;
				achou = false;
			}
		}
	}

	public boolean existe(String codigo) {
		for (int i = 0; i < (contador + 1); i++) {
			if (this.produtos[i].getId().equals(codigo)) {
				return true;
			}
		}
		return false;
	}
	
	public Integer getIndice(String atualizacao) {
		for (int i = 0; i < (contador + 1); i++) {
			if (this.produtos[i].getId().equals(atualizacao)) {
				return i;
			}
		}
		return null;
	}
	
	public void atualizar(Produto produtoAtualizado) {
		int indice = this.getIndice(produtoAtualizado.getId());
		if(!(produtoAtualizado.getPreco() == -1.0)) {
			this.produtos[indice].setPreco(produtoAtualizado.getPreco());
		}
		if(!(produtoAtualizado.getNome() == null)) {
			this.produtos[indice].setNome(produtoAtualizado.getNome());
		}
		if(!(produtoAtualizado.getEstoque() == null)) {
			this.produtos[indice].setEstoque(produtoAtualizado.getEstoque());
		}

	}

}
