package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import terms.TermsAndConditions;

/**
 *
 * @author MuhammadHasnatRasool
 */
public class TableView extends javax.swing.JFrame {
TableRowSorter<DefaultTableModel> sorter;
static DefaultTableModel model;
    /**
     * Creates new form TableView
     */
    public TableView() {
        setTitle("TableView");
        setLocationRelativeTo(null);
        setLocation(250,100);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        model = new DefaultTableModel(new Object[]{"Subject", "Mcqs", "True/False", "OutputQ","ShortQ"},0);
        model.addRow(new Object[]{"Java","Yes","Yes","Yes","Yes"});
        model.addRow(new Object[]{"C++","Yes","Yes","Yes","Yes"});
        model.addRow(new Object[]{"C","Yes","Yes","No","Yes"});
        model.addRow(new Object[]{"JS","Yes","Yes","NO","Yes"});
        model.addRow(new Object[]{"Html","Yes","Yes","NO","Yes"});
        model.addRow(new Object[]{"C#","Yes","Yes","NO","Yes"});
        model.addRow(new Object[]{"Php","Yes","Yes","NO","Yes"});
        model.addRow(new Object[]{"Css","Yes","Yes","NO","Yes"});
        model.addRow(new Object[]{"Accounting","Yes","NO","Yes","Yes"});
        model.addRow(new Object[]{"Computer","Yes","Yes","NO","Yes"});
        model.addRow(new Object[]{"Computer2","Yes","Yes","NO","Yes"});
        model.addRow(new Object[]{"Computer3","Yes","Yes","NO","Yes"});
        model.addRow(new Object[]{"Computer4","Yes","Yes","NO","Yes"});
        model.addRow(new Object[]{"Computer5","Yes","Yes","NO","Yes"});
        model.addRow(new Object[]{"Earth","Yes","Yes","NO","Yes"});
        model.addRow(new Object[]{"Facts","Yes","Yes","NO","Yes"});
        model.addRow(new Object[]{"Geograpy","Yes","Yes","NO","NO"});
        model.addRow(new Object[]{"History","Yes","Yes","NO","NO"});
        model.addRow(new Object[]{"Human Body","Yes","Yes","NO","NO"});
        model.addRow(new Object[]{"Astrology","Yes","Yes","NO","NO"});
        model.addRow(new Object[]{"Biology","Yes","No","No","NO"});
        model.addRow(new Object[]{"Chemistry","Yes","No","No","NO"});
        model.addRow(new Object[]{"Physics","Yes","No","No","NO"});
        model.addRow(new Object[]{"Geology","Yes","No","No","NO"});
        model.addRow(new Object[]{"Engineering","Yes","No","No","NO"});
        model.addRow(new Object[]{"Mathematics","Yes","No","No","NO"});
        model.addRow(new Object[]{"Algorithms","Yes","No","No","NO"});
        model.addRow(new Object[]{"CyberSecurity","Yes","No","No","NO"});
        model.addRow(new Object[]{"DataBases","Yes","No","No","NO"});
        model.addRow(new Object[]{"DataStructures","Yes","No","No","NO"});
        model.addRow(new Object[]{"Ict","Yes","No","No","NO"});
        model.addRow(new Object[]{"SoftwareRequirement","Yes","No","No","NO"});
        model.addRow(new Object[]{"TheoryOfAutomata","Yes","No","No","NO"});
        model.addRow(new Object[]{"Algebra","Yes","No","No","NO"});
        model.addRow(new Object[]{"Calculus","Yes","No","No","NO"});
        model.addRow(new Object[]{"DiscreteMaths","Yes","No","No","NO"});
        model.addRow(new Object[]{"Graphs","Yes","No","No","NO"});
        model.addRow(new Object[]{"Logics","Yes","No","No","NO"});
        model.addRow(new Object[]{"Theorems","Yes","No","No","NO"});
        model.addRow(new Object[]{"ConstituionOfPakistan","Yes","No","No","NO"});
        model.addRow(new Object[]{"ForeignPolicy","Yes","No","No","NO"});
        model.addRow(new Object[]{"Pakistan","Yes","No","No","NO"});
        model.addRow(new Object[]{"WorldPolitics","Yes","No","No","NO"});
        model.addRow(new Object[]{"AdobeAcrobat","Yes","No","No","NO"});
//        model.addRow(new Object[]{"AdobePremiumPro","Yes","No","No","NO"});
        model.addRow(new Object[]{"CommandPrompt","Yes","No","No","NO"});
        model.addRow(new Object[]{"Git","Yes","No","No","NO"});
        model.addRow(new Object[]{"Ms Word","Yes","No","No","NO"});
        model.addRow(new Object[]{"Ms Excel","Yes","No","No","NO"});
        model.addRow(new Object[]{"Ms PowerPoint","Yes","No","No","NO"});
        model.addRow(new Object[]{"Ms Access","Yes","No","No","NO"});
//        model.addRow(new Object[]{"SharePoint","Yes","No","No","NO"});
//        model.addRow(new Object[]{"iMovie","Yes","No","No","NO"});
        model.addRow(new Object[]{"Amazon","Yes","No","No","NO"});
        model.addRow(new Object[]{"MongoDb","Yes","No","No","NO"});
        model.addRow(new Object[]{"MySQL","Yes","No","No","NO"});
        model.addRow(new Object[]{"OracleDB","Yes","No","No","NO"});
        model.addRow(new Object[]{"PostgreSQl","Yes","No","No","NO"});
        model.addRow(new Object[]{"SQLServer","Yes","No","No","NO"});
        model.addRow(new Object[]{"SQLite","Yes","No","No","NO"});
        model.addRow(new Object[]{"AI","Yes","No","No","NO"});
        model.addRow(new Object[]{"GUI","Yes","No","No","NO"});
        model.addRow(new Object[]{"GoogleAds","Yes","No","No","NO"});
//        model.addRow(new Object[]{"GoogleAnalytics","Yes","No","No","NO"});
//        model.addRow(new Object[]{"GoogleCloud","Yes","No","No","NO"});
        model.addRow(new Object[]{"Linux","Yes","No","No","NO"});
        model.addRow(new Object[]{"Windows","Yes","No","No","NO"});
        model.addRow(new Object[]{"MacOS","Yes","No","No","NO"});
        model.addRow(new Object[]{"NoSQL","Yes","No","No","NO"});
        model.addRow(new Object[]{"SEO","Yes","No","No","NO"});
        model.addRow(new Object[]{"Angular","Yes","No","No","NO"});
        model.addRow(new Object[]{"Django","Yes","No","No","NO"});
        model.addRow(new Object[]{"Flask","Yes","No","No","NO"});
        model.addRow(new Object[]{"Hibernate","Yes","No","No","NO"});
        model.addRow(new Object[]{"React","Yes","No","No","NO"});
//        model.addRow(new Object[]{"SQLAlchemy","Yes","No","No","NO"});
        model.addRow(new Object[]{"SpringBoot","Yes","No","No","NO"});
        model.addRow(new Object[]{"TensorFlow","Yes","No","No","NO"});
//        model.addRow(new Object[]{"dotnet","Yes","No","No","NO"});
        model.addRow(new Object[]{"Chart.js","Yes","No","No","NO"});
        model.addRow(new Object[]{"Moment.js","Yes","No","No","NO"});
        model.addRow(new Object[]{"Numpy","Yes","No","No","NO"});
        model.addRow(new Object[]{"Pandas","Yes","No","No","NO"});
        model.addRow(new Object[]{"Redux","Yes","No","No","NO"});
        model.addRow(new Object[]{"Requests","Yes","No","No","NO"});
        model.addRow(new Object[]{"Swing","Yes","No","No","NO"});
        model.addRow(new Object[]{"Tkinter","Yes","No","No","NO"});
        model.addRow(new Object[]{"Cargo","Yes","No","No","NO"});
        model.addRow(new Object[]{"Composer","Yes","No","No","NO"});
        model.addRow(new Object[]{"Gradle","Yes","No","No","NO"});
        model.addRow(new Object[]{"Homebrew","Yes","No","No","NO"});
        model.addRow(new Object[]{"Maven","Yes","No","No","NO"});
        model.addRow(new Object[]{"npm","Yes","No","No","NO"});
        model.addRow(new Object[]{"Nu-Get","Yes","No","No","NO"});
        model.addRow(new Object[]{"pip","Yes","No","No","NO"});
        model.addRow(new Object[]{"RubyGems","Yes","No","No","NO"});
        sorter = new TableRowSorter<>(model);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(model);
        jTable1.setRowSorter(sorter);
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setAutoscrolls(false);
        jTextField1.setVerifyInputWhenFocusTarget(false);
        jTextField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jTextField1.getText();
                if (text.isEmpty()) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter(text));
                }
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        jLabel1.setText("Search");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/backbutton.png"))); // NOI18N
        jButton1.setText("Back To Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
//        int column = jTable1.columnAtPoint(evt.getPoint());
        int row = jTable1.rowAtPoint(evt.getPoint());
        String selectedValue = (String) jTable1.getValueAt(row, 0);
        TermsAndConditions.getInstance(selectedValue).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       Menu.getInstance().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TableView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
