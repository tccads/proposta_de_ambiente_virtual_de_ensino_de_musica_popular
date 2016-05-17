package escola.musica.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import escola.musica.dao.GenericDAO;
import escola.musica.dao.JPAUtil;
import escola.musica.modelo.Aluno;
import escola.musica.modelo.Cidade;
import escola.musica.modelo.Curso;
import escola.musica.modelo.DiaSemana;
import escola.musica.modelo.Email;
import escola.musica.modelo.Endereco;
import escola.musica.modelo.Instrumento;
import escola.musica.modelo.IntervaloTempo;
import escola.musica.modelo.Professor;
import escola.musica.modelo.Telefone;
import escola.musica.modelo.Uf;

public class PopulaProfessor {
	
	public static void main(String[] args) {
		
		GenericDAO<Curso, Long> cursoDao = new GenericDAO<Curso, Long>(Curso.class);
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		List<Telefone> listaTesteTelefones = new ArrayList<Telefone>();
		List<Email> listaTesteEmails = new ArrayList<Email>();
		
		List<Curso> cursosMinistrados = new ArrayList<Curso>();
		List<Instrumento> instrumentos = new ArrayList<Instrumento>();
		List<IntervaloTempo> horariosDisponiveis = new ArrayList<IntervaloTempo>();
		
		List<String> filtros = new ArrayList<String>();
		
		listaTesteTelefones.add(new Telefone("3246-46684"));
		listaTesteTelefones.add(new Telefone("7896-46684"));
		listaTesteTelefones.add(new Telefone("3466-4515"));
		
		listaTesteEmails.add(new Email("jessica.jaacabou@hotmail.com"));
		listaTesteEmails.add(new Email("galo.cego@hotmail.com"));
		listaTesteEmails.add(new Email("jarbas@hotmail.com"));
		listaTesteEmails.add(new Email("romerobritto@hotmail.com"));
		
		filtros.add("guitarra");
		filtros.add("violão");
		filtros.add("contra-baixo");
		
		instrumentos.add(new Instrumento("Guitarra"));
		instrumentos.add(new Instrumento("Violão"));
		instrumentos.add(new Instrumento("Contra-Baixo"));
		
		horariosDisponiveis.add(new IntervaloTempo( DiaSemana.SEGUNDA, new Date(0, 0, 0, 16, 30), new Date(0, 0, 0, 20, 30)));
		horariosDisponiveis.add(new IntervaloTempo( DiaSemana.TERCA, new Date(0, 0, 0, 10, 30), new Date(0, 0, 0, 20, 30)));
		horariosDisponiveis.add(new IntervaloTempo( DiaSemana.QUARTA, new Date(0, 0, 0, 18, 30), new Date(0, 0, 0, 21, 30)));
		horariosDisponiveis.add(new IntervaloTempo( DiaSemana.QUINTA, new Date(0, 0, 0, 16, 30), new Date(0, 0, 0, 22, 00)));
		horariosDisponiveis.add(new IntervaloTempo( DiaSemana.SEXTA, new Date(0, 0, 0, 16, 00), new Date(0, 0, 0, 20, 00)));
		horariosDisponiveis.add(new IntervaloTempo( DiaSemana.SABADO, new Date(0, 0, 0, 8, 00), new Date(0, 0, 0, 15, 00)));
		
		cursosMinistrados.addAll(cursoDao.selectByFilter(filtros, "nome"));
		Cidade cidade = new Cidade("São José do Rio Preto", Uf.SP);
		
		Endereco enderecoTeste = new Endereco("Rua dos Tolos",0,"18546-681",cidade);
		
		Professor reinaldo = new Professor( "333.034.208-07", "Reinaldo Neves", "dos Santos",
				listaTesteTelefones, listaTesteEmails, enderecoTeste, cursosMinistrados, instrumentos, horariosDisponiveis, true);
		Professor jonas = new Professor( "334.035.008-04", "Jonas", "Berso", listaTesteTelefones, listaTesteEmails, enderecoTeste,
				cursosMinistrados, instrumentos, horariosDisponiveis, true);
		Professor bruno = new Professor( "648.456.469-06", "Bruno", "Garcia", listaTesteTelefones, listaTesteEmails, enderecoTeste,
				cursosMinistrados, instrumentos, horariosDisponiveis, true);
		Professor marquinho = new Professor( "648.564.489-06", "Marquinho", "Munhoz", listaTesteTelefones, listaTesteEmails, enderecoTeste,
				cursosMinistrados, instrumentos, horariosDisponiveis, true);
		Professor jeison = new Professor( "553.064.486-06", "Marquinho", "Munhoz", listaTesteTelefones, listaTesteEmails, enderecoTeste,
				cursosMinistrados, instrumentos, horariosDisponiveis, true);
		Professor formiga = new Professor( "976.468.795-06", "Henrique", "Formiga", listaTesteTelefones, listaTesteEmails, enderecoTeste,
				cursosMinistrados, instrumentos, horariosDisponiveis, true);
		Professor paulo = new Professor( "468.696.498-06", "Paulo", "Pacheco", listaTesteTelefones, listaTesteEmails, enderecoTeste,
				cursosMinistrados, instrumentos, horariosDisponiveis, true);
		
		em.persist(reinaldo);
		em.persist(jonas);
		em.persist(bruno);
		em.persist(marquinho);
		em.persist(jeison);
		em.persist(formiga);
		em.persist(paulo);
		
		em.getTransaction().commit();
		em.close();
	}
	
	private static String getDescricao() {
		return "Mussum ipsum cacilds, vidis litro abertis. Consetis adipiscings elitis."
			+ " Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis.";
	}
	
}
