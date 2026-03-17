
package module10;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}
public class RemoveNthNode {
   public static void main(String[] args) {

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        int n=2;

        Node first=head;
        Node second=head;

        for(int i=0;i<n;i++)
            first=first.next;

        if(first==null){
            head=head.next;
        }else{

            while(first.next!=null){
                first=first.next;
                second=second.next;
            }

            second.next=second.next.next;
        }

        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

