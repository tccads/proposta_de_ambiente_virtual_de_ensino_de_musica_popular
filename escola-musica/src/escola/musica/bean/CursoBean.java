/**
 * 
 */
package escola.musica.bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.behavior.FacesBehavior;
import javax.faces.context.FacesContext;
import javax.faces.event.FacesListener;

import org.primefaces.push.annotation.Singleton;

import escola.musica.dao.CursoDao;
import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Curso;
import escola.musica.modelo.TipoCurso;

/**
 * @author RSantos34
 *
 */
@SessionScoped
@ManagedBean
public class CursoBean implements INavegable<Curso>{
		
	private static Curso curso;
	private List<TipoCurso> tipos = Arrays.asList(TipoCurso.values());
	private List<Curso> cursos = new ArrayList<Curso>();

	
	private CursoDao cursoDao = null;
	
	/**
	 * Bean da entidade Curso
	 */
	public CursoBean() {
		
		if(curso == null){
			curso = new Curso();
		}
		
		cursoDao = new CursoDao();
		cursos = cursoDao.selectAll();
	}

	/**
	 * @return the cursos
	 */
	public List<Curso> getCursos() {
		return cursos;
	}

	/**
	 * @param cursos the cursos to set
	 */
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	 * @return the tipos
	 */
	public List<TipoCurso> getTipos() {
		return tipos;
	}

	/**
	 * @param tipos the tipos to set
	 */
	public void setTipos(List<TipoCurso> tipos) {
		this.tipos = tipos;
	}

	@Override
	public String save() {
		
		cursoDao.save(curso);
		
		cursos.add(curso);
		curso = new Curso();
		
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Curso salvo com sucesso!"));
//		try {
//			FacesContext.getCurrentInstance().getExternalContext().dispatch("curso_lista");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		return "curso_lista?faces-redirect=true";
	}

	@Override
	public String edit(Curso curso) {
		this.curso = curso;
		return "curso_formulario?faces-redirect=true";
	}

	@Override
	public String remove() {
		
		System.out.println("\n\rId do curso a ser deletado: "+curso.getId());
		cursoDao.remove(curso.getId());
		
		FacesContext.getCurrentInstance().addMessage("Sucesso!", 
new FacesMessage("Curso "+curso.getId()+" deletado com sucesso!"));
		
		cursos = cursoDao.selectAll();
		return "curso_lista?faces-redirect=true";
	}

	@Override
	public void holdInstance(Curso curso) {
		System.out.println("\n\rEntrou no método hold instance: " + curso.getId());
		this.curso = curso;
	}
	
}
