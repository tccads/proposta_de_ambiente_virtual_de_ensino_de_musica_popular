/**
 * 
 */
package escola.musica.modelo;

import java.util.Calendar;

/**
 * @author RSantos34
 *
 */
public class IntervaloTempo {

	private DiaSemana dia;
	private Calendar inicioIntervalo;
	private Calendar terminioIntervalo;
	/**
	 * @return the dia
	 */
	public DiaSemana getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(DiaSemana dia) {
		this.dia = dia;
	}
	/**
	 * @return the inicioIntervalo
	 */
	public Calendar getInicioIntervalo() {
		return inicioIntervalo;
	}
	/**
	 * @param inicioIntervalo the inicioIntervalo to set
	 */
	public void setInicioIntervalo(Calendar inicioIntervalo) {
		this.inicioIntervalo = inicioIntervalo;
	}
	/**
	 * @return the terminioIntervalo
	 */
	public Calendar getTerminioIntervalo() {
		return terminioIntervalo;
	}
	/**
	 * @param terminioIntervalo the terminioIntervalo to set
	 */
	public void setTerminioIntervalo(Calendar terminioIntervalo) {
		this.terminioIntervalo = terminioIntervalo;
	}
	
	public IntervaloTempo(DiaSemana dia, Calendar inicioIntervalo,
			Calendar terminioIntervalo) {
		super();
		this.dia = dia;
		this.inicioIntervalo = inicioIntervalo;
		this.terminioIntervalo = terminioIntervalo;
	}
	
	/**
	 * 
	 */
	public IntervaloTempo() {
		super();
	}
	
}
