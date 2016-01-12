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

		if (curso.getCurso_id() != null) {
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
				// cursoRemovido = entityManager.merge(cursoRemovido);
				System.out.println("\n\rOBJETO ALVO: "
						+ cursoRemovido.getCurso_id());

				entityManager.remove(cursoRemovido);
				transac.commit();
				result = true;
				System.out.println("\n\rOBJETO DELETADO: "
						+ cursoRemovido.getCurso_id());
			}
		} catch (TransactionException e) {
			if (transac != null && transac.isActive()) {
				System.out.print("A transa��o" + transac.toString()
						+ "est� aberta!");
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

	public List<Curso> selectAllAccordion(List<String> filtros) {

		if (filtros.isEmpty()) {
			return selectAll();
		} else {

			StringBuilder restricoes = new StringBuilder("from Curso where nome in (");
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

			restricoes.append(") order by nome");

			System.out.print("\n\r Restrições do método selectAccordion: "
					+ restricoes);
			Query query = entityManager.createQuery(restricoes.toString());
			// Query query =
			// entityManager.createQuery("from Curso where nome in ('Violino','Viola','Bateria','Clarinete','Flauta','Guitarra','Violão,','Oboé') order by nome");
			return query.getResultList();
		}
	}

}
