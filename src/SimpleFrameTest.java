import javax.swing.*;
import java.awt.*;


public class SimpleFrameTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFrame frame  = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Programm");
                frame.setVisible(true);


            }
        });
    }
}
