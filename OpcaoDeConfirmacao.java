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
		   
		   int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
			if( resposta == 0) {
				JOptionPane.showMessageDialog(null, "A divis�o para as pessoas deu..." + divisao);
			} 
			
			resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto desta divis�o?");
			if (resposta ==0){
				JOptionPane.showMessageDialog(null, "O resto da divis�o � de..." + resto);
				
			}
			}
	}


