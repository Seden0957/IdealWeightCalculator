
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seden0957
 */
public class display extends javax.swing.JFrame {

    /**
     * Creates new form display
     */
    public display() {
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

        displayPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        measurmentLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        enterButton = new javax.swing.JButton();
        nameInput = new javax.swing.JTextField();
        systemInput = new javax.swing.JTextField();
        heightInput = new javax.swing.JTextField();
        imperialOrMetric = new javax.swing.JLabel();
        metresOrInches = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        displayPanel.setBackground(new java.awt.Color(0, 153, 255));

        title.setText("Ideal Weight Calculator");

        nameLabel.setText("Name:");

        measurmentLabel.setText("System of measure:");

        heightLabel.setText("Height:");

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        nameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        systemInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        systemInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemInputActionPerformed(evt);
            }
        });

        heightInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        imperialOrMetric.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        imperialOrMetric.setText("(I)mperial or (M)etric");

        metresOrInches.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        metresOrInches.setText("Metres or Inches ");

        outputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayPanelLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(displayPanelLayout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(nameLabel))
                                .addComponent(measurmentLabel))
                            .addComponent(imperialOrMetric)))
                    .addGroup(displayPanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(heightLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(metresOrInches)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(systemInput)
                    .addComponent(enterButton)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightInput, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(title)
                .addGap(27, 27, 27)
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(measurmentLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imperialOrMetric, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(systemInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightLabel)
                    .addComponent(heightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(metresOrInches))
                    .addGroup(displayPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(enterButton)))
                .addGap(28, 28, 28)
                .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
       double height,weight, i, I, m, M; //systemOfMeasurment; //heightInInches, heightInMetres;
       DecimalFormat x = new DecimalFormat ("###.00");
       String name, systemOfMeasurment;
       height = Double.parseDouble(heightInput.getText());
       name = nameInput.getText();
       systemOfMeasurment = /*Double.parseDouble*/(systemInput.getText());
       i = 1;
       I = 1;    
       m = 2;
       M = 2;
       switch(systemOfMeasurment)
       {
           case "I":
       {
            weight = height*height*25/703;
            outputLabel.setText(name +"'s ideal weight is " + (x.format(weight))+ " lbs.");
            break;  
       }
           case "i":
           {
            weight = height*height*25/703;
            outputLabel.setText(name +"'s ideal weight is " + (x.format(weight))+ " lbs.");
            break;  
           }
           case "M":
           {
            weight = height*height*25;
            outputLabel.setText(name +"'s ideal weight is " + (x.format(weight))+ "kgs.");
            break;    
           }
           case "m":
           {
            weight = height*height*25;
            outputLabel.setText(name +"'s ideal weight is " + (x.format(weight))+ "kgs.");
            break;     
           }
       }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void systemInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemInputActionPerformed
      
    }//GEN-LAST:event_systemInputActionPerformed

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
            java.util.logging.Logger.getLogger(display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel displayPanel;
    private javax.swing.JButton enterButton;
    private javax.swing.JTextField heightInput;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JLabel imperialOrMetric;
    private javax.swing.JLabel measurmentLabel;
    private javax.swing.JLabel metresOrInches;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JTextField systemInput;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
