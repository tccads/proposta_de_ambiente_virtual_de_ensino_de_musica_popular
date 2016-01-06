package escola.musica.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Curso {

		//TODO: Botar o curso, o professor, e as mat�rias de cada curso, depois do exemplo do video: 
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
		@Id
	 	@GeneratedValue(strategy = GenerationType.AUTO)
		public Long getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}
		
		@NotEmpty(message="O campo nome deve ser informado!")
		@Length(min=4, max=50, message="O campo nome deve ter entre 4 e 50 caracteres!")
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
		
		@NotEmpty(message="Você deve informar uma descrição.")
		@Length(min=4, max=255, message="A descrição deve ter até 999 caracteres!")
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
		
		@NotNull(message = "Voc� deve selecionar o tipo do curso!")
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
		
		public String obterImagem(){
			
			return nome.toLowerCase().replaceAll("�", "a")
					.replaceAll("�", "e").replaceAll(" ", "-")
					.concat(".png");
		}
		
}
