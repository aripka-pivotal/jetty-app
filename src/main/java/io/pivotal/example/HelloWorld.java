package io.pivotal.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class HelloWorld extends AbstractHandler {

	public void handle(String target, Request baseRequest,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		baseRequest.setHandled(true);
		response.getWriter().println("<h1>Hello World</h1>");
		
		//some code that tests if we can find a mariadb class - this is really bad code
		boolean foundMaria = false;
		
		try{
			foundMaria = Class.forName("org.mariadb.jdbc.Driver") !=null; 
		}catch(ClassNotFoundException cfn){
			//eat exception
		}
		response.getWriter().println("<b>Found MariaDriver:"+foundMaria+"</b>");
	}

}
