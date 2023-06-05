public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int l=0,h=n,ans=n;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(isBadVersion(mid))
            {
                ans=mid;
                h=mid-1;
            }
            else
                l=mid+1;
        }
        return ans;
    }

    Boolean isBadVersion(int n){
        return true;
    }
}
