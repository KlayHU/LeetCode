package Linear.Test;

import Linear.SequenceList;

/**
 * @description: 可变容量顺序表
 * @author: KlayHu
 * @create: 2020/6/16 20:26
 **/
public class SequenceListCompTest {
    public static void main(String[] args) {
        SequenceList<String> sequenceList = new SequenceList<>(5);
        sequenceList.insert("张三");
        sequenceList.insert("李四");
        sequenceList.insert("王五");
        sequenceList.insert("Klay胡");
        sequenceList.insert("汤普森");
        sequenceList.insert("汤普森");
    }
}
