package cursojava.executavel;

import javax.swing.JOptionPane;

public class OpcaoDeConfirmacao {
	public static void main (String [] args) {
		
		   String bikes = JOptionPane.showInputDialog("Informe a quantidade de bikes?");
		   String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
			
		   Double bikeNumero = Double.parseDouble(bikes);
		   Double pessoaNumero = Double.parseDouble(pessoas);
		   
		   int divisao = (int) (bikeNumero / pessoaNumero);
		   double resto = bikeNumero % pessoaNumero;
		   
		   int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
			if( resposta == 0) {
				JOptionPane.showMessageDialog(null, "A divisão para as pessoas deu..." + divisao);
			} 
			
			resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto desta divisão?");
			if (resposta ==0){
				JOptionPane.showMessageDialog(null, "O resto da divisão é de..." + resto);
				
			}
			}
	}


