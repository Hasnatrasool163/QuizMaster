package frame;
import javax.swing.RowFilter;
import CodingTasks.ArrayBestTimeToBuyAndSellStockTask;
import CodingTasks.ArrayBinarySearchTask;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import CodingTasks.ArrayCheckElementTask;
import CodingTasks.ArrayCheckSymmetricTask;
import CodingTasks.ArrayClimbingStairsTask;
import CodingTasks.ArrayCoinChangeTask;
import CodingTasks.ArrayCombinationSumIVTask;
import CodingTasks.ArrayCombinationSumTask;
import CodingTasks.ArrayContiguousArrayTask;
import CodingTasks.ArrayCountElementTask;
import CodingTasks.ArrayCountOccurrencesTask;
import CodingTasks.ArrayDecodeWaysTask;
import CodingTasks.ArrayFindDuplicatesIITask;
import CodingTasks.ArrayFindDuplicatesTask;
import CodingTasks.ArrayFindFirstDuplicateTask;
import CodingTasks.ArrayFindFirstLastPositionTask;
import CodingTasks.ArrayFindFirstRepeatingCharacterTask;
import CodingTasks.ArrayFindIndexTask;
import CodingTasks.ArrayFindKthLargestElementTask;
import CodingTasks.ArrayFindLastNonRepeatingCharacterTask;
import CodingTasks.ArrayFindLastRepeatingCharacterTask;
import CodingTasks.ArrayFindLongestPathTask;
import CodingTasks.ArrayFindMaxGapTask;
import CodingTasks.ArrayFindMaxInRowTask;
import CodingTasks.ArrayFindMaxTask;
import CodingTasks.ArrayFindMedianTask;
import CodingTasks.ArrayFindMinGapTask;
import CodingTasks.ArrayFindMinInColumnTask;
import CodingTasks.ArrayFindMinTask;
import CodingTasks.ArrayFindMissingNumberTask;
import CodingTasks.ArrayFindMissingRangesTask;
import CodingTasks.ArrayFindModeTask;
import CodingTasks.ArrayFindOptimalSplitTask;
import CodingTasks.ArrayFindPairsWithGivenSumTask;
import CodingTasks.ArrayFindPeakElementTask;
import CodingTasks.ArrayFindSecondMaxTask;
import CodingTasks.ArrayFindSecondMinTask;
import CodingTasks.ArrayFindShortestPathTask;
import CodingTasks.ArrayFindSingleNumberTask;
import CodingTasks.ArrayFloodFillTask;
import CodingTasks.ArrayFourSumTask;
import CodingTasks.ArrayIntersectionTask;
import CodingTasks.ArrayLargestRectangleHistogramTask;
import CodingTasks.ArrayListAverageTask;
import CodingTasks.ArrayListIntersectionTask;
import CodingTasks.ArrayLongestCommonSubsequenceTask;
import CodingTasks.ArrayLongestConsecutiveSequenceTask;
import CodingTasks.ArrayLongestIncreasingSubsequenceTask;
import CodingTasks.ArrayLongestPalindromeTask;
import CodingTasks.ArrayMajorityElementTask;
import CodingTasks.ArrayMergeTask;
import CodingTasks.ArrayMinimumPathSumTask;
import CodingTasks.ArrayMoveZeroesTask;
import CodingTasks.ArrayNextPermutationTask;
import CodingTasks.ArrayPermutationsTask;
import CodingTasks.ArrayProductExceptSelfTask;
import CodingTasks.ArrayRemoveDuplicatesTask;
import CodingTasks.ArrayRemoveElementTask;
import CodingTasks.ArrayRemoveNthElementTask;
import CodingTasks.ArrayReverseTask;
import CodingTasks.ArrayRotateImageTask;
import CodingTasks.ArrayRotateTask;
import CodingTasks.ArraySearchInRotatedSortedArrayTask;
import CodingTasks.ArraySearchInsertPositionTask;
import CodingTasks.ArraySetMatrixZeroesTask;
import CodingTasks.ArraySortTask;
import CodingTasks.ArraySpiralMatrixTask;
import CodingTasks.ArraySubarrayProductLessThanKTask;
import CodingTasks.ArraySubsetsTask;
import CodingTasks.ArraySumDiagonalElementsTask;
import CodingTasks.ArraySumTask;
import CodingTasks.ArrayTrappingRainWaterTask;
import CodingTasks.ArrayTwoSumTask;
import CodingTasks.ArrayUniqueElementsTask;
import CodingTasks.ArrayUniquePathsTask;
import CodingTasks.ArrayValidSudokuTask;
import CodingTasks.ArrayWiggleSortTask;
import CodingTasks.JavaGenericsMethodTask;
import CodingTasks.LongestPalindromicSubstringTask;
import CodingTasks.LongestSubstringTask;
import CodingTasks.MathFactorialTask;
import CodingTasks.MathFastInverseSquareRootTask;
import CodingTasks.MathFibonacciTask;
import CodingTasks.MathGCDTask;
import CodingTasks.MathPrimeCheckTask;
import CodingTasks.MatrixDeterminantTask;
import CodingTasks.MatrixMultiplicationTask;
import CodingTasks.MedianOfTwoSortedArraysTask;
import CodingTasks.MergeSortTask;
import CodingTasks.QuickSortTask;
import CodingTasks.StringCountVowelsTask;
import CodingTasks.StringIsAnagramTask;
import CodingTasks.StringLongestCommonPrefixTask;
import CodingTasks.StringLongestUniqueSubstringTask;
import CodingTasks.StringPermutationsTask;
import CodingTasks.StringRemoveDuplicatesTask;
import CodingTasks.StringReverseTask;
import CodingTasks.ValidPalindromeTask;

/**
 *
 * @author MuhammadHasnatRasool
 */
public class BrightCode_View extends javax.swing.JFrame {

    TableRowSorter<DefaultTableModel> sorter;
    public static DefaultTableModel model;

    /**
     * Creates new form BrightCode_View
     */
    public BrightCode_View() {
        setLocationRelativeTo(null);
        setLocation(250, 100);
//        setMaximumSize(new Dimension(900,700));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        model = new DefaultTableModel(new Object[]{"Id", "Problem", "Category"}, 0);
        model.addRow(new Object[]{"1", "ArrayCheckElementTask", "Easy"});
        model.addRow(new Object[]{"2", "ArrayCountElementTask", "Easy"});
        model.addRow(new Object[]{"3", "ArraySumTask", "Easy"});
        model.addRow(new Object[]{"4", "ArrayFindIndexTask", "Easy"});
        model.addRow(new Object[]{"5", "ArrayFindMaxTask", "Easy"});
        model.addRow(new Object[]{"6", "ArrayFindMinTask", "Easy"});
        model.addRow(new Object[]{"7", "ArrayReverseTask", "Easy"});
        model.addRow(new Object[]{"8", "ArrayRotateTask", "Medium"});
        model.addRow(new Object[]{"9", "ArrayFindSecondMaxTask", "Medium"});
        model.addRow(new Object[]{"10", "ArraySortTask", "Medium"});
        model.addRow(new Object[]{"11", "ArrayFindDuplicatesTask", "Medium"});
        model.addRow(new Object[]{"12", "ArrayMergeTask", "Medium"});
        model.addRow(new Object[]{"13", "ArrayRemoveElementTask", "Easy"});
        model.addRow(new Object[]{"14", "ArrayFindFirstDuplicateTask", "Easy"});
        model.addRow(new Object[]{"15", "ArrayCountOccurrencesTask", "Easy"});
        model.addRow(new Object[]{"16", "ArraySumDiagonalElementsTask", "Easy"});
        model.addRow(new Object[]{"17", "ArrayFindMinInColumnTask", "Easy"});
        model.addRow(new Object[]{"18", "ArrayTwoSumTask", "Easy"});
        model.addRow(new Object[]{"19", "ArrayThreeSumTask", "Medium"});
        model.addRow(new Object[]{"20", "ArrayFourSumTask", "Medium"});
        model.addRow(new Object[]{"21", "ArraySpiralMatrixTask", "Medium"});
        model.addRow(new Object[]{"22", "ArrayTrappingRainWaterTask", "Hard"});
        model.addRow(new Object[]{"23", "ArrayNextPermutationTask", "Hard"});
        model.addRow(new Object[]{"24", "ArrayRotateImageTask", "Hard"});
        model.addRow(new Object[]{"25", "ArrayLargestRectangleHistogramTask", "Hard"});
        model.addRow(new Object[]{"26", "MedianOfTwoSortedArraysTask", "Hard"});
        model.addRow(new Object[]{"27", "ArrayValidSudokuTask", "Medium"});
        model.addRow(new Object[]{"28", "LongestSubstringTask", "Easy"});
        model.addRow(new Object[]{"29", "ValidPalindromeTask", "Medium"});
        model.addRow(new Object[]{"30", "LongestPalindromicSubstringTask", "Medium"});
        model.addRow(new Object[]{"31", "StringReverseTask", "Easy"});
        model.addRow(new Object[]{"32", "StringLongestCommonPrefixTask", "Easy"});
        model.addRow(new Object[]{"33", "ArrayListIntersectionTask", "Easy"});
        model.addRow(new Object[]{"34", "ArrayListAverageTask", "Easy"});
        model.addRow(new Object[]{"35", "QuickSortTask", "Medium"});
        model.addRow(new Object[]{"36", "MergeSortTask", "Medium"});
        model.addRow(new Object[]{"37", "ArrayFindMaxInRowTask", "Easy"});
        model.addRow(new Object[]{"38", "ArrayIntersectionTask", "Easy"});
        model.addRow(new Object[]{"39", "ArrayFindFirstLastPositionTask", "Medium"});
        model.addRow(new Object[]{"40", "ArrayUniqueElementsTask", "Easy"});
        model.addRow(new Object[]{"41", "ArrayMoveZeroesTask", "Easy"});
        model.addRow(new Object[]{"42", "ArrayLongestConsecutiveSequenceTask", "Medium"});
        model.addRow(new Object[]{"43", "ArrayFindKthLargestElementTask", "Medium"});
        model.addRow(new Object[]{"44", "ArrayFindMedianTask", "Medium"});
        model.addRow(new Object[]{"45", "ArrayFindModeTask", "Medium"});
        model.addRow(new Object[]{"46", "ArrayRemoveDuplicatesTask", "Easy"});
        model.addRow(new Object[]{"47", "ArrayProductExceptSelfTask", "Hard"});
        model.addRow(new Object[]{"48", "ArrayFindPeakElementTask", "Medium"});
        model.addRow(new Object[]{"49", "ArrayFindSecondMinTask", "Easy"});
        model.addRow(new Object[]{"50", "ArrayFindMissingNumberTask", "Easy"});
        model.addRow(new Object[]{"51", "ArrayFindSingleNumberTask", "Easy"});
        model.addRow(new Object[]{"52", "ArrayFindMissingRangesTask", "Medium"});
        model.addRow(new Object[]{"53", "ArrayLongestIncreasingSubsequenceTask", "Medium"});
        model.addRow(new Object[]{"54", "ArrayBestTimeToBuyAndSellStockTask", "Easy"});
        model.addRow(new Object[]{"55", "ArraySearchInRotatedSortedArrayTask", "Medium"});
        model.addRow(new Object[]{"56", "ArrayCoinChangeTask", "Hard"});
        model.addRow(new Object[]{"57", "ArrayLongestCommonSubsequenceTask", "Medium"});
        model.addRow(new Object[]{"58", "ArrayFindDuplicatesIITask", "Medium"});
        model.addRow(new Object[]{"59", "ArrayLongestPalindromeTask", "Medium"});
        model.addRow(new Object[]{"60", "ArraySubarrayProductLessThanKTask", "Medium"});
        model.addRow(new Object[]{"61", "ArrayMajorityElementTask", "Easy"});
        model.addRow(new Object[]{"62", "ArrayFloodFillTask", "Easy"});
        model.addRow(new Object[]{"63", "ArrayPermutationsTask", "Medium"});
        model.addRow(new Object[]{"64", "ArraySubsetsTask", "Medium"});
        model.addRow(new Object[]{"65", "ArrayWiggleSortTask", "Medium"});
        model.addRow(new Object[]{"66", "ArraySubarraySumEqualsKTask", "Medium"});
        model.addRow(new Object[]{"67", "ArrayContiguousArrayTask", "Medium"});
        model.addRow(new Object[]{"68", "ArrayBinarySearchTask", "Easy"});
        model.addRow(new Object[]{"69", "ArrayRemoveNthElementTask", "Easy"});
        model.addRow(new Object[]{"70", "ArraySearchInsertPositionTask", "Easy"});
        model.addRow(new Object[]{"71", "ArrayMinimumPathSumTask", "Medium"});
        model.addRow(new Object[]{"72", "ArrayUniquePathsTask", "Medium"});
        model.addRow(new Object[]{"73", "ArraySetMatrixZeroesTask", "Medium"});
        model.addRow(new Object[]{"74", "ArrayCombinationSumTask", "Medium"});
        model.addRow(new Object[]{"75", "ArrayCombinationSumIVTask", "Medium"});
        model.addRow(new Object[]{"76", "ArrayClimbingStairsTask", "Easy"});
        model.addRow(new Object[]{"77", "ArrayDecodeWaysTask", "Medium"});
        model.addRow(new Object[]{"78", "ArrayCheckSymmetricTask", "Easy"});
        model.addRow(new Object[]{"79", "MatrixMultiplicationTask", "Medium"});
        model.addRow(new Object[]{"80", "MatrixDeterminantTask", "Hard"});
        model.addRow(new Object[]{"81", "StringIsAnagramTask", "Easy"});
        model.addRow(new Object[]{"82", "StringCountVowelsTask", "Easy"});
        model.addRow(new Object[]{"83", "MathFactorialTask", "Easy"});
        model.addRow(new Object[]{"84", "MathFibonacciTask", "Easy"});
        model.addRow(new Object[]{"85", "MathPrimeCheckTask", "Easy"});
        model.addRow(new Object[]{"86", "MathGCDTask", "Easy"});
        model.addRow(new Object[]{"87", "MathLCMTask", "Easy"});
        model.addRow(new Object[]{"88", "StringRemoveDuplicatesTask", "Medium"});
        model.addRow(new Object[]{"89", "StringLongestUniqueSubstringTask", "Medium"});
        model.addRow(new Object[]{"90", "StringPermutationsTask", "Medium"});
        model.addRow(new Object[]{"91", "MathFastInverseSquareRootTask", "Hard"});
        model.addRow(new Object[]{"92", "JavaGenericsMethodTask", "Medium"});
        model.addRow(new Object[]{"93", "ArrayFindShortestPathTask", "Medium"});
        model.addRow(new Object[]{"94", "ArrayFindLongestPathTask", "Medium"});
        model.addRow(new Object[]{"95", "ArrayFindLastNonRepeatingCharacterTask", "Easy"});
        model.addRow(new Object[]{"96", "ArrayFindLastRepeatingCharacterTask", "Easy"});
        model.addRow(new Object[]{"97", "ArrayFindFirstRepeatingCharacterTask", "Easy"});
        model.addRow(new Object[]{"98", "ArrayFindMinGapTask", "Easy"});
        model.addRow(new Object[]{"99", "ArrayFindMaxGapTask", "Easy"});
        model.addRow(new Object[]{"100", "ArrayFindOptimalSplitTask", "Hard"});
        model.addRow(new Object[]{"101", "ArrayFindPairsWithGivenSumTask", "Easy"});
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TasksFrame");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setAutoscrolls(true);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(model);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setDragEnabled(true);
        jTable1.setFillsViewportHeight(true);
        jTable1.setFocusCycleRoot(true);
        jTable1.setFocusTraversalPolicyProvider(true);
        jTable1.setGridColor(new java.awt.Color(51, 204, 255));
        jTable1.setRowSorter(sorter);
        jTable1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionForeground(new java.awt.Color(51, 204, 255));
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        jLabel1.setText("Search");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setToolTipText("search for any taks by id , name or category");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome Choose any Task Below:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/backbutton.png"))); // NOI18N
        jButton1.setText("Back To Menu");
        jButton1.setToolTipText("press to move back to menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Menu.getInstance().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        //        int column = jTable1.columnAtPoint(evt.getPoint());
        int row = jTable1.rowAtPoint(evt.getPoint());
        String selectedValue = (String) jTable1.getValueAt(row, 1);
        switch (selectedValue) {
            case "ArrayCheckElementTask" -> {
                new ArrayCheckElementTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayCountElementTask" -> {
                new ArrayCountElementTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindIndexTask" -> {
                new ArrayFindIndexTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindMaxTask" -> {
                new ArrayFindMaxTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindMinTask" -> {
                new ArrayFindMinTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayReverseTask" -> {
                new ArrayReverseTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayRotateTask" -> {
                new ArrayRotateTask().setVisible(true);
                setVisible(false);
            }
            case "ArraySumTask" -> {
                new ArraySumTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindSecondMaxTask" -> {
                new ArrayFindSecondMaxTask().setVisible(true);
                setVisible(false);
            }
            case "ArraySortTask" -> {
                new ArraySortTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindDuplicatesTask" -> {
                new ArrayFindDuplicatesTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayMergeTask" -> {
                new ArrayMergeTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayRemoveElementTask" -> {
                new ArrayRemoveElementTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindFirstDuplicateTask" -> {
                new ArrayFindFirstDuplicateTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayCountOccurrencesTask" -> {
                new ArrayCountOccurrencesTask().setVisible(true);
                setVisible(false);
            }
            case "ArraySumDiagonalElementsTask" -> {
                new ArraySumDiagonalElementsTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindMaxInRowTask" -> {
                new ArrayFindMaxInRowTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindMinInColumnTask" -> {
                new ArrayFindMinInColumnTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayTwoSumTask" -> {
                new ArrayTwoSumTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayThreeSumTask" -> {
                new ArrayTwoSumTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFourSumTask" -> {
                new ArrayFourSumTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindFirstLastPositionTask" -> {
                new ArrayFindFirstLastPositionTask().setVisible(true);
                setVisible(false);
            }
            case "ArraySpiralMatrixTask" -> {
                new ArraySpiralMatrixTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayTrappingRainWaterTask" -> {
                new ArrayTrappingRainWaterTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayNextPermutationTask" -> {
                new ArrayNextPermutationTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayRotateImageTask" -> {
                new ArrayRotateImageTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayLargestRectangleHistogramTask" -> {
                new ArrayLargestRectangleHistogramTask().setVisible(true);
                setVisible(false);
            }
            case "MedianOfTwoSortedArraysTask" -> {
                new MedianOfTwoSortedArraysTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayValidSudokuTask" -> {
                new ArrayValidSudokuTask().setVisible(true);
                setVisible(false);
            }
            case "LongestSubstringTask" -> {
                new LongestSubstringTask().setVisible(true);
                setVisible(false);
            }
            case "ValidPalindromeTask" -> {
                new ValidPalindromeTask().setVisible(true);
                setVisible(false);
            }
            case "LongestPalindromicSubstringTask" -> {
                new LongestPalindromicSubstringTask().setVisible(true);
                setVisible(false);
            }
            case "StringReverseTask" -> {
                new StringReverseTask().setVisible(true);
                setVisible(false);
            }
            case "StringLongestCommonPrefixTask" -> {
                new StringLongestCommonPrefixTask().setVisible(true);
                setVisible(false);
            }
            case "MergeSortTask" -> {
                new MergeSortTask().setVisible(true);
                setVisible(false);
            }
            case "QuickSortTask" -> {
                new QuickSortTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayListIntersectionTask" -> {
                new ArrayListIntersectionTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayListAverageTask" -> {
                new ArrayListAverageTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayIntersectionTask" -> {
                new ArrayIntersectionTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayUniqueElementsTask" -> {
                new ArrayUniqueElementsTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayMoveZeroesTask" -> {
                new ArrayMoveZeroesTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayLongestConsecutiveSequenceTask" -> {
                new ArrayLongestConsecutiveSequenceTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindKthLargestElementTask" -> {
                new ArrayFindKthLargestElementTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindMedianTask" -> {
                new ArrayFindMedianTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindModeTask" -> {
                new ArrayFindModeTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayRemoveDuplicatesTask" -> {
                new ArrayRemoveDuplicatesTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindPeakElementTask" -> {
                new ArrayFindPeakElementTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayProductExceptSelfTask" -> {
                new ArrayProductExceptSelfTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindMissingNumberTask" -> {
                new ArrayFindMissingNumberTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindSingleNumberTask" -> {
                new ArrayFindSingleNumberTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindMissingRangesTask" -> {
                new ArrayFindMissingRangesTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayLongestIncreasingSubsequenceTask" -> {
                new ArrayLongestIncreasingSubsequenceTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayBestTimeToBuyAndSellStockTask" -> {
                new ArrayBestTimeToBuyAndSellStockTask().setVisible(true);
                setVisible(false);
            }
            case "ArraySearchInRotatedSortedArrayTask" -> {
                new ArraySearchInRotatedSortedArrayTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayCoinChangeTask" -> {
                new ArrayCoinChangeTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayLongestCommonSubsequenceTask" -> {
                new ArrayLongestCommonSubsequenceTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindDuplicatesIITask" -> {
                new ArrayFindDuplicatesIITask().setVisible(true);
                setVisible(false);
            }
            case "ArrayLongestPalindromeTask" -> {
                new ArrayLongestPalindromeTask().setVisible(true);
                setVisible(false);
            }
            case "ArraySubarrayProductLessThanKTask" -> {
                new ArraySubarrayProductLessThanKTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayMajorityElementTask" -> {
                new ArrayMajorityElementTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFloodFillTask" -> {
                new ArrayFloodFillTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayPermutationsTask" -> {
                new ArrayPermutationsTask().setVisible(true);
                setVisible(false);
            }
            case "ArraySubsetsTask" -> {
                new ArraySubsetsTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayWiggleSortTask" -> {
                new ArrayWiggleSortTask().setVisible(true);
                setVisible(false);
            }
            case "ArraySubarraySumEqualsKTask" -> {
                new ArrayWiggleSortTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayContiguousArrayTask" -> {
                new ArrayContiguousArrayTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindPairsWithGivenSumTask" -> {
                new ArrayFindPairsWithGivenSumTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayBinarySearchTask" -> {
                new ArrayBinarySearchTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayRemoveNthElementTask" -> {
                new ArrayRemoveNthElementTask().setVisible(true);
                setVisible(false);
            }
            case "ArraySearchInsertPositionTask" -> {
                new ArraySearchInsertPositionTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayMinimumPathSumTask" -> {
                new ArrayMinimumPathSumTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayUniquePathsTask" -> {
                new ArrayUniquePathsTask().setVisible(true);
                setVisible(false);
            }
            case "ArraySetMatrixZeroesTask" -> {
                new ArraySetMatrixZeroesTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayCombinationSumTask" -> {
                new ArrayCombinationSumTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayCombinationSumIVTask" -> {
                new ArrayCombinationSumIVTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayClimbingStairsTask" -> {
                new ArrayClimbingStairsTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayDecodeWaysTask" -> {
                new ArrayDecodeWaysTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayCheckSymmetricTask" -> {
                new ArrayCheckSymmetricTask().setVisible(true);
                setVisible(false);
            }
            case "MatrixMultiplicationTask" -> {
                new MatrixMultiplicationTask().setVisible(true);
                setVisible(false);
            }
            case "StringIsAnagramTask" -> {
                new StringIsAnagramTask().setVisible(true);
                setVisible(false);
            }
            case "StringCountVowelsTask" -> {
                new StringCountVowelsTask().setVisible(true);
                setVisible(false);
            }
            case "MathFactorialTask" -> {
                new MathFactorialTask().setVisible(true);
                setVisible(false);
            }
            case "MathFibonacciTask" -> {
                new MathFibonacciTask().setVisible(true);
                setVisible(false);
            }
            case "MathPrimeCheckTask" -> {
                new MathPrimeCheckTask().setVisible(true);
                setVisible(false);
            }
            case "MathGCDTask" -> {
                new MathGCDTask().setVisible(true);
                setVisible(false);
            }
            case "StringRemoveDuplicatesTask" -> {
                new StringRemoveDuplicatesTask().setVisible(true);
                setVisible(false);
            }
            case "StringLongestUniqueSubstringTask" -> {
                new StringLongestUniqueSubstringTask().setVisible(true);
                setVisible(false);
            }
            case "StringPermutationsTask" -> {
                new StringPermutationsTask().setVisible(true);
                setVisible(false);
            }
            case "MathFastInverseSquareRootTask" -> {
                new MathFastInverseSquareRootTask().setVisible(true);
                setVisible(false);
            }
            case "JavaGenericsMethodTask" -> {
                new JavaGenericsMethodTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindShortestPathTask" -> {
                new ArrayFindShortestPathTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindLongestPathTask" -> {
                new ArrayFindLongestPathTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindLastNonRepeatingCharacterTask" -> {
                new ArrayFindLastNonRepeatingCharacterTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindLastRepeatingCharacterTask" -> {
                new ArrayFindLastRepeatingCharacterTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindFirstRepeatingCharacterTask" -> {
                new ArrayFindFirstRepeatingCharacterTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindMinGapTask" -> {
                new ArrayFindMinGapTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindMaxGapTask" -> {
                new ArrayFindMaxGapTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindOptimalSplitTask" -> {
                new ArrayFindOptimalSplitTask().setVisible(true);
                setVisible(false);
            }
            case "MatrixDeterminantTask" -> {
                new MatrixDeterminantTask().setVisible(true);
                setVisible(false);
            }
            case "ArrayFindSecondMinTask" -> {
                new ArrayFindSecondMinTask().setVisible(true);
                setVisible(false);
            }
            default -> {
            }

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

        String text = jTextField1.getText();
        System.out.println(text);
        if (text.isEmpty()) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(text));
        }

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
            java.util.logging.Logger.getLogger(BrightCode_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrightCode_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrightCode_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrightCode_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BrightCode_View().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
