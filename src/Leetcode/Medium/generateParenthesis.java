package Leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: No：022 括号生成    【难度：中等】
 * @author: KlayHu
 * 思路：有些像No：077的爬楼梯，可以用dp做吗？如果难度是中等的话应该状态转移方程不好写吧；
 * 看了题解发现dp方程真的不容易想
 * ====================================================================================
 * leetcode题解：dp、回溯、递归都能做。dp方程：dp[n] = "("+dp[k]+")"+dp[m]  其中k+m=i-1
 * 发现题解区有个简单的dfs，判断左右括号和右括号的数量进行拼接，全程只进行判断的操作。
 * @create: 2020/8/18 16:07
 **/
public class generateParenthesis {
    List<String> res = new ArrayList<>();
    //""是最初的情况。n对括号，肯定由n个左、右括号组成
    public List<String> generateParenthesis(int n){
        dfs(n,n,"");
        return res;
    }
    public void dfs(int left,int right,String str) {
        //如果左右括号都没有剩余了，递归结束出结果
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }
        //如果左括号还有剩余，拼接一个左括号，然后继续dfs
        if (left > 0) {
            dfs(left-1,right,str+"(");
        }
        //如果左括号个数小于右括号
        if (left < right) {
            dfs(left,right-1,str+")");
        }
    }
}
