package com.co.alura.challenge.models;

import javax.swing.JOptionPane;


public class Home {
 
    
    public static void main (String[] args) {

      Conversor monedas = new Conversor();
      Conversor temperatura = new Conversor();
            
        while(true) {
        	
         String opciones = (JOptionPane.showInputDialog(null, "Seleccione un Conversor: ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();

            switch(opciones) {
        	case "Conversor de Moneda":
        		 String entrada = JOptionPane.showInputDialog("Ingresa la cantidad  que deseas convertir: ");
                 if(validarNumero(entrada)) {
                     double aConvertir = Double.parseDouble(entrada);
                     monedas.ConvertirMonedas(aConvertir);

                     int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                     if (JOptionPane.OK_OPTION == respuesta){
                     	System.out.println("Selecciona opción Afirmativa");
                     }else{
                        	JOptionPane.showMessageDialog(null, "Programa terminado");                         
                     }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");                
                    }
                     	break;

        	
            
        	 case "Conversor de Temperatura":
        	 entrada = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
             if(validarNumero(entrada) == true) {
                 double temp = Double.parseDouble(entrada);
                 temperatura.ConvertirTemperatura(temp);

                 int respuesta = 0;
                 respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                 if((respuesta == 0) && (validarNumero(entrada) == true)) { 
                 } else {
                     JOptionPane.showMessageDialog(null, "Programa terminado");                     
                 }

             } else {
                 JOptionPane.showMessageDialog(null, "Valor inválido");                
             }
             break;
        }                
    }
               
  }
    public static boolean validarNumero(String entrada) {
        try {
            double x = Double.parseDouble(entrada);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}