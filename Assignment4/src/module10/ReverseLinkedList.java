
package module10;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReverseLinkedList {
public static void main(String[] args) {

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        Node prev=null;
        Node curr=head;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node temp=prev;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

