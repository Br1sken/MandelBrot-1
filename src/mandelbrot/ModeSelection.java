
package mandelbrot;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 * Formular to select the modes of the set.
 * 
 * @author rix
 */
public class ModeSelection extends javax.swing.JFrame {

    MainFrame parent;
    
    
    /**
     * Creates new form ModeSelection
     */
    public ModeSelection(MainFrame parent) {
        initComponents();
        this.parent = parent;
        this.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        MandelMode = new javax.swing.JTextField();
        BOK = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        rbMandel = new javax.swing.JRadioButton();
        rbJulia = new javax.swing.JRadioButton();
        JuliaMode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JuliaX = new javax.swing.JTextField();
        JuliaY = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Please enter an exponent between 2 and 10.");

        MandelMode.setText("2");
        MandelMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MandelModeActionPerformed(evt);
            }
        });
        MandelMode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MandelModeFocusLost(evt);
            }
        });

        BOK.setText("OK");
        BOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOKActionPerformed(evt);
            }
        });

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbMandel);
        rbMandel.setSelected(true);
        rbMandel.setText("Mandelbrot Set");
        rbMandel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMandelActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbJulia);
        rbJulia.setText("Julia Set");
        rbJulia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJuliaActionPerformed(evt);
            }
        });

        JuliaMode.setText("2");
        JuliaMode.setEnabled(false);
        JuliaMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JuliaModeActionPerformed(evt);
            }
        });
        JuliaMode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JuliaModeFocusLost(evt);
            }
        });

        jLabel2.setText("Please enter an exponent between 2 and 10.");
        jLabel2.setEnabled(false);

        jLabel3.setText("Please enter an X- and Y-variable:");
        jLabel3.setEnabled(false);

        jLabel4.setText("X:");
        jLabel4.setEnabled(false);

        jLabel5.setText("Y:");
        jLabel5.setEnabled(false);

        JuliaX.setEnabled(false);

        JuliaY.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbJulia)
                    .addComponent(rbMandel))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BOK, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JuliaX, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JuliaY, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(71, 71, 71))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(MandelMode, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(JuliaMode, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rbMandel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MandelMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbJulia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(JuliaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JuliaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JuliaMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOK)
                    .addComponent(jButton1))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MandelModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MandelModeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MandelModeActionPerformed

    private void BOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOKActionPerformed
        String test;
        double x,y;
        
        if (rbMandel.isSelected() == true) {
            test = MandelMode.getText();
        } else {
            test = JuliaMode.getText();
        }
        
        if (isValidMode(test)) {
    
            if (rbMandel.isSelected() == true){
                parent.setMode(Integer.parseInt(test));
            } else {
            
                try {
                    x = Double.parseDouble(JuliaX.getText());
                    y = Double.parseDouble(JuliaY.getText());
                    
                    parent.setMode(Integer.parseInt(test),x,y);
                
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(this, "Please enter two valid numbers for the Julia Set!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
            this.setVisible(false);
        
        } else {
            JOptionPane.showMessageDialog(this, "Please enter an exponent between 2 and 15.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_BOKActionPerformed

    private void MandelModeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MandelModeFocusLost
        
        try {
            if (Integer.parseInt(MandelMode.getText()) > 4 && Integer.parseInt(MandelMode.getText())<=15) {
                JOptionPane.showMessageDialog(this, "This will be very slow for values greater than 2 (default).", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        
        } catch (NumberFormatException  e) {
            
        }
    }//GEN-LAST:event_MandelModeFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JuliaModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JuliaModeActionPerformed
        
    }//GEN-LAST:event_JuliaModeActionPerformed

    private void JuliaModeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JuliaModeFocusLost
        
    }//GEN-LAST:event_JuliaModeFocusLost

    
    private void rbJuliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJuliaActionPerformed
        
        jLabel1.setEnabled(false);
        MandelMode.setEnabled(false);
        JuliaMode.setEnabled(true);
        JuliaX.setEnabled(true);
        JuliaY.setEnabled(true);
        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel5.setEnabled(true);
    }//GEN-LAST:event_rbJuliaActionPerformed

    
    private void rbMandelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMandelActionPerformed
        
        jLabel1.setEnabled(true);
        MandelMode.setEnabled(true);
        JuliaX.setEnabled(false);
        JuliaY.setEnabled(false);
        jLabel2.setEnabled(false);
        jLabel3.setEnabled(false);
        jLabel4.setEnabled(false);
        jLabel5.setEnabled(false);
        JuliaMode.setEnabled(false);
        
    }//GEN-LAST:event_rbMandelActionPerformed

    
boolean isValidMode(String test) {
    
    try {
        int i = Integer.parseInt(test);
        
        if ((i > 1) && (i < 16)) {
            return true;
        } else {
            return false;
        }
        
    }catch (Exception e) {
        return false;
    }
}    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOK;
    private javax.swing.JTextField JuliaMode;
    private javax.swing.JTextField JuliaX;
    private javax.swing.JTextField JuliaY;
    private javax.swing.JTextField MandelMode;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton rbJulia;
    private javax.swing.JRadioButton rbMandel;
    // End of variables declaration//GEN-END:variables
}
