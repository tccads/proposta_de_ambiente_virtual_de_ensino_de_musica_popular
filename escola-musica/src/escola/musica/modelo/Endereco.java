package escola.musica.modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author RSantos34
 *
 */
@Embeddable
public class Endereco implements Serializable {
	
		private static final long serialVersionUID = -6712232556815451427L;
		@Column(name="endereco_logradouro")
		private String logradouro;
		@Column(name="endereco_numero")
		private int numero;
		@Column(name="endereco_cep")
		private String cep;
		@ManyToOne(cascade=CascadeType.DETACH)
		@JoinColumn(name="cidade_id")
		private Cidade cidade = new Cidade();
		
		/**
		 * @return the logradouro
		 */
		public String getLogradouro() {
			return logradouro;
		}
		/**
		 * @param logradouro the logradouro to set
		 */
		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}
		/**
		 * @return the numero
		 */
		public int getNumero() {
			return numero;
		}
		/**
		 * @param numero the numero to set
		 */
		public void setNumero(int numero) {
			this.numero = numero;
		}
		/**
		 * @return the cep
		 */
		public String getCep() {
			return cep;
		}
		/**
		 * @param cep the cep to set
		 */
		public void setCep(String cep) {
			this.cep = cep;
		}
		
		/**
		 * @return the cidade
		 */
		public Cidade getCidade() {
			return cidade;
		}
		/**
		 * @param cidade the cidade to set
		 */
		public void setCidade(Cidade cidade) {
			this.cidade = cidade;
		}
		public Endereco(String logradouro, int numero, String cep,
				Cidade cidade) {
			super();
			this.logradouro = logradouro;
			this.numero = numero;
			this.cep = cep;
			this.cidade = cidade;
		}
		
		public Endereco() {
		}
	
}
