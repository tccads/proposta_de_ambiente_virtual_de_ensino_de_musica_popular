package escola.musica.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Curso {

		//TODO: Botar o curso, o professor, e as matérias de cada curso, depois do exemplo do video: 
	 	@Id
	 	@GeneratedValue
		private Long id;
		private String nome;
		private String descricao;
		private Date dataCriacao;
		private double duracao;
		private TipoCurso tipo;
		
		/**
		 * 
		 */
		public Curso() {
			super();
		}
		
		/**
		 * @param id
		 * @param nome
		 * @param descricao
		 * @param duracao
		 * @param tipo
		 */
		public Curso(Long id, String nome, String descricao, double duracao,
				TipoCurso tipo) {
			super();
			this.id = id;
			this.nome = nome;
			this.descricao = descricao;
			this.duracao = duracao;
			this.tipo = tipo;
		}
		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}
		/**
		 * @return the nome
		 */
		public String getNome() {
			return nome;
		}
		/**
		 * @param nome the nome to set
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}
		/**
		 * @return the descricao
		 */
		public String getDescricao() {
			return descricao;
		}
		/**
		 * @param descricao the descricao to set
		 */
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		/**
		 * @return the duracao
		 */
		public double getDuracao() {
			return duracao;
		}
		/**
		 * @param duracao the duracao to set
		 */
		public void setDuracao(double duracao) {
			this.duracao = duracao;
		}
		/**
		 * @return the tipo
		 */
		public TipoCurso getTipo() {
			return tipo;
		}
		/**
		 * @param tipo the tipo to set
		 */
		public void setTipo(TipoCurso tipo) {
			this.tipo = tipo;
		}

		/**
		 * @return the dataCriacao
		 */
		public Date getDataCriacao() {
			return dataCriacao;
		}

		/**
		 * @param dataCriacao the dataCriacao to set
		 */
		public void setDataCriacao(Date dataCriacao) {
			this.dataCriacao = dataCriacao;
		}
		
		
		
}
