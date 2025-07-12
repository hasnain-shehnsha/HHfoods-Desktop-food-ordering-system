/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */

public class openPdf {
    public static void openbyId(String id){
        try{
            File file = new File("H:\\CODES\\java\\Food-Ordering-DeskApp\\Java-Online-Food-Ordering-System-main\\Java-Online-Food-Ordering-System-main\\bills"+id+".pdf");
            if(file.exists()){
                if (Desktop.isDesktopSupported()){
                    Desktop.getDesktop().open(file);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Not supported.");
                }
//                Process p = Runtime
//                        .getRuntime()
//                        .exec("rundll32 url.dll.FileProtocolHangler D:\\"+id+".pdf");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "File does not exist.");
            }
        }
        catch(Exception e){
          
            JOptionPane.showMessageDialog(null, e);
         
        }
    }
}
