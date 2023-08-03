package learn;
public class MyCircleQueue {
    int front = 0;//队首指针
    int rear = 0;//队尾指针
    int size;
    int data[] ;//顺序队列;//顺序队列
    //构造器
    public MyCircleQueue(int size) {
        this.size = size;
        data = new int[size + 1];
    }
    /**
     * 从队首获取元素。如果队列为空，返回 -1
     */
    int Front(){
        if(isEmpty()){
            return -1;
        }
        int temp = (front+1)%data.length;
        return data[temp];
    }
    /**
     *  获取队尾元素。如果队列为空，返回 -1
     */
    int Rear(){
        if(isEmpty()){
            return -1;
        }
        return data[rear];
    }
    /**
     * 向循环队列插入一个元素。如果成功插入则返回真
     */
    boolean enQueue(int val){
        //判断队列是否已满
        if(isFull()){
            return false;
        }
        rear = (rear +1) % data.length;
        data[rear] = val;
        return  true;
    }
    /**
     * 从循环队列中删除一个元素。如果成功删除则返回真
     */
    boolean deQueue(){
        if (isEmpty())
            return false;
        front = (front+1)%data.length;
        return true;
    }
    /**
     * 检查循环队列是否为空
     */
    boolean isEmpty(){
        if (rear == front)
            return true;
        return false;
    }

    /**
     * 判断循环队列是否已满
     */
    boolean isFull(){
        if((rear+1)%data.length == front){
            return true;
        }
        return false;
    }
}
    /**
     * Return the length of the shortest path between root and target node.
     */
    /*广度搜索优先
    int BFS(Node root, Node target) {
        Queue<Node> queue;  // store all nodes which are waiting to be processed
        Set<Node> used;     // store all the used nodes
        int step = 0;       // number of steps neeeded from root to current node
        // initialize
        add root to queue;
        add root to used;
        // BFS
        while (queue is not empty) {
            step = step + 1;
            // iterate the nodes which are already in the queue
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                Node cur = the first node in queue;
                return step if cur is target;
                for (Node next : the neighbors of cur) {
                    if (next is not in used) {
                        add next to queue;
                        add next to used;
                    }
                }
                remove the first node from queue;
            }
        }
        return -1;          // there is no path from root to target
    }*/