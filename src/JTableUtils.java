import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JTableUtils {

    public static void setTable(JTable table, String[] identifiers, int cellSize) {
        table.setRowHeight(cellSize);
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnCount(identifiers.length);
        model.setColumnIdentifiers(identifiers);
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(cellSize);
        }
        table.setModel(model);
    }
    public static void setTable(JTable table, int rowCount, int colCount, int cellSize) {
        table.setRowHeight(cellSize);
        DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(rowCount);
        model.setColumnCount(colCount);
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(cellSize);
        }
        table.setModel(model);
    }
}
