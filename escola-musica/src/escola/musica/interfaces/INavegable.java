package escola.musica.interfaces;

import java.util.List;

/** T = Entidade tratada na implementação;
 *  K = Tipo do id da entidade;
 * 
 */
public interface INavegable<T> {
	
		/** Método chamado na edição das entidades, retorna uma String com o nome da nova página.
		 */
		String edit(T entity);
	
		/**Método chamado em caso de persistência de entidades, ou alteração, retorna uma String como o nome da nova página.
		 */
		String save();
	
		/** Remove a entidade cujo id foi passado por parâmetro.
		 */
		String remove();
		
//		/** Retorna a entidade cujo id foi passado por parâmetro.
//		 */
//		T select(K idEntity);
//		/** Traz uma coleção (List<T>) da entidade tratada pela implementação da interface.
//		 */
//		List<T> selectAll();
		
		/**Método que segura a instância de um objeto passado por parâmetro;
		 */
		void holdInstance(T entity);

}
