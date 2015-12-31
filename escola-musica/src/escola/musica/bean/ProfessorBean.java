package escola.musica.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Professor;

@ManagedBean
public class ProfessorBean implements INavegable<Professor, Long>{

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
	public String save() {
				
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Professor"+ professor.getNome() +"salvo com sucesso!"));
		return "lista_professores";
	}

	@Override
	public String edit(Professor entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String remove(Long idEntity) {
		// TODO Auto-generated method stub
		return null;
	}

}
