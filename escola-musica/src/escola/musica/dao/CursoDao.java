package escola.musica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.TransactionException;

import escola.musica.modelo.Curso;

public class CursoDao implements IDao<Curso, Long> {

	EntityManager entityManager = null;

	public CursoDao() {
		this.entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void save(Curso curso) {
		entityManager.getTransaction().begin();

		if (curso.getId() != null) {
			entityManager.merge(curso);
		} else {
			entityManager.persist(curso);
		}

		entityManager.getTransaction().commit();
	}

	@Override
	public boolean remove(Long idCurso) {

		Curso cursoRemovido = select(idCurso);
		EntityTransaction transac = null;
		boolean result = false;

		try {
			transac = entityManager.getTransaction();
			if (transac != null && !transac.isActive()) {
				transac.begin();
				//cursoRemovido = entityManager.merge(cursoRemovido);
				System.out.println("\n\rOBJETO ALVO: " + cursoRemovido.getId());
								
				entityManager.remove(cursoRemovido);
				transac.commit();
				result = true;
				System.out.println("\n\rOBJETO DELETADO: " + cursoRemovido.getId());
			}
		} catch (TransactionException e) {
			if (transac != null && transac.isActive()) {
				System.out.print("A transação"+ transac.toString() +"está aberta!");
				transac.rollback();
			}
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public Curso select(Long idCurso) {
		Query query = entityManager.createQuery("from Curso c where c.id="
				+ idCurso);
		return (Curso) query.getSingleResult();
	}

	@Override
	public List<Curso> selectAll() {
		Query query = entityManager.createQuery("from Curso");
		return query.getResultList();
	}

}
