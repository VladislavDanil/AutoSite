package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octo.captcha.module.servlet.image.SimpleImageCaptchaServlet;

import DAO.*;

/**
 * Servlet implementation class Gallery
 */
public class Zakaz extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Zakaz() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String model="";
		String color="";
		String dvig="";
		String compl="";
		String dopusl1="";
		String name="";
		String lastname="";
		String middlename="";
		String telefon="";
		String userCaptchaResponse = request.getParameter("jcaptcha");
		boolean captchaPassed = SimpleImageCaptchaServlet.validateResponse(request, userCaptchaResponse);
		if(captchaPassed){
		// proceed to submit action
		model = new String(request.getParameter("auto_name").getBytes("ISO-8859-1"),
				"UTF-8");
	
		color = new String(request.getParameter("color").getBytes(
				"ISO-8859-1"), "UTF-8");

		dvig = new String(request.getParameter("turning1").getBytes(
				"ISO-8859-1"), "UTF-8");

		compl = new String(request.getParameter("turning2").getBytes(
				"ISO-8859-1"), "UTF-8");

		dopusl1 = new String(request.getParameter("option2").getBytes(
				"ISO-8859-1"), "UTF-8");

		name = new String(request.getParameter("name")
				.getBytes("ISO-8859-1"), "UTF-8");

		lastname = new String(request.getParameter("last_name")
				.getBytes("ISO-8859-1"), "UTF-8");

		middlename = new String(request.getParameter("middle_name")
				.getBytes("ISO-8859-1"), "UTF-8");

		telefon = new String(request.getParameter("fon").getBytes("ISO-8859-1"),
				"UTF-8");

		IZakazDAO zakaz;
		zakaz=new ZakazDAO();
		zakaz.addZakaz(model, color, dvig, compl, dopusl1, 
				name, lastname, middlename, telefon);
		ArrayList<String> a =zakaz.selectZakaz();
		request.setAttribute("array", a);
		request.setAttribute("mes", "1");
		request.getRequestDispatcher("tehosmotr.jsp").forward(request,
				response);
		}else{
			request.setAttribute("mes1", "*Неправильно введенные символы");
			request.getRequestDispatcher("zakaz.jsp").forward(request,
					response);
		}
	}

}
