package escola.musica.modelo;

import java.util.Date;
import java.util.List;

public class Aluno extends Pessoa {
	
	private List<Instrumento> listaInstrumentos;
	private IntervaloTempo horario;
	private Date dataMatricula;
	private Date dataRescisao;
	
	/**
	 * @return the listaInstrumentos
	 */
	public List<Instrumento> getListaInstrumentos() {
		return listaInstrumentos;
	}
	/**
	 * @param listaInstrumentos the listaInstrumentos to set
	 */
	public void setListaInstrumentos(List<Instrumento> listaInstrumentos) {
		this.listaInstrumentos = listaInstrumentos;
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
	 * @param listaInstrumentos
	 * @param horario
	 */
	public Aluno(List<Instrumento> listaInstrumentos, IntervaloTempo horario) {
		super();
		this.listaInstrumentos = listaInstrumentos;
		this.horario = horario;
	}
	/**
	 * 
	 */
	public Aluno() {
		super();
	}
	/**
	 * @return the dataMatricula
	 */
	public Date getDataMatricula() {
		return dataMatricula;
	}
	/**
	 * @param dataMatricula the dataMatricula to set
	 */
	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
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

}
