package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* this is an old techniqu to create servlet
 * 
 * previous there were no annotations like @webservlet to register your servlet
 * for this we have to create web.xml file
 * 
 * <?xml version="1.0" encoding="UTF-8"?>
	<web-app
    	 xmlns="http://xmlns.jcp.org/xml/ns/javaee"
    	 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
         http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
         version="3.1">
    
    <session-config>
        <session-timeout>
                30
        </session-timeout>
    </session-config>
    
    <servlet>
		<servlet-name>NewServlet</servlet-name>
		<servlet-class>servlet.NewServlet</servlet-class>
    </servlet>

	<servlet-mapping>
		<servlet-name>NewServlet</servlet-name>
		<url-pattern>/NewServlet</url-pattern>
	</servlet-mapping>

	</web-app>
*/


public class NewServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("Hello");
	}
}
