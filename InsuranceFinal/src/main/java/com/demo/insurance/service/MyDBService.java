package com.demo.insurance.service;

import java.io.IOException;
import java.net.Socket;

import org.springframework.stereotype.Service;
@Service
public class MyDBService {
	
	
	 private static final String HOST = "localhost";
	    private static final int PORT = 8081;

	    public boolean isDatabaseUp() {
	        try (Socket socket = new Socket(HOST, PORT)) {
	            return true;
	        } catch (IOException e) {
	            return false;
	        }
	    }

}

