package escola.musica.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Curso implements Serializable {

		private static final long serialVersionUID = 8242048543360630837L;
		//TODO:Botar as matérias de cada curso, depois do exemplo do video: 
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long curso_id;
		@NotEmpty(message="O campo nome deve ser informado!")
		@Length(min=4, max=50, message="O campo nome deve ter entre 4 e 50 caracteres!")
		private String nome;
		@NotEmpty(message="Você deve informar uma descrição.")
		@Length(min=4, max=255, message="A descrição deve ter até 255 caracteres!")
		private String descricao;
		@Temporal(TemporalType.DATE)
		private Date dataCriacao;
		private double duracao;
		@Enumerated(EnumType.STRING)
		@NotNull(message = "Você deve selecionar o tipo do curso!")
		private Area area;
		@ManyToOne
		@JoinColumn(name="pessoa_id")
		private Professor professor;

		/**
		 * 
		 */
		public Curso() {
		}
		
		
		/**
		 * @param id
		 * @param nome
		 * @param descricao
		 * @param dataCriacao
		 * @param duracao
		 * @param tipo
		 * @param matricula
		 */
		public Curso(Long id, String nome, String descricao, Date dataCriacao,
				double duracao, Area tipo) {
			super();
			this.curso_id = id;
			this.nome = nome;
			this.descricao = descricao;
			this.dataCriacao = dataCriacao;
			this.duracao = duracao;
			this.area = tipo;
		}
		
		/**
		 * @return the curso_id
		 */
		public Long getCurso_id() {
			return curso_id;
		}


		/**
		 * @param curso_id the curso_id to set
		 */
		public void setCurso_id(Long curso_id) {
			this.curso_id = curso_id;
		}


		/**
		 * @return the professor
		 */
		public Professor getProfessor() {
			return professor;
		}


		/**
		 * @param professor the professor to set
		 */
		public void setProfessor(Professor professor) {
			this.professor = professor;
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

		public Area getArea() {
			return area;
		}
		/**
		 * @param area the tipo to set
		 */
		public void setArea(Area area) {
			this.area = area;
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

		public String obterImagem(){
			
			return nome.toLowerCase().replaceAll("�", "a")
					.replaceAll("�", "e").replaceAll(" ", "-")
					.concat(".png");
		}
		
}
