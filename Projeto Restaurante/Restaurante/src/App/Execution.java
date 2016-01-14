package App;
import Model.Mesa;
import Model.Pedido;
import Model.Restaurante;

public class Execution {
	public static void main(String[] args) {
		System.out.println("Iniciando sistema...");
		
		Restaurante restaurante = new Restaurante("Come desgraça!", 10);
		
		System.out.println(restaurante);
			
		restaurante.abrirMesa(0);
		
		Mesa mesinha = restaurante.abrirMesa(0);
		
		Pedido p1 = new Pedido("Arroz", 10);
		restaurante.getMesas()[0].adcionarPedido(p1);
		
		Pedido p2 = new Pedido("Cocada", 10);
		restaurante.getMesas()[0].adcionarPedido(p2);
		
		Pedido p3 = new Pedido("Pizza", 22);
		restaurante.getMesas()[0].adcionarPedido(p3);
		
		mesinha.setRateuo(3);
		/*for(Mesa mesa : restaurante.getMesas()){
			System.out.println(mesa);
			for(Pedido pedido : mesa.getPedidos()){
				if(pedido != null){
					System.out.println("	" + pedido);
				}
			}
		}*/
		System.out.println(restaurante.getMesas()[0]);
		
		
	}
}
