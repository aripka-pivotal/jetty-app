package io.pivotal.example;

import org.eclipse.jetty.server.Server;

public class HelloJetty {

	public static void main(String[] args) throws Exception {

		String port = System.getenv("PORT");

		if (port == null || port.isEmpty()) {
			port = "8080";
		}

		Server server = new Server(Integer.parseInt(port));
		server.setHandler(new HelloWorld());

		server.start();
		server.join();
	}

}
