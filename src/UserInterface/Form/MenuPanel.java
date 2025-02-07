package UserInterface.Form;

import UserInterface.CustomerControl.MyButton;
import UserInterface.Style;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {
    public  MyButton   
            btnHome       = new MyButton("Home");

    public MenuPanel(){
        customizeComponent();
    }

    private void customizeComponent() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(250, getHeight())); 

        try {
            Image logo = ImageIO.read(Style.URL_LOGO);
            logo = logo.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            add(new JLabel(new ImageIcon(logo)));
        } catch (IOException e) {
            Style.showMsgError("Error al cargar el logo");
        }

        add(btnHome);
        
        add(new JLabel(Style.NOMBRE));
    }
}
