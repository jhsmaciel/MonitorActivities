/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import exceptions.UnexpectedOSException;
import model.OsInfoMac;
import model.OsInfoLinux;
import model.OsInfo;
import model.OsInfoWindows;
import model.OsType;

/**
 *
 * @author Augusto
 */
public class Monitor {
    private OsInfo osInfo;
    
    public Monitor() throws Exception {
        osInfo = OsInfoInstantiate();
        System.out.println(osInfo.getOsName()); 
        osInfo.capturaProcesso();
    }

    private OsInfo OsInfoInstantiate() throws UnexpectedOSException {
        String os = System.getProperty("os.name");
        if (os.startsWith("Windows")) {
            return new OsInfoWindows();
        } else if (os.startsWith("Linux")){
            return new OsInfoLinux();
        } else if (os.startsWith("Mac")){
            return new OsInfoMac();
        } else {
            throw new UnexpectedOSException();
        }
    }

    public String getOsName() {
        return osInfo.getOsName();
    }
}
