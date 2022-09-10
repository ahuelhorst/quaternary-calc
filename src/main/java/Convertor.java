public class Convertor {

    //convert base 4 number to base 10 number
    //returns int base 10 num
    public static int convert(String base4) {
        int total = 0;
        int a = 1;
        String[] splitArray=base4.split("");
        for (int i=splitArray.length-1; i>=0; i--){
            int c = Integer.parseInt(splitArray[i]);
            int b = a * c;
            total = total + b;
            a = a * 4;
        }
        return total;
    }
    //convert base 10 number to base 4 number
    //returns int base 10
    public static int revert(int base10) {
        String s = Integer.toString(base10, 4);
        return Integer.parseInt(s);
    }
}
