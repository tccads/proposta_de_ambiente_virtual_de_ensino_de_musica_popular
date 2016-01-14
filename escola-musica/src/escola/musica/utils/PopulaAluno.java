package escola.musica.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import escola.musica.dao.JPAUtil;
import escola.musica.modelo.Aluno;
import escola.musica.modelo.Endereco;
import escola.musica.modelo.Matricula;
import escola.musica.modelo.Telefone;
import escola.musica.modelo.Email;
import escola.musica.modelo.Curso;
import escola.musica.modelo.Area;

public class PopulaAluno {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		List<Telefone> listaTesteTelefones = new ArrayList<Telefone>();
		List<Email> listaTesteEmails = new ArrayList<Email>();
		
		listaTesteTelefones.add(new Telefone("32156-46684"));
		listaTesteTelefones.add(new Telefone("1656-46684"));
		listaTesteTelefones.add(new Telefone("32156-13515"));
		
		listaTesteEmails.add(new Email("jessica.jaacabou@hotmail.com"));
		listaTesteEmails.add(new Email("galo.cego@hotmail.com"));
		listaTesteEmails.add(new Email("jarbas@hotmail.com"));
		listaTesteEmails.add(new Email("romerobritto@hotmail.com"));
	
		Endereco enderecoTeste = new Endereco("Rua dos Tolos",0,"18546-681","Paraizinho do Sul","AC");
		
		Aluno john = new Aluno(null,  "333.034.208-07", "John", "Frusciante", listaTesteTelefones, listaTesteEmails, enderecoTeste, null, true);
		Aluno joe = new Aluno(null,   "334.035.008-04", "Joe", "Satriani", listaTesteTelefones, listaTesteEmails, enderecoTeste, null, true);
		Aluno jimmy = new Aluno(null, "353.044.208-06", "Jimmy", "Page", listaTesteTelefones, listaTesteEmails, enderecoTeste, null, true);
		Aluno james = new Aluno(null, "464.865.454-86", "James", "Hetfield", listaTesteTelefones, listaTesteEmails, enderecoTeste, null, true);
		Aluno luan = new Aluno(null,  "534.464.208-06", "Luan", "Falchette", listaTesteTelefones, listaTesteEmails, enderecoTeste, null, true);
		Aluno izac = new Aluno(null,  "545.464.464-05", "Izac", "Roschel", listaTesteTelefones, listaTesteEmails, enderecoTeste, null, true);
		Aluno steve = new Aluno(null, "165.464.208-03", "Steve", "Vai", listaTesteTelefones, listaTesteEmails, enderecoTeste, null, true);
		Aluno paul = new Aluno(null,  "534.415.505-01", "Paul", "Gilbert", listaTesteTelefones, listaTesteEmails, enderecoTeste, null, true);
		Aluno guthrie = new Aluno(null, "178.964.208-09", "Guthrie", "Govan", listaTesteTelefones, listaTesteEmails, enderecoTeste, null, true);
		
		em.persist(john);
		em.persist(joe);
		em.persist(jimmy);
		em.persist(james);
		em.persist(luan);
		em.persist(izac);
		em.persist(steve);
		em.persist(paul);
		em.persist(guthrie);
		
		em.getTransaction().commit();
		em.close();
	}
	
	private static String getDescricao() {
		return "Mussum ipsum cacilds, vidis litro abertis. Consetis adipiscings elitis."
			+ " Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis.";
	}
	
}
