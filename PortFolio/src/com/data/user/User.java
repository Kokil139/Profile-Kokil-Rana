package com.data.user;

import org.springframework.stereotype.Service;

@Service
public class User {
	public String welcomeMessage(){
		return "Welcome to Kokil's Profile";
}

	public Object welcomeAgainMessage() {
		// TODO Auto-generated method stub
		return "Welcome Again to Kokil's Profile";
	}

}