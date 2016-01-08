package escola.musica.modelo;

import java.util.Date;
import java.util.List;

public class Aluno extends Pessoa {
	
	private List<Matricula> listaMatriculas;
	private boolean ativo;
	/**
	 * @param listaMatriculas
	 * @param ativo
	 */
	public Aluno(List<Matricula> listaMatriculas, boolean ativo) {
		super();
		this.listaMatriculas = listaMatriculas;
		this.ativo = ativo;
	}
	/**
	 * 
	 */
	public Aluno() {
	}
	
}
