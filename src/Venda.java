import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venda {
	private String data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	private String hora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	private double total;
	private Consumidor cliente;
	private Bebida bebida;

	public void Vender() {
		
	}
	
	
	
	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public String getHora() {
		return hora;
	}



	public void setHora(String hora) {
		this.hora = hora;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}



	public Consumidor getCliente() {
		return cliente;
	}



	public void setCliente(Consumidor cliente) {
		this.cliente = cliente;
	}



	public Bebida getBebida() {
		return bebida;
	}



	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}


	public void exibeVenda(int quantidade) {
		System.out.println(" ===============================\n|Compra realizada! Total: R$" + total + "|\n|Data: " + data + " Hora: " + hora + "|");
		bebida.setEstoque(bebida.getEstoque() - quantidade);
		System.out.println("|Restam " + bebida.getEstoque() + " no estoque|");
	}
	
	public void verificarQuantidade(int quantidade, Consumidor cliente, Bebida bebida) {
		if(quantidade > 10) {
			if(cliente.getClass().equals(ConsumidorPj.class)) {
				exibeVenda(quantidade);
			}else {
				System.out.println("Compra Negada, apenas pessoas juridicas podem comprar mais de 10 itens");
			}
		}else {
				exibeVenda(quantidade);
		}
	}
}


