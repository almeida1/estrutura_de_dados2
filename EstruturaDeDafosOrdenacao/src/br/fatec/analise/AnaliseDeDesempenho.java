package br.fatec.analise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AnaliseDeDesempenho {
	public static void main(String args[]) {
		int tamanhoVetor = 50000;
		Aluno aluno = null;
		IVetorMatriculas cadastro = new ServicoMatricula(tamanhoVetor);
		// Carrega o vetor para simulacao
		for (int j = 0; j < tamanhoVetor; j++) {
			long n = (long) (java.lang.Math.random() * (tamanhoVetor - 1));
			String ra = Long.toString(n);
			aluno = new Aluno();
			aluno.setRa(ra);
			aluno.setNome("Jose");
			cadastro.matricula(aluno);
		} // Calcula o tempo de ordenacao
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		long start = Calendar.getInstance().getTimeInMillis();
		System.out.println("Inicio => " + sdf.format(start));
		cadastro.ordena();
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
	}
}
