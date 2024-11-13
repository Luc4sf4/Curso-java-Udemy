package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoCliente1 {
	public static void main(String[] args) {
	
		Assento assento = new Assento("16A");
		Cliente cliente = new Cliente("Carlos", assento);
		
		DAO<Object> dao = new DAO<>();
		
		//quem vou inserir primeiro ? 
		//como colocamos para o cliente receber o id do assento, deveremos criar o assento de cliente
		
		dao.abrirT().incluir(assento).incluir(cliente).fecharT().fechar();
		
		
	}
}
