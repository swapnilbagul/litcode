
//869. Reordered Power of 2
//Return true if and only if we can do this so that the resulting number is a power of two.

class Solution {
    public static boolean reorderedPowerOf2(int n) {
        String target = countDigits(n);
        System.out.println(target);
        
        for (int i = 0; i < 31; i++) { // 2^30 < 10^9
            int power = 1 << i;
            System.out.println("2 power of "+" "+i+" "+power);
            System.out.println(countDigits(power));
            if (target.equals(countDigits(power))) {
                return true;
            }
        }
        return false;
    }

    private static  String countDigits(int num) {
        int[] count = new int[10];
        while (num > 0) {
            count[num % 10]++;
            num /= 10;
        }
        StringBuilder sb = new StringBuilder();
        for (int c : count) {
            sb.append(c);
        }
        return sb.toString();
    }
    
    public static void main(String arg[]){
        reorderedPowerOf2(821);
    }

}
