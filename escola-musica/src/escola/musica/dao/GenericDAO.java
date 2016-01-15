package escola.musica.dao;
import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *T simboliza a entidade a ser persistida. 
 *K simboliza o tipo do id da entidade persistida.
 */
public class GenericDAO<T, TipoId>  implements Serializable{

	private static final long serialVersionUID = -6886514734941582883L;
	private final Class<T> classe;
	
	public GenericDAO(Class<T> classe){
		this.classe = classe;
	}
	
	public void save(T entity){
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.merge(entity);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
	}
	
	public void remove(T entity){
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.remove(entityManager.merge(entity));
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
	
	}
	
	public List<T> selectAll(){
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		List<T> resultados = entityManager.createQuery(
				"select c from " + classe.getName() + " c", classe).getResultList();
		
		entityManager.close();
		
		return resultados;
		
	}
	
	/**
	 * Tem que ser testado
	 * Método que traz um objeto único de acordo com a sua identificação,
	 * seja qual for a coluna sendo o Id, de acordo com o tipo e o idenfificador em si
	 * passado por parâmetro.
	 * 
	 */
	public T select(TipoId id, String nomeId){
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		T entity = entityManager.createQuery("from " + classe.getName() + " where "+ nomeId +" = :cod", classe)
				.setParameter("cod", id).getSingleResult();
		
		entityManager.close();
		
		return entity;
	}

	/**@TODO: Testar o método selectByFilter()
	 * Método que recebe uma lista de filtros, e nome do filtro onde a restrição deve ser aplicada.
	 */
	public List<T> selectByFilter(List<String> filtros, String nomeRestricao){
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		if (filtros.isEmpty()) {
			return selectAll();
		} else {

			StringBuilder restricoes = new StringBuilder(" from " + classe.getName() + " where "+ nomeRestricao +" in (");
			int counter = filtros.size();

			System.out.print("\n\rFiltros: " + filtros);

			for (int i = 0; i < filtros.size(); i++) {
				counter--;
				System.out.print("\n\rContador: " + counter);

				restricoes.append("'" + filtros.get(i) + "'");

				if (counter > 0) {
					restricoes.append(",");
				}
			}

			restricoes.append(") order by "+ nomeRestricao);

			System.out.print("\n\r## Restrições do método selectByFilter: "
					+ restricoes);
			Query query = entityManager.createQuery(restricoes.toString());
			// Query query =
			// entityManager.createQuery("from Curso where nome in ('Violino','Viola','Bateria','Clarinete','Flauta','Guitarra','Violão,','Oboé') order by nome");
			return query.getResultList();
		}
		
	}
	
//  @Deprecated	
//	public T obterPorId(Integer id){
//		EntityManager em = JPAUtil.getEntityManager();
//		
//		T t = em.createQuery("from " + classe.getName() + " where id = :cod", classe)
//				.setParameter("cod", id).getSingleResult();
//		
//		em.close();
//		
//		return t;
//	}
	
}