package UserInterface.CustomerControl;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import UserInterface.Style;
import java.text.ListFormat;

public class MyTable extends JPanel {
    JTable table;
    public MyTable(String[] header, Object[][] data){
        try {
            showTable(header, data);
        } catch (Exception e) {
            Style.showMsgError("Error al cargar datos");
        }
    }

    private void showTable(String[] header, Object[][] data) throws Exception {
        removeAll();
        table = new JTable(data, header);
        table.setShowHorizontalLines(true);
        table.setGridColor(Style.COLOR_BORDER);
        table.setRowSelectionAllowed(true);
        table.setColumnSelectionAllowed(false);

        table.setPreferredScrollableViewportSize(new Dimension(650, 200));
        table.setFillsViewportHeight(true);

        add(new JScrollPane(table));
    }
}
