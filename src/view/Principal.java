/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.Monitor;
import exceptions.UnexpectedOSException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.OsInfo;


/**
 *
 * @author Augusto
 */
public class Principal {
    public static void main (String[] args) {
        
        Monitor monitor;
        try {
            monitor = new Monitor();
//            System.out.println(monitor.getOsInfo().getOsName());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
