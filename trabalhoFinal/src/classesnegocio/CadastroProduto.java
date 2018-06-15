package classesnegocio;
import classesbasicas.Produto;
import interfaces.repositorioProduto;

public class CadastroProduto {

	private repositorioProduto produtosArmazenados;
	
	public CadastroProduto(repositorioProduto produto) {
		this.produtosArmazenados = produto;
	}
	
	public void cadastrar(Produto produto) {
		produtosArmazenados.inserir(produto);
	}
	
	public void descadastrar(Produto produto){
		produtosArmazenados.remover(produto);
	}
	
	
}
