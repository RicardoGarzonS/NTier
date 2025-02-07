package UserInterface.CustomerControl;

import UserInterface.Style;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

public class MyButton  extends JButton implements MouseListener {
    public MyButton(String text){
        customizeComponent(text);
    }
    public void customizeComponent(String text) {
        setText(text);
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setForeground(Style.COLOR_FONT);
        setBackground(Style.COLOR_BACKGROUND);
        setHorizontalAlignment(Style.ALIGNMENT_LEFT);
        setFont(Style.FONT);
        
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setForeground(Color.BLACK);
        setCursor(Style.CURSOR_HAND);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setForeground(Color.GRAY);
        setCursor(Style.CURSOR_DEFAULT);
    }
}
