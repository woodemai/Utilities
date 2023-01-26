import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Утилиты для работы с JTable
 * Основано на работе Дмитрия Ивановича Соломатина (кафедра ПиИТ ФКН ВГУ)
 *
 * @author @author <a href="https://vk.com/woodemai">nikolay savchenko</a>
 * @see <a href="https://github.com/woodemai">GitHub</a>
 */
public class JTableUtils {

    /**
     * @param table       JTable
     * @param identifiers заголовки столбцов
     * @param cellSize    размер клетки (клетка квадратная)
     */
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

    /**
     * @param table    JTable
     * @param rowCount количество строк
     * @param colCount количество столбцов
     * @param cellSize размер клетки (клетка квадратная)
     */
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

    /**
     * @param table  JTable
     * @param matrix (double) матрица которую надо загрузить
     */
    public static void writeMatrixToJTable(JTable table, double[][] matrix) {
        if (!matrix.getClass().isArray()) {
            return;
        }
        if (!(table.getModel() instanceof DefaultTableModel tableModel)) {
            return;
        }
        tableModel.setRowCount(matrix.length);
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < 6; j++) {
                table.setValueAt(matrix[i][j], i, j);
            }
        }
    }

    /**
     * @param table  JTable
     * @param matrix (int) матрица которую надо загрузить
     */
    public static void writeMatrixToJTable(JTable table, int[][] matrix) {
        if (!matrix.getClass().isArray()) {
            return;
        }
        if (!(table.getModel() instanceof DefaultTableModel tableModel)) {
            return;
        }
        tableModel.setRowCount(matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                table.setValueAt(matrix[i][j], i, j);
            }
        }
    }

    /**
     * @param table  JTable
     * @param matrix (String) матрица которую надо загрузить
     */
    public static void writeMatrixToJTable(JTable table, String[][] matrix) {
        if (!matrix.getClass().isArray()) {
            return;
        }
        if (!(table.getModel() instanceof DefaultTableModel tableModel)) {
            return;
        }
        tableModel.setRowCount(matrix.length);
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < 6; j++) {
                table.setValueAt(matrix[i][j], i, j);
            }
        }
    }

    /**
     * @param table  JTable
     * @param matrix (boolean) матрица которую надо загрузить
     */
    public static void writeMatrixToJTable(JTable table, boolean[][] matrix) {
        if (!matrix.getClass().isArray()) {
            return;
        }
        if (!(table.getModel() instanceof DefaultTableModel tableModel)) {
            return;
        }
        tableModel.setRowCount(matrix.length);
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < 6; j++) {
                table.setValueAt(matrix[i][j], i, j);
            }
        }
    }

    /**
     * @param table  JTable
     * @param matrix (float) матрица которую надо загрузить
     */
    public static void writeMatrixToJTable(JTable table, float[][] matrix) {
        if (!matrix.getClass().isArray()) {
            return;
        }
        if (!(table.getModel() instanceof DefaultTableModel tableModel)) {
            return;
        }
        tableModel.setRowCount(matrix.length);
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < 6; j++) {
                table.setValueAt(matrix[i][j], i, j);
            }
        }
    }

    /**
     * @param table  JTable
     * @param matrix (Object) матрица которую надо загрузить
     */
    public static void writeMatrixToJTable(JTable table, Object[][] matrix) {
        if (!matrix.getClass().isArray()) {
            return;
        }
        if (!(table.getModel() instanceof DefaultTableModel tableModel)) {
            return;
        }
        tableModel.setRowCount(matrix.length);
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < 6; j++) {
                table.setValueAt(matrix[i][j], i, j);
            }
        }
    }
}
