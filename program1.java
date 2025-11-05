Object Oriented Programming with JAVA  Lab 
________________


1. Develop a JAVA program to add TWO matrices of suitable order N (The value of N should be read from
command line arguments).


Program:

import java.util.Scanner;


public class MatrixAddition {
    public static void main(String[] args) {
        // Check if N is provided through command line
        if (args.length != 1) {
            System.out.println("Usage: java MatrixAddition <N>");
            return;
        }


        int N = Integer.parseInt(args[0]);
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        int[][] C = new int[N][N];


        Scanner sc = new Scanner(System.in);


        // Read first matrix
        System.out.println("Enter elements of Matrix A (" + N + "x" + N + "):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }


        // Read second matrix
        System.out.println("Enter elements of Matrix B (" + N + "x" + N + "):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = sc.nextInt();
            }
        }


        // Add the two matrices
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }


        // Display the result
        System.out.println("\nResultant Matrix (A + B):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}




OUTPUT:
1. Save the file as MatrixAddition.java

Compile the program:

javac MatrixAddition.java
   2. Run the program (example for a 3×3 matrix):

java MatrixAddition 3


      3. Input values for both matrices when prompted.

$ java MatrixAddition 2
Enter elements of Matrix A (2x2):
1         2
3         4
Enter elements of Matrix B (2x2):
5         6
7         8


Resultant Matrix (A + B):
6        8        
10        12