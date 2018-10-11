/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author CCNE
 */
public class HoaQuoa {

    double giaBan;
    String nguonGoc;

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }
    
}

class QuaCam extends HoaQuoa{
     
}   
class QuaTao extends HoaQuoa{
     
}   
class CamCaoPhong extends QuaCam{
     
}   
class CamSanh extends QuaCam{
     
}   
