package com.example.sri.payload.response;

public class MessageResponse {
	private Long id;
	private String message;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MessageResponse(Long id, String message) {
		this.id = id;
		this.message = message;
	}

	public MessageResponse(String message) {
	    this.message = message;
	  }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
