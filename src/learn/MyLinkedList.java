package learn;
class MyLinkedList {
    class Node{
        int val;
        Node next;

        public Node(){
        }
        public Node(int val, Node node){
            this.val = val;
            this.next = node;
        }
    }
    Node root;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        root = null;
    }
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node temp = root;
        while(index-- > 0 && temp != null){
            temp = temp.next;
        }
        if(temp != null){
            return temp.val;
        }
        return -1;
    }
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val,null);
        if(root == null){
            root = node;
        } else {
            node.next = root;
            root = node;
        }

    }
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val,null);
        if(root == null){
            root = node;
        }
        Node temp = root;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {

        Node temp = root;
        while(--index > 0 && temp != null){//
            temp = temp.next;
        }
        if(temp == null && index >= 0){
            return;
        }
        Node node = new Node(val,null);
        if(index < 0){
            if(root != null){
                node.next = root;
            }
            root = node;
            return;
        }

        if(temp.next != null){
            node.next = temp.next;
        }
        temp.next = node;

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index == 0){
            root = root.next;
        }
        Node temp = root;
        while(--index > 0 && temp != null){
            temp = temp.next;
        }
        if(temp != null && temp.next != null){
            temp.next = temp.next.next;
        }
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
