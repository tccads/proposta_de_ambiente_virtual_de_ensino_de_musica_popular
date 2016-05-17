package escola.musica.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import escola.musica.dao.GenericDAO;
import escola.musica.interfaces.INavegable;

public abstract class GenericBean<T, K> implements INavegable<T>, Serializable {

	private static final long serialVersionUID = 5049046873729999542L;
	private T entity;
	private List<T> entities = null;
	private GenericDAO<T, K> dao = null;
	private T entityAlvo = null;
	private List<T> entitiesFiltradas;
	
	@Override
	public void voltar() {
		this.entity = null;
	}

	@Override
	public void edit(T entity) {
		this.entity = entity;
	}

	@Override
	public void save() {
		dao.save(entity);
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(entity.getClass().getSimpleName() + " salvo com sucesso!"));
		entities = dao.selectAll();
		entity = null;
	}

	@Override
	public void remove() {

		dao.remove(entityAlvo);

		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(entityAlvo.getClass().getSimpleName() + " removido com sucesso!"));
		entities = dao.selectAll();
		entitiesFiltradas = null;
	}

	@Override
	public void holdInstance(T entity) {
		this.entityAlvo = entity;
	}
	
	/**
	 * @return the entitiesFiltradas
	 */
	public List<T> getEntitiesFiltradas() {
		return entitiesFiltradas;
	}

	/**
	 * @param entitiesFiltradas the entitiesFiltradas to set
	 */
	public void setEntitiesFiltradas(List<T> entitiesFiltradas) {
		this.entitiesFiltradas = entitiesFiltradas;
	}

	/**
	 * @return the dao
	 */
	public GenericDAO<T, K> getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(GenericDAO<T, K> dao) {
		this.dao = dao;
	}

	/**
	 * @return the entity
	 */
	public T getEntity() {
		return entity;
	}

	/**
	 * @param entity the entity to set
	 */
	public void setEntity(T entity) {
		this.entity = entity;
	}

	/**
	 * @return the entities
	 */
	public List<T> getEntities() {
		return entities;
	}

	/**
	 * @param entities the entities to set
	 */
	public void setEntities(List<T> entities) {
		this.entities = entities;
	}

	/**
	 * @return the entityAlvo
	 */
	public T getEntityAlvo() {
		return entityAlvo;
	}

	/**
	 * @param entityAlvo the entityAlvo to set
	 */
	public void setEntityAlvo(T entityAlvo) {
		this.entityAlvo = entityAlvo;
	}
	
}
