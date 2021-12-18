package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/MyServlet", asyncSupported = true)
public class MyServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//this code is a thread code
		// this will not print anything on the browser
		/*Sevlet itself is threead, a thread cannot produce another thread
		 * a normal java class will but a servlet cannot
		 * for this we have to make a async servlet
		 * 
		 * this code is used to do a task in the background concurrently*/		
		
		AsyncContext ac = req.startAsync(); // to support async task, tell servlet that there 
											//is a thread to be run in background
		PrintWriter pw = resp.getWriter();

		new Thread() {
			
			@Override
			public void run() {
				try {
					
					for(int i =0;i<=5;i++) {
						
						pw.println(i);
						Thread.currentThread().sleep(1000); //thread will not sleep as it is executes asyncly
					}
				}catch (Exception e) {
					// TODO: handle exception
					pw.println(e);
				}
				
				ac.complete(); // complete async task
			}
		}.start();
	}
}
