package app;

public class App {
    public static void main(String[] args) {
        //lambda expression which return first and last name given as input 
       PrintName printUserNameLambda = (String firstName, String lastName) -> {  
       return String.format("%s %s", firstName,lastName);};
       System.out.println(printUserNameLambda.printUserName("Abraham", "Pierrot")); 
    
        //lambda expresion which calculate the sum of two given input
        CalculateInput inputResult = (int n,int n2) -> {System.out.println("result = "+(n+n2));};  
        inputResult.calculate(3, 4);


        // anonymous class representation of the lambda expression which calculate the sum of two given input 
        CalculateInput anonymousClass = new CalculateInput(){
            public void calculate(int num,int num2) {
                System.out.println("result = "+(num+num2));
            }
        };
         anonymousClass.calculate(2,3);
   
      }
} 
