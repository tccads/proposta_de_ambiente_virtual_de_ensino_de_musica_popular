package escola.musica.bean;

import java.util.List;

/** T = Entidade tratada na implementa��o;
 *  K = Tipo do id da entidade;
 * 
 */
public interface ICrud<T, K> {
	
		/** Salva caso j� exista, ou insere a entidade passada por par�metro.
		 */
		void save(T entity);
		/** Remove a entidade cujo id foi passado por par�metro.
		 */
		boolean remove(K idEntity);
		/** Retorna a entidade cujo id foi passado por par�metro.
		 */
		T select(K idEntity);
		/** Traz uma cole��o (List<T>) da entidade tratada pela implementa��o da interface.
		 */
		List<T> selectAll();

}
