package cursojava.executavel;

import javax.swing.JOptionPane;

public class EntradaDeDados {
	
		public static void main (String [] args) {
			
	   String bikes = JOptionPane.showInputDialog("Informe a quantidade de bikes?");
	   String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
		
	   Double bikeNumero = Double.parseDouble(bikes);
	   Double pessoaNumero = Double.parseDouble(pessoas);
	   
	   int divisao = (int) (bikeNumero / pessoaNumero);
	   double resto = bikeNumero % pessoaNumero;
	   
	   JOptionPane.showMessageDialog(null,"Resultado de " + divisao + " bikes para " + pessoaNumero + " pessoas e resto da divisão " + resto);
		
		}
}




