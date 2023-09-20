import org.w3c.dom.Node;
import java.util.Scanner;

public class linkedlist {
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

    public void addnote(){
        Node newNode=new Node(data);
        Scanner s=new Scanner(System.in);
        do{
        System.out.println("Enter the input");
            int data=s.nextInt();
            System.out.println("enter 1 to terminate the program");
            n= s.nextInt();}
        while (n==1);
        if(head==null){
            newNode=head;
        }

else{
    newNode.next=head;
    newNode=head;
        }



    }

    public static void main(String[] args) {
        linkedlist l=new linkedlist();
        l.addnote();
    }
}
