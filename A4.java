//Assignment No - 01
//Roll No - 23356
//Program: Menu driven program to find area of circle, square, triangle, and rectangle

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
      
        do {
            System.out.println("\n===== AREA CALCULATOR =====");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Square");
            System.out.println("3. Area of Rectangle");
            System.out.println("4. Area of Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            //Using switch case for a menu driven program
            switch (choice) {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double radius = sc.nextDouble();
                    double circleArea = 3.14159 * radius * radius;
                    System.out.println("Area of Circle = " + circleArea);
                    break;

                case 2:
                    System.out.print("Enter side of square: ");
                    double side = sc.nextDouble();
                    double squareArea = side * side;
                    System.out.println("Area of Square = " + squareArea);
                    break;

                case 3:
                    System.out.print("Enter length of rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter breadth of rectangle: ");
                    double breadth = sc.nextDouble();
                    double rectangleArea = length * breadth;
                    System.out.println("Area of Rectangle = " + rectangleArea);
                    break;

                case 4:
                    System.out.print("Enter base of triangle: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height of triangle: ");
                    double height = sc.nextDouble();
                    double triangleArea = 0.5 * base * height;
                    System.out.println("Area of Triangle = " + triangleArea);
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}

/*
===== AREA CALCULATOR =====
1. Area of Circle
2. Area of Square
3. Area of Rectangle
4. Area of Triangle
5. Exit
Enter your choice: 1
Enter radius of circle: 5
Area of Circle = 78.53975

===== AREA CALCULATOR =====
1. Area of Circle
2. Area of Square
3. Area of Rectangle
4. Area of Triangle
5. Exit
Enter your choice: 2
Enter side of square: 4
Area of Square = 16.0

===== AREA CALCULATOR =====
1. Area of Circle
2. Area of Square
3. Area of Rectangle
4. Area of Triangle
5. Exit
Enter your choice: 3
Enter length of rectangle: 5
Enter breadth of rectangle: 6
Area of Rectangle = 30.0

===== AREA CALCULATOR =====
1. Area of Circle
2. Area of Square
3. Area of Rectangle
4. Area of Triangle
5. Exit
Enter your choice: 4
Enter base of triangle: 6
Enter height of triangle: 8
Area of Triangle = 24.0

===== AREA CALCULATOR =====
1. Area of Circle
2. Area of Square
3. Area of Rectangle
4. Area of Triangle
5. Exit
Enter your choice: 5
Exiting... Thank you!

-----------------------------

*/
