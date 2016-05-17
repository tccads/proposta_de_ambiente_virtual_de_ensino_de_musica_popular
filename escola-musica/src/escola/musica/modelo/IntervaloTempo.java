/**
 * 
 */
package escola.musica.modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author RSantos34
 *
 *Entidade que representa um intervalo de tempo
 *com dia e faixa de horário especificado.
 *
 */
@Entity
public class IntervaloTempo implements Serializable{

	private static final long serialVersionUID = -6511720254931536056L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer intervalo_id;
	@Enumerated
	private DiaSemana dia;
	@Temporal(TemporalType.TIME)
	private Date inicioIntervalo;
	@Temporal(TemporalType.TIME)
	private Date terminioIntervalo;
	@ManyToOne
	@JoinColumn(name="pessoa_id")
	private Professor professor;
	
	/**
	 * @param id
	 * @param dia
	 * @param inicioIntervalo
	 * @param terminioIntervalo
	 */
	public IntervaloTempo(DiaSemana dia, Date inicioIntervalo,
			Date terminioIntervalo) {
		super();
		this.dia = dia;
		this.inicioIntervalo = inicioIntervalo;
		this.terminioIntervalo = terminioIntervalo;
	}
	
	/**
	 * 
	 */
	public IntervaloTempo() {
	}
	
	/**
	 * @return the id
	 */

	public Integer getId() {
		return intervalo_id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.intervalo_id = id;
	}
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
	public Date getInicioIntervalo() {
		return inicioIntervalo;
	}
	/**
	 * @param inicioIntervalo the inicioIntervalo to set
	 */
	public void setInicioIntervalo(Date inicioIntervalo) {
		this.inicioIntervalo = inicioIntervalo;
	}
	
	/**
	 * @return the terminioIntervalo
	 */
	public Date getTerminioIntervalo() {
		return terminioIntervalo;
	}
	/**
	 * @param terminioIntervalo the terminioIntervalo to set
	 */
	public void setTerminioIntervalo(Date terminioIntervalo) {
		this.terminioIntervalo = terminioIntervalo;
	}
	
}
