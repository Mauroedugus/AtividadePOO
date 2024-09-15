
public class Bebida {
	private String codBarras;
	private String marca;
	private String dataValidade;
	private double precoCusto;
	private double precoVenda;
	private int estoque;
	
	public Bebida(String codBarras, String marca, String dataValidade, double precoCusto, int estoque) {
		super();
		this.codBarras = codBarras;
		this.marca = marca;
		this.dataValidade = dataValidade;
		this.precoCusto = precoCusto;

		this.estoque = estoque;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public void ajustaPrecoVenda() {
		setPrecoVenda(precoCusto + ((precoCusto * 50) / 100));
	}
	
	public void exibeBebida() {
		System.out.println(codBarras +"\nMarca:"+ marca +"\nPreço:"+ precoVenda +"\nValidade:"+ dataValidade +"\nEstoque:"+ estoque + "\n");
	}
	
	
	
}
