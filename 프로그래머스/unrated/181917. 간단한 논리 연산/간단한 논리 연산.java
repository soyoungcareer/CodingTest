class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean first = vFunc(x1, x2);
        boolean second = vFunc(x3, x4);

        answer = (first == second) ? first : false;

        return answer;
    }

    public boolean vFunc(boolean a, boolean b) {
        boolean rslt = (a == b) ? a : true;
        return rslt;
    }
    
    /* 간단한 풀이 
    boolean answer = (x1||x2)&&(x3||x4);
    */
}