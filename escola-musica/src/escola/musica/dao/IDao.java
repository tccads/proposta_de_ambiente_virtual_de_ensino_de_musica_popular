package escola.musica.dao;

import java.util.List;

public interface IDao<T,K> {
	
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
