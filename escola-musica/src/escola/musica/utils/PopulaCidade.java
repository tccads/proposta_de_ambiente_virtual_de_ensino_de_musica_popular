package escola.musica.utils;

import javax.persistence.EntityManager;

import escola.musica.dao.JPAUtil;
import escola.musica.modelo.Cidade;
import escola.musica.modelo.Uf;

public class PopulaCidade {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Cidade cidadeSp1 = new Cidade("São José dos Campos", Uf.SP);
		Cidade cidadeSp2 = new Cidade("Caçapava", Uf.SP);
		Cidade cidadeSp3 = new Cidade("Jacareí", Uf.SP);
		Cidade cidadeSp4 = new Cidade("Aparecida", Uf.SP);
		Cidade cidadeSp5 = new Cidade("Taubaté", Uf.SP);
//		Cidade cidadeSp6 = new Cidade("São José do Rio Preto", Uf.SP);
		
		Cidade cidadeRj1 = new Cidade("Resende", Uf.RJ);
		Cidade cidadeRj2 = new Cidade("Barra Mansa", Uf.RJ);
		Cidade cidadeRj3 = new Cidade("Macaé", Uf.RJ);
		Cidade cidadeRj4 = new Cidade("Cabo Frio", Uf.RJ);
		Cidade cidadeRj5 = new Cidade("Volta Redonda", Uf.RJ);
		
		Cidade cidadeMg1 = new Cidade("Itajubá", Uf.MG);
		Cidade cidadeMg2 = new Cidade("Maria da Fé", Uf.MG);
		Cidade cidadeMg3 = new Cidade("Passa Quatro", Uf.MG);
		Cidade cidadeMg4 = new Cidade("São Lourenço", Uf.MG);
		Cidade cidadeMg5 = new Cidade("Três Corações", Uf.MG);
		
		Cidade cidadePr1 = new Cidade("Curitiba", Uf.PR);
		Cidade cidadePr2 = new Cidade("São José dos Pinhais", Uf.PR);
		Cidade cidadePr3 = new Cidade("Pato Branco", Uf.PR);
		Cidade cidadePr4 = new Cidade("Maringá", Uf.PR);
		Cidade cidadePr5 = new Cidade("Cascavel", Uf.PR);
		
		Cidade cidadeSc1 = new Cidade("Rio do Sul", Uf.SC);
		Cidade cidadeSc2 = new Cidade("Blumenau", Uf.SC);
		Cidade cidadeSc3 = new Cidade("Chapecó", Uf.SC);
		Cidade cidadeSc4 = new Cidade("Joinvile", Uf.SC);
		Cidade cidadeSc5 = new Cidade("Petrolândia", Uf.SC);
		
		em.persist(cidadeMg1);
		em.persist(cidadeMg2);
		em.persist(cidadeMg3);
		em.persist(cidadeMg4);
		em.persist(cidadeMg5);
//		em.persist(cidadeSp6);
		
		em.persist(cidadeSp1);
		em.persist(cidadeSp2);
		em.persist(cidadeSp3);
		em.persist(cidadeSp4);
		em.persist(cidadeSp5);
		
		em.persist(cidadePr1);
		em.persist(cidadePr2);
		em.persist(cidadePr3);
		em.persist(cidadePr4);
		em.persist(cidadePr5);
		
		em.persist(cidadeRj1);
		em.persist(cidadeRj2);
		em.persist(cidadeRj3);
		em.persist(cidadeRj4);
		em.persist(cidadeRj5);
		
		em.persist(cidadeSc1);
		em.persist(cidadeSc2);
		em.persist(cidadeSc3);
		em.persist(cidadeSc4);
		em.persist(cidadeSc5);
		
		em.getTransaction().commit();
		em.close();
	}
}
