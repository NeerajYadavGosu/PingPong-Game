import java.awt.* ;
import java.awt.event.* ;
import java.util.* ;
import javax.swing.*;
public class GameFrame extends JFrame{
    GamePanel panel  ;
    public GameFrame() {
        panel = new GamePanel() ;
        this.add(panel) ;
        this.setTitle("Pong Game") ;
        this.setResizable(false) ;
        this.setBackground(Color.black) ;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack(); // this causes the window to pack the
        //game panel that we created , so we dont need to set the
        //size separetely
        this.setVisible(true) ;
        this.setLocationRelativeTo(null);



    }
}
