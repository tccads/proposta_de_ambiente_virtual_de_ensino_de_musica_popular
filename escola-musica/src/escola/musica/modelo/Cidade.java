package escola.musica.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Cidade implements Serializable{
	
	private static final long serialVersionUID = -4159969087748917939L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cidade_id;
	@NotNull(message="Preencha o nome da cidade.")
	private String nome;
	@Enumerated(EnumType.STRING)
	private Uf uf;
	
	/**
	 * 
	 */
	public Cidade() {
	}
	
	/**
	 * @param nome
	 * @param uf
	 */
	public Cidade(String nome, Uf uf) {
		super();
		this.nome = nome;
		this.uf = uf;
	}
	
	/**
	 * @return the cidade_id
	 */
	public Integer getCidade_id() {
		return cidade_id;
	}
	/**
	 * @param cidade_id the cidade_id to set
	 */
	public void setCidade_id(Integer cidade_id) {
		this.cidade_id = cidade_id;
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
	 * @return the uf
	 */
	public Uf getUf() {
		return uf;
	}
	/**
	 * @param uf the uf to set
	 */
	public void setUf(Uf uf) {
		this.uf = uf;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
//		return "Cidade [cidade_id=" + cidade_id + ", nome=" + nome + ", uf="
//				+ uf + "]";
		return nome;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cidade_id == null) ? 0 : cidade_id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (cidade_id == null) {
			if (other.cidade_id != null)
				return false;
		} else if (!cidade_id.equals(other.cidade_id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (uf != other.uf)
			return false;
		return true;
	}

}
