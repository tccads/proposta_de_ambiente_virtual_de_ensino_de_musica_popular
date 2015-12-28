package escola.musica.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import escola.musica.modelo.Professor;

@ManagedBean
public class ProfessorBean implements ICrud<Professor,String>{

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
	public void save(Professor professor) {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Professor"+ professor.getNome() +"salvo com sucesso!"));
	}

	@Override
	public boolean remove(String idProfessor) {	
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Professor com id: "+ idProfessor +"removido com sucesso!"));
		return false;
	}

	@Override
	public Professor select(String idProfessor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Professor> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}



}
