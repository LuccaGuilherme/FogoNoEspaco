package aplicacao;
import javax.swing.JFrame;

public class ContainerDeJanela extends JFrame {
	     public ContainerDeJanela(){
	    	 
	    	 
	    	 add(new Fase());
	    	 setTitle("Fogo no Espaço");
	    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	 setSize(1200,896);
	    	 setLocationRelativeTo(null);
	    	 setResizable(false);
	    	 setVisible(true);
	    	 
	}
	     public static void main(String[] args) {
	    	 	new ContainerDeJanela();
		}
		
}
