import javax.swing.*;
import java.awt.*;

public class wow{
    public static void main(String[] args){
        Draw_Wow wow = new Draw_Wow();

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(wow);
        frame.setSize(240, 300);
        frame.setTitle("Wow Face");
        frame.setLocationRelativeTo(null);

        wow.setBackground(Color.BLUE);

        frame.setVisible(true);
    }
}