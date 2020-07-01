package cl.modulo6.controller;

import java.io.IOException;
import java.sql.*;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.modulo6.cookies.CookieCliente;
import cl.modulo6.models.ModelLogin;
import cl.modulo6.objetos.Usuario;
import cl.modulo6.ojdbc.Conexion;

/**
 * Servlet implementation class controllerLogin
 */
public class controllerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ModelLogin mLogin;
	private Connection conex;
	
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getLogin(request, response);
		CookieCliente.creaCookie(request, response);
	}

	private void getLogin(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		//declaro variables a usar en login tanto las de pagina web como de la BD
		String user=request.getParameter("usuario");
		String pass=request.getParameter("pass");
		String userbd=null;
		String passbd=null;
		int idbd=0;
		
		//creo lista para almacenar usuario de BD	
		List<Usuario>usuarioDB;
		
		try {
			//se envia el usuario para revisar BD y traer los datos del usuario
			usuarioDB=ModelLogin.getLogin(user);
			
			for(Usuario tempUser:usuarioDB) {
				
				userbd=tempUser.getUsuario();
				passbd=tempUser.getClave();
				idbd=tempUser.getId();
			}
			
			if(user.equals(userbd)&&pass.equals(passbd)) {
				
				switch(idbd) {
				case 1:
					System.out.println("administrador");
					
					RequestDispatcher rdAdmin;
					rdAdmin=request.getRequestDispatcher("/bienvenidaAdmin.jsp");
					rdAdmin.forward(request,response);
					break;
				case 2:
					System.out.println("Profesional");
					
					RequestDispatcher rdProf;
					rdProf=request.getRequestDispatcher("/homeProfesional.jsp");
					rdProf.forward(request,response);
					break;
				case 3:
					System.out.println("cliente");
					
					RequestDispatcher rdCliente;
					rdCliente=request.getRequestDispatcher("/bienvenidaCliente.jsp");
					rdCliente.forward(request,response);
					break;
				default:
					System.out.println("Login nuevamente");
					
					RequestDispatcher rdDef;
					rdDef=request.getRequestDispatcher("/index.jsp");
					rdDef.forward(request,response);
				}
			}else {
				System.out.println("Login nuevamente");
				
				RequestDispatcher rdDef;
				rdDef=request.getRequestDispatcher("/index.jsp");
				rdDef.forward(request,response);
			}
			
		}catch(Exception e) {
			
		}
		
	}

}
