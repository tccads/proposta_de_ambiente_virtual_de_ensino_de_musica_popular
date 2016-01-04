package escola.musica.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Aluno;
import escola.musica.modelo.Curso;

@ManagedBean
public class AlunoBean implements INavegable<Aluno>{
	
	private Aluno aluno = new Aluno();

	@Override
	public String edit(Aluno aluno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void holdInstance(Aluno aluno) {
		// TODO Auto-generated method stub
		
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
