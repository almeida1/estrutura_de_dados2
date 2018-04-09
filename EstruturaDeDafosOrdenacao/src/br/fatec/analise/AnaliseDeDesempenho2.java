package br.fatec.analise;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AnaliseDeDesempenho2 {
	public static void main (String args[]){
		int tamanhoVetor = 50000;
		Aluno[] matriculas1 = new Aluno[tamanhoVetor];
		Aluno[] matriculas2 = new Aluno[tamanhoVetor];
		Aluno aluno=null;
		
		int totalDeRegistros = 0;
		// Carrega o vetor para simulacao;
		for (int j = 0; j < tamanhoVetor; j++) {
			long n = (long) (java.lang.Math.random() * (tamanhoVetor - 1));
			String ra = Long.toString(n);
			aluno = new Aluno();
			aluno.setRa(ra);
			aluno.setNome("Jose");
			matriculas1[j] = aluno;
		} 
		/*
		 * mostra o vetor original
		 */
		for (int i=0; i < tamanhoVetor; i++){
			System.out.println("[" + i + "] = " + matriculas1[i].getRa());
		}
		/*
		 * copia o vetor
		 */
		for (int i=0; i < tamanhoVetor; i++){
			matriculas2[i] = matriculas1[i];
		}
		/*
		 * mostra o vetor copiado
		 */
		for (int i=0; i < tamanhoVetor; i++){
			System.out.println("[" + i + "] = " + matriculas2[i].getRa());
		}
		/*
		 * avalia para o primeiro algoritmo
		 */
		ServicoMatricula2 servico = new ServicoMatricula2();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		long start = Calendar.getInstance().getTimeInMillis();
		System.out.println("Inicio => " + sdf.format(start));
		servico.ordena1(tamanhoVetor, matriculas2);
		long stop = Calendar.getInstance().getTimeInMillis();
		System.out.println("Termino => " + sdf.format(stop));
		long time = stop - start;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		cal.add(Calendar.SECOND, Integer.parseInt("" + (time / 1000)));
		System.out.println("Esforco: " + sdf.format(cal.getTime()));
		/*
		 * avalia para o segundo algoritmo
		 */
		
		for (int i=0; i < tamanhoVetor; i++){
			matriculas2[i] = matriculas1[i];
		}
		servico = new ServicoMatricula2();
		start = Calendar.getInstance().getTimeInMillis();
		System.out.println("Inicio => " + sdf.format(start));
		servico.ordena2(tamanhoVetor, matriculas2);
		stop = Calendar.getInstance().getTimeInMillis();
		System.out.println("Termino => " + sdf.format(stop));
		time = stop - start;
		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		cal.add(Calendar.SECOND, Integer.parseInt("" + (time / 1000)));
		System.out.println("Esforco: " + sdf.format(cal.getTime()));
		
	}

}
