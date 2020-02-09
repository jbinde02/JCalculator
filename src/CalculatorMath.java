public class CalculatorMath {
    public String addValue(String string1, String string2){
        int int1 = Integer.parseInt(string1);
        int int2 = Integer.parseInt(string2);
        int int3 = int1 + int2;
        return Integer.toString(int3);
    }
    public int subValue(int int1, int int2){
        return int1-int2;
    }
    public int multiplyValue(int int1, int int2){
        return int1*int2;
    }
    public int divideValue(int int1, int int2){
        return int1/int2;
    }
}
