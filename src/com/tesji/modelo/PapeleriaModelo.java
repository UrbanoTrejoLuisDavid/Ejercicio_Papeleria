package com.tesji.modelo;

public class PapeleriaModelo {
	public int copias;
	
	
	
	public String totalCompra (){
		String pagoTotal = "";
		double pago = 0, op=0;;
		int resta =0;
		
		if (copias <= 50) {
			op = (copias * 0.30);
			pagoTotal = "Cantidad de Copias: " + copias + "\nTotal a pagar: $" + op;
		} else if (copias > 50 && copias <100 ) {
			resta = copias - 50;
			op = (resta * 0.20);
			pago = (50 * 0.30) + op;
			pagoTotal= "Cantidad de Copias: " + copias + "\nTotal a pagar: $" + pago;
		} else if (copias >100) { 
			resta = copias - 50;
			op = (resta * 0.10);
			pago = (50 * 0.30) + op;
			pagoTotal= "Cantidad de Copias: " + copias + "\nTotal a pagar: $" + pago;
		}
		return pagoTotal;
	}
}