
package mandelbrot;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 * Formular to choose a color scheme.
 * 
 * @author rix
 */
public class SchemeSelection extends javax.swing.JFrame implements MouseListener{

    private MainFrame parent;
    private int[] colorArray;
    public ColorSpectrum Spectrum;
    private ColorSelection Selection;
    private int panelsXstart, panelsYstart, panelsTotalWidth, panelsTotalHeight;
    private JColorChooser ColorChooser;

    
    /**
     * Creates new form SchemeSelection
     */
    public SchemeSelection(MainFrame parent) {
        this.parent = parent;
        
        this.pack();
        setResizable(false);
        
        colorArray = new int[6];
        Spectrum = new ColorSpectrum();
        Selection = new ColorSelection(this);
        addMouseListener(this);
        
        initComponents();
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        OKbutton = new javax.swing.JButton();
        rbStandard = new javax.swing.JRadioButton();
        CancelButton = new javax.swing.JButton();
        rbCustom = new javax.swing.JRadioButton();
        rbScheme1 = new javax.swing.JRadioButton();
        rbScheme2 = new javax.swing.JRadioButton();
        rbScheme3 = new javax.swing.JRadioButton();
        bAddColor = new javax.swing.JButton();
        bClearColor = new javax.swing.JButton();
        bShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OKbutton.setText("Ok");
        OKbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKbuttonMouseClicked(evt);
            }
        });
        OKbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKbuttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbStandard);
        rbStandard.setSelected(true);
        rbStandard.setText("Standard Scheme");
        rbStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbStandardActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButtonMouseClicked(evt);
            }
        });

        buttonGroup1.add(rbCustom);
        rbCustom.setText("Custom Scheme");
        rbCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCustomActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbScheme1);
        rbScheme1.setText("Simple blue");
        rbScheme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbScheme1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbScheme2);
        rbScheme2.setText("RGB");
        rbScheme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbScheme2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbScheme3);
        rbScheme3.setText("Pretty");
        rbScheme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbScheme3ActionPerformed(evt);
            }
        });

        bAddColor.setText("Add Color");
        bAddColor.setEnabled(false);
        bAddColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddColorActionPerformed(evt);
            }
        });

        bClearColor.setText("Clear");
        bClearColor.setEnabled(false);
        bClearColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearColorActionPerformed(evt);
            }
        });

        bShow.setText("Show");
        bShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCustom)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OKbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bShow, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbScheme2)
                            .addComponent(rbScheme1)
                            .addComponent(rbScheme3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bAddColor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bClearColor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(rbStandard))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(rbStandard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbScheme1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbScheme2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbScheme3)
                .addGap(18, 18, 18)
                .addComponent(rbCustom)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAddColor)
                    .addComponent(bClearColor))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKbutton)
                    .addComponent(CancelButton)
                    .addComponent(bShow))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void OKbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKbuttonMouseClicked
        
    }//GEN-LAST:event_OKbuttonMouseClicked

    private void OKbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKbuttonActionPerformed
    
        if (Spectrum.getColorCount() <= 1) {
                JOptionPane.showMessageDialog(this, "You have to choose at least two colors.","Error!",JOptionPane.ERROR_MESSAGE);
        
        } else {
            parent.repaint();
            showPanels();
            setVisible(false);
        }
    }//GEN-LAST:event_OKbuttonActionPerformed

    
    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CancelButtonMouseClicked

    
    private void rbCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCustomActionPerformed
        bAddColor.setEnabled(true);
        bClearColor.setEnabled(true);
        
        rbScheme1.setEnabled(false);
        rbScheme2.setEnabled(false);
        rbScheme3.setEnabled(false);
        
    }//GEN-LAST:event_rbCustomActionPerformed

    
    private void rbStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbStandardActionPerformed
        bAddColor.setEnabled(false);
        bClearColor.setEnabled(false);
        
        rbScheme1.setEnabled(true);
        rbScheme2.setEnabled(true);
        rbScheme3.setEnabled(true); 
        
        showPanels();
        
    }//GEN-LAST:event_rbStandardActionPerformed

    
    private void bShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bShowActionPerformed
        showPanels();
    }//GEN-LAST:event_bShowActionPerformed

    
    private void bClearColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearColorActionPerformed
         Spectrum.clear();
         
         showPanels();
    }//GEN-LAST:event_bClearColorActionPerformed

    
    private void bAddColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddColorActionPerformed
        Selection.override = 0;
        Selection.clearAll();
        Selection.setVisible(true);
    }//GEN-LAST:event_bAddColorActionPerformed

    
    private void rbScheme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbScheme1ActionPerformed
        Spectrum.clear();
        Spectrum.add(0, 0, 80);
        Spectrum.add(255, 255, 255);
        showPanels();
    }//GEN-LAST:event_rbScheme1ActionPerformed

    
    private void rbScheme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbScheme2ActionPerformed
        Spectrum.clear();
        Spectrum.add(255, 0, 0);
        Spectrum.add(0, 255, 0);
        Spectrum.add(0,0,255);
        showPanels();
    }//GEN-LAST:event_rbScheme2ActionPerformed

    
    private void rbScheme3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbScheme3ActionPerformed
        Spectrum.clear();
        Spectrum.add(0, 0, 80);
        Spectrum.add(255,255,255);
        Spectrum.add(80,0,0);
        Spectrum.add(255, 255, 255);
        Spectrum.add(0,80,0);
        Spectrum.add(255,255,255);
        showPanels();
    }//GEN-LAST:event_rbScheme3ActionPerformed

    
    public void showPanels() {
        int panelwidth;
        int colorCount;
        
        panelsXstart = 20;
        panelsTotalWidth = this.getWidth() - 3*panelsXstart;
        panelsYstart = 20 + bAddColor.getY()  + bAddColor.getHeight();
        panelsTotalHeight = 40;
        
        colorCount = Spectrum.getColorCount();
        
        if (colorCount == 0) {
            JPanel myPanel = new JPanel();
            this.add(myPanel);
            myPanel.setBackground(new Color(0,0,0));
            myPanel.setBounds(panelsXstart, panelsYstart, panelsTotalWidth, panelsTotalHeight);
            myPanel.setVisible(true);
    
        } else {
            panelwidth = panelsTotalWidth/colorCount;

            for (int i = 1; i <= colorCount; i ++){
        
                JPanel myPanel = new JPanel();
                this.add(myPanel);
                
                myPanel.setBackground(Spectrum.getColorByNum(i));
                myPanel.setBounds(panelsXstart + (i - 1) * panelwidth, panelsYstart, panelwidth, panelsTotalHeight);
                myPanel.setVisible(true);

            }    
        
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton OKbutton;
    private javax.swing.JButton bAddColor;
    private javax.swing.JButton bClearColor;
    private javax.swing.JButton bShow;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton rbCustom;
    private javax.swing.JRadioButton rbScheme1;
    private javax.swing.JRadioButton rbScheme2;
    private javax.swing.JRadioButton rbScheme3;
    private javax.swing.JRadioButton rbStandard;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent me) {
        int x,y;
        
        x = me.getX();
        y = me.getY();
        
        y -= ((getHeight() - getContentPane().getHeight())*0.8);
        x += ((getWidth() - getContentPane().getWidth()));
        
        if (((x >= panelsXstart) && ( x <= panelsXstart + panelsTotalWidth)) 
                && ((y >= panelsYstart) && (y <= panelsYstart + panelsTotalHeight))) {
            Selection.override = (int)(((double)(x)-20)/280*(double)(Spectrum.getColorCount())) +1;
            Selection.fillIn(Selection.override);
            Selection.setVisible(true);
        }
            
    }

    @Override
    public void mousePressed(MouseEvent me) { }

    @Override
    public void mouseReleased(MouseEvent me) { }

    @Override
    public void mouseEntered(MouseEvent me) { }

    @Override
    public void mouseExited(MouseEvent me) { }

}
