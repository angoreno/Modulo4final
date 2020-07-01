package cl.modulo6.objetos;

public class Usuario {
	
	private String nombre;
	private String usuario;
	private String clave;
	private int id;
	
	public Usuario(String nombre, String usuario, String clave, int id) {
		super();
		this.nombre = nombre;
		this.usuario = usuario;
		this.clave = clave;
		this.id = id;
	}
	
	

	public Usuario(String usuario, String clave, int id) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", usuario=" + usuario + ", clave=" + clave + ", id=" + id
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
