package br.fatec.escola.model;

public class Disciplina {
	
	private String nome;
	private String sigla;
	private int cod;
	private Aluno aluno;
	
	public Disciplina(String nome, String sigla, int cod) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", sigla=" + sigla + ", cod=" + cod + ", aluno=" + aluno + "]";
	}
	

	
	
}
