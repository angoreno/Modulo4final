package cl.modulo6.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;


public class Conexion {

	public static Connection coneccion; 
	
	
	public static Connection getConexion() {
	
		try {
			if(coneccion==null) {
				Runtime.getRuntime().addShutdownHook(new getClose());
				Class.forName("oracle.jdbc.driver.OracleDriver"); 
				coneccion=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "fruna");
				System.out.println("Conexion correcta"); 
			}
			
		}catch (Exception e){ 
			System.out.println("Error al conectar. Error: " + e + "."); 
			
			
		}
		return coneccion; 
	}
	
	static class getClose extends Thread{
		@Override
		public void run() {
			try {
				Connection conecta=Conexion.getConexion(); 
				conecta.close();
				
			}catch (SQLException ex){
				System.out.println(ex); 
				
			}
		}
	}
	
	
}
