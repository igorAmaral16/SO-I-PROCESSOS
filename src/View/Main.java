package View;

import javax.swing.JOptionPane;
import Controller.RedesController;

public class Main {
	
    public static void main(String[] args) {
    	
        RedesController rController = new RedesController();
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
            		"1 -Mostrar Adaptadores com IPv4\n\n"+
                    "2 - M�dia de ping google\n\n"+
                    "3 - Sair"));
            switch(op) {
                case 1:
                    rController.ip();
                break;
                
                case 2:
                    rController.ping();
                break;
                
                case 3:
                    JOptionPane.showMessageDialog(null, "Finalizando.");break;
            }
        } while(op != 3);
    }
}