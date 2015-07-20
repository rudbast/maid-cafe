package cafe.tool;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Types;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @ref : http://technojeeves.com/index.php/22-resultset-to-tablemodel
 */
public class DbUtils {
    public static TableModel resultSetToTableModel(ResultSet rs) {
        try {
            final ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();

            // Get the column names
            for (int column = 0; column < numberOfColumns; column++) {
                columnNames.addElement(metaData.getColumnLabel(column + 1));
            }

            // Get all rows.
            Vector rows = new Vector();

            while (rs.next()) {
                Vector newRow = new Vector();

                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                rows.addElement(newRow);
            }

            return new DefaultTableModel(rows, columnNames){
                @Override
                public Class<?> getColumnClass(int column) {
                    int type;
                    try {
                        type = metaData.getColumnType(column + 1);
                    } catch (Exception e) {
                        return super.getColumnClass(column);
                    }

                    switch (type) {
                        case Types.CHAR:
                        case Types.VARCHAR:
                        case Types.LONGVARCHAR:
                            return String.class;

                        case Types.BIT:
                            return Boolean.class;

                        case Types.TINYINT:
                        case Types.SMALLINT:
                        case Types.INTEGER:
                            return Integer.class;

                        case Types.BIGINT:
                            return Long.class;

                        case Types.FLOAT:
                        case Types.DOUBLE:
                            return Double.class;

                        case Types.DATE:
                            return java.sql.Date.class;

                        default:
                            return Object.class;
                    }
                }
                
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}