package escola.musica.interfaces;

import java.util.List;

/** T = Entidade tratada na implementa��o;
 *  K = Tipo do id da entidade;
 * 
 */
public interface INavegable<T> {
	
		/** M�todo chamado na edi��o das entidades, retorna uma String com o nome da nova p�gina.
		 */
		void edit(T entity);
	
		/**M�todo chamado em caso de persist�ncia de entidades, ou altera��o, retorna uma String como o nome da nova p�gina.
		 */
		void save();
	
		/** Remove a entidade cujo id foi passado por par�metro.
		 */
		void remove();
		
//		/** Retorna a entidade cujo id foi passado por par�metro.
//		 */
//		T select(K idEntity);
//		/** Traz uma cole��o (List<T>) da entidade tratada pela implementa��o da interface.
//		 */
//		List<T> selectAll();
		
		/**M�todo que segura a inst�ncia de um objeto passado por par�metro;
		 */
		void holdInstance(T entity);

}
