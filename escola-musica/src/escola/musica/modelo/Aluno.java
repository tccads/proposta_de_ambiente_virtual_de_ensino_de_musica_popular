package escola.musica.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="pessoa_id")
public class Aluno extends Pessoa {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2874192966365653682L;
	@OneToMany(mappedBy="aluno")
	private List<Matricula> listaMatriculas;
	private boolean ativo;
	
	/**
	 * @param pessoa_id
	 * @param cpf
	 * @param nome
	 * @param sobrenome
	 * @param telefones
	 * @param emails
	 * @param endereco
	 * @param listaMatriculas
	 * @param ativo
	 */
	public Aluno(Integer pessoa_id, String cpf, String nome, String sobrenome,
			List<Telefone> telefones, List<Email> emails, Endereco endereco,
			List<Matricula> listaMatriculas, boolean ativo) {
		super(pessoa_id, cpf, nome, sobrenome, telefones, emails, endereco);
		this.listaMatriculas = listaMatriculas;
		this.ativo = ativo;
	}
	
	public Aluno(){
	}

	/**
	 * @return the listaMatriculas
	 */

	public List<Matricula> getListaMatriculas() {
		return listaMatriculas;
	}
	
	/**
	 * @param listaMatriculas the listaMatriculas to set
	 */
	public void setListaMatriculas(List<Matricula> listaMatriculas) {
		this.listaMatriculas = listaMatriculas;
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
