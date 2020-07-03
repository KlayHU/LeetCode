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

    public TwoWayLinkList{

    }

    //空置线性表
    public void clear() {

    }

    //判断线性表是否为空，为空返回true
    public boolean isEmpty() {

    }

    //获取线性表中的元素个数
    public int length() {
        return 0;
    }

    //读取并返回线性表中第i个元素的值
    public T get(int i) {

    }

    //往线性表中添加一个元素
    public void insert(T t) {

    }

    //在线性表的第i个元素之前插入一个值为t的数据元素
    public void insert(T t, int i) {

    }

    //删除并返回线性表中第i个元素
    public T remove(int i) {

    }

    //返回线性表中首次出现的制定的数据元素的位序号，若不存在，返回-1
    public int indexOf(T t) {

    }

    //获取第一个元素
    public T getFirst() {

    }

    //获取最后一个元素
    public T getLast() {

    }
}
