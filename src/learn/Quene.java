package learn;
import java.util.LinkedList;
import java.util.Stack;
public class Quene {
    class Queue {
        Stack<Integer> stackA = new Stack<Integer>();
        Stack<Integer> stackB = new Stack<Integer>();
        //入队
        public void in(int n) {
            stackA.push(n);
        }
        //出队
        public int out() {
            if(stackB.isEmpty()){
                while (stackA.size() > 0) {
                    stackB.push(stackA.pop());
                }
            }
            return stackB.pop();
        }
    }//两个堆栈实现队列
}
class Queue {
    int[] a = new int[5];
    int i = 1; //数组下标
    //入队
    public void in(int m){
        a[i++] = m;
    }
    //出队
    public int out(){
        int index = 0;
        int temp = a[1];
        for(int j=1;j<i;j++){
            a[j-1] = a[j];
            index++;
        }
        i = index;
        return temp;
    }
} //数组实现队列
