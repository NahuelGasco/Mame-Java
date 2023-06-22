
package FrogPantallas;

import MamePantallas.MameFrame;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class DeadFrog extends JPanel implements MouseListener{
 
    private ImageIcon fondo = new ImageIcon(getClass().getResource("/FrogAssets/frogger_arcade.PNG"));
    private ImageIcon replayBoton = new ImageIcon(getClass().getResource("/FrogAssets/Green_buttons.jpg"));
    private ImageIcon salirBoton = new ImageIcon(getClass().getResource("/FrogAssets/Red_buttons.jpg"));
    private ImageIcon derrotaImg = new ImageIcon(getClass().getResource("/FrogAssets/defeat-buttons.png"));
    private int alto = 930;
    private int ancho = 560;
    private MameFrame frame;

    public DeadFrog(MameFrame frame) {
        this.setVisible(false);
        this.frame = (MameFrame) frame;
        this.setPreferredSize(new Dimension(930, 560));
        this.setLocation(300, 200);
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics grafico) {
        //super.paintComponent(grafico);
        grafico.drawImage(fondo.getImage(), 0, 0, alto, ancho, null);
        grafico.drawImage(replayBoton.getImage(), 50, 220, 200, 40, null);
        grafico.drawImage(salirBoton.getImage(), 50, 280, 200, 40, null);
        grafico.drawImage(derrotaImg.getImage(), 400, 40, 200, 40, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
         Point p = e.getPoint();
         if (p.x > 50 && p.x < 250
             && p.y > 220 && p.y < 260){
            frame.replayJuegoFrog();
         } else if (p.x > 50 && p.x < 250
             && p.y > 280 && p.y < 320) {
            frame.onExitFrog();
         }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
