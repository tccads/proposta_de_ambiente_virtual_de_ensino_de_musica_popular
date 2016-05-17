package escola.musica.modelo;

public enum Area{
	
		TECLAS("Teclas"),
		CORDAS("Cordas"),
		SOPRO("Sopro"),
		PERCUSSAO("Percussão"),
		CANTO("Canto");

		private String label;

		private Area(String label) {
			this.label = label;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
	
}
