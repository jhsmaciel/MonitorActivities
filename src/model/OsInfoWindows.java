/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Augusto
 */
public class OsInfoWindows extends OsInfo {

    public OsInfoWindows() {
        super();
        osName = "Windows";
    }

    @Override
    public void capturaProcesso() throws Exception {
        String command = "tasklist";
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("tasklist");
        pr.getInputStream();
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String readline;
        while((readline = buffer.readLine())!=null){
            System.out.println(readline);
            if(readline.contains("reply")){
                long ping = System.currentTimeMillis();
                System.out.println("Pinged in:"+ ping);
            }
        }
    }
    
}
