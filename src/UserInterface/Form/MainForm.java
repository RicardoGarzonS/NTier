package UserInterface.Form;

import UserInterface.Style;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainForm extends JFrame{
    MenuPanel  pnlMenu = new MenuPanel();
    JPanel     pnlMain = new MainPanel();
 
    public MainForm(String tilteApp) {
        customizeComponent(tilteApp);
        pnlMenu.btnHome.addActionListener( e -> setPanel(new MainPanel()));
    }

    private void setPanel(JPanel formularioPanel) {
        Container container = getContentPane();
        container.remove(pnlMain);
        pnlMain = formularioPanel;
        container.add(pnlMain, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private void customizeComponent(String tilteApp) {
        setTitle(tilteApp);
        setSize(1000, 800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        container.add(pnlMenu, BorderLayout.WEST);
        container.add(pnlMain, BorderLayout.CENTER);
        setVisible(true);
    }   
}
