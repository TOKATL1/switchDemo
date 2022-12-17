package org.example;

public class Main {
    public static void main(String[] args) {
        char grade = 'A';


        switch (grade) {

            case 'A':


                System.out.println("MÜK KANKA");
                break;


            case 'B':


                System.out.println("güzel geçtin");

                break;


            case 'C':


                System.out.println("idare eder");


            case 'D':
                System.out.println("az daha geçmiyodun")
                ;
                break;


            case 'F':

                System.out.println("geçemedin kankaaa")
                ;
                break;

            default:
                System.out.println("geçersiz not girdiniz")
                ;
        }

    }
}