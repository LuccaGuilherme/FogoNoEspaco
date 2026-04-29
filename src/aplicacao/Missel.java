package aplicacao;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Missel {
	
	private Image imagem ;
	private int x,y;
	private boolean isVisivel;
	
	private static final int LARGURA_TELA = 1200 ;
	private static final int VELOCIDADE = 2;
	
	public Missel(int x, int y){
		this.x=x;
		this.y=y;
		
		ImageIcon referencia = new ImageIcon("res\\Missel.gif");
		imagem = referencia.getImage();
		
		isVisivel = true;
		
	}
		public void mexer(){
			this.x += VELOCIDADE;
			if(this.x > LARGURA_TELA) {
				isVisivel = false;
			}
		}
			
	
	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public Image getImagem() {
		return imagem;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	

}
