package br.fatec.analise;

public class ServicoMatricula implements IVetorMatriculas {
	private Aluno[] matriculas = new Aluno[100];
	private int tamanho = 0;
	private int totalDeRegistros = 0;

	public ServicoMatricula(int tam) {
		tamanho = tam;
		matriculas = new Aluno[tamanho];
	}

	@Override
	public Aluno get(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void matricula(int posicao, Aluno umAluno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void matricula(Aluno umAluno) {
		this.matriculas[this.totalDeRegistros] = umAluno;
		this.totalDeRegistros++;
	}

	@Override
	public void cancelamento(Aluno aAluno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprime() {
		// TODO Auto-generated method stub

	}

	@Override
	public int estaMatriculado(Aluno aluno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int pesquisa(Aluno aluno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ordena() { // bubble sort
		int out;
		int in;
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
}
