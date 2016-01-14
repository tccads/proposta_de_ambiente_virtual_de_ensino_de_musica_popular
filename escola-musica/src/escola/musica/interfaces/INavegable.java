package escola.musica.interfaces;

/** T = Entidade tratada na implementa��o;
 *  K = Tipo do id da entidade;
 * 
 */
public interface INavegable<T> {
	
		void iniciarBean();
	
		void voltar();
		
		void novaEntity();
		
		/** M�todo chamado na edição das entidades, retorna uma String com o nome da nova página.
		 */
		void edit(T entity);
	
		/**Método chamado em caso de persistência de entidades, ou alteração, retorna uma String como o nome da nova página.
		 */
		void save();
	
		/** Remove a entidade cujo id foi passado por parâmetro.
		 */
		void remove();
		
//		/** Retorna a entidade cujo id foi passado por parâmetro.
//		 */
//		T select(K idEntity);
//		/** Traz uma coleção (List<T>) da entidade tratada pela implementação da interface.
//		 */
//		List<T> selectAll();
		
		/**Método que segura a inst�ncia de um objeto passado por parâmetro;
		 */
		void holdInstance(T entity);

}
