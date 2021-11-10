package 과제8;

public class Bit3 {
    static int x=32;

    static int getPosOfRightmostSetBit(int n) {
        return Integer.parseInt( Long.toString(Math.round(Math.log(Double.parseDouble(Integer.toString(~n&(n+1) ))) / Math.log(Double.parseDouble("2")))   )) + 1;
    }


    static int setRightmostUnsetBit(int n) {
        if (n == 0)
        return 1;
        if ((n & (n + 1)) == 0)
        return n;
        int pos = getPosOfRightmostSetBit(n);
        return ((1 << (pos - 1)) | n);
    }
    public static void main(String[] args) {
        int n = 21;
       
        System.out.println(setRightmostUnsetBit(n));
    }
}
