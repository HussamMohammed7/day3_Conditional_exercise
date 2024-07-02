import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        1.Write a program that checks the role of the user
//        If the role is admin print "welcome admin"
//        If the role is superuser print "welcome superuser"
//        If the role is user print "welcome user" (tip:
//        use if else)

        Scanner input = new Scanner(System.in);
        System.out.println("********************************");
        System.out.print("Enter your role : ");
        String role = input.nextLine();
        if(role.equals("admin")){
            System.out.println("welcome admin");
        } else if (role.equals("superuser")) {
            System.out.println("welcome superuser");
        }else {
            System.out.println("welcome user");
        }

//        2.Take three numbers from the user and print the greatest number.
//                Test Data
//        Input the 1st number: 25
//        Input the 2nd number: 78
//        Input the 3rd number: 87
//        Expected Output : The
//        greatest: 87
        System.out.println("********************************");

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Three numbers ");
        System.out.print("Input the 1st number : ");
        int num1 = input1.nextInt();
        System.out.print("Input the 2nd number: ");

        int num2 = input1.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = input1.nextInt();

        if (num1> num3 && num1 >num2){
            System.out.println("greatest: " + num1);
        } else if (num2> num3 && num2>num3) {
            System.out.println("greatest: " + num2);
        }else {
            System.out.println("greatest: " + num3);
        }

//        3.Write a Java program that generates an integer between 1 and 7 and
//        displays the name of the weekday.
//        Test Data
//        number: 4
//        Expected Output:
//        Wednesday
        System.out.println("********************************");


        System.out.print("Enter a number to display a day (number from 1 to 7) : ");

             Scanner input2 = new Scanner(System.in);
             int day_number = input2.nextInt();
             switch (day_number){
                 case 1 :
                     System.out.println("Sunday");
                     break;
                 case 2 :
                     System.out.println("Monday");
                     break;
                 case 3 :
                     System.out.println("Tuesday");
                     break;
                 case 4 :
                     System.out.println("Wednesday");
                     break;
                 case 5 :
                     System.out.println("Thursday");
                     break;
                 case 6 :
                     System.out.println("Friday");
                     break;
                 case 7 :
                     System.out.println("Saturday");
                     break;
                 default:
                System.out.println("please enter number from 1 - 7");

             }



//        4. Write a program that takes a numeric score as input and prints the
//        corresponding letter grade using the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59
//        Enter your numeric score: 85
//        Numeric Score: 85
//        Letter Grade: B

        System.out.println("********************************");

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter your numeric score: ");
       int num = input3.nextInt();

        System.out.println("Numeric Score: " +num);
        if(num>100 || num <0){
            System.out.println("this number is invalid ");
        } else if (num<=100 && num>=90) {
            System.out.println("Letter Grade: A");
        }else if (num<=89 && num>=80) {
            System.out.println("Letter Grade: B");
        }else if (num<=79 && num>=70) {
            System.out.println("Letter Grade: C");
        }else if (num<=69 && num>=60) {
            System.out.println("Letter Grade: D");
        }else {
            System.out.println("Letter Grade: F");
        }

//        5. Write a Java program that takes a person's age as input and
//        categorizes them into one of three age categories: "Child,"
//        "Teenager," or "Adult" using an if statement.
//                use an if statement to categorize the age based on the following criteria:
//        • If the age is less than 13, categorize them as a "Child."
//        • If the age is between 13 and 19 (inclusive), categorize them as a
//        "Teenager."
//        • If the age is 20 or older, categorize them as an "Adult."
//        Sample Output:
//        Enter your age: 25
//        You are an Adult.
        System.out.println("********************************");

        Scanner input4 = new Scanner(System.in);

        System.out.print("Enter your age : ");
         int age = input4.nextInt();
         if(age<13){
             System.out.println("you are an Child");
         } else if (age>=13 && age <=19) {
             System.out.println("You are a Teenager");

         }else {
             System.out.println("You are an Adult");
         }


    }
}