package escola.musica.modelo;

import java.util.List;

public abstract class Pessoa {
	
	private String cpf;
	private String nome;
	private String sobrenome;
	private List<Telefone> telefones;
	private List<Email> emails;
	private Endereco endereco;
	
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
