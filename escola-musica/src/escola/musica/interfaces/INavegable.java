package escola.musica.interfaces;

import java.util.List;

/** T = Entidade tratada na implementa��o;
 *  K = Tipo do id da entidade;
 * 
 */
public interface INavegable<T, K> {
	
		/** M�todo chamado na edi��o das entidades, retorna uma String com o nome da nova p�gina.
		 */
		String edit(T entity);
	
		/**M�todo chamado em caso de persist�ncia de entidades, ou altera��o, retorna uma String como o nome da nova p�gina.
		 */
		String save();
	
		/** Remove a entidade cujo id foi passado por par�metro.
		 */
		String remove(K idEntity);
		
//		/** Retorna a entidade cujo id foi passado por par�metro.
//		 */
//		T select(K idEntity);
//		/** Traz uma cole��o (List<T>) da entidade tratada pela implementa��o da interface.
//		 */
//		List<T> selectAll();

}
