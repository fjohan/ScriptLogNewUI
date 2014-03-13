/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.lu.scriptlognewui.scriptlog2;

import javax.swing.JFrame;

/**
 *
 * @author johanf
 */
class Maximiser {

    static void maximise(NewMDIApplication aThis) {
        aThis.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
