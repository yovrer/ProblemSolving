
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class TestGenrate {
    public static void main(String[] args)throws Exception {
        BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
        
        
        out.write(1000+"\n");
        for (int i = 1; i <= 1000; i++) {
            out.write(i+"\n");
        }
        out.flush();
        out.close();
    }
}
