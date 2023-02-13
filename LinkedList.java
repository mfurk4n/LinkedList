/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagliliste;

/**
 *
 * @author mfurk
 */
public class LinkedList {

    Node first;
    Node last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public void addToHead(int value) {
        Node n = new Node();
        n.data = value;
        if (first == null) {
            first = n;
            last = n;
        } else {
            n.next = first;
            first = n;
        }
    }

    public void addToLast(int value) {
        Node n = new Node();
        n.data = value;
        if (first == null) {
            first = n;
            last = n;
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void addToSpesificPoint(int searched, int value) {
        Node n = new Node();
        n.data = value;

        Node temp = first;
        while (temp.data != searched) {
            temp = temp.next;
        }
        Node tempNext = temp.next;

        temp.next = n;
        n.next = tempNext;

    }

    public void deleteFromScratch() {
        if (first == null) {
            System.out.println("List is empty");
        } else {
            if (first != last) {
                first = first.next;
            }
        }
    }
    
    public void deleteFromLast() {
        Node temp = first;
        Node pre = null;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        if (pre == null) {
            first = null;
            last = null;
        } else {
            pre.next = null;
            last = pre;
        }
    }

    public void deleteFromSpesificPoint(int searched) {
        Node temp = first;
        Node pre = null;
        if (temp != null && temp.data == searched) {
            first = temp.next;
        }
        while (temp != null && temp.data != searched) {
            pre = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        pre.next = temp.next;
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " >> ");
            temp = temp.next;
        }
        System.out.println("");
    }
}
