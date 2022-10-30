  // Reverse list using loop or iteration

public class LL6 {

    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // ADD END

    public void addEnd(String data){
        Node newNode = new Node(data);
          if(head == null){
              newNode.next = head;
              head = newNode;
              return;
          }
          Node curNode = head;
          while(curNode.next != null){
            curNode = curNode.next;
          }
          curNode.next = newNode;
    }

    // PRINT LIST

    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data+"-> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    // REVERSE LIST

     public void reverseList(){
        if(head == null || head.next ==  null)
{
    return;
}        
          Node previousNode = head;
          Node curNode = head.next;

          while(curNode != null){
            Node nextNode = curNode.next;
            curNode.next = previousNode;

              // Update

              previousNode = curNode;
              curNode = nextNode;

          }
          head.next = null;
          head = previousNode;

     }
    public static void main(String args []){
        LL6 list = new LL6();
        list.addEnd("asif");
        list.addEnd("is");
        list.addEnd("name");
        list.addEnd("my");
        list.printList();
        list.reverseList();
        list.printList();
    }
}
