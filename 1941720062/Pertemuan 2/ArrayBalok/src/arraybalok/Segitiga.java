/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraybalok;

/**
 *
 * @author Erika
 */
public class Segitiga {
    public int alas;
    public int tinggi;
    
Segitiga(){
    }
    
    Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }

    Segitiga() {
         }
    double hitungLuas(int a, int t){
        return alas*tinggi/2;
    }
    double hitungKeliling(){
        return alas*3;
                
    }
}