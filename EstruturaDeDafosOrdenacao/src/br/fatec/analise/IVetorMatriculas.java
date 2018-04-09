package br.fatec.analise;

	public interface IVetorMatriculas {
		public Aluno get(int posicao);
		public void matricula(int posicao, Aluno umAluno);
		public void matricula(Aluno aluno);
		public void cancelamento(Aluno aAluno);
		public void imprime();
		public int estaMatriculado(Aluno aluno);
		public int pesquisa(Aluno aluno);
		public void ordena();
}
