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
import javax.faces.component.behavior.FacesBehavior;
import javax.faces.context.FacesContext;
import javax.faces.event.FacesListener;

import escola.musica.modelo.Curso;
import escola.musica.modelo.TipoCurso;

/**
 * @author RSantos34
 *
 */
@ManagedBean
public class CursoBean implements ICrud<Curso, Long>{
		
	private Curso curso = new Curso();
	private List<TipoCurso> tipos = Arrays.asList(TipoCurso.values());
	private List<Curso> cursos = new ArrayList<Curso>();
	
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

	@Deprecated
	@Override
	public void save(Curso curso) {
		cursos.add(curso);
		curso = new Curso();
		
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Curso salvo com sucesso!"));
		try {
			FacesContext.getCurrentInstance().getExternalContext().dispatch("curso_lista");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void save() {
		cursos.add(curso);
		curso = new Curso();
		
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Curso salvo com sucesso!"));
		try {
			FacesContext.getCurrentInstance().getExternalContext().dispatch("curso_lista");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@Override
	public boolean remove(Long idCurso) {
		FacesContext.getCurrentInstance().addMessage(null, 
		new FacesMessage("Curso "+ idCurso +"removido com sucesso!"));
		return false;
	}

	@Override
	public Curso select(Long idCurso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
