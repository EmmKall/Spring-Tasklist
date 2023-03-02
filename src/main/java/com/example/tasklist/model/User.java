package com.example.tasklist.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document( collection = "users" )
public class User
{

	@Id
	private String id;
	private String nombre;
	private String email;
	private String token;
	private String user;
	
	public User()
	{
		super();
	}

	public User(String id)
	{
		super();
		this.id = id;
	}
	
	public User(String nombre, String email, String token, String user)
	{
		super();
		this.nombre = nombre;
		this.email = email;
		this.token = token;
		this.user = user;
	}
	
	public User(String id, String nombre, String email, String token, String user)
	{
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.token = token;
		this.user = user;
	}

	public String getId()
	{
		return this.id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getToken()
	{
		return this.token;
	}
	
	public void setToken(String token)
	{
		this.token = token;
	}
	
	public String getUser()
	{
		return this.user;
	}
	
	public void setUser(String user)
	{
		this.user = user;
	}
	
	
	
}
