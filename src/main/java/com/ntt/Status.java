package com.ntt;

public class Status {
	
	final String  open = "open";
	final String  close = "close";
	final String  pause = "pause";

	Long cont;
	Long contador;
	String status;
	
	public Status(Long cont)
	{
		this.cont = cont;
		contador = 0L;
		this.status = "close";
	}
	
	
	public String executeCircuit(String newstatus)
	{
		
		if (contador>=cont) {
			status = open;
			return status;
		}
		
		if (newstatus.equals(close)) {
			status = close;
		}
		
		if (newstatus.equals(pause)) {
			status = pause;
		}
		
		
		if (newstatus.equals(open)) {
			status = open;
		}
		
		
		contador++;
		return status;
		
	}
	
	
}
