package xmlWrite;

import javax.swing.*;
import java.awt.*;

public class XMLWriteTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new XMLWriteFrame();
                frame.setTitle("XMLWriteTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
