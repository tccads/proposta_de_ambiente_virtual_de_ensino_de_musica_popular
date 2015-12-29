package escola.musica.interfaces;

import java.util.List;

/** T = Entidade tratada na implementação;
 *  K = Tipo do id da entidade;
 * 
 */
public interface INavegable {
	
//		/** Salva caso já exista, ou insere a entidade passada por parâmetro.
//		 */
//		void save(T entity);
	
		String save();
	
//		/** Remove a entidade cujo id foi passado por parâmetro.
//		 */
//		boolean remove(K idEntity);
//		/** Retorna a entidade cujo id foi passado por parâmetro.
//		 */
//		T select(K idEntity);
//		/** Traz uma coleção (List<T>) da entidade tratada pela implementação da interface.
//		 */
//		List<T> selectAll();

}
