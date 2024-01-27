
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
		this.nacionalidad = nacionalidad;
	}
	
	
	

}
