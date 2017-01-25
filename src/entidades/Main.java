package entidades;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main {


	public static void main(String[] args) {
		
		System.out.println("-----Trabalho de Comp3-----");
		
		//Criação de Mobilias
		Mobilia cadeira = new Mobilia("Cadeira", 20, 2);
		Mobilia mesa = new Mobilia("Mesa", 100, 3);
		Mobilia cama = new Mobilia("Cama", 300, 4);
		Mobilia armario = new Mobilia("Armario", 3000, 2);
		Mobilia escrivaninha = new Mobilia("Escrivaninha", 500, 3);
		Mobilia balcao = new Mobilia("Balcao", 600, 2);
		Mobilia pia = new Mobilia("Pia", 150, 1);
		Mobilia sofa = new Mobilia("Sofá", 2000, 2);
		
		//Criação de Quartos
		Quarto q1 = new Quarto("Quarto casal");
		Quarto q2 = new Quarto("Quarto solteiro");
		
		//Criação de Salas
		Sala s1 = new Sala("Sala de Estar");
		Sala s2 = new Sala("Sala de Jantar");
		
		//Criação de Cozinhas
		Cozinha c1 = new Cozinha("Cozinha moderna");
		Cozinha c2 = new Cozinha("Cozinha americana");
		
		//Criação de ComodoComposto
		ComodoComposto cc1 = new ComodoComposto("Escritorio - Sala/Quarto");
		cc1.listaComodo.add(Quarto.lista);
		cc1.listaComodo.add(Sala.lista);
		
		ComodoComposto cc2 = new ComodoComposto("Quitinete - Todos os comodos");
		
		//Inserção nas listas
		Quarto.lista.add(cadeira);
		Quarto.lista.add(cama);
		Quarto.lista.add(armario);
		Quarto.lista.add(escrivaninha);
		
		Sala.lista.add(cadeira);
		Sala.lista.add(mesa);
		Sala.lista.add(sofa);
		
		Cozinha.lista.add(mesa);
		Cozinha.lista.add(armario);
		Cozinha.lista.add(balcao);
		Cozinha.lista.add(sofa);

		/*
		for (Mobilia iterador : Cozinha.lista) {
			System.out.println(iterador.getDescricao());
		}*/
		
		
		//Criação ItemVenda
		ItemVenda itemVenda1 = new ItemVenda(cadeira, 6);
		ItemVenda itemVenda2 = new ItemVenda(mesa, 1);
		ItemVenda itemVenda3 = new ItemVenda(armario, 1);
		
		//Criação de Ambiente
		Ambiente ambiente1 = new Ambiente(4, 2, 10);
		Ambiente ambiente2 = new Ambiente(5, 1, 15);
		Ambiente ambiente3 = new Ambiente(5, 3, 20);
		
		//Criação de Contrato
		Contrato contrato1 = new Contrato(10);
		
		//Atribuição dos itemVenda à Ambiente
		ambiente1.listaItemVenda().add(itemVenda1);
		ambiente1.listaItemVenda().add(itemVenda2);
		ambiente1.listaItemVenda().add(itemVenda3);
		
		//Atribuição dos Ambientes à Contrato
		contrato1.listaAmbiente().add(ambiente1);
		
		
	/*	float teste;
		teste = ambiente1.custo();
		System.out.println(teste);
		
		ambiente1.custoAuxiliar();
		System.out.println("----"+contrato1.valorContrato());
		*/
		for (Mobilia iterador : Cozinha.lista) {
			System.out.println(iterador.getDescricao());
		}
		
		System.out.println("---------------------");
		
		Cozinha cozinha = new Cozinha("cozinha maluca");
		c2.lista.add(escrivaninha);
		for (Mobilia iterador : Cozinha.lista) {
			System.out.println(iterador.getDescricao());
		}
	}
}
