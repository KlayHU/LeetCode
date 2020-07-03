package Linear.Test;

import Linear.LinkList;
import Linear.SequenceList;

/**
 * @description: 线性表测试类
 * @author: KlayHu
 * @create: 2020/6/15 22:11
 **/
public class LinkListTest implements Cloneable{
    public static void main(String[] args) {
        //创建单向链表对象
        LinkList<String> linkList = new LinkList<String>();

        //测试插入
        linkList.insert("姚明");
        linkList.insert("易建联");
        linkList.insert("王治郅");
        linkList.insert(1,"库里");

        for (String s : linkList) {
            System.out.println(s);
        }

        System.out.println("-------------------------------------------------------------------------");
        //测试获取
        String getResult = linkList.get(1);
        System.out.println("元素下标“1”处的结果为："+getResult);

        //测试删除
        String removeResult = linkList.remove(0);
        System.out.println("元素下标“0”处被删除的元素是:"+removeResult);

        //测试清空
        linkList.clear();
        System.out.println("清空后的单向链表中元素的个数为："+linkList.length());
    }

}
