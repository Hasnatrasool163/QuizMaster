package utilities;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

public class MyCellRenderer extends DefaultTreeCellRenderer {
   public MyCellRenderer() {
   }

   @Override
   public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
      Component component = super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
      if (component instanceof JLabel label) {
         label.setForeground(Color.WHITE);
         label.setBackground(Color.YELLOW);
      }

      return component;
   }
}
