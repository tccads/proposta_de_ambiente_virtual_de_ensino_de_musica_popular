package escola.musica.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import escola.musica.dao.GenericDAO;
import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Aluno;
import escola.musica.modelo.Cidade;
import escola.musica.modelo.Curso;
import escola.musica.modelo.Uf;
import escola.musica.utils.PopulaAluno;

@ManagedBean
@ViewScoped
public class AlunoBean implements INavegable<Aluno>, Serializable {

	private static final long serialVersionUID = -8651322028367045648L;
	private Aluno aluno;
	private List<Aluno> alunos = null;
	private GenericDAO<Aluno, Integer> dao = null;
	private Aluno alunoAlvo = null;
	private List<Aluno> alunosFiltrados;
	private List<Uf> estados;
	private List<Cidade> cidadesDoEstado;
	private List<String> filtros;
	
	/**
	 * 
	 */
	public AlunoBean() {
		iniciarBean();
	}

	@Override
	public void iniciarBean() {
		dao = new GenericDAO<Aluno, Integer>(Aluno.class);
		alunos = dao.selectAll();
		
		if(alunos.isEmpty()){
			PopulaAluno.main(null);
		}
		
		estados = Arrays.asList(Uf.values());
	}
	
	/**
	 * @return the estados
	 */
	public List<Uf> getEstados() {
		return estados;
	}

	/**
	 * @param estados the estados to set
	 */
	public void setEstados(List<Uf> estados) {
		this.estados = estados;
	}

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

	/**
	 * @return the alunos
	 */
	public List<Aluno> getAlunos() {
		return alunos;
	}

	/**
	 * @param alunos the alunos to set
	 */
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public void novoAluno() {
		aluno = new Aluno();
	}
	
	@Override
	public void edit(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public void save() {
		dao.save(aluno);
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Aluno: "+ aluno.getNome()+", "
						+ "CPF: "+ aluno.getCpf() +" salvo com sucesso!"));
		alunos = dao.selectAll();
		aluno = null;
	}

	@Override
	public void remove() {
		
		System.out.println("\n\rId do aluno a ser deletado: " + alunoAlvo.getId());
		dao.remove(alunoAlvo);

		FacesContext.getCurrentInstance().addMessage(
				"Sucesso!",
				new FacesMessage("Aluno: "+ alunoAlvo.getNome()+", "
						+ "CPF: "+ alunoAlvo.getCpf() +" removido com sucesso!"));

		alunos = dao.selectAll();
		alunosFiltrados = null;
		//return "aluno_lista?faces-redirect=true";
	}

	@Override
	public void holdInstance(Aluno aluno) {
		
		this.alunoAlvo = aluno;
		System.out.println("\n\rEntrou no hold instance. Segura o aluno: " + alunoAlvo.getId());
	}
	
	@Override
	public void voltar() {
		this.aluno = null;
	}
	
	/**
	 * @return the alunosFiltrados
	 */
	public List<Aluno> getAlunosFiltrados() {
		return alunosFiltrados;
	}

	/**
	 * @param alunosFiltrados the alunosFiltrados to set
	 */
	public void setAlunosFiltrados(List<Aluno> alunosFiltrados) {
		this.alunosFiltrados = alunosFiltrados;
	}

	/**
	 * @return the alunoAlvo
	 */
	public Aluno getAlunoAlvo() {
		return alunoAlvo;
	}

	/**
	 * @param alunoAlvo the alunoAlvo to set
	 */
	public void setAlunoAlvo(Aluno alunoAlvo) {
		this.alunoAlvo = alunoAlvo;
	}

	@Override
	public void novaEntity() {
		aluno = new Aluno();
	}
	
	/**
	 * @return the dao
	 */
	public GenericDAO<Aluno, Integer> getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(GenericDAO<Aluno, Integer> dao) {
		this.dao = dao;
	}

	/**
	 * @return the cidadesDoEstado
	 */
	public List<Cidade> getCidadesDoEstado() {
		return cidadesDoEstado;
	}

	/**
	 * @param cidadesDoEstado the cidadesDoEstado to set
	 */
	public void setCidadesDoEstado(List<Cidade> cidadesDoEstado) {
		this.cidadesDoEstado = cidadesDoEstado;
	}

	@SuppressWarnings("unchecked")
	public List<Cidade> getCidadesdoEstado() {
		
		for (Uf est : estados) {
			filtros.add(est.getLabel());
		}
		cidadesDoEstado = new GenericDAO(Cidade.class).selectByFilter(filtros, "uf");
		
		return cidadesDoEstado;
	}
	
}
