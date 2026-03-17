
package module10;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}
public class LinkedListCycle {
public static void main(String[] args) {

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head; 

        Node slow=head;
        Node fast=head;

        boolean cycle=false;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                cycle=true;
                break;
            }
        }

        System.out.println(cycle);
    }
}   

