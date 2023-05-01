import java.awt.*;
import java.awt.event.KeyEvent;

public class Personaje {
    Laberinto lab = new Laberinto();
    private int x=40;
    private int y=40;
    private final int ancho = 40;
    private final int alto = 40;
    private final int movimiento = 40;

    public void paint(Graphics grafico){
        grafico.setColor(Color.red);
        grafico.fillOval(x,y,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(x,y,ancho,alto);
    }

    public void teclaPresionada(KeyEvent event){
        int laberinto[][] = lab.getLaberinto();
        if(event.getKeyCode() == 37){//left
            if(laberinto[y/40][(x/40)-1] != 1){
                x -= movimiento;
            }
        }

        if(event.getKeyCode() == 39){//right
            if(laberinto[y/40][(x/40)+1] != 1){
                x += movimiento;
            }
        }

        if(event.getKeyCode() == 40){//down
            if(laberinto[(y/40)+1][x/40] != 1){
                y += movimiento;
            }
        }

        if(event.getKeyCode() == 38){//up
            if(laberinto[(y/40)-1][x/40] != 1){
                y -= movimiento;
            }
        }
    }
}
