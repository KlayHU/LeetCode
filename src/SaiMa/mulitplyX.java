package SaiMa;

/**
 * @description:
 * @author: KlayHu
 * @create: 2020/4/21 19:25
 **/
public class mulitplyX {
    static void solution(int num) {
        if (num > 1) {
            int result = num * (num - 1);
            solution(num-=num);
        }
        System.out.println(num);
    }
}
