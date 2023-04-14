package com.co.alura.challenge.models;

import javax.swing.JOptionPane;


public class Conversor {
 
    ConvertirMoneda monedas = new ConvertirMoneda();
    ConvertirTemperatura temperatura = new ConvertirTemperatura();
    
    public void ConvertirMonedas(double aConvertir) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir: ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"Pesos a Dolar", "Pesos a Euro", "Pesos a Libras","Pesos a Yen","Pesos a Won Coreano","Dolar a Pesos", "Euro a Pesos", "Libras a Pesos","Yen a Pesos","Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
    
    switch(opcion) {
        case "Pesos a Dolar":
        	monedas.convertirADolares(aConvertir);
        	break;
        case "Pesos a Euro":
        	monedas.ConvertirAEuros(aConvertir);
        	break;
        case "Pesos a Libras":
        	monedas.ConvertirALibras(aConvertir);
        	break;
        case "Pesos a Yen":
        	monedas.ConvertirAYen(aConvertir);
        	break;
        case "Pesos a Won Coreano":
        	monedas.ConvertirAWon(aConvertir);
        	break;    	    	                          
        case "Dolar a Pesos":
        	monedas.convertirDolares(aConvertir);
        	break;
        case "Euro a Pesos":
        	monedas.convertirEuros(aConvertir);
        	break;
        case "Libras a Pesos":
        	monedas.convertirLibras(aConvertir);
        	break;
        case "Yen a Pesos":
        	monedas.convertirYen(aConvertir);
        	break;
        case "Won Coreano a Pesos":
            monedas.convertirWon(aConvertir);
            break;
        }      
    } 
    
    public void ConvertirTemperatura(double temp) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(opcion) {
        case "Grados Celcius a Grados Farenheit":
        	temperatura.convertirCelciusAFarenheit(temp);
        	break;
        case "Grados Celcius a Kelvin":
            temperatura.convertirCelciusAKelvin(temp);
            break;
        case "Grados Farenheit a Grados Celcius":
           temperatura.convertirFarenheitACelcius(temp);
           break;
        case "Kelvin a Grados Celcius":
           temperatura.convertirKelvinACelcius(temp);
           break;
        case "Kelvin a Grados Farenheit":
        	temperatura.convertirKelvinAFarenheit(temp);
        	break;
        }
	}
    
    
        
    }
   
        
 

    
    
            
       
    
    
    

