import java.util.ArrayList;

public class PalindromeLInkedList {
    static class Listnode{
        int val;
        Listnode next;
        Listnode() {}
        Listnode(int val){
            this.val = val;
        }
        public Listnode(int val, Listnode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static boolean ispal(Listnode head){
        ArrayList<Integer> list = new ArrayList<>();
        while(head!= null){
            list.add(head.val);
            head = head.next;
        }
        int l = 0;
        int r = list.size() - 1;
        while(l<r){
            if(list.get(l) != list.get(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void printlist(Listnode head){
        while(head!=null){
            System.out.println(head.val + "->");
            head = head.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Listnode head = new Listnode(1,
            new Listnode(2,
            new Listnode(3,
            new Listnode(4))
        ));
        printlist(head);
        if (ispal(head)) {
            System.out.println("Linked List is Palindrome");
        } else {
            System.out.println("Linked List is NOT Palindrome");
        }
    }
}
