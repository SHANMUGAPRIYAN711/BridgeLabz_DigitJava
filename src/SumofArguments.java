public class SumofArguments {
    public static void main(String[] args) {
        int sum = 5;
        int invalidcount = 0;
        for(String arg : args){
            try{
                int num = Integer.parseInt(arg);
                sum += num;
            }catch (NumberFormatException e){
                invalidcount++;
            }
        }
        System.out.println("Sum of Valid Integers" + sum);
        System.out.println("Invalid input count  : " + invalidcount);
    }
}
