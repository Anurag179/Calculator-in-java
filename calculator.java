import java.util.*;
class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        while(true){
            System.out.println("Enter a operator");
            char ch = sc.next().charAt(0);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%'){
                System.out.println("Enter two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(ch=='+'){
                    c = a+b;
                }
                else if(ch=='-'){
                    c = a-b;
                }
                else if(ch=='*'){
                    c = a*b;
                }
                else if(ch=='/'){
                    if(b!=0){
                        c = a/b;
                    }
                }
                else if(ch=='%'){
                    c = a%b;
                }
                else if(ch == 'x' || ch == 'X'){
                    break;
                }
                else{
                    System.out.println("Invalid response");
                }
                System.out.println(c);  
            }
        }
    }
}
