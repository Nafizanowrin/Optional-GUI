import javax.swing.*;
import java.awt.*;

public class Draw_Wow extends  JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //drawing the face
        g.setColor(Color.GRAY);
        g.fillOval(10, 10, 200, 220);


        //drawing the eyes
        g.setColor(Color.BLACK);
        g.fillOval(55, 55, 30, 50);
        g.fillOval(135, 55,30, 50);


        //drawing the mouth
        g.fillOval(75, 110, 65, 90);
        
        g.setColor(Color.PINK);
        g.fillOval(90, 125, 35, 60);

        g.setColor(Color.PINK);
        g.fillOval(63, 65, 15, 25);
        g.fillOval(142, 65, 15, 25);



    }
}