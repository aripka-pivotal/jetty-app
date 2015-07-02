package io.pivotal.example;

import org.eclipse.jetty.server.Server;

public class HelloJetty {

	public static void main(String[] args) throws Exception{
		 	Server server = new Server(8080);
	        server.setHandler(new HelloWorld());
	 
	        server.start();
	        server.join();
	}
	
}
