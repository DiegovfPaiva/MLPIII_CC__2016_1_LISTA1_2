import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListagemApp {
		public static void main(String[] args) {
			
			Inventario inventario = new Inventario();
			
			Item item1 = new Item(1, "item01");
			Item item2 = new Item(2, "item02");
			Item item5 = new Item(5, "item05");
			Item item7 = new Item(7, "item07");
			Item item3 = new Item(3, "item03");
			Item item10 = new Item(10, "item10");
			Item item8 = new Item(8, "item08");
			Item item9 = new Item(9, "item09");
			Item item11 = new Item(11, "item11");
			
			//Verificando se a coleção está vazia.
			if (inventario.getItens().isEmpty()){
				System.out.println("Lista vazia!"); 
			}
			
			
			inventario.getItens().add(item1);
			inventario.getItens().add(item2);
			inventario.getItens().add(item5);
			inventario.getItens().add(item7);
			inventario.getItens().add(item3);
			inventario.getItens().add(item10);
			inventario.getItens().add(item8);
			inventario.getItens().add(item9);
			
			for(Item i : inventario.getItens()){
				System.out.println(i);
			}
			//interação com os itens
			inventario.getItens().get(2).setDescItem("Itens da posicao 2 modificado");
			
			//Odernando a coleção
			Collections.sort(inventario.getItens());
			System.out.println("############### ordenado ###############");
			for(Item i : inventario.getItens()){
				System.out.println(i);
			}
			
			if(inventario.getItens().contains(item9)){
				System.out.println("Lista com objeto : " + item9);
			}else{
				System.out.println("Não existe objeto: " + item9);
			}

			if(inventario.getItens().contains(item11)){
				System.out.println("Lista com objeto : " + item11);
			}else{
				System.out.println("Não existe objeto: " + item11);
			}
			
			
		}
		// Autores: Diego Paiva e Edyara Araujo
}
