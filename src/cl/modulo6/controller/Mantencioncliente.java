package cl.modulo6.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.modulo6.models.ModelLogin;
import cl.modulo6.objetos.Cliente;
import cl.modulo6.ojdbc.Conexion;

/**
 * Servlet implementation class Mantencioncliente
 */
public class Mantencioncliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ModelLogin mLogin;//cambiar el nombre por el modelo a usar
	private Connection conex;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		conex=Conexion.getConexion();
		try {
			mLogin = new ModelLogin(conex);//cambiar el nombre por el modelo a usar
		}catch(Exception e) {
			throw new ServletException(e);
		}
		
	} 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mantencioncliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		muestraClientes(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
	}

	private void muestraClientes(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		List<Cliente> listaClientes;
		
		try {
			
			listaClientes=ModelLogin.getListaClientes();
			
			request.setAttribute("LISTACLIENTES",listaClientes);
			
			RequestDispatcher rdListaCliente;
			rdListaCliente=request.getRequestDispatcher("/mantenedorCliente.jsp");
			rdListaCliente.forward(request,response);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
