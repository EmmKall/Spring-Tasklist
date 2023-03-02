package com.example.tasklist.helpers;

public class ResponseContent
{
	private int status;
	private String message;
	
	public ResponseContent()
	{
		super();
	}

	public ResponseContent(int status, String message)
	{
		super();
		this.status = status;
		this.message = message;
	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)	
	{
		this.message = message;
	}
	
	
}
