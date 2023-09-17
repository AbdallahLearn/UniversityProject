/**
 * 
 */
package programsCA14;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CA14 {
	//1
	public static double sum(double n1, double n2) {
        double sum = n1 + n2;
        return sum;
    }
	//2
    public static double sub(double n1, double n2) {
        double sub = n1 - n2;
        return sub;
    }
    //3
    public static double multi(double n1, double n2) {
        double multi = n1 * n2;
        return multi;
    }
    //4
    public static double division(double n1, double n2) {
        double division = n1 / n2;
        return division;
    }
    //5
    public static double mod(double num1,double num2) {
    	 double mod = num1 % num2;
         System.out.println(" the result is "+ mod);
    	return mod;
    }
    //6
    public static double power(double num3 ,double numPower) {
    	double power = Math.pow(num3,numPower);
        System.out.println("number "+ num3 + " is power of "+ numPower + " it is "+ power);
    	return power;
    }
    //7
    public static int factoril(int num4) {
    	
    	int fact = 1;
        for(int i =1 ;i<=num4 ; i++){
                fact= fact*i;
        }
        System.out.println(fact);
    	return fact;
    }
    //8
    public static double root(double num5) {
    	double root = Math.sqrt(num5);
        System.out.println("the root of number "+ num5 + " is "+ root);
    	return root;
    }
    //9 
    public static double log(double number) {
    	 number = Math.log(number);
    	 System.out.println("the result is "+ number);
    	 return number;
    }
    //10
    public static double sin(double num) {
    	num = Math.sin(num);
    	System.out.println("is "+ num);
    	return num;
    }
    //11
    public static double Absolute(double num) {
    	num = Math.abs(num);
    	System.out.println("the result is "+ num);
    	return num;
    }
    //12
    public static int avrage(int array[]) {
    	
    	int sum = 0;
    	
    	for(int i = 0; i<array.length; i++) {
    		sum+=array[i];
    	}
    	int avg = sum / array.length;
    	System.out.println("the avrage is "+ avg);
    	return avg;
    }
    public static void main(String[] args) {
    	
    	char w;
        Scanner input = new Scanner(System.in);
        System.out.println("1:Additon\n2:Subtraction\n3:Multiply\n4:Division\n5:mod\n6:power\n"
        		+ "7:factoral\n8:root\n9:Log\n10:Sin\n11:absolute\n12:avrage ");
        int user = input.nextInt();
        
        	
        do {
        switch(user){
        
        	case 1: System.out.println("enter first number: ");
            double n1 = input.nextDouble();
            System.out.println("enter the second number: ");
            double n2 = input.nextDouble();
            System.out.println(n1+" + "+n2+" = "+ sum(n1,n2));break;
        
        
        	case 2: System.out.println("enter first number: ");
            double n3 = input.nextDouble();
            System.out.println("enter the second number: ");
            double n4 = input.nextDouble();
            System.out.println(n3+" - "+n4+" = "+ sub(n3,n4));break;
        
        	case 3:System.out.println("enter first number: ");
            double n5 = input.nextDouble();
            System.out.println("enter the second number: ");
            double n6 = input.nextDouble();
            System.out.println(n5+" * "+n6+" = "+ multi(n5,n6));break;
            
        	case 4:
            System.out.println("enter first number: ");
            double n7 = input.nextDouble();
            System.out.println("enter the second number: ");
            double n8 = input.nextDouble();
            System.out.println(n7+" / "+n8+" = "+ division(n7,n8));break;
        
        	case 5: System.out.println(" enter number for mod %: ");
            double num1 = input.nextDouble();
            System.out.println("enter the second number: ");
            double num2 = input.nextDouble();
            mod(num1,num2);break;
            
        	case 6: System.out.println("enter number to power: ");
            double num3 = input.nextDouble();
            System.out.println("enter number of power: ");
            double numPower = input.nextDouble();
            power(num3, numPower);break;
            
        	case 7: System.out.println("enter number to factoral it: ");
            int num4 = input.nextInt();
            factoril(num4);break;
            
        	case 8: System.out.println("enter number to root: ");
            double num5 = input.nextDouble();
            root(num5);break;
            
        	case 9: System.out.println("enter number to Log: ");
        		double number = input.nextDouble();
        		log(number);break;
        		
        	case 10: System.out.println("enter number to sin: ");
        	double num = input.nextDouble();
        	sin(num);break;
        	
        	case 11: System.out.println("enter number to abslout: ");
        	double number1 = input.nextDouble();
        	Absolute(number1);break;
        	
        	case 12: System.out.println("enter groub of number(5 numbers) to take the avrage it: ");
        	int [] array = new int[5];
        	for(int i = 0 ; i<array.length;i++) {
        		array[i]= input.nextInt();
        	}
        	avrage(array);break;
        		
            default: System.out.println("error input");
         
        }
        
        System.out.println("do you want to continue(Y/N): ");
        w = input.next().charAt(0);
       
       
       }while(w =='y'|| w=='Y');
       input.close();
    }
}

