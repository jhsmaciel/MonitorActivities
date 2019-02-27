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
public abstract class OsInfo{
    protected String osName;
    
    public OsInfo(){
        super();
    }

    public String getOsName() {
        return osName;
    }
    
    public abstract void capturaProcesso() throws Exception;
}
