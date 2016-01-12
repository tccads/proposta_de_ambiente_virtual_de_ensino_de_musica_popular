package escola.musica.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;

import escola.musica.modelo.Curso;
import escola.musica.modelo.Area;

public class PopulaCurso {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Curso violino = geraCurso("Violino", getDescricao(), "01/01/2014", 4, Area.CORDAS);
		Curso viola = geraCurso("Viola", getDescricao(), "01/01/2014", 4, Area.CORDAS);
		Curso violoncello = geraCurso("Violoncello", getDescricao(), "01/01/2014", 4, Area.CORDAS);
		Curso contrabaixo = geraCurso("Contrabaixo", getDescricao(), "01/01/2014", 4, Area.CORDAS);
		Curso violao = geraCurso("Viol�o", getDescricao(), "01/01/2014", 4, Area.CORDAS);
		Curso guitarra = geraCurso("Guitarra", getDescricao(), "01/01/2014", 4, Area.CORDAS);
		Curso flauta = geraCurso("Flauta", getDescricao(), "01/02/2014", 4, Area.SOPRO);
		Curso clarinete = geraCurso("Clarinete", getDescricao(), "01/02/2014", 4, Area.SOPRO);
		Curso oboe = geraCurso("Oboé", getDescricao(), "01/02/2014", 5, Area.SOPRO);
		Curso fagote = geraCurso("Fagote", getDescricao(), "01/02/2014", 5, Area.SOPRO);
		Curso saxofone = geraCurso("Saxofone", getDescricao(), "01/02/2014", 5, Area.SOPRO);
		Curso clarone = geraCurso("Clarone", getDescricao(), "01/02/2014", 5, Area.SOPRO);
		Curso trompete = geraCurso("Trompete", getDescricao(), "04/02/2014", 6, Area.SOPRO);
		Curso trompa = geraCurso("Trompa", getDescricao(), "04/01/2014", 6, Area.SOPRO);
		Curso trombone = geraCurso("Trobone", getDescricao(), "04/01/2014", 6, Area.SOPRO);
		Curso tuba = geraCurso("Tuba", getDescricao(), "04/01/2014", 6, Area.SOPRO);
		Curso bateria = geraCurso("Bateria", getDescricao(), "22/01/2014", 3, Area.PERCUSSAO);
		Curso xilofone = geraCurso("Xilofone", getDescricao(), "22/01/2014", 3, Area.PERCUSSAO);
		Curso caixa = geraCurso("Caixa", getDescricao(), "22/01/2014", 3, Area.PERCUSSAO);
		Curso bumbo = geraCurso("Bumbo", getDescricao(), "22/01/2014", 3, Area.PERCUSSAO);
		Curso batera = geraCurso("Bateria", getDescricao(), "22/01/2014", 3, Area.PERCUSSAO);
		
		em.persist(violino);
		em.persist(viola);
		em.persist(violoncello);
		em.persist(contrabaixo);
		em.persist(violao);
		em.persist(guitarra);
		em.persist(flauta);
		em.persist(clarinete);
		em.persist(oboe);
		em.persist(fagote);
		em.persist(clarone);
		em.persist(saxofone);
		em.persist(trompete);
		em.persist(trompa);
		em.persist(trombone);
		em.persist(tuba);
		em.persist(bateria);
		em.persist(xilofone);
		em.persist(caixa);
		em.persist(bumbo);
		
		em.getTransaction().commit();
		em.close();
	}
	
	private static String getDescricao() {
		return "Mussum ipsum cacilds, vidis litro abertis. Consetis adipiscings elitis."
			+ " Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis.";
	}

	public static Curso geraCurso(String nome, String descricao, String data, double duracao, Area tipo){
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setDescricao(descricao);
		curso.setDuracao(duracao);
		curso.setDataCriacao(parseData(data));
		curso.setArea(tipo);
		return curso;
	}
	
	private static Date parseData(String data){
		try{
			Date date = new SimpleDateFormat("dd/MM/yyy").parse(data);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			return calendar.getTime();
		}catch(ParseException e){
			throw new IllegalArgumentException(e);
		}
	}
}
