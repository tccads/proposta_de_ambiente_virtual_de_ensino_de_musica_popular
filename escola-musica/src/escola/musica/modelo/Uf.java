package escola.musica.modelo;

public enum Uf {
	
 	AC("Acre"),	 
	AL("Alagoas"), 	 
	AP("Amapá"), 	 
	AM("Amazonas"), 	 
	BA("Bahia"),
	CE("Ceará"), 	 
	DF("Distrito Federal"), 	 
	ES("Espírito Santo"), 	 
	GO("Goiás"), 	 
	MA("Maranhão"), 	 
	MT("Mato Grosso"), 	 
	MS("Mato Grosso do Sul"),
	MG("Minas Gerais"), 
	PA("Pará"),
	PB("Paraíba"),
	PR("Paraná"),
	PE("Pernambuco"), 	 
	PI("Piauí"), 	 
	RJ("Rio de Janeiro"), 	 
	RN("Rio Grande do Norte"),
	RS("Rio Grande do Sul"),
	RO("Rondônia"), 	 
	RR("Roraima"), 	 
	SC("Santa Catarina"),	 
	SP("São Paulo"),
	SE("Sergipe"), 	 
	TO("Tocantins");
	
	private String label;

	/**
	 * @param label
	 */
	private Uf(String label) {
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
