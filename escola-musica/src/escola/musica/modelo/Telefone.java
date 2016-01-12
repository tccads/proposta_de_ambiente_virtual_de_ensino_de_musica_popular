/**
 * 
 */
package escola.musica.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author RSantos34
 *
 */
@Entity
public class Telefone {

		@Id
		private String numero;
		@ManyToOne
		@JoinColumn(name="pessoa_id")
		private Pessoa pessoa;
		
		/**
		 * @param numero
		 */
		public Telefone(String numero) {
			super();
			this.numero = numero;
		}

		/**
		 * 
		 */
		public Telefone() {
			super();
		}

		/**
		 * @return the numero
		 */
		public String getNumero() {
			return numero;
		}

		/**
		 * @param numero the numero to set
		 */
		public void setNumero(String numero) {
			this.numero = numero;
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
		
}
