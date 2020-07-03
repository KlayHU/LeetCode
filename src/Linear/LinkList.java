package Linear;

import java.util.Iterator;

/**
 * @description: 单向链表
 * @author: KlayHu
 * @create: 2020/7/2 16:28
 **/
public class LinkList<T> implements Iterable<T>{
    //记录头结点
    private Node head;
    //记录链表长度
    private int N;


    //节点类
    private class Node {
        //存储数据
        T item;
        //下一个结点
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkList() {
        //初始化头结点
        this.head = new Node(null, null);
        //初始化元素个数
        this.N = 0;
    }

    //清空链表
    public void clear() {
        head.next = null;
        this.N = 0;
    }

    //获取链表的长度
    public int length() {
        return N;
    }

    //判断链表的长度
    public boolean isEmpty() {
        return N == 0;
    }

    //获取指定位置i出的元素
    public T get(int i) {
        //通过循环，从头结点开始往后找，依次找i次，就可以找到对应的元素
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.item;
    }

    //向链表中添加元素t
    public void insert(T t) {
        //找到当前最后一个结点
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        //创建新节点，保存元素
        Node newNode = new Node(t, null);
        //让当前最后一个节点指向新结点
        n.next = newNode;
        //元素个数++
        N++;
    }

    //向指定位置i处，添加元素t
    public void insert(int i, T t) {
        //找到i位置处的前一个结点
        Node pre = head;
        for (int index = 0; index <= i - 1; index++) {
            pre = pre.next;
        }
        //找到i位置处的结点
        Node cur = pre.next;
        //创建新节点，并且让新节点指向原来i位置的结点
        Node newNode = new Node(t, cur);
        //原来i位置处的前一个结点指向新节点即可
        pre.next = newNode;
        //元素个数++
        N++;
    }

    //删除并返回链表中第i个数据元素
    public T remove(int i) {
        //找到i位置的前一个结点
        Node pre = head;
        for (int index = 0; index <= i - 1; index++) {
            pre = pre.next;
        }
        //找到i位置结点
        Node cur = pre.next;
        //找到i位置下一个节点
        Node nextNode = cur.next;
        //前一个结点指向下一个结点
        pre.next = nextNode;
        //元素个数--
        N--;
        return cur.item;
    }

    //返回线性表中首次出现的指定的元素的位序号，若不存在，返回-1
    public int indexOf(T t) {
        //从头结点开始，一次找到每一个结点，取出item与t进行比较
        Node flag = head;
        for (int index = 0; index < N; index++) {
            flag = flag.next;
            if (flag.item.equals(t)) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }

    private class LIterator implements Iterator {

        private Node n;
        public LIterator(){
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }
    }
}
