package fatecpg.edu.br.model;

public class Tarefa {
	private int cod;
	private String desc;
	private boolean concluida;
	
	public Tarefa(int cod, String desc, boolean concluida) {
		this.cod = cod;
		this.desc = desc;
		this.concluida = concluida;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public String toString() {
		return "\n Cód:		" + cod 
				+"\n Descrição:	" + desc 
				+"\n Concluída:	" + concluida +"\n";
	}

	
	
	
}
