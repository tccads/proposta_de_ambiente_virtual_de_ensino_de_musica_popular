package escola.musica.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Aluno;
import escola.musica.modelo.Curso;

@ManagedBean
public class AlunoBean implements INavegable<Curso, Long>{
	
	private Aluno aluno = new Aluno();

	/**
	 * @return the aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * @param aluno the aluno to set
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public String save() {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(aluno.getNome() +"removido com sucesso!"));
		return "aluno_lista";
	}

	@Override
	public String edit(Curso curso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String remove(Long idEntity) {
		// TODO Auto-generated method stub
		return null;
	}
		
//	@Override
//	public void save(Aluno aluno) {
//		FacesContext.getCurrentInstance().addMessage(null, 
//				new FacesMessage(aluno.getNome() +"removido com sucesso!"));
//	}
//
//	@Override
//	public boolean remove(Long idAluno) {
//		FacesContext.getCurrentInstance().addMessage(null, 
//				new FacesMessage("Aluno"+ idAluno +"removido com sucesso!"));
//		return false;
//	}
//
//	@Override
//	public Aluno select(Long idAluno) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Aluno> selectAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
