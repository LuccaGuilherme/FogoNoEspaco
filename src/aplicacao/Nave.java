package aplicacao;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Nave {
	private int x,y;
	private int dx,dy;
	private int altura, largura;
	private boolean isVisivel;
	
	
	
	private Image imagem;
	
	
	private List<Missel> misseis;
	
	
	public Nave() {
		ImageIcon referencia = new ImageIcon("res\\Nave1.gif");
		imagem = referencia.getImage();
		
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
		
		
		misseis = new ArrayList<Missel>();
		
		
		this.x = 472;
		this.y = 700;
		
	}
	
	public void mexer() {
		
		x += dx;
		y += dy;
		
		if(this.x < 4 ){
			x=4;
		}
		if(this.x >1030) {
			x=1030;
		}
		if(this.y < 12){
			y=12;
		}
		if(this.y > 700) {
			y=700;
		}
		
	}

	

	public List<Missel> getMisseis() {
		return misseis;
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
	
	public void atira() {
		this.misseis.add(new Missel(this.x + (largura/2)-36 , this.y - 63));
		
		
	}
	
	
	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y,largura,altura);
		
	}
	
	public void keyPressed(KeyEvent tecla) {
		
		int codigo = tecla.getKeyCode();
		
			if ( codigo == KeyEvent.VK_SPACE) {
				atira(); 
			}
			
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
