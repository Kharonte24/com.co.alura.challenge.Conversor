
package com.co.alura.challenge.models;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
    
    
    public void convertirDolares(double valor) {
	double monedaDolar = valor * 4415.18;
	monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Colombianos");
    }
	
    public void convertirEuros(double valor) {
	double monedaEuro = valor * 4878.33;
	monedaEuro = (double) Math.round(monedaEuro *100d)/100;
	JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Colombianos");
    }
	
    public void convertirLibras(double valor) {
	double monedaLibra = valor * 5530.97;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Colombianos");
    }
	
    public void convertirYen(double valor) {
	double monedaYen = valor * 33.26;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Colombianos");
    }
	
    public void convertirWon(double valor) {
	double monedaWon = valor * 3.39;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Colombianos");
    }
    
    public void convertirADolares(double valor) {
		double monedaDolar = valor / 4415.18;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void ConvertirAEuros(double valor) {
		double monedaEuro = valor / 4878.33;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	
	public void ConvertirALibras(double valor) {
		double monedaLibra = valor / 5530.97;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
	}
	
	public void ConvertirAYen(double valor) {
		double monedaYen = valor / 33.26;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
	}
	
	public void ConvertirAWon(double valor) {
		double monedaWon = valor / 3.39;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
	}
    
}
