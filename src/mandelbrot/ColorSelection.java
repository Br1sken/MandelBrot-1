
package mandelbrot;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Form to choose a color. Uses the JColorChooser.
 * 
 * Because some people can't be bothered to enter RGB colors by value.
 * 
 * @author rix
 */
public class ColorSelection extends javax.swing.JFrame {
    
    private SchemeSelection parent;
    
    private int[] colorArray = new int[3];
    public int override = 0;
    
    /**
     * Creates new form ColorSelection
     */
    public ColorSelection(SchemeSelection parent) {
        this.parent = parent;
        
        
        initComponents();
        
        MyPreviewPane myPanel;
        myPanel = new MyPreviewPane(ColorChooser);
        ColorChooser.setPreviewPanel(myPanel);
        ColorChooser.removeChooserPanel(ColorChooser.getChooserPanels()[0]);
        ColorChooser.removeChooserPanel(ColorChooser.getChooserPanels()[0]);
        ColorChooser.removeChooserPanel(ColorChooser.getChooserPanels()[0]);
        ColorChooser.removeChooserPanel(ColorChooser.getChooserPanels()[1]);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bOK = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        ColorChooser = new javax.swing.JColorChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bOK.setText("OK");
        bOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOKActionPerformed(evt);
            }
        });

        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bOK, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(ColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bOK)
                    .addComponent(bCancel)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOKActionPerformed
        int r,g,b;
        
        r = ColorChooser.getColor().getRed();
        g = ColorChooser.getColor().getGreen();
        b = ColorChooser.getColor().getBlue();
        
        if (override == 0) {
            parent.Spectrum.add(r,g,b);
        } else {

            parent.Spectrum.change(override, r,g,b);
        }
        setVisible(false);
        parent.setVisible(true);
        parent.showPanels();
            
   
    }//GEN-LAST:event_bOKActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        setVisible(false);
        parent.showPanels();
    }//GEN-LAST:event_bCancelActionPerformed
   
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser ColorChooser;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bOK;
    // End of variables declaration//GEN-END:variables
    
    public void fillIn(int over) {
        ColorChooser.setColor(parent.Spectrum.getColorByNum(over));
    }
    
    public void clearAll() {
        ColorChooser.setColor(new Color(255,255,255));
    }
    

}

class MyPreviewPane extends JLabel{
  Color curColor;
  public MyPreviewPane(JColorChooser chooser) {
    curColor = chooser.getColor();
    
    ColorSelectionModel model = chooser.getSelectionModel();
    model.addChangeListener(new ChangeListener() {
        @Override
      public void stateChanged(ChangeEvent evt) {
        ColorSelectionModel model = (ColorSelectionModel) evt.getSource();
        curColor = model.getSelectedColor();
      }
    });
    setPreferredSize(new Dimension(50, 50));
  }
    @Override
  public void paint(Graphics g) {
    g.setColor(curColor);
    g.fillRect(0, 0, getWidth() - 1, getHeight() - 1);
  }
}

