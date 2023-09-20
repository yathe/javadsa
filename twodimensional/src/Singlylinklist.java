public class Singlylinklist {
    private Node head;
    private Node tail;
    private int size;
    public Singlylinklist(){
        this.size=0;
    }

    public void insertnodefirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;

    }
    public  void insertlast(int value){
        if(tail==null){
            insertnodefirst(value);
            return;

        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int Value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
   }

    public static void main(String[] args) {
        Singlylinklist list=new Singlylinklist();
        list.insertnodefirst(7);
        list.insertnodefirst(17);
        list.insertnodefirst(72);
        list.insertnodefirst(87);
        list.insertnodefirst(74);
        list.insertlast(58);
        list.insertlast(86);
        list.insertlast(83);
        list.insertlast(88);
        list.display();

    }
}

