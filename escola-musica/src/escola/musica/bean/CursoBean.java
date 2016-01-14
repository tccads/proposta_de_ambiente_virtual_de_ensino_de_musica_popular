/**
 * 
 */
package escola.musica.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import escola.musica.dao.CursoDao;
import escola.musica.dao.GenericDAO;
import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Area;
import escola.musica.modelo.Curso;

/**
 * @author RSantos34
 * 
 */
@ViewScoped
@ManagedBean
public class CursoBean implements INavegable<Curso>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -21180947346757649L;
	private static Curso curso;
	private List<Area> areas;
	private List<Curso> cursos = new ArrayList<Curso>();
	private List<Curso> cursosAccordion = new ArrayList<Curso>();
	private List<String> restricoes = new ArrayList<String>();
	private Curso cursoAlvo;
	private CursoDao cursoDao = null;
	private GenericDAO<Curso, Long> dao = null;
	private List<Curso> cursosFiltrados;

	/**
	 * @return the cursosFiltrados
	 */
	public List<Curso> getCursosFiltrados() {
		return cursosFiltrados;
	}

	/**
	 * @param cursosFiltrados the cursosFiltrados to set
	 */
	public void setCursosFiltrados(List<Curso> cursosFiltrados) {
		this.cursosFiltrados = cursosFiltrados;
	}

	/**
	 * 
	 */
	public CursoBean() {
		iniciarBean();
	}

	public void iniciarBean() {

		cursoDao = new CursoDao();
		dao = new GenericDAO<Curso, Long>(Curso.class);
		cursos = dao.selectAll();

		for (Curso c : cursos) {
			restricoes.add(c.getNome());
		}

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

		dao.save(curso);

		cursos.add(curso);

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Curso "+ curso.getCurso_id() +" salvo com sucesso!"));
		curso = null;
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
		dao.remove(cursoAlvo);

		FacesContext.getCurrentInstance().addMessage(
				"Sucesso!",
				new FacesMessage("Curso " + cursoAlvo.getCurso_id()
						+ " deletado com sucesso!"));

		cursos = dao.selectAll();
		cursosFiltrados = null;
		//return "curso_lista?faces-redirect=true";
	}

	@Override
	public void holdInstance(Curso curso) {
		System.out.println("Entrou no holdInstance, segura o curso: " + curso.getCurso_id());
		this.cursoAlvo = curso;
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
