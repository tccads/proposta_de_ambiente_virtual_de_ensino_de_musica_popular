package escola.musica.modelo;

public enum TipoCurso {
	
		TECLAS("Teclas"),
		CORDAS("Cordas"),
		SOPRO("Sopro"),
		PERCUSSAO("Percuss�o"),
		CANTO("Canto");

		private String label;

		private TipoCurso(String label) {
			this.label = label;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
	
}
