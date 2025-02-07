package UserInterface.CustomerControl;

import UserInterface.Style;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class MyLabel extends JLabel{
    public MyLabel(){
        customizeComponent();
    }
    public MyLabel(String text){
        setText(text);
        customizeComponent();
    }
    private void customizeComponent(){
        setCustomizeComponent(getText(), Style.FONT, Style.COLOR_FONT, Style.ALIGNMENT_LEFT);
    }
    public void setCustomizeComponent(String text, Font  font, Color color, int alignment) {
        setText(text);
        setFont(font);
        setOpaque(false);
        setBackground(null);
        setForeground(color);
        setHorizontalAlignment(alignment);
    }
}