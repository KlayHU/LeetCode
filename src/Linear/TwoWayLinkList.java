package Linear;

/**
 * @description: 双向链表
 * @author: KlayHu
 * @create: 2020/7/3 23:47
 **/
public class TwoWayLinkList<T> {
    //首结点
    private Node head;
    //最后一个结点
    private Node last;
    //链表的长度
    private int N;

    //结点类
    private class Node {
        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }

        //存储数据
        public T item;
        //指向上一个结点
        public Node pre;
        //指向下一个节点
        public Node next;
    }

    public TwoWayLinkList() {
        this.head = new Node(null, null, null);
        this.last = null;
        this.N = 0;
    }

    //空置线性表
    public void clear() {
        this.head.next = null;
        this.last = null;
        this.N = 0;
    }

    //判断线性表是否为空，为空返回true
    public boolean isEmpty() {
        return N == 0;
    }

    //获取线性表中的元素个数
    public int length() {
        return N;
    }

    //获取第一个元素
    public T getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.next.item;
    }

    //获取最后一个元素
    public T getLast() {
        if (isEmpty()) {
            return null;
        }
        return last.item;
    }

    //往线性表中添加一个元素
    public void insert(T t) {
        if (isEmpty()) {
            //链表为空的情况：
            //创建新结点，让新结点成为尾结点，让头结点指向尾结点
            Node node = new Node(t, head, null);
            last = node;
            head.next = last;
        }else {
            //链表不为空的情况：
            //创建新结点，让当前尾结点指向新结点，让新节点成为尾结点
            Node oldLast = last;
            Node node = new Node(t, oldLast, null);
            oldLast.next = node;
            last = node;
        }
        //元素个数+1
        N++;

    }

    //读取并返回线性表中第i个元素的值
    public T get(int i) {
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n= n.next;
        }
        return n.item;
    }

    //在线性表的第i个元素之前插入一个值为t的数据元素
    public void insert(T t, int i) {
        //找到i位置的前一个结点，
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        //找到i位置的结点
        Node curr = pre.next;
        //创建新结点
        Node newNode = new Node(t, pre, curr);
        //让i位置的前一个结点的下一个结点变为新结点，让i位置的前一个结点变为新结点
        pre.next = newNode;
        curr.pre = newNode;
        //元素个数+1
        N++;

    }

    //删除并返回线性表中第i个元素
    public T remove(int i) {
        return null;
    }

    //找到元素t在链表中第一次出现的位置
    public int indexOf(T t) {
        Node n = head;
        for (int i = 0; n.next != null; i++) {
            n=n.next;
            if (n.item.equals(t)) {
                return i;
            }
        }
        return -1;
    }

}
