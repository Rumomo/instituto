
public class EstudianteInt extends Estudiante {

	private boolean esErasmus;
	private String nacionalidad;
	
	public EstudianteInt() {
		super();
		this.esErasmus = false;
		this.nacionalidad = "";
	}

	public EstudianteInt(String nombre, String direccion, int edad, String codigo, boolean esErasmus, String nacionalidad ) {
		super(nombre, direccion, edad, codigo);
		this.esErasmus = esErasmus;
		if (nacionalidad == "ingles" 
			|| nacionalidad == "frances" 
			|| nacionalidad == "portugues" 
			|| nacionalidad == "americano") {
			
			this.nacionalidad = nacionalidad;}else {
				System.out.println("La nacionalidad debe ser una de las siguientes: "
						+ "ingles, frances , portugues o americano");
			}
	}

	public boolean isEsErasmus() {
		return esErasmus;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setEsErasmus(boolean esErasmus) {
		this.esErasmus = esErasmus;
	}

	public void setNacionalidad(String nacionalidad) {
		if (nacionalidad == "ingles" 
				|| nacionalidad == "frances" 
				|| nacionalidad == "portugues" 
				|| nacionalidad == "americano") {
				
				this.nacionalidad = nacionalidad;}else {
					System.out.println("La nacionalidad debe ser una de las siguientes: "
							+ "ingles, frances , portugues o americano");
				}
	}
	
	public boolean esErasmus() {
		if (nacionalidad == "ingles" 
			|| nacionalidad == "frances" 
			|| nacionalidad == "portugues"){
				return true;
		}
		return false;
	}
	
	
	public boolean descuentoParaJovenes() {
		if(esErasmus() == true && edad <=25) {
			return true;
		}
		return false;
	}
	
	 @Override
	    public String toString() {
	        return "EstudianteInt{" +
	                "esErasmus=" + esErasmus +
	                ", nacionalidad='" + nacionalidad + '\'' +
	                ", nombre='" + nombre + '\'' +
	                ", direccion='" + direccion + '\'' +
	                ", edad=" + edad +
	                ", codigo='" + getCodigo() + '\'' +
	                '}';
	    }

}
