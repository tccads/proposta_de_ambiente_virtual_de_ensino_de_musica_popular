package escola.musica.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import escola.musica.dao.GenericDAO;
import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Professor;
import escola.musica.utils.PopulaProfessor;

@ManagedBean
@ViewScoped
public class ProfessorBean extends GenericBean<Professor, Integer> implements Serializable{
	
	private static final long serialVersionUID = -4932944048957033091L;
	
	@Override
	public void iniciarBean() {
		super.setDao(new GenericDAO<Professor, Integer>(Professor.class));
		super.setEntities(super.getDao().selectAll());
		if(super.getEntities().isEmpty()){
			PopulaProfessor.main(null);
		}
	};
	
	public ProfessorBean(){
		iniciarBean();
	}
	
	@Override
	public void novaEntity() {
		super.setEntity(new Professor());
	}

}
