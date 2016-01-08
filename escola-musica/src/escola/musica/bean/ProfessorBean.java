package escola.musica.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Professor;

@ManagedBean
public class ProfessorBean implements INavegable<Professor>{

	private Professor professor = new Professor();
	
	/**
	 * @return the professor
	 */
	public Professor getProfessor() {
		return professor;
	}

	/**
	 * @param professor the professor to set
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public void save() {
				
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Professor"+ professor.getNome() +"salvo com sucesso!"));
	}

	@Override
	public void edit(Professor professor) {
		// TODO Implementar o edit
	}

	@Override
	public void remove() {
		// TODO Implementar o remove
	}

	@Override
	public void holdInstance(Professor professor) {
		// TODO Implementar o holdInstance
		
	}

}
