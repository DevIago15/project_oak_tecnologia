package entities;

public class Produto implements Comparable<Produto> {
	private String nomeProduto;
	private String descricaoProduto;
	private String disponivel;
	private double precoProduto;

	public int compareTo(Produto produto) {
		if (this.precoProduto > produto.precoProduto) {
			return 1;
		} else if (this.precoProduto < produto.precoProduto) {
			return -1;
		} else {
			return 0;
		}
	}

	// constructor
	public Produto(String nomeProduto, String descricaoProduto, String disponivel, Double precoProduto) {
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.disponivel = disponivel;
		this.precoProduto = precoProduto;
	}

	// getters and setters
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}

	// transformando a listagem em string
	public String toString() {
		return "\nNome: " + nomeProduto + ", Descrição: " + descricaoProduto + ", Preço: R$" + precoProduto
				+ ", Disponivel: " + disponivel;
	}

}
