package escola.musica.modelo;

import java.util.Date;

public class Matricula {
	
	private Integer id;
	private Curso curso;
	private Professor professor;
	private IntervaloTempo horario;
	private Date dataAbertura;
	private Date dataRescisao;
	private boolean ativa;
	
	/**
	 * @param id
	 * @param curso
	 * @param professor
	 * @param horario
	 * @param dataAbertura
	 * @param dataRescisao
	 * @param ativa
	 */
	public Matricula(Integer id, Curso curso, Professor professor,
			IntervaloTempo horario, Date dataAbertura, Date dataRescisao,
			boolean ativa) {
		super();
		this.id = id;
		this.curso = curso;
		this.professor = professor;
		this.horario = horario;
		this.dataAbertura = dataAbertura;
		this.dataRescisao = dataRescisao;
		this.ativa = ativa;
	}
	
	/**
	 * 
	 */
	public Matricula() {
	}
	
}
