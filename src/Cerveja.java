
public class Cerveja extends Bebida {

	public Cerveja(String codBarras, String marca, String dataValidade, double precoCusto, int estoque) {
		super(codBarras, marca, dataValidade, precoCusto, estoque);
		// TODO Auto-generated constructor stub
	}
	
	public boolean verificaIdade(Consumidor cliente) {
		if(cliente.getIdade() >= 18) {
			return true;
		}else {
			return false;
		}
	}

}
