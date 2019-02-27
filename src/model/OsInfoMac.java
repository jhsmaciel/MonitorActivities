/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Augusto
 */
public class OsInfoMac extends OsInfo {

    public OsInfoMac() {
        super();
        osName = "Mac";
    }

    @Override
    public void capturaProcesso() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
