package ljiod_ch11;

public class LambdaExpression {
        public static void main(String[] args) {
            MyNumber num1;
            
            num1 =  () -> 12.3;

                System.out.println("The value is "+num1);
                System.out.println("The value is "+num1.getValue());

            num1 =  () -> 2+3;
                
                System.out.println("The value is "+num1.getValue());

            num1 =  () -> {
                int counter = 1;
                int sum = 0;
                while (counter <5){
                    sum += counter;
                    counter++;
                }
                return sum;
            };
                System.out.println("The value is "+num1.getValue());
            
                MyNumberPara num2;

                num2 = (n,m) -> n+m;
                System.out.println("The value is "+num2.getValue2(9,3)); 
            
                num2 = (n,m) -> {
                    if(n>m)
                        return m;
                    else if (n<m)
                        return n;
                    else
                        return 0;
                };
                System.out.println("The minimum between 52 & 19 is "+num2.getValue2(52,19));

    }
}

@FunctionalInterface
interface MyNumber{
    double getValue();
}

@FunctionalInterface
interface MyNumberPara{
    int getValue2(int n, int m);
}
