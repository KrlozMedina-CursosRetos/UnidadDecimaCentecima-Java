/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on Feb 15, 2011, 8:11:08 AM
 */

package tarea1;

/**
 *
 * @author Alejandro
 */
public class NewJFrame extends javax.swing.JFrame {

    /** Creates new form NewJFrame */
    public NewJFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        c2 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c3, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(c1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(180, 180, 180))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(25, 25, 25)
                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String k=c1.getText();
        String cc;
        String er=("Ingrese numero de tres digitos unicamente."), err=("ingrese u, d, ?? c unicamente.");
        char p, x, z ;
        int h, hc,j;
        int z1=0;
        j=k.length();
        cc=c2.getText();
        h=cc.length();

        if("u".equals(cc)){
        z1= uni(k);
        c3.setText(String.valueOf(z1));
        }
 else{
            if("d".equals(cc)){
        z1= dec(k);
        c3.setText(String.valueOf(z1));
        }
 else{
                if("c".equals(cc)){
        z1= cen(k);
        c3.setText(String.valueOf(z1));
        }
 else{
                 c2.setText(String.valueOf(err));
 
 }
 }
 }
        if(j>=4){
            c1.setText(String.valueOf(er));
            c3.setText(String.valueOf(er));
        }
}//GEN-LAST:event_jButton1ActionPerformed

int uni(String f){
int y=0;
y=y + Integer.parseInt(f);
y=y%10;
return y;
}
int dec(String f){
int x=0, y=0,z=0,e=999,r=0, d;
char u=0,c,h=3;
String o,p,q,k;
y=y + Integer.parseInt(f);
y=y/10;
d=y%10;
return d;
}
int cen(String f){
int x=0, y=0,z=0,e=999,r=0, d, c;
char u=0,h=3;
String o,p,q,k;
y=y + Integer.parseInt(f);
y=y/10;
d=y/10;
c=d%10;
return c;
}
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

}
