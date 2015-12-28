package escola.musica.modelo;

public enum DiaSemana{

	SEGUNDA("Segunda-feira"), TERCA("Terça-feira"), QUARTA("Quarta-feira"), QUINTA("Quinta-feira"), SEXTA("Sexta-feira"), SABADO("Sábado");
	
	private String label;

	private DiaSemana(String label) {
		this.label = label;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
}
