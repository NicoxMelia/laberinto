import java.awt.*;

public class Laberinto {

    private int fila = 0;
    private int columna = 0;
    private final int numeroFilas = 13;
    private final int numeroColumnas = 23;
    private final int ancho = 40;
    private final int alto = 40;
    public void paint(Graphics grafico){
        int[][] laberinto = getLaberinto();
        for(int i=0; i<numeroFilas; i++){
            for(int j=0; j<numeroColumnas; j++){
                if(laberinto[i][j] == 1){
                    grafico.setColor(Color.blue);
                    grafico.fillRect(j*40, i*40, ancho, alto);
                    grafico.setColor(Color.black);
                    grafico.drawRect(j*40, i*40, ancho, alto);
                }
            }
        }
    }

    public int[][] getLaberinto(){
        int laberinto[][] = {
                            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
                            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                            };

        return laberinto;
    }
}
