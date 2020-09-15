package Leetcode.EverydayQuest;

/**
 * @description: No：657 每日一题08.28 机器人能否返回原点   【难度：简单】
 * @author: KlayHu
 * 思路：哈希计数。遇到UDLR存到hashmap里，比较最后次数是否相等。
 * ====================================================================================
 * leetcode题解：很多种解法
 * @create: 2020/8/28 14:55
 **/
public class judgeCircle_657 {
    /**
     * 输入: "UD"
     * 输出: true
     * 解释：机器人向上移动一次，然后向下移动一次。所有动作都具有相同的幅度，因此它最终回到它开始
     * 的原点。因此返回 true。
     */
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if (move == 'U') {
                y--;
            } else if (move == 'D') {
                y++;
            } else if (move == 'L') {
                x--;
            } else if (move == 'R') {
                x++;
            }
        }
        return x == 0 && y == 0;
//        Map<Character, Integer> resMap = new HashMap<>();
//        char[] c = move.toCharArray();
//        if (move.length() % 2 != 0) {
//            return false;
//        }
//        for (char res : c) {
//            if (!resMap.containsKey(res)) {
//                resMap.put(res, 1);
//            }else {
//                resMap.put(res, resMap.get(res)+1);
//            }
//        }
//        return resMap.get('U')==resMap.get('D')&&resMap.get('R')==resMap.get('L');
    }

    public static void main(String[] args) {
        new judgeCircle_657().judgeCircle("UUDDLRLR");
    }
}
