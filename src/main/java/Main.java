//
 //* Created by iyasuwatts on 1
 //*

 import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner user_input = new Scanner(System.in);

            String first_name;
            System.out.print("Please enter your first name:");
            first_name = user_input.next();


            if (first_name.equals ("Alice") || first_name.equals ("Bob")) {
                System.out.print("Hello");
            }
        }
    }









