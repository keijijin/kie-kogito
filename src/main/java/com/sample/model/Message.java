package com.sample.model;

import org.kie.api.definition.type.ClassReactive;

@ClassReactive
public class Message {

    public static final int HELLO = 0;
    public static final int GOODBYE = 1;

    private String message;
	private int status;
	
	public Message() {
	}	

	public Message(String message, int status) {
		this.message = message;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Message [message=" + message + ", status=" + status + "]";
	}
    
}