package escola.musica.dao;

import java.util.List;

public interface IDao<T,K> {
	
	/** Salva caso já exista, ou insere a entidade passada por parâmetro.
	 */
	void save(T entity);
	/** Remove a entidade cujo id foi passado por parâmetro.
	 */
	boolean remove(K idEntity);
	/** Retorna a entidade cujo id foi passado por parâmetro.
	 */
	T select(K idEntity);
	/** Traz uma coleção (List<T>) da entidade tratada pela implementação da interface.
	 */
	List<T> selectAll();
	
}
