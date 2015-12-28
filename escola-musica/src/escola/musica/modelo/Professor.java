package escola.musica.modelo;

import java.util.Calendar;
import java.util.List;

public class Professor extends Pessoa{

	private List<Curso> cursosMinistrados;
	private List<Aluno> alunos;
	private List<Instrumento> instrumentos;
	private List<IntervaloTempo> horariosDisponiveis;
	
	/**
	 * @param cursosMinistrados
	 * @param alunos
	 * @param instrumentos
	 * @param horariosDisponiveis
	 */
	public Professor(List<Curso> cursosMinistrados, List<Aluno> alunos,
			List<Instrumento> instrumentos,
			List<IntervaloTempo> horariosDisponiveis) {
		super();
		this.cursosMinistrados = cursosMinistrados;
		this.alunos = alunos;
		this.instrumentos = instrumentos;
		this.horariosDisponiveis = horariosDisponiveis;
	}
	
	
	/**
	 * 
	 */
	public Professor() {
		super();
	}


	/**
	 * @return the cursosMinistrados
	 */
	public List<Curso> getCursosMinistrados() {
		return cursosMinistrados;
	}
	/**
	 * @param cursosMinistrados the cursosMinistrados to set
	 */
	public void setCursosMinistrados(List<Curso> cursosMinistrados) {
		this.cursosMinistrados = cursosMinistrados;
	}
	/**
	 * @return the alunos
	 */
	public List<Aluno> getAlunos() {
		return alunos;
	}
	/**
	 * @param alunos the alunos to set
	 */
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	/**
	 * @return the instrumentos
	 */
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}
	/**
	 * @param instrumentos the instrumentos to set
	 */
	public void setInstrumentos(List<Instrumento> instrumentos) {
		this.instrumentos = instrumentos;
	}
	/**
	 * @return the horariosDisponiveis
	 */
	public List<IntervaloTempo> getHorariosDisponiveis() {
		return horariosDisponiveis;
	}
	/**
	 * @param horariosDisponiveis the horariosDisponiveis to set
	 */
	public void setHorariosDisponiveis(List<IntervaloTempo> horariosDisponiveis) {
		this.horariosDisponiveis = horariosDisponiveis;
	}
	
}
