package UserInterface.CustomerControl;

import UserInterface.Style;
import java.awt.*;
import javax.swing.*;

public class MyLabelText extends JPanel{
    private MyLabel    lblEtiqueta = new MyLabel();
    private MyTextBox  txtContenido= new MyTextBox();

    public MyLabelText(String etiqueta) {
        setLayout(new BorderLayout());

        lblEtiqueta.setCustomizeComponent(  etiqueta, 
                                            Style.FONT_SMALL, 
                                            Style.COLOR_FONT, 
                                            Style.ALIGNMENT_LEFT);
        txtContenido.setBorderLine();
        add(lblEtiqueta, BorderLayout.NORTH);
        add(txtContenido, BorderLayout.CENTER);
    }
}
