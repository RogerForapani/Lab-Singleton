package Facade;

import subsistema2.CrmService;
import subsistema2.cep.CepService;

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepService.getInstancia().recuperarCidade(cep);
		String estado = CepService.getInstancia().recuperarEstado(cep);
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}	
}
