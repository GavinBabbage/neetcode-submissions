class Solution {
    public static void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i]==0){red++;}
            if(nums[i]==1){white++;}
            if(nums[i]==2){blue++;}
        }

        // System.out.println("red: " + red + " white: " + white + " blue: " + blue);

        for(int j = 0; j < nums.length; j++) {
            if(red>0){
                nums[j] = 0;
                red--;
            }
            else if(red == 0 && white>0){
                nums[j] = 1;
                white--;
            }
            else if(red == 0 & white == 0 & blue>0){
                nums[j] = 2;
                blue--;
            }
        }

        // System.out.println("sorted:" + Arrays.toString(nums));

        
    }
}