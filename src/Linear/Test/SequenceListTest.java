package Linear.Test;

import Linear.SequenceList;

/**
 * @description: 线性表测试类
 * @author: KlayHu
 * @create: 2020/6/15 22:11
 **/
public class SequenceListTest {
    public static void main(String[] args) {
        //创建顺序表对象
        SequenceList<String> sequenceList = new SequenceList<>(10);

        //测试插入
        sequenceList.insert("姚明");
        sequenceList.insert("易建联");
        sequenceList.insert("王治郅");
        sequenceList.insert(1,"库里");

        for (String s : sequenceList) {
            System.out.println(s);
        }

        System.out.println("-------------------------------------------------------------------------");
        //测试获取
        String getResult = sequenceList.get(1);
        System.out.println("获取索引“1”处的结果为："+getResult);

        //测试删除
        String removeResult = sequenceList.remove(0);
        System.out.println("索引“0”处被删除的元素是:"+removeResult);

        //测试清空
        sequenceList.clear();
        System.out.println("清空后的线性表中元素的个数为："+sequenceList.length());
    }
}
