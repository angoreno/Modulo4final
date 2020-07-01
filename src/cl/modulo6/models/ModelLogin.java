package cl.modulo6.models;

import java.sql.*;
import java.util.*;
import java.util.Date;

import cl.modulo6.objetos.Cliente;
import cl.modulo6.objetos.ReporteCliente;
import cl.modulo6.objetos.Usuario;

public class ModelLogin {
	
	private static Connection conex;
	
	public ModelLogin(Connection conex) {
		ModelLogin.conex = conex;
	}

	public static List<Usuario> getLogin(String usuario) throws SQLException {
		// TODO Auto-generated method stub
		
		String user=usuario;
		
		List<Usuario>usuarioDB = new ArrayList<>();
		
		Statement stmLogin=null;
		ResultSet rSetLogin=null;
		
		String consultaSql="SELECT usuario,pass,cargo_id FROM usuario WHERE usuario='"+user+"'";
		
		stmLogin=conex.createStatement();
		rSetLogin=stmLogin.executeQuery(consultaSql);
		
		while(rSetLogin.next()) {
			String userDB=rSetLogin.getString("USUARIO");
			String passDB=rSetLogin.getString("PASS");
			int idBD=rSetLogin.getInt("CARGO_ID");
			
			Usuario tempUserDB=new Usuario(userDB,passDB,idBD);
			
			usuarioDB.add(tempUserDB);
			
		}
		
		
		return usuarioDB;
	}
	
	

	public static String creaAccidente(String accidente, String trabajador, String fecha, String detalle) throws SQLException {
		// TODO Auto-generated method stub
		
		String accid=accidente;
		String trab=trabajador;
		String fech=fecha;
		String det=detalle;
		
		try {
			
			Statement stmAccidente=null;
			ResultSet rSetAccidente=null;
			
			String consultaSql="INSERT INTO REPACCIDENTES (ACCIDENTE, TRABAJADOR, FECHA, DETALLE, CLIENTE_USUARIO)"+
								" VALUES ('"+accid+"', '"+trab+"', TO_DATE('"+fech+"', 'DD-MM-YYYY'), "+
								"'"+det+"', '1')";//cambiae el id de cliente segun lo rescatado por la sesion
			
			stmAccidente=conex.createStatement();
			stmAccidente.executeQuery(consultaSql);
			
			String respuesta="Reporte ingresado correctamente";
			
			return respuesta;
			
		}catch(Exception e) {
			return "error en el ingreso del Servidor ";
		}
		
		
		
		
	}

	public static List<ReporteCliente> getListaReportesAcc() {
		// TODO Auto-generated method stub
		
		List<ReporteCliente>repcliente = new ArrayList<>();
		
		Statement stmReporte=null;
		ResultSet rSetReporte=null;
		
		String consultaSql="SELECT id_rep,nombre_emp,rut_emp,accidente,trabajador,fecha,detalle,usuario_usuario "+
							"FROM repaccidentes r,cliente c "+
							"WHERE r.cliente_usuario=c.id_emp";
		
		try {
			stmReporte=conex.createStatement();
			rSetReporte=stmReporte.executeQuery(consultaSql);
			
			while(rSetReporte.next()) {
				String repId=rSetReporte.getString("ID_REP");
				String repNombre=rSetReporte.getString("NOMBRE_EMP");
				String repRut=rSetReporte.getString("RUT_EMP");
				String repAccidente=rSetReporte.getString("ACCIDENTE");
				String repTrabajador=rSetReporte.getString("TRABAJADOR");
				String repFecha=rSetReporte.getString("FECHA");
				String repDetalle=rSetReporte.getString("DETALLE");
				String repUsuario=rSetReporte.getString("USUARIO_USUARIO");
				
				ReporteCliente tempReporte=new ReporteCliente(repId,repNombre,repRut,repAccidente,repTrabajador,repFecha,repDetalle,repUsuario);
				
				repcliente.add(tempReporte);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return repcliente;
	}

	public static List<Cliente> getListaClientes() {
		
		List<Cliente> listaClientes= new ArrayList<>();
		
		Statement stmListClient=null;
		ResultSet rSetListClient=null;
		
		String consultaSql="SELECT c.nombre_emp,c.rut_emp,c.direccion_emp,c.telefono_emp,c.giro_emp,c.email_emp,u.usuario,u.pass "+
							"FROM cliente c,usuario u WHERE c.usuario_usuario=u.usuario";
		
		try {
			
			stmListClient=conex.createStatement();
			rSetListClient=stmListClient.executeQuery(consultaSql);
			
			while(rSetListClient.next()) {
				String nombre=rSetListClient.getString("NOMBRE_EMP");
				String rut=rSetListClient.getString("RUT_EMP");
				String direccion=rSetListClient.getString("DIRECCION_EMP");
				String telefono=rSetListClient.getString("TELEFONO_EMP");
				String giro=rSetListClient.getString("GIRO_EMP");
				String correo=rSetListClient.getString("EMAIL_EMP");
				String usuario=rSetListClient.getString("USUARIO");
				String clave=rSetListClient.getString("PASS");
				
				Cliente tempListClient=new Cliente(nombre,rut,direccion,telefono,giro,correo,usuario,clave);
				
				listaClientes.add(tempListClient);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		return listaClientes;
	}
	
	

}
