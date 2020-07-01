package cl.modulo6.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieCliente {
	
	
	public CookieCliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void creaCookie(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
		
		String usuario=request.getParameter("usuario");
		
		Cookie loginCookie = new Cookie("usuario",usuario);
		
		loginCookie.setMaxAge(60*5);
		
		response.addCookie(loginCookie);
	}

}