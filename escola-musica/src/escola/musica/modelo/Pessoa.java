package escola.musica.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4163624590974880134L;
	@Id
 	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pessoa_id;
	@Length(min=11, max=15, message="O campo cpf deve ter 11 caracteres! Com ou sem pontos e traços")
	@NotNull
	private String cpf;
	@NotEmpty(message="O campo nome deve ser informado!")
	@Length(min=2, max=255, message="O campo nome deve ter entre 2 e 100 caracteres!")
	private String nome;
	@NotEmpty(message="O campo nome deve ser informado!")
	@Length(min=2, max=255, message="O campo sobrenome deve ter entre 2 e 255 caracteres!")
	private String sobrenome;
	@OneToMany(mappedBy="pessoa")
	private List<Telefone> telefones;
	@OneToMany(mappedBy="pessoa")
	private List<Email> emails;
	@Embedded
	private Endereco endereco = new Endereco();
	
	/**
	 * @param pessoa_id
	 * @param cpf
	 * @param nome
	 * @param sobrenome
	 * @param telefones
	 * @param emails
	 * @param endereco
	 */
	public Pessoa(String cpf, String nome, String sobrenome,
			List<Telefone> telefones, List<Email> emails, Endereco endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefones = telefones;
		this.emails = emails;
		this.endereco = endereco;
	}
	
	public Pessoa() {
	}
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return pessoa_id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.pessoa_id = id;
	}
	/**
	 * @return the cpf
	 */

	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return the sobrenome
	 */

	public String getSobrenome() {
		return sobrenome;
	}
	/**
	 * @param sobrenome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	/**
	 * @return the telefones
	 */
	public List<Telefone> getTelefones() {
		return telefones;
	}
	/**
	 * @param telefones the telefones to set
	 */
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	/**
	 * @return the emails
	 */
	public List<Email> getEmails() {
		return emails;
	}
	/**
	 * @param emails the emails to set
	 */
	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}
	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
