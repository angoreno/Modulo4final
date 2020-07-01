package cl.modulo6.objetos;

public class ReporteCliente {
	private String idCliente;
	private String nombreCliente;
	private String rutCliente;
	private String accidentCliente;
	private String trabajadorCliente;
	private String fechaCliente;
	private String detalleCliente;
	private String usuarioCliente;
	
	
	public ReporteCliente(String idCliente, String nombreCliente, String rutCliente, String accidentCliente,
			String trabajadorCliente, String fechaCliente, String detalleCliente, String usuarioCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.rutCliente = rutCliente;
		this.accidentCliente = accidentCliente;
		this.trabajadorCliente = trabajadorCliente;
		this.fechaCliente = fechaCliente;
		this.detalleCliente = detalleCliente;
		this.usuarioCliente = usuarioCliente;
	}


	public String getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public String getRutCliente() {
		return rutCliente;
	}


	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}


	public String getAccidentCliente() {
		return accidentCliente;
	}


	public void setAccidentCliente(String accidentCliente) {
		this.accidentCliente = accidentCliente;
	}


	public String getTrabajadorCliente() {
		return trabajadorCliente;
	}


	public void setTrabajadorCliente(String trabajadorCliente) {
		this.trabajadorCliente = trabajadorCliente;
	}


	public String getFechaCliente() {
		return fechaCliente;
	}


	public void setFechaCliente(String fechaCliente) {
		this.fechaCliente = fechaCliente;
	}


	public String getDetalleCliente() {
		return detalleCliente;
	}


	public void setDetalleCliente(String detalleCliente) {
		this.detalleCliente = detalleCliente;
	}


	public String getUsuarioCliente() {
		return usuarioCliente;
	}


	public void setUsuarioCliente(String usuarioCliente) {
		this.usuarioCliente = usuarioCliente;
	}


	@Override
	public String toString() {
		return "ReporteCliente [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", rutCliente="
				+ rutCliente + ", accidentCliente=" + accidentCliente + ", trabajadorCliente=" + trabajadorCliente
				+ ", fechaCliente=" + fechaCliente + ", detalleCliente=" + detalleCliente + ", usuarioCliente="
				+ usuarioCliente + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
