package br.fatec.analise;

public class ServicoMatricula2 {

	private Aluno[] matriculas;

	public void ordena1(int totalDeRegistros, Aluno[] matriculas) { // bubble
																	// sort
		int out;
		int in;
		this.matriculas = matriculas;
		for (out = totalDeRegistros - 1; out > 1; out--) {
			for (in = 0; in < out; in++) {
				if (matriculas[in].getRa().compareTo(matriculas[in + 1].getRa()) > 0) {
					troca(in, in + 1); // troca de posicao } } } }
				}
			}
		}
	}

	private void troca(int one, int two) {
		Aluno temp = matriculas[one];
		matriculas[one] = matriculas[two];
		matriculas[two] = temp;
	}

	
	public void ordena2(int totalDeRegistros, Aluno[] matriculas) {// algoritmo de ordenação por insercao
		int in;
		int out;
		for (out = 1; out < totalDeRegistros; out++) {
			Aluno temp = matriculas[out];
			in = out;
			while (in > 0 && (matriculas[in - 1].getRa().compareTo(temp.getRa()) > 0)) {
				matriculas[in] = matriculas[in - 1];
				--in;
			}
			matriculas[in] = temp;
		}
	}
}
