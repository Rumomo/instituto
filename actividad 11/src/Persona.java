
public class Persona {

	protected String nombre;
	protected String direccion;
	protected int edad;
	
	public Persona() {
		
		this.nombre ="";
		this.direccion = "";
		this.edad = 0;
	
	}

	public Persona(String nombre, String direccion, int edad) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean mayorEdad() {
		if(edad < 18) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "\n direccion=" + direccion + 
				"\n edad=" + edad + "\n mayorEdad()=" + mayorEdad() + "]";
	}
	
	
}
