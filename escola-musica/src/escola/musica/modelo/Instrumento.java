/**
 * 
 */
package escola.musica.modelo;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * @author RSantos34
 *
 */
@Entity
public class Instrumento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Enumerated
	private Area area;
	@NotNull
	private String nomeInstrumento;
	@ManyToOne
	@JoinColumn(name="pessoa_id")
	private Professor professor;
	
	/**
	 * @return the area
	 */
	public Area getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(Area area) {
		this.area = area;
	}

	/**
	 * @return the nomeInstrumento
	 */
	public String getNomeInstrumento() {
		return nomeInstrumento;
	}

	/**
	 * @param nomeInstrumento the nomeInstrumento to set
	 */
	public void setNomeInstrumento(String nomeInstrumento) {
		this.nomeInstrumento = nomeInstrumento;
	}

	public Instrumento(String nomeInstrumento) {
		super();
		this.nomeInstrumento = nomeInstrumento;
	}

	public Instrumento() {
	}
	
}
