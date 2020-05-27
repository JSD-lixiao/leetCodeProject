
### 解题思路
以第一个参数为模板，遍历模板（str0）中的每一个字符，当出现不匹配的时候直接截取元素0

笨办法，注释写的很详细了

### 代码

```java
class Solution {
   //最长公共前缀
    public String longestCommonPrefix(String[] strs) {
        if(strs.length <1 ) return "";
        //第一个参数,以他为标准
        String str0 = strs[0];
        if ("".equals(str0)) return "";
        char[] str = str0.toCharArray();

        //遍历元素0
        for (int j = 0; j < str.length; j++) {
            //遍历后面的
            for (int i = 1; i < strs.length; i++) {
                //如果后面元素i长度不够执行本次循环，说明元素i完全满足，直接返回
                if (strs[i].length() < j+1) {
                    return strs[i];
                }

                if (str[j] == strs[i].charAt(j)) {
                    //正常情况，匹配到了
                    continue;
                } else {
                    //匹配失败，直接截取返回
                    return str0.substring(0, j);
                }
            }
        }
        //元素0遍历完了，说明第一个元素就是
        return str0;
    }
}
