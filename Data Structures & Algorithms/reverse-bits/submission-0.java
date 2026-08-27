class Solution {
    public static int reverseBits(int n) {   
        String bits = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        String reversed = new StringBuilder(bits).reverse().toString();
        int result = Integer.parseUnsignedInt(reversed, 2);
        
        return result;
    }
}
