package services;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TASKK extends javax.swing.JFrame {
    
    CardLayout c;
    
    char mainMatrix[][];
    char arrFirstRow[];
    char alph_new[];
    char arrcipherText[];
    char key_arr[];
    int N;
    
    static String new_key = "";
    
    public TASKK() {
        initComponents();
        c = (CardLayout) P_work.getLayout();
        
    }
    
    public char[] creatArrFirstRow(String S_firstRow) {
        return S_firstRow.replace(" ", "").toCharArray();
    }
    
    public char[][] creatMainMatrix(char arrFirstRow[]) {
        char temp_row[] = new char[arrFirstRow.length];
        
        for (int i = 0; i < arrFirstRow.length; i++) {
            int counter = 0;
            for (int j = 0; j < arrFirstRow.length; j++) {
                if (i + j < arrFirstRow.length) {
                    temp_row[j] = arrFirstRow[j + i];
                } else {
                    temp_row[j] = arrFirstRow[counter++];
                }
                mainMatrix[i][j] = temp_row[j];
            }
        }
        return mainMatrix;
    }
    
    public String displayMatrix(char matrix[][]) {
        String Stemp = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                Stemp = Stemp + " " + matrix[i][j];
                
            }
            Stemp = Stemp + "\n";
        }
        return Stemp;
        
    }
    
    public int get_indexof_char(char c, char[] myArr) {
        int i;
        for (i = 0; i < myArr.length; i++) {
            if (c == myArr[i]) {
                break;
            }
        }
        return i;
    }
    
    public char[] ready_key_arr(String key, String my_ciphertext) {
        int ci_length = my_ciphertext.length();
        int key_length = key.length();
        char key_arr_test[] = new char[key.length()];
        
        if (key_length < ci_length) {
            key_arr_test = new char[my_ciphertext.length() + key.length()];
            
            while (true) {
                new_key = new_key + key;
                if (new_key.length() >= my_ciphertext.length()) {
                    break;
                }
            }
            key_arr_test = new_key.toCharArray();
        } else {
            key_arr_test = key.toCharArray();
        }
        return key_arr_test;
        
    }
    
    public String decription(String my_cipher, String key) {
        String plantText = "";
        arrcipherText = new char[my_cipher.replace(" ", "").length()];
        arrcipherText = my_cipher.replace(" ", "").toCharArray();
        
        key_arr = ready_key_arr(key, my_cipher);
        
        for (int i = 0; i < arrcipherText.length; i++) {
            int indexofkey = get_indexof_char(key_arr[i], arrFirstRow);
//            System.out.println( " - "+indexofkey);
            for (int j = 0; j < mainMatrix.length; j++) {
                if (arrcipherText[i] == mainMatrix[j][indexofkey]) {
                    plantText = plantText + mainMatrix[j][0];
                    break;
                }
            }
            
        }
        
        return plantText;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_work = new javax.swing.JPanel();
        P_setmatrix_length = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        T_NumberNmatrix = new javax.swing.JTextField();
        b_saveLength = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        P_FirstRowMatixcontent = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        T_StringFirstRow = new javax.swing.JTextField();
        b_saveLength1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        LapleCounter = new javax.swing.JLabel();
        B_matrixLength = new javax.swing.JButton();
        P_showMatrix = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_matrix = new javax.swing.JTextArea();
        b_NextToKetCT = new javax.swing.JButton();
        B_FirstRowMatrixContent = new javax.swing.JButton();
        P_addKeyCT = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        T_mykey = new javax.swing.JTextField();
        T_MyCT = new javax.swing.JTextField();
        b_Decryption = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        L_resuilt = new javax.swing.JLabel();
        B_showSmallMatrix = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        P_work.setBackground(new java.awt.Color(255, 255, 255));
        P_work.setLayout(new java.awt.CardLayout());

        P_setmatrix_length.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Length Number ");

        T_NumberNmatrix.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        T_NumberNmatrix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        T_NumberNmatrix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                T_NumberNmatrixKeyTyped(evt);
            }
        });

        b_saveLength.setFont(new java.awt.Font("Sakkal Majalla", 0, 18)); // NOI18N
        b_saveLength.setForeground(new java.awt.Color(1, 1, 1));
        b_saveLength.setText("Save ");
        b_saveLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_saveLengthActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Full veginner ");

        javax.swing.GroupLayout P_setmatrix_lengthLayout = new javax.swing.GroupLayout(P_setmatrix_length);
        P_setmatrix_length.setLayout(P_setmatrix_lengthLayout);
        P_setmatrix_lengthLayout.setHorizontalGroup(
            P_setmatrix_lengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_setmatrix_lengthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_setmatrix_lengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_setmatrix_lengthLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_saveLength, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_setmatrix_lengthLayout.createSequentialGroup()
                        .addGroup(P_setmatrix_lengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_setmatrix_lengthLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(48, 48, 48)
                                .addComponent(T_NumberNmatrix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P_setmatrix_lengthLayout.setVerticalGroup(
            P_setmatrix_lengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_setmatrix_lengthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addGroup(P_setmatrix_lengthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_NumberNmatrix, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(b_saveLength)
                .addContainerGap())
        );

        P_work.add(P_setmatrix_length, "card2");

        P_FirstRowMatixcontent.setBackground(new java.awt.Color(255, 255, 255));
        P_FirstRowMatixcontent.setAutoscrolls(true);

        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("To Create The Matrix Add The First Row of the Matrix ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("First Row ");

        T_StringFirstRow.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        T_StringFirstRow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T_StringFirstRow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        T_StringFirstRow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                T_StringFirstRowKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                T_StringFirstRowKeyReleased(evt);
            }
        });

        b_saveLength1.setFont(new java.awt.Font("Sakkal Majalla", 0, 18)); // NOI18N
        b_saveLength1.setForeground(new java.awt.Color(1, 1, 1));
        b_saveLength1.setText("Save ");
        b_saveLength1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_saveLength1ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("The First Row will be As String ...");

        LapleCounter.setForeground(new java.awt.Color(0, 153, 204));
        LapleCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LapleCounter.setText(" ");

        B_matrixLength.setFont(new java.awt.Font("Sakkal Majalla", 0, 18)); // NOI18N
        B_matrixLength.setForeground(new java.awt.Color(1, 1, 1));
        B_matrixLength.setText("SET Matrix Length");
        B_matrixLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_matrixLengthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_FirstRowMatixcontentLayout = new javax.swing.GroupLayout(P_FirstRowMatixcontent);
        P_FirstRowMatixcontent.setLayout(P_FirstRowMatixcontentLayout);
        P_FirstRowMatixcontentLayout.setHorizontalGroup(
            P_FirstRowMatixcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FirstRowMatixcontentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_FirstRowMatixcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_FirstRowMatixcontentLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T_StringFirstRow))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FirstRowMatixcontentLayout.createSequentialGroup()
                        .addComponent(B_matrixLength, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_saveLength1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_FirstRowMatixcontentLayout.createSequentialGroup()
                        .addGroup(P_FirstRowMatixcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_FirstRowMatixcontentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LapleCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        P_FirstRowMatixcontentLayout.setVerticalGroup(
            P_FirstRowMatixcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_FirstRowMatixcontentLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(P_FirstRowMatixcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_StringFirstRow, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LapleCounter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(P_FirstRowMatixcontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_saveLength1)
                    .addComponent(B_matrixLength))
                .addContainerGap())
        );

        P_work.add(P_FirstRowMatixcontent, "card3");

        P_showMatrix.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Your Matrix  ..... Click Next To add The Cipher And The KEY");

        TextArea_matrix.setColumns(20);
        TextArea_matrix.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        TextArea_matrix.setRows(10);
        TextArea_matrix.setToolTipText("The Matrix");
        TextArea_matrix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        TextArea_matrix.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TextArea_matrix.setEnabled(false);
        jScrollPane1.setViewportView(TextArea_matrix);

        b_NextToKetCT.setFont(new java.awt.Font("Sakkal Majalla", 0, 18)); // NOI18N
        b_NextToKetCT.setForeground(new java.awt.Color(1, 1, 1));
        b_NextToKetCT.setText("Next");
        b_NextToKetCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_NextToKetCTActionPerformed(evt);
            }
        });

        B_FirstRowMatrixContent.setFont(new java.awt.Font("Sakkal Majalla", 0, 18)); // NOI18N
        B_FirstRowMatrixContent.setForeground(new java.awt.Color(1, 1, 1));
        B_FirstRowMatrixContent.setText("Add Matrix Content");
        B_FirstRowMatrixContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_FirstRowMatrixContentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_showMatrixLayout = new javax.swing.GroupLayout(P_showMatrix);
        P_showMatrix.setLayout(P_showMatrixLayout);
        P_showMatrixLayout.setHorizontalGroup(
            P_showMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_showMatrixLayout.createSequentialGroup()
                .addGroup(P_showMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_showMatrixLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_NextToKetCT, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_showMatrixLayout.createSequentialGroup()
                        .addGroup(P_showMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P_showMatrixLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(P_showMatrixLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(P_showMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B_FirstRowMatrixContent, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        P_showMatrixLayout.setVerticalGroup(
            P_showMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_showMatrixLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(P_showMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_NextToKetCT)
                    .addComponent(B_FirstRowMatrixContent))
                .addContainerGap())
        );

        P_work.add(P_showMatrix, "card5");

        P_addKeyCT.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("Add The KEY And The Cipher Text .. Then Click On Decryption");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("C.T");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("KEY");

        T_mykey.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        T_mykey.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T_mykey.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        T_mykey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                T_mykeyKeyPressed(evt);
            }
        });

        T_MyCT.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        T_MyCT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T_MyCT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        T_MyCT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                T_MyCTKeyPressed(evt);
            }
        });

        b_Decryption.setFont(new java.awt.Font("Sakkal Majalla", 0, 18)); // NOI18N
        b_Decryption.setForeground(new java.awt.Color(1, 1, 1));
        b_Decryption.setText("Decryption");
        b_Decryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_DecryptionActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Resuilt");

        L_resuilt.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        L_resuilt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_resuilt.setText(" ");

        B_showSmallMatrix.setFont(new java.awt.Font("Sakkal Majalla", 0, 18)); // NOI18N
        B_showSmallMatrix.setForeground(new java.awt.Color(1, 1, 1));
        B_showSmallMatrix.setText("Show Your matrix");
        B_showSmallMatrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_showSmallMatrixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_addKeyCTLayout = new javax.swing.GroupLayout(P_addKeyCT);
        P_addKeyCT.setLayout(P_addKeyCTLayout);
        P_addKeyCTLayout.setHorizontalGroup(
            P_addKeyCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_addKeyCTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_addKeyCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_resuilt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(P_addKeyCTLayout.createSequentialGroup()
                        .addGroup(P_addKeyCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(P_addKeyCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(b_Decryption)
                                .addGroup(P_addKeyCTLayout.createSequentialGroup()
                                    .addGroup(P_addKeyCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(P_addKeyCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(T_mykey, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(T_MyCT, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(P_addKeyCTLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel8)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(P_addKeyCTLayout.createSequentialGroup()
                .addComponent(B_showSmallMatrix, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        P_addKeyCTLayout.setVerticalGroup(
            P_addKeyCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_addKeyCTLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(58, 58, 58)
                .addGroup(P_addKeyCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(T_mykey, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(P_addKeyCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_addKeyCTLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(T_MyCT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_addKeyCTLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_Decryption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(L_resuilt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(B_showSmallMatrix))
        );

        P_work.add(P_addKeyCT, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_work, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(P_work, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_FirstRowMatrixContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_FirstRowMatrixContentActionPerformed
        
        c.show(P_work, "card3");
    }//GEN-LAST:event_B_FirstRowMatrixContentActionPerformed

    private void B_matrixLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_matrixLengthActionPerformed
        c.show(P_work, "card2");

    }//GEN-LAST:event_B_matrixLengthActionPerformed

    private void B_showSmallMatrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_showSmallMatrixActionPerformed
        c.show(P_work, "card5");
    }//GEN-LAST:event_B_showSmallMatrixActionPerformed

    private void b_saveLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_saveLengthActionPerformed
        if (!T_NumberNmatrix.getText().equals("")) {
            c.show(P_work, "card3");
            N = Integer.parseInt(T_NumberNmatrix.getText());
            mainMatrix = new char[N][N];            
        } else {
            JOptionPane.showMessageDialog(this, "mafe4 rakm fe l N ");
        }
        

    }//GEN-LAST:event_b_saveLengthActionPerformed

    private void b_saveLength1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_saveLength1ActionPerformed
        
        if (T_StringFirstRow.getText().replace(" ", "").length() == N) {
            arrFirstRow = creatArrFirstRow(T_StringFirstRow.getText().replace(" ", ""));
            mainMatrix = creatMainMatrix(arrFirstRow);
            
            for (int i = 0; i < mainMatrix.length; i++) {
                for (int j = 0; j < mainMatrix.length; j++) {
                    System.out.print("   " + mainMatrix[i][j]);
                }
                System.out.println("");
            }
            TASKK.TextArea_matrix.setText(displayMatrix(mainMatrix));
            c.show(P_work, "card5");
        } else {
            JOptionPane.showMessageDialog(null, "pleas enter The String With the same Size of the Matrix \n The matrix Size which You enter IS - " + N + " - Char");
        }

    }//GEN-LAST:event_b_saveLength1ActionPerformed

    private void b_NextToKetCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_NextToKetCTActionPerformed
        c.show(P_work, "card6");
    }//GEN-LAST:event_b_NextToKetCTActionPerformed

    private void T_NumberNmatrixKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T_NumberNmatrixKeyTyped
        try {
            char c = evt.getKeyChar();
            if (c < '0' || c > '9') {
                evt.consume();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_T_NumberNmatrixKeyTyped

    private void T_StringFirstRowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T_StringFirstRowKeyPressed

    }//GEN-LAST:event_T_StringFirstRowKeyPressed

    private void T_StringFirstRowKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T_StringFirstRowKeyReleased
        int xx = T_StringFirstRow.getText().replace(" ", "").length();
        LapleCounter.setText(xx + "");
    }//GEN-LAST:event_T_StringFirstRowKeyReleased
    
    public boolean checkPT_Matrix(String pt) {
        String all_ch = "";
        for (int i = 0; i < mainMatrix.length; i++) {
            for (int j = 0; j < mainMatrix.length; j++) {
                all_ch = all_ch + mainMatrix[i][j];
            }
        }
        
        pt = pt.replace(" ", "");
        for (int i = 0; i < pt.length(); i++) {
            if (!all_ch.contains("" + pt.charAt(i))) {
                return false;
            }
            
        }
        
        return true;
    }

    private void b_DecryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_DecryptionActionPerformed
        
        if (checkPT_Matrix(T_MyCT.getText().replace(" ", "")) && checkPT_Matrix(T_mykey.getText().replace(" ", ""))) {
            String resultt = decription(T_MyCT.getText().replace(" ", ""), T_mykey.getText().replace(" ", ""));
            System.out.println(resultt);
            L_resuilt.setText(resultt);
        } else {
            JOptionPane.showMessageDialog(this, "There is some Char in your Ky or CT text Not in the Matix ");
        }
        

    }//GEN-LAST:event_b_DecryptionActionPerformed

    private void T_MyCTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T_MyCTKeyPressed
        L_resuilt.setText(" ");
    }//GEN-LAST:event_T_MyCTKeyPressed

    private void T_mykeyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T_mykeyKeyPressed
        L_resuilt.setText(" ");
    }//GEN-LAST:event_T_mykeyKeyPressed

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
            java.util.logging.Logger.getLogger(TASKK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TASKK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TASKK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TASKK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TASKK Servic = new TASKK();
                JPanel jPanel = new JPanel();

//                Servic.setResizable(false);
                Servic.setLocation(300, 150);
                Servic.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton B_FirstRowMatrixContent;
    public static javax.swing.JButton B_matrixLength;
    public static javax.swing.JButton B_showSmallMatrix;
    public static javax.swing.JLabel L_resuilt;
    public static javax.swing.JLabel LapleCounter;
    public static javax.swing.JPanel P_FirstRowMatixcontent;
    public static javax.swing.JPanel P_addKeyCT;
    public static javax.swing.JPanel P_setmatrix_length;
    public static javax.swing.JPanel P_showMatrix;
    private javax.swing.JPanel P_work;
    private javax.swing.JTextField T_MyCT;
    public static javax.swing.JTextField T_NumberNmatrix;
    public static javax.swing.JTextField T_StringFirstRow;
    private javax.swing.JTextField T_mykey;
    public static javax.swing.JTextArea TextArea_matrix;
    public static javax.swing.JButton b_Decryption;
    public static javax.swing.JButton b_NextToKetCT;
    public static javax.swing.JButton b_saveLength;
    public static javax.swing.JButton b_saveLength1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
