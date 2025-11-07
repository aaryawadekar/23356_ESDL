//Assignment No - 07
//Roll No - 23356
/*Problem Statement - Write a program in java to check whether a given number is 
1.prime 2.palindrome 3.armstrong number*/
import java.util.Scanner;
class A7{

    //Function to check if the given number is prime or not
    static boolean isPrime(int a){
        if(a<=1) return false;
        boolean r=true;
        for(int i=2;i<a;i++){
            if(a%i==0){ 
                r=false;
                break;
            }
        }
        return r;
    }

    //Function to check is the given number is palindrome or not
    static boolean isPalindrome(int a){
        int orig=a,revNum=0,temp=a;
        while(temp!=0){
            int rem=temp%10;
            revNum=(revNum*10)+rem;
            temp/=10;
        }
        if(revNum==orig){
            return true;
        }else{
            return false;
        }
    }

    //Function to check if the given number is armstrong number or not
    static boolean isArmstrong(int a){
        int orig=a,newNum=0,temp=a;
        while(temp!=0){
            int rem=temp%10;
            newNum=newNum+(rem*rem*rem);
            temp/=10;
        }
        if(newNum==orig){
            return true;
        }else{
            return false;
        }
    }

    //Main function
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        char ch;

        //Using do while loop 
        do{
            System.out.println("Enter your number:");
            int a=s.nextInt();
            
            System.out.println("1.To check if prime or not");
            System.out.println("2.To check if palindrome or not");
            System.out.println("3.To check if armstrong number or not");

            System.out.println("Enter your choice");
            int b=s.nextInt();

            //Using switch case
            switch(b){
                case 1:{
                    if(isPrime(a)){
                        System.out.println("The given number is prime");
                    }else{
                        System.out.println("The given number is not prime");
                    }
                    break;
                }

                case 2:{
                    if(isPalindrome(a)){
                        System.out.println("The given number is a palindrome");
                    }else{
                        System.out.println("The given number is not a palindrome");
                    }
                    break;
                }

                case 3:{
                    if(isArmstrong(a)){
                        System.out.println("The given number is an armstrong number");
                    }else{
                        System.out.println("The given number is not an armstrong number");
                    }
                    break;
                }

                //Default statement if invalid choice is made
                default: System.out.println("Invalid choice!");
            }

            System.out.println("Do you want to continue(y/n)?");
            ch=s.next().charAt(0);
        }while(ch=='y'||ch=='Y');
        s.close();
    }
}

/*Output - 
Enter your number:
2
1.To check if prime or not
2.To check if palindrome or not
3.To check if armstrong number or not
Enter your choice
1
The given number is prime
Do you want to continue(y/n)?
y
Enter your number:
4
1.To check if prime or not
2.To check if palindrome or not
3.To check if armstrong number or not
Enter your choice
1
The given number is not prime
Do you want to continue(y/n)?
y
Enter your number:
12321
1.To check if prime or not
2.To check if palindrome or not
3.To check if armstrong number or not
Enter your choice
2
The given number is a palindrome
Do you want to continue(y/n)?
y
Enter your number:
21
1.To check if prime or not
2.To check if palindrome or not
3.To check if armstrong number or not
Enter your choice
2
The given number is not a palindrome
Do you want to continue(y/n)?
y
Enter your number:
153
1.To check if prime or not
2.To check if palindrome or not
3.To check if armstrong number or not
Enter your choice
3
The given number is an armstrong number
Do you want to continue(y/n)?
y
Enter your number:
16
1.To check if prime or not
2.To check if palindrome or not
3.To check if armstrong number or not
Enter your choice
3
The given number is not an armstrong number
Do you want to continue(y/n)?
n

*/
