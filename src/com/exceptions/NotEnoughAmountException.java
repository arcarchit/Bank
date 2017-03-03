package com.exceptions;

public class NotEnoughAmountException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public NotEnoughAmountException(){}

	public NotEnoughAmountException(String message){
		super(message);
	}
	
}
