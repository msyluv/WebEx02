package com.sds.icto.webex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamServlet
 */
@WebServlet("/param")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		String text = request.getParameter("name");
		String radio = request.getParameter("radio");
		String checkbox = request.getParameter("checkbox");
		String button = request.getParameter("button");
		String pwd = request.getParameter("pwd");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("당신의 입력정보<br>");
		out.println("TEXT  : ");
		out.println(text);
		out.println("<br> RADIO : ");
		out.println(radio);
		out.println("<br> CHECKBOX : ");
			String chk[] = request.getParameterValues("checkbox");
			if(chk==null){
				out.println("선택 안함");
			} else {
				for(String checkbox1  : chk){
					out.println(checkbox1 + " ");
				}
			}
		out.println("<br> BUTTON : ");
		out.println(button);
		out.println("<br> PASSWORD : ");
		out.println(pwd);
		
		out.println("</body></html>");
		
	}

}
