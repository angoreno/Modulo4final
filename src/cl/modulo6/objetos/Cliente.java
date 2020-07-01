package cl.modulo6.objetos;

public class Cliente {
	
	private String nombre;
	private String rut;
	private String direccion;
	private String Telefono;
	private String giro;
	private String correo;
	private String usuario;
	private String clave;
	
	
	public Cliente(String nombre, String rut, String direccion, String telefono, String giro, String correo,
			String usuario, String clave) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
		Telefono = telefono;
		this.giro = giro;
		this.correo = correo;
		this.usuario = usuario;
		this.clave = clave;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return Telefono;
	}


	public void setTelefono(String telefono) {
		Telefono = telefono;
	}


	public String getGiro() {
		return giro;
	}


	public void setGiro(String giro) {
		this.giro = giro;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", rut=" + rut + ", direccion=" + direccion + ", Telefono=" + Telefono
				+ ", giro=" + giro + ", correo=" + correo + ", usuario=" + usuario + ", clave=" + clave
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
