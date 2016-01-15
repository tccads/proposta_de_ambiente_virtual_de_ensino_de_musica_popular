/**
 * 
 */
package escola.musica.modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author RSantos34
 *
 */
@Entity
public class Email implements Serializable {
	
	@Id
	@org.hibernate.validator.constraints.Email(message = "Informe um e-mail válido")
	@NotNull
	@NotEmpty(message="Preencha um valor para o email!")
	private String endereco;
	@ManyToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="pessoa_id")
	private Pessoa pessoa;
	
	/**
	 * @param id
	 * @param endereco
	 */
	public Email(String endereco) {
		this.endereco = endereco;
	}
	/**
	 * 
	 */
	public Email() {
		super();
	}
	
	/**
	 * @return the pessoa
	 */
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
