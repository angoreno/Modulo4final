package cl.modulo6.objetos;

public class Cliente {
	
	private String nombre;
	private String rut;
	private String direccion;
	private String telefono;
	private String giro;
	private String correo;
	private String usuario;
	private String clave;
	private int cargo;
	
	
	public Cliente(String nombre, String rut, String direccion, String telefono, String giro, String correo,
			String usuario, String clave, int cargo) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
		this.telefono = telefono;
		this.giro = giro;
		this.correo = correo;
		this.usuario = usuario;
		this.clave = clave;
		this.cargo = cargo;
	}
	
	
	public Cliente(String nombre, String rut, String direccion, String telefono, String giro, String correo,
			String usuario, String clave) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
		this.telefono = telefono;
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
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
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


	public int getCargo() {
		return cargo;
	}


	public void setCargo(int cargo) {
		this.cargo = cargo;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", rut=" + rut + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", giro=" + giro + ", correo=" + correo + ", usuario=" + usuario + ", clave=" + clave + ", cargo="
				+ cargo + ", toString()=" + super.toString() + "]";
	}
	
	

}
