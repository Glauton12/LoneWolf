package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mensagem
 */
@WebServlet("/Mensagem")
public class Mensagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mensagem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double peso = Double.parseDouble(request.getParameter("peso"));
		double altura = Double.parseDouble(request.getParameter("altura"));
		
		double imc = peso / Math.pow(altura, 2);
		
		PrintWriter texto = response.getWriter();
		texto.print("Seu IMC é: "+imc+"<hr>");
		
		if(imc < 18.5) {
			texto.print("Muito abaixo do peso");
		}else if(imc < 25) {
			texto.print("Peso normal");
		}else if(imc < 30) {
			texto.print("Acima do peso");
		}else {
			texto.print("Obesidade");
		}
	}

}
