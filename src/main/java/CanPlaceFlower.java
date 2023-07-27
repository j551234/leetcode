public class CanPlaceFlower {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int remainFlower = n;
        for(int i = 0; i< flowerbed.length;i++){
            if(flowerbed[i]==0) {
                if(flowerbed.length ==1){
                    return true;
                }

                if (i - 1 < 0 || i +1 >=flowerbed.length) {
                    if(i+1>=flowerbed.length){
                        if ( i-1 >0 &&flowerbed[i - 1] == 0) {
                            flowerbed[i] = 1;
                            remainFlower = remainFlower - 1;
                        }
                    }

                    if ( i+1 <flowerbed.length && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        remainFlower = remainFlower - 1;
                    }
                } else {
                    if (flowerbed[i-1]==0 && flowerbed[i+1]==0)

                    {
                        flowerbed[i] = 1;
                        remainFlower = remainFlower - 1;
                    }

                }
            }
            if (remainFlower <= 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
     int [] flowerBed =    {0,0,0,0,0,1,0,0};
     int k = 0;
     Boolean ans =canPlaceFlowers(flowerBed,k);
        System.out.println(ans);
    }
}
