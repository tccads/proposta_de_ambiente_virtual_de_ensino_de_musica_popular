package escola.musica.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Matricula implements Serializable {
	
	private static final long serialVersionUID = 1388203587099607201L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer curso_id;
	@OneToOne
	@JoinColumn(name="curso_id")
	private Curso curso;
	@OneToOne
	@JoinColumn(name="professor_id")
	private Professor professor;
	@ManyToOne
	@JoinColumn(name="aluno_id")
	private Aluno aluno;
	@OneToOne
	@JoinColumn(name="intervalo_id")
	private IntervaloTempo horario;
	@Temporal(TemporalType.DATE)
	@Column(name="data_nascimento")
	private Date dataAbertura;
	@Temporal(TemporalType.DATE)
	@Column(name="data_rescisao")
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
		this.curso_id = id;
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

	/**
	 * @return the id
	 */
	public Integer getId() {
		return curso_id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.curso_id = id;
	}

	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	 * @return the professor
	 */
	public Professor getProfessor() {
		return professor;
	}

	/**
	 * @param professor the professor to set
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	/**
	 * @return the horario
	 */
	public IntervaloTempo getHorario() {
		return horario;
	}

	/**
	 * @param horario the horario to set
	 */
	public void setHorario(IntervaloTempo horario) {
		this.horario = horario;
	}

	/**
	 * @return the dataAbertura
	 */
	public Date getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * @param dataAbertura the dataAbertura to set
	 */
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	/**
	 * @return the dataRescisao
	 */
	public Date getDataRescisao() {
		return dataRescisao;
	}

	/**
	 * @param dataRescisao the dataRescisao to set
	 */
	public void setDataRescisao(Date dataRescisao) {
		this.dataRescisao = dataRescisao;
	}

	/**
	 * @return the ativa
	 */
	public boolean isAtiva() {
		return ativa;
	}

	/**
	 * @param ativa the ativa to set
	 */
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	/**
	 * @return the aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * @param aluno the aluno to set
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
}
