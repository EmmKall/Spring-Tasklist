package com.example.tasklist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.tasklist.model.User;
import com.example.tasklist.repository.UserRepository;

@Service
public class USerService
{
	@Autowired
	UserRepository repository;
	
	//GetAll Users
	public List< User > getAllUser()
	{
		List< User > data = null;
		try
		{
			data = this.repository.findAll();
			return data;
		} catch( Exception e )
		{
			System.out.println( "ERROR: " + e.getMessage() );
			return null;
		}
	}
	
	//Find User By Id
	public User findById( User user )
	{
		User data = null;
		try
		{
			data = this.repository.findById( user.getId() ).get();
			return data;
		} catch( Exception error )
		{
			System.out.println( "ERROR: " + error.getMessage() );
			return null;
		}
	}
	
	//Insert User
	public User insertUser( User user )
	{
		try
		{
			User data = this.repository.save( user );
			return data;
		} catch( Exception error )
		{
			System.out.println( "ERROR: " + error.getMessage() );
			return null;
		}
	}
	
	//Update User
	public User updateUser( User user )
	{
		try
		{
			User data = this.repository.save( user );
			return data;
		} catch( Exception error )
		{
			System.out.println( "ERROR: " + error.getMessage() );
			return null;
		}
	}
	
	//Eliminar usuario
	public boolean deleteByIdUser( User user )
	{
		boolean res = false;
		try
		{
			this.repository.deleteById( user.getId() );
			res = true;
		} catch( Exception error )
		{
			System.out.println( error.getMessage() );
		}
		return res;
	}
	
}
