package it.unibo.shapes.api;

public class AObject {
        public static void main (String[] args) {
            Object o = Integer.valueOf(10);
            Integer i = (Integer) o; // OK
            String s = (String) o; // ClassCastException
            // int i = o.intValue(); // No, intValue() non def. // String s = (String)i; // No, tipi inconvertibili
            System.out.println(i+","+ s);
        } 
}
