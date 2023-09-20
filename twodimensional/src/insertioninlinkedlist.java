import org.w3c.dom.Node;
import java.util.Scanner;
import java.io.*;

public class insertioninlinkedlist {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }}

    public Node head=null;
    int n;
    int data;
    int temp;
    int i;


    public void addnote() {
        Node newNode = new Node(data);
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Enter the input");
            int data = s.nextInt();
            System.out.println("enter 1 to terminate the program");
            n = s.nextInt();
        }
        while (n == 1);
        if (head == null) {
            newNode = head;
        } else {
            newNode.next = head;
            newNode = head;
            System.out.println("insert the node at first position press(1) or insert at last position press (2) or insert at any position press(3)");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    newNode.next = head;
                    head = newNode;
                    System.out.println("insert the node" + data);
                    break;
                case 2:
//
                    Node last=head;
                    while(last.next!=null){
                        last=last.next;

                    } last.next=head;
                    break;
//                case 3:
//                    int pos;
//                    System.out.println("enter where do you want to insert");
//                    pos=s.nextInt();
//                    Node temp=head;
//                    i=0;
//                    while(i<pos-1) {
//                    temp.next=temp;
//                    temp=newNode;
//                    }i++;
//                    break;


            }
        }
    }





    public static void main(String[] args) {
        linkedlist l=new linkedlist();
        l.addnote();
    }
}
