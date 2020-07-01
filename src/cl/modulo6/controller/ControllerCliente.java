package cl.modulo6.controller;

import java.io.IOException;
import java.sql.*;
import java.text.*;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import cl.modulo6.cookies.BuscaCookie;
import cl.modulo6.models.ModelLogin;
import cl.modulo6.objetos.ReporteCliente;
import cl.modulo6.ojdbc.Conexion;

/**
 * Servlet implementation class ControllerCliente
 */
public class ControllerCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ModelLogin mLogin;
	private Connection conex;
	
	//cambiar en caso de que el modelo sea distinto
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		conex=Conexion.getConexion();
		try {
			mLogin = new ModelLogin(conex);
		}catch(Exception e) {
			throw new ServletException(e);
		}
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		listarReportes(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getAccidente(request, response);
	}

	private void getAccidente(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String accidente=request.getParameter("accident");
		String trabajador=request.getParameter("nTrabajador");
		String fecha=request.getParameter("fAccident");	
		String detalle=request.getParameter("detAccident");
		
		String usuario = BuscaCookie.buscaCookie(request,response);
		
		try {
			String respuesta=null;
			//parametros del metodo revisar, debe llevar el usuario para verificar el id
			respuesta=ModelLogin.creaAccidente(accidente,trabajador,fecha,detalle);
			System.out.println(respuesta);
			
			listarReportes(request,response);
			
			
		}catch(Exception e) {
			
		}
		
		
	}
	
	 private void listarReportes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
		 List<ReporteCliente>repcliente;
		 
		 try {
			 
		 
		 repcliente=ModelLogin.getListaReportesAcc();
		 
		 request.setAttribute("LISTAREPORTES",repcliente);
		 
		 RequestDispatcher rdReporte;
		 rdReporte=request.getRequestDispatcher("/listadoAccidente.jsp");
		 rdReporte.forward(request,response);
		 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		
	}

	public static Date ParseFecha(String fecha)
	    {
	        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
	        Date fechaDate = null;
	        try {
	            fechaDate = formato.parse(fecha);
	        } 
	        catch (ParseException ex) 
	        {
	            System.out.println(ex);
	        }
	        return fechaDate;
	    }

}
