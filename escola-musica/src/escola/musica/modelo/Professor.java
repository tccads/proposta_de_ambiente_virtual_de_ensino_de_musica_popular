package escola.musica.modelo;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="pessoa_id")
public class Professor extends Pessoa{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4408518922598030401L;
	@OneToMany(mappedBy="professor")
	private List<Curso> cursosMinistrados;
	@OneToMany(mappedBy="professor")
	private List<Instrumento> instrumentos;
	@OneToMany(mappedBy="professor")
	private List<IntervaloTempo> horariosDisponiveis;
	private boolean ativo;
	
	/**
	 * @param pessoa_id
	 * @param cpf
	 * @param nome
	 * @param sobrenome
	 * @param telefones
	 * @param emails
	 * @param endereco
	 * @param cursosMinistrados
	 * @param instrumentos
	 * @param horariosDisponiveis
	 * @param ativo
	 */
	public Professor(String cpf, String nome,
			String sobrenome, List<Telefone> telefones, List<Email> emails,
			Endereco endereco, List<Curso> cursosMinistrados,
			List<Instrumento> instrumentos,
			List<IntervaloTempo> horariosDisponiveis, boolean ativo) {
		super(cpf, nome, sobrenome, telefones, emails, endereco);
		this.cursosMinistrados = cursosMinistrados;
		this.instrumentos = instrumentos;
		this.horariosDisponiveis = horariosDisponiveis;
		this.ativo = ativo;
	}

	/**
	 * 
	 */
	public Professor() {
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

	/**
	 * @return the ativo
	 */
	public boolean isAtivo() {
		return ativo;
	}

	/**
	 * @param ativo the ativo to set
	 */
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
