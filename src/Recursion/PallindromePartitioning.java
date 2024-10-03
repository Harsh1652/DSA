

package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PallindromePartitioning {


    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList();
        List<String> path = new ArrayList();
        this.func(0, s, path, res);
        return res;
    }

    void func(int index, String s, List<String> path, List<List<String>> res) {
        if (index == s.length()) {
            res.add(new ArrayList(path));
        } else {
            for(int i = index; i < s.length(); ++i) {
                if (this.isPallindrome(s, index, i)) {
                    path.add(s.substring(index, i + 1));
                    this.func(i + 1, s, path, res);
                    path.remove(path.size() - 1);
                }
            }

        }
    }

    boolean isPallindrome(String s, int start, int end) {
        while(true) {
            if (start <= end) {
                if (s.charAt(start++) == s.charAt(end--)) {
                    continue;
                }

                return false;
            }

            return true;
        }
    }
}
