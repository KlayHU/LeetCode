package Leetcode.Easy;

import java.util.Stack;

/**
 * @description: No：232 用栈实现队列  【难度：简单】
 * @author: KlayHu
 * 思路：两个栈实现入栈和出栈。由于队列和栈的元素进出顺序相反，而两个栈正好可以实现一反一正的元素
 * 顺序的转换。
 * ====================================================================================
 * leetcode题解：还有双向队列deque的做法。
 * @create: 2020/9/9 9:28
 **/
public class MyQueue_232 {
    //需要两个栈来模拟入栈出栈
    private Stack<Integer> in;
    private Stack<Integer> out;
    /** Initialize your data structure here. */
    public MyQueue_232() {
        in = new Stack<>();
        out = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                //如果出栈中的元素为空，就把入栈的元素依次弹出到出栈中，这样可以实现
                //在最后的元素最先出来，实现先进先出
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
