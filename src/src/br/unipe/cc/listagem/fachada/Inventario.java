package br.unipe.cc.listagem.fachada;
import java.util.ArrayList;
import java.util.List;

import br.unipe.cc.listagem.modelo.Item;

public class Inventario{

	private List<Item> itens = new ArrayList<Item>();

	public Inventario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	
}
