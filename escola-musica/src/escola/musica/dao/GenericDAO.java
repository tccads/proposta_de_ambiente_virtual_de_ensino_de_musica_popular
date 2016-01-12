package escola.musica.dao;
import java.util.List;

import javax.persistence.EntityManager;

/**
 *T simboliza a entidade a ser persistida. 
 *K simboliza o tipo do id da entidade persistida.
 */
public class GenericDAO<T, TipoId> {

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
	
	public void excluir(T entity){
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.remove(entityManager.merge(entity));
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
	
	}
	
	public List<T> listarTodos(){
		
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
	public T obterPorId(TipoId id, String nomeId){
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		T entity = entityManager.createQuery("from " + classe.getName() + " where "+ nomeId +" = :cod", classe)
				.setParameter("cod", id).getSingleResult();
		
		entityManager.close();
		
		return entity;
	}
	
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