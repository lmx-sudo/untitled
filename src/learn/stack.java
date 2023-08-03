package learn;
import java.util.LinkedList;
import java.util.Arrays;
public class stack {
    /**
     * 数组实现栈
     * @param <T>
     */
    static class Mystack1<T> {
        //实现栈的数组
        private Object[] stack;
        //数组大小
        private int size;
        Mystack1() {
            stack = new Object[10];//初始容量为10
        }
        //判断是否为空
        public boolean isEmpty() {
            return size == 0;
        }
        //返回栈顶元素
        public T peek() {
            T t = null;
            if (size > 0)
                t = (T) stack[size - 1];
            return t;
        }
        public void push(T t) {
            expandCapacity(size + 1);
            stack[size] = t;
            size++;
        }
        //出栈
        public T pop() {
            T t = peek();
            if (size > 0) {
                stack[size - 1] = null;
                size--;
            }
            return t;
        }
        //扩大容量
        public void expandCapacity(int size) {
            int len = stack.length;
            if (size > len) {
                size = size * 3 / 2 + 1;//每次扩大50%
                stack = Arrays.copyOf(stack, size);
            }
        }
    }
    public static class ArrayStack {
        public static void main(String[] args) {
            Mystack1<String> stack = new Mystack1<>();
            System.out.println(stack.peek());
            System.out.println(stack.isEmpty());
            stack.push("java");
            stack.push("is");
            stack.push("beautiful");
            stack.push("language");
            System.out.println(stack.pop());
            System.out.println(stack.isEmpty());
            System.out.println(stack.peek());
        }
    }
    /**
     * 链表实现栈
     *
     * @param <T>
     */
    static class Mystack2<T> {
        //定义链表
        class Node<T> {
            private T t;
            private Node next;
        }

        private Node<T> head;

        //构造函数初始化头指针
        Mystack2() {
            head = null;
        }

        //入栈
        public void push(T t) {
            if (t == null) {
                throw new NullPointerException("参数不能为空");
            }
            if (head == null) {
                head = new Node<T>();
                head.t = t;
                head.next = null;
            } else {
                Node<T> temp = head;
                head = new Node<>();
                head.t = t;
                head.next = temp;
            }
        }

        //出栈
        public T pop() {
            T t = head.t;
            head = head.next;
            return t;
        }

        //栈顶元素
        public T peek() {
            T t = head.t;
            return t;
        }

        //栈空
        public boolean isEmpty() {
            if (head == null)
                return true;
            else
                return false;
        }
    }

    public static class LinkStack {
        public static void main(String[] args) {
            Mystack2 stack = new Mystack2();
            System.out.println(stack.isEmpty());
            stack.push("Java");
            stack.push("is");
            stack.push("beautiful");
            System.out.println(stack.peek());
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.isEmpty());
            System.out.println(stack.pop());
            System.out.println(stack.isEmpty());
        }
    }


    /**
     * LinkedList实现栈
     *
     * @param <T>
     */
    static class ListStack<T> {
        private LinkedList<T> ll = new LinkedList<>();

        //入栈
        public void push(T t) {
            ll.addFirst(t);
        }

        //出栈
        public T pop() {
            return ll.removeFirst();
        }

        //栈顶元素
        public T peek() {
            T t = null;
            //直接取元素会报异常，需要先判断是否为空
            if (!ll.isEmpty())
                t = ll.getFirst();
            return t;
        }

        //栈空
        public boolean isEmpty() {
            return ll.isEmpty();
        }
    }

    public static class LinkedListStack {
        public static void main(String[] args) {
            ListStack stack = new ListStack();
            System.out.println(stack.isEmpty());
            System.out.println(stack.peek());
            stack.push("java");
            stack.push("is");
            stack.push("beautiful");
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.isEmpty());
            System.out.println(stack.peek());
        }
    }
}
