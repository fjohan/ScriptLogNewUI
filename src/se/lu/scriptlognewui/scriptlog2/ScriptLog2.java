/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.lu.scriptlognewui.scriptlog2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu.Separator;
import javax.swing.WindowConstants;

/**
 *
 * @author johanf
 */
public class ScriptLog2 extends javax.swing.JFrame {

    /**
     * Creates new form ScriptLog2
     */
    public ScriptLog2() {
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

        jDesktopPane1 = new JDesktopPane();
        menuBar = new JMenuBar();
        fileMenu = new JMenu();
        jMenuItem1 = new JMenuItem();
        jSeparator1 = new Separator();
        jMenu2 = new JMenu();
        jMenuItem3 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jSeparator2 = new Separator();
        jMenu1 = new JMenu();
        jMenuItem2 = new JMenuItem();
        jMenuItem5 = new JMenuItem();
        jSeparator3 = new Separator();
        jMenuItem4 = new JMenuItem();
        exitMenuItem = new JMenuItem();
        editMenu = new JMenu();
        cutMenuItem = new JMenuItem();
        copyMenuItem = new JMenuItem();
        pasteMenuItem = new JMenuItem();
        deleteMenuItem = new JMenuItem();
        helpMenu = new JMenu();
        contentsMenuItem = new JMenuItem();
        aboutMenuItem = new JMenuItem();
        jMenu3 = new JMenu();
        jMenuItem7 = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        jMenuItem1.setText("New log");
        jMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);
        fileMenu.add(jSeparator1);

        jMenu2.setText("Open log");

        jMenuItem3.setText("Open latest log");
        jMenu2.add(jMenuItem3);

        jMenuItem6.setText("Open other log...");
        jMenu2.add(jMenuItem6);

        fileMenu.add(jMenu2);
        fileMenu.add(jSeparator2);

        jMenu1.setText("Continue log");

        jMenuItem2.setText("Continue latest log");
        jMenu1.add(jMenuItem2);

        jMenuItem5.setText("Continue other log...");
        jMenu1.add(jMenuItem5);

        fileMenu.add(jMenu1);
        fileMenu.add(jSeparator3);

        jMenuItem4.setText("Master");
        fileMenu.add(jMenuItem4);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");
        editMenu.setEnabled(false);

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        jMenu3.setText("Frames");

        jMenuItem7.setText("New ScriptLogFrame");
        jMenuItem7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        menuBar.add(jMenu3);

        setJMenuBar(menuBar);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addComponent(jDesktopPane1, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addComponent(jDesktopPane1, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SimpleSetupFrame ssf = new SimpleSetupFrame();
        //sf.setLocation(100,100);
        ssf.setVisible(true);
        jDesktopPane1.add(ssf);
        try {
            ssf.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
//        SimpleJIF sjif = new SimpleJIF(jDesktopPane1);
//        sjif.setLocation(100, 100);
//        sjif.setVisible(true);
//        sjif.addMe();
//        Simple1 s1 = new Simple1(this, rootPaneCheckingEnabled);
//        s1.setLocation(100, 100);
//        s1.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ScriptLogFrame slf = new ScriptLogFrame();
        slf.setVisible(true);
        jDesktopPane1.add(slf);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(ScriptLog2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScriptLog2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScriptLog2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScriptLog2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ScriptLog2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JMenuItem aboutMenuItem;
    private JMenuItem contentsMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem cutMenuItem;
    private JMenuItem deleteMenuItem;
    private JMenu editMenu;
    private JMenuItem exitMenuItem;
    private JMenu fileMenu;
    private JMenu helpMenu;
    private JDesktopPane jDesktopPane1;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
    private JMenuItem jMenuItem7;
    private Separator jSeparator1;
    private Separator jSeparator2;
    private Separator jSeparator3;
    private JMenuBar menuBar;
    private JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables
}
