package escola.musica.modelo;

/**
 * @author RSantos34
 *
 */
public class Endereco {
	
		private String logradouro;
		private int numero;
		private String cep;
		private String cidade;
		private String uf;
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
		public String getCidade() {
			return cidade;
		}
		/**
		 * @param cidade the cidade to set
		 */
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		/**
		 * @return the uf
		 */
		public String getUf() {
			return uf;
		}
		/**
		 * @param uf the uf to set
		 */
		public void setUf(String uf) {
			this.uf = uf;
		}
		
		public Endereco(String logradouro, int numero, String cep,
				String cidade, String uf) {
			super();
			this.logradouro = logradouro;
			this.numero = numero;
			this.cep = cep;
			this.cidade = cidade;
			this.uf = uf;
		}
		
		public Endereco() {
		}
	
}
