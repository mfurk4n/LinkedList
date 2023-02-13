/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bagliliste;

/**
 *
 * @author mfurk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Muhammed Furkan Elaldı  
       
        
        LinkedList obj = new LinkedList();
        obj.addToHead(7); 
        obj.addToHead(2);
        obj.addToHead(4);
        obj.addToLast(8);
        System.out.print("basa ve sona eklenerek elde edilen ilk hali ");
        obj.print();
        System.out.print("araya ekle ");
        obj.addToSpesificPoint(2, 3);
        obj.print();
        System.out.print("bastan sil ");
        obj.deleteFromScratch();
        obj.print();
        System.out.print("aradan sil ");
        obj.deleteFromSpesificPoint(3);
        obj.print();
        System.out.print("sondan sil ");
        obj.deleteFromLast();
        obj.print();
        
    }
    
}
