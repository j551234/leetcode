public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int maxHeight = 0;
        int nowHeight = 0;
        for (int j : gain) {
            nowHeight += j;
            if (nowHeight > maxHeight) {
                maxHeight = nowHeight;
            }
        }
return maxHeight;
    }
}
