package aplicacao;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Missel {
	
    private Image imagem;
    private int x, y;
    private int largura, altura; 
    private boolean isVisivel;
	
    private static final int VELOCIDADE = 2;
	
    public Missel(int x, int y){
        this.x = x;
        this.y = y;
		
        ImageIcon referencia = new ImageIcon("res\\Missel.gif");
        imagem = referencia.getImage();
        
       
        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);
		
        isVisivel = true;
    }

    public void mexer(){
        this.y -= VELOCIDADE; 
        
        
        if(this.y < 0) {
            isVisivel = false;
        }
    }

    public Rectangle getBounds() {
        
        return new Rectangle(x, y, largura, altura);
    }
	
   
    public boolean isVisivel() { return isVisivel; }
    public void setVisivel(boolean isVisivel) { this.isVisivel = isVisivel; }
    public Image getImagem() { return imagem; }
    public int getX() { return x; }
    public int getY() { return y; }
}