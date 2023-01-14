import javax.swing.JFrame;

public class DrawRainbowUltaTest
{
    public static void main(String[] args)
    {
        DrawRainbowUlta panel = new DrawRainbowUlta();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);

    }

}    