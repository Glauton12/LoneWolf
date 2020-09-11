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
		String nome = request.getParameter("nome");
		double nota1 = Double.parseDouble(request.getParameter("nota1"));
		double nota2 = Double.parseDouble(request.getParameter("nota2"));
		double nota3 = Double.parseDouble(request.getParameter("nota3"));
	
		double media = (nota1+nota2+nota3)/3;
		
		PrintWriter texto = response.getWriter();
		texto.print("Sua média é "+media+" e sua situação é "+(media >= 7 ? "Aprovado" : "Reprovado"));
	}

}
