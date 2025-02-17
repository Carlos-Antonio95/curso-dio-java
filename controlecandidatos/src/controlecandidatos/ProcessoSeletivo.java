package controlecandidatos;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;



public class ProcessoSeletivo {

	public static void main(String[] args) {
		String [] candidatos = {"FELIPE","MARCIA","PAULO","AUSGUTO","MONICA"};
		for(String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
		
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas =1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = ! atendeu;
			if (continuarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("Contato realizado com sucesso");
			}
			
			
		}while(continuarTentando && tentativasRealizadas < 3);
		if (atendeu) {
			System.out.println("Conseguimos contato com "+ candidato+" na "+tentativasRealizadas);
		}else {
			System.out.println("Não conseguimos contato com "+ candidato +" Número maximo tentativas "+ tentativasRealizadas+" Realizada");
		}
	}
	//Metodo auxiliar
	public static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
	
	public static void imprirmirSelecionados() {
		String [] candidatos = {"FELIPE","MARCIA","PAULO","AUSGUTO","MONICA"};
		System.out.println("Imprimindo a lista de candidatos informando o elemento");
		for (int indice =0; indice < candidatos.length;indice++) {
			System.out.println("O candidato de nº "+ (indice+1)+ " é "+ candidatos[indice]);
			
		}
	}
	
	public static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE","MARCIA","PAULO","AUSGUTO","MONICA","FABRICIO","MIRELA","DANIELA","JOAS"};
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato "+candidato+" Solicitou este valor de salário "+salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato "+ candidato+ " foi selecionado para vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	
	}
	
	public static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
		}
	
	public static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		}else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
		
		
	}

}
