package learn;
public class LinkNode {
    int val;
    LinkNode next;
    public LinkNode() {
    }
    public LinkNode(int val) {
        this.val = val;
    }
    public LinkNode(int val, LinkNode next) {
        this.val = val;
        this.next = next;
    }
    public static void showNode(LinkNode head){
        while (head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
    //在链表的头部插入节点
    public static void headInsert(LinkNode head,LinkNode newNode){
        newNode.next = head;
        head = newNode;
        showNode(head);
    }
    //在链表的中间插入节点
    public static void middleInsert(LinkNode head,LinkNode newNode,int middle){
        LinkNode pre = head;
        while (pre.val != middle){
            pre = pre.next;
        }
        newNode.next = pre.next;
        pre.next = newNode;
        showNode(head);
    }
    //在链表的尾部插入节点
    public static void tailInsert(LinkNode head,LinkNode newNode){
        LinkNode pre = head;
        while (head.next != null){
            head = head.next;
        }
        head.next = newNode;
        newNode.next = null;
        head = pre;
        showNode(head);

    }
    public static void delete(LinkNode head,LinkNode newNode) {

    }
    public static void main(String[] args) {
        LinkNode head = new LinkNode(23);
        head.next = new LinkNode(6);
        head.next.next = new LinkNode(15);
        head.next.next.next = new LinkNode(0);
        System.out.print("原始链表：\t");
        showNode(head);
        LinkNode newNode = new LinkNode(9);
        System.out.print("\n在链表的头部插入节点:\t");
        headInsert(head,newNode);
        System.out.print("\n在链表的中间插入节点:\t");
        middleInsert(head,newNode,6);
        System.out.print("\n在链表的尾部插入节点:\t");
        tailInsert(head,newNode);
    }
}