/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.marvels;

/**
 *
 * @author c0662366
 */
public class CPD4414Assignment1Marvels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static String stringPower(String str, int num) {
        String res = null;
        if(str == ""){
            res = ""; 
        }
        else if(num < 1) {
            res = null;
        }
        else if(num == 1) {
            res = str;
        }
        else if(num == 2) {
            res = str+""+str;
        }
        return res;
    }
    
}
