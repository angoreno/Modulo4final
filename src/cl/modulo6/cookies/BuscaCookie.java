package cl.modulo6.cookies;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BuscaCookie {

	public static String buscaCookie(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String contCookie=null;
		String user="JSESSIONID";
		Cookie[] misCookies =request.getCookies();
		
		if(misCookies!=null) {
			for(Cookie tempCook:misCookies) {
				if(user.equals(tempCook.getName())) {
					contCookie=tempCook.getValue();
				}
			}
		}
		
		System.out.println(contCookie);
		return contCookie;
	}

	
	

}
