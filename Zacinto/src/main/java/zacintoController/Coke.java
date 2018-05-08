package zacintoController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Coke {

	private String nomeCookie;
	private String value;

	//Costruttore
	public Coke() {

	}
	//Crea il cookie
	public static void CreaCookie( HttpServletResponse resp, String nomeCookie, String value) {
		//Oggetto cookie
		Cookie coks = new Cookie(nomeCookie, value);
		coks.setMaxAge(1200);
		resp.addCookie(coks);

	}
	//Elimina il cookie dal nome
	public static void EliminaCookie(HttpServletResponse resp, String nomeCookie) {
		// Ricrea il cookie e lo setta a 0 cosi è nullo
		Cookie coks = new Cookie(nomeCookie, null);
		coks.setMaxAge(0);
		resp.addCookie(coks);

	}

	public static boolean controlloCookie(HttpServletRequest req) {

		Cookie[] coks = req.getCookies(); // mette nell' array tutti i cookie del browser
		for(int i=0; coks != null  && i<coks.length; i++) { //se l'array è pieno e la i è minore della lunghezza dell'array lo scorre
			if(coks[i].getName().equals("logCookie") && coks[i].getValue().equals("ZacintoCookie")) {
					// getname mi ritorna il nome dell'array
				return true;

			}


		}

		return false;

	}
}


