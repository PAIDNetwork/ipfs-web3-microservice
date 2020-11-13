package com.ipfs.jsonrpc.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		IPFSController ctrl = new IPFSController();
		ctrl.init();
		SpringApplication.run(ClientApplication.class, args);
	}

}
