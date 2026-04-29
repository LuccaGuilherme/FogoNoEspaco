package aplicacao;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Nave {
	private int x,y;
	private int dx,dy;
	private Image imagem;
	
	
	public Nave() {
		ImageIcon referencia = new ImageIcon("res\\Nave1.gif");
		imagem = referencia.getImage();
		
		this.x = 472;
		this.y = 700;
		
	}
	
	public void mexer() {
		
		x += dx;
		y += dy;
		
		if(this.x < 4 ){
			x=4;
		}
		if(this.x >924) {
			x=924;
		}
		if(this.y < 12){
			y=12;
		}
		if(this.y > 700) {
			y=700;
		}
		
	}


	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Image getImagem() {
		return imagem;
	}
	
	public void keyPressed(KeyEvent tecla) {
		
		int codigo = tecla.getKeyCode();
		    if( codigo == KeyEvent.VK_UP) {
			      dy = -4;
		    }
		    if(codigo == KeyEvent.VK_DOWN) {
		    	  dy = 4;
		    }
		    
		    if( codigo == KeyEvent.VK_LEFT) {
		    	dx = -4;
		    }
		    if(codigo == KeyEvent.VK_RIGHT) {
		    	dx = 4;
		    }
		
	}
			public void keyRelease(KeyEvent tecla) {
				int codigo = tecla.getKeyCode();
				
				if( codigo == KeyEvent.VK_UP) {
				      dy = 0;
			    }
			    if(codigo == KeyEvent.VK_DOWN) {
			    	  dy = 0;
			    }
			    
			    if( codigo == KeyEvent.VK_LEFT) {
			    	dx = 0;
			    }
			    if(codigo == KeyEvent.VK_RIGHT) {
			    	dx = 0;
			    }
			}
		
	
}
