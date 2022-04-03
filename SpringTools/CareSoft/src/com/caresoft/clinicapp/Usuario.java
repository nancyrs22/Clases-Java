package com.caresoft.clinicapp;

public class Usuario {
    protected Integer id;
    protected int pin;
    

    // Implementar un constructor que tome un ID
    public Usuario(Integer id,int pin)
    {	
    	this.id = id;
    	this.pin = pin;
    }
    // PARA HACER: Getters y Setters
    public int getId()
    {
    	return id;
    }
    public void setId(int id)
    {
    	this.id = id;
    }
    
    public int getPin()
    {
    	return pin;
    }
    public void setPin(int pin)
    {
    	this.pin = pin;
    }
    
}
