public class CalculatorMath {
    public String addValue(String string1, String string2)throws IllegalArgumentException{
        if(string1 == null || string2 == null){
            throw new IllegalArgumentException("Missing values");
        }
        int int1 = Integer.parseInt(string1);
        int int2 = Integer.parseInt(string2);
        int int3 = int1 + int2;
        return Integer.toString(int3);
    }
    public String subtractValue(String string1, String string2){
        int int1 = Integer.parseInt(string1);
        int int2 = Integer.parseInt(string2);
        int int3 = int1 - int2;
        return Integer.toString(int3);
    }
    public String multiplyValue(String string1, String string2){
        int int1 = Integer.parseInt(string1);
        int int2 = Integer.parseInt(string2);
        int int3 = int1 * int2;
        return Integer.toString(int3);
    }
    public String divideValue(String string1, String string2){
        int int1 = Integer.parseInt(string1);
        int int2 = Integer.parseInt(string2);
        int int3 = int1 / int2;
        return Integer.toString(int3);
    }
}
