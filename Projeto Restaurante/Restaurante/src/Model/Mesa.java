package Model;

public class Mesa {
	
	public final static String DISPONIVEL = "Disponivel";
	public final static String OCUPADA = "Ocupada";
	public final static String RESERVADA = "Reservada";
	public final static int MAXPEDIDOS = 4;
	
	private int code;
	private String status;
	private Mesa mesaJunta;
	private Pedido[] pedidos;
	private int ContaPedidos = 0;
	private int qntMaxPedidos = MAXPEDIDOS;
	private double conta;
	private double rateio;

	
	public Mesa(int code){
		this.code = code;
		pedidos = new Pedido[MAXPEDIDOS];
	}
	
	//=============================================================//
	public void adcionarPedido(Pedido pedido){
		if(this.status != this.OCUPADA){
			System.out.println("Mesa indisponivel");
			return;
		}
		pedidos[ContaPedidos++] = pedido;
		conta += pedido.getValor();
		if(ContaPedidos == qntMaxPedidos){
			qntMaxPedidos += MAXPEDIDOS;
			Pedido[] temp = this.pedidos;
			this.pedidos = new Pedido[qntMaxPedidos];
			for (int i = 0; i < qntMaxPedidos; i++) {
				pedidos[i] = temp[i];
			}
		}
	}
	
	public double getConta(){
		return conta;
	}
	public void juntarMesa(Mesa mesa){
		mesaJunta = mesa;
	}
	
	public Pedido[] getPedidos(){
		return pedidos;
	}
	//=============================================================//
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setRateuo(int rateio){
		this.rateio = rateio;
	}
	//=============================================================//
	
	public String toString() {
		String str = "Mesa: " + code + " "
				+ "\n-------------------------------\n";
		for(Pedido pedido : pedidos){
			if(pedido != null){
				str += "\t\t" + pedido.toString() + "\n";
			}
		}
		str += "\n-------------------------------\n" + "Total a pagar: " + conta + "R$";
		if(rateio > 0){
			str += "\nRateio: " + conta/rateio;
		}
		return str;
	}
}
