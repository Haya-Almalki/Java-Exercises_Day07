import java.util.Scanner;

public class main_ex1 {
    public static void main(String[] args) {
        //1:
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first number: ");
        int num1=input.nextInt();
        System.out.println("Enter your second number: ");
        int num2=input.nextInt();
        System.out.println("choose your operation: \n(+)\n(-)\n(/)\n(*)\n(%)");
        String operation=input.next();
        if (operation.equals("+")){
            int result=num1+num2;
            System.out.println(num1+" + "+num2+" = "+result);
        } else if (operation.equals("-")) {
            int result=num1-num2;
            System.out.println(num1+" - "+num2+" = "+result);
        }else if (operation.equals("*")) {
            int result=num1*num2;
            System.out.println(num1+" * "+num2+" = "+result);
        }else if (operation.equals("/")) {
            int result=num1/num2;
            System.out.println(num1+" / "+num2+" = "+result);
        }else if (operation.equals("%")) {
            int result=num1%num2;
            System.out.println(num1+" % "+num2+" = "+result);
        }else{
            System.out.println("false input operation");
        }    }
}