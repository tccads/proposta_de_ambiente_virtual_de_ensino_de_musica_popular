/**
 * 
 */
package escola.musica.bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.behavior.FacesBehavior;
import javax.faces.context.FacesContext;
import javax.faces.event.FacesListener;

import org.primefaces.push.annotation.Singleton;

import escola.musica.dao.CursoDao;
import escola.musica.dao.GenericDAO;
import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Curso;
import escola.musica.modelo.Area;

/**
 * @author RSantos34
 * 
 */
@SessionScoped
@ManagedBean
public class CursoBean implements INavegable<Curso> {

	private static Curso curso;
	private List<Area> areas;
	private List<Curso> cursos = new ArrayList<Curso>();
	private List<Curso> cursosAccordion = new ArrayList<Curso>();
	private List<String> restricoes = new ArrayList<String>();
	private Curso cursoAlvo;
	private CursoDao cursoDao = null;
	// private GenericDAO<Curso, Long> dao = null;

	/**
	 * 
	 */
	public CursoBean() {
		iniciarBean();
	}

	public void iniciarBean() {
//		if (curso == null) {
//			curso = new Curso();
//		}

		cursoDao = new CursoDao();
		cursos = cursoDao.selectAll();

		for (Curso c : cursos) {
			restricoes.add(c.getNome());
		}

		// dao = new GenericDAO<Curso, Long>();

		cursosAccordion = cursoDao.selectAllAccordion(restricoes);
		areas = Arrays.asList(Area.values());
	}
	
	/**
	 * @return the cursoAlvo
	 */
	public Curso getCursoAlvo() {
		return cursoAlvo;
	}

	/**
	 * @param cursoAlvo the cursoAlvo to set
	 */
	public void setCursoAlvo(Curso cursoAlvo) {
		this.cursoAlvo = cursoAlvo;
	}

	public void novoCurso(){
		curso = new Curso();
	}
	
	/**
	 * @return the cursos
	 */
	public List<Curso> getCursos() {
		return cursos;
	}

	/**
	 * @param cursos
	 *            the cursos to set
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
	 * @param curso
	 *            the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	 * @return the areas
	 */
	public List<Area> getAreas() {
		return areas;
	}

	/**
	 * @param areas
	 *            the areas to set
	 */
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	@Override
	public void save() {

		cursoDao.save(curso);

		cursos.add(curso);
		curso = null;

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Curso salvo com sucesso!"));
		// try {
		// FacesContext.getCurrentInstance().getExternalContext().dispatch("curso_lista");
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		//return "curso_lista?faces-redirect=true";
	}

	@Override
	public void edit(Curso curso) {
		this.curso = curso;
		//return "curso_formulario?faces-redirect=true";
	}

	@Override
	public void remove() {

		System.out.println("\n\rId do curso a ser deletado: " + cursoAlvo.getCurso_id());
		cursoDao.remove(cursoAlvo.getCurso_id());

		FacesContext.getCurrentInstance().addMessage(
				"Sucesso!",
				new FacesMessage("Curso " + cursoAlvo.getCurso_id()
						+ " deletado com sucesso!"));

		cursos = cursoDao.selectAll();
		//return "curso_lista?faces-redirect=true";
	}

	@Override
	public void holdInstance(Curso curso) {
		System.out.println("\n\rEntrou no método hold instance: "
				+ curso.getCurso_id());
		this.cursoAlvo = curso;
	}

	public Date getDataAtual() {
		return new Date();
	}

	/**
	 * @return the cursosAccordion
	 */
	public List<Curso> getCursosAccordion() {
		return cursosAccordion;
	}

	/**
	 * @param cursosAccordion
	 *            the cursosAccordion to set
	 */
	public void setCursosAccordion(List<Curso> cursosAccordion) {
		this.cursosAccordion = cursosAccordion;
	}
	
	public void voltar(){
		curso = null;
	}

}
