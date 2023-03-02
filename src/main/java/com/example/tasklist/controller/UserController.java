package com.example.tasklist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.tasklist.helpers.ResponseContent;
import com.example.tasklist.model.User;
import com.example.tasklist.service.USerService;

@RestController
@RequestMapping( "/user" )
public class UserController
{

	@Autowired
	private USerService userService;
	
	@GetMapping( "/test" )
	public String test()
	{
		return "Funciona";
	}
	
	@GetMapping( "/getall" )
	public ResponseEntity<?> gettAllUser()
	{
		List< User > data = this.userService.getAllUser();
		if( data == null )
		{
			ResponseContent response = new ResponseContent( 501, "Error to proccess petition" );
			return new ResponseEntity< ResponseContent >( response, HttpStatus.INTERNAL_SERVER_ERROR );
		}
		return new ResponseEntity< List< User > >( data, HttpStatus.OK );
	}
	
	@GetMapping( "find/{id}" )
	public ResponseEntity<?> findUser( @PathVariable String id )
	{
		User user = new User();
		user.setId( id );
		User data = this.userService.findById( user );
		if( data == null )
		{
			ResponseContent response = new ResponseContent( 501, "Error to save item" );
			return new ResponseEntity< ResponseContent >( response, HttpStatus.INTERNAL_SERVER_ERROR );
		}
		return new ResponseEntity< User >( data, HttpStatus.OK );
	}
	
	@PostMapping( "/insert" )
	public ResponseEntity<?> insertUser( @RequestBody User user )
	{
		User data = this.userService.insertUser( user );
		if( data == null )
		{
			ResponseContent response = new ResponseContent( 501, "Error to save item" );
			return new ResponseEntity< ResponseContent >( response, HttpStatus.INTERNAL_SERVER_ERROR );
		}
		return new ResponseEntity< User >( data, HttpStatus.CREATED );
	}
	
	@PutMapping( "/update" )
	public ResponseEntity<?> updateUser( @RequestBody User user )
	{
		User data = this.userService.updateUser( user );
		if( data == null )
		{
			ResponseContent response = new ResponseContent( 501, "Error to update item" );
			return new ResponseEntity< ResponseContent >( response, HttpStatus.INTERNAL_SERVER_ERROR );
		}
		return new ResponseEntity< User >( user, HttpStatus.OK );
	}
	
	@DeleteMapping( "/delete/{id}" )
	public ResponseEntity<?> deleteUser( @PathVariable String id )
	{
		User user = new User( id );
		boolean data = this.userService.deleteByIdUser( user );
		if( data == false )
		{
			ResponseContent response = new ResponseContent( 501, "Error to delete item" );
			return new ResponseEntity< ResponseContent >( response, HttpStatus.INTERNAL_SERVER_ERROR );
		}
		ResponseContent response = new ResponseContent( 200, "Item deleted successfully" );
		return new ResponseEntity< ResponseContent >( response, HttpStatus.OK );
		
	}
}
