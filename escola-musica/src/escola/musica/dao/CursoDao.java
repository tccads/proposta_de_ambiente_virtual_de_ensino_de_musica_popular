package escola.musica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import escola.musica.modelo.Curso;

public class CursoDao implements IDao<Curso, Long>{

	EntityManager entityManager = null;
	
	public CursoDao() {
		this.entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void save(Curso entity) {
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public boolean remove(Long idEntity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Curso select(Long idEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> selectAll() {
		Query query = entityManager.createQuery("from Curso");
		return query.getResultList();
	}

	
	
}
