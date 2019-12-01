package com.example.sinansamilsaglam;

import java.util.Scanner;

public class main {

    public static int sayin;
    public static String romaRakami;


    public static void main(String[] args) {
        int call;
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayıdan Roma rakamına dönüşüm için 1'e basınız. ");
        System.out.println("Roma rakamından sayıya dönüşüm için 2'ye basınız. ");

        call = scan.nextInt();
        switch (call) {

            case 1:
                main cagir = new main();
                cagir.numberToRoman();

                break;

            case 2:
                main cagir2 = new main();
                cagir2.romanToNumber();

                break;
        }
    }


    public void numberToRoman() {
        Scanner input = new Scanner(System.in);
        int sayi;
        int i;

        System.out.println("Roma rakamlarına dönüştürülecek sayıyı girin: ");
        sayi = input.nextInt();


        for (i = 0; i < 4; i++) {
            if (sayi > 999) {
                sayi = sayi - 1000;
                System.out.print("M");
            } else if (sayi <= 999) {
                break;
            }
        }
        for (i = 0; i < 10; i++) {
            if (sayi > 899) {
                sayi = sayi - 900;
                System.out.print("CM");
            } else if (sayi <= 899) {
                break;
            }
        }
        for (i = 0; i < 10; i++) {
            if (sayi > 499) {
                sayi = sayi - 500;
                System.out.print("D");
            } else if (sayi <= 499) {
                break;
            }
        }
        for (i = 0; i < 10; i++) {
            if (sayi > 99) {
                sayi = sayi - 100;
                System.out.print("C");
            } else if (sayi <= 99) {
                break;
            }
        }
        for (i = 0; i < 10; i++) {
            if (sayi > 89) {
                sayi = sayi - 90;
                System.out.print("XC");
            } else if (sayi <= 89) {
                break;
            }
        }
        for (i = 0; i < 10; i++) {
            if (sayi > 49) {
                sayi = sayi - 50;
                System.out.print("L");
            } else if (sayi <= 49) {
                break;
            }
        }
        for (i = 0; i < 10; i++) {
            if (sayi > 39) {
                sayi = sayi - 40;
                System.out.print("XL");
            } else if (sayi <= 39) {
                break;
            }
        }
        for (i = 0; i < 10; i++) {
            if (sayi > 9) {
                sayi = sayi - 10;
                System.out.print("X");
            } else if (sayi <= 9) {
                break;
            }
        }
        for (i = 0; i < 10; i++) {
            if (sayi > 8) {
                sayi = sayi - 9;
                System.out.print("IX");
            } else if (sayi <= 8) {
                break;
            }
        }
        for (i = 0; i < 10; i++) {
            if (sayi > 4) {
                sayi = sayi - 5;
                System.out.print("V");
            } else if (sayi <= 4) {
                break;
            }
        }
        for (i = 0; i < 10; i++) {
            if (sayi > 3) {
                sayi = sayi - 4;
                System.out.print("IV");
            } else if (sayi <= 3) {
                break;
            }
        }
        for (i = 0; i < 10; i++) {
            if (sayi > 0) {
                sayi = sayi - 1;
                System.out.print("I");
            } else if (sayi <= 1) {
                break;
            }
        }
    }



    private void romanToNumber() {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayıya dönüştürülecek Roma rakamını giriniz: ");
        romaRakami = input.nextLine();

        int l = romaRakami.length();
        int sayi2 = 0;
        int eskiSayi = 0;
        int i;
        for (i = l - 1; i >= 0; i--) {
            char x = romaRakami.charAt(i);

            switch (x) {
                case 'I':
                    eskiSayi = sayi2;
                    sayi2 = 1;
                    break;
                case 'V':
                    eskiSayi = sayi2;
                    sayi2 = 5;
                    break;
                case 'X':
                    eskiSayi = sayi2;
                    sayi2 = 10;
                    break;
                case 'L':
                    eskiSayi = sayi2;
                    sayi2 = 50;
                    break;
                case 'C':
                    eskiSayi = sayi2;
                    sayi2 = 100;
                    break;
                case 'D':
                    eskiSayi = sayi2;
                    sayi2 = 500;
                    break;
                case 'M':
                    eskiSayi = sayi2;
                    sayi2 = 1000;
                    break;
            }
            if (sayi2 < eskiSayi) {
                sayin = sayin - sayi2;
            } else
                sayin = sayin + sayi2;
        }

            System.out.println(sayin);
        }
   }
