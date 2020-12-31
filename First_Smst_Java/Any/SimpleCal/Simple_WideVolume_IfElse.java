package First_Smst_Java.Any.SimpleCal;
import java.util.*;
public class Simple_WideVolume_IfElse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;
        int a,b,c,t,hasil1;
        float hasil2;

        //Menu awal
        System.out.println("Silahkan memilih");
        System.out.printf("[1] Luas \n[2] Volume \n[3] Akhiri \n");
        System.out.print("Masukan pilihan -> ");
        pilihan = input.nextInt();

        if ((pilihan == 1) || (pilihan == 2)){

            //Bagian Luas
            if (pilihan == 1){
                System.out.println("Silahkan memilih");
                System.out.printf("[1] Persegi \n[2] Persegi Panjang \n[3] Lingkaran \n[4] Segitiga \n[5] Trapesium \n[6] Layang-layang \n");
                System.out.print("Masukan pilihan -> ");
                pilihan = input.nextInt();

                if (pilihan == 1){
                    System.out.println("===[ Persegi ]===");
                    System.out.print("Panjang sisi: ");
                    a = input.nextInt();
                    hasil1 = a*a;
                    System.out.println("Luas Persegi: " + hasil1);

                }else if (pilihan == 2){
                    System.out.println("===[ Persegi Panjang ]===");
                    System.out.print("Panjang: ");
                    a = input.nextInt();
                    System.out.print("Lebar: ");
                    b = input.nextInt();
                    hasil1 = a*b;
                    System.out.println("Luas Persegi Panjang: " + hasil1);

                }else if (pilihan == 3){
                    System.out.println("===[ Lingkaran ]===");
                    System.out.print("Jari - jari: ");
                    a = input.nextInt();
                    hasil2 = (float) Math.PI*a*a;
                    System.out.println("Luas Lingkaran: " + hasil2);

                }else if (pilihan == 4){
                    System.out.println("===[ Segitiga ]===");
                    System.out.print("Alas: ");
                    a = input.nextInt();
                    System.out.print("Tinggi: ");
                    b = input.nextInt();
                    hasil1 = a*b/2;
                    System.out.println("Luas Segitiga: " + hasil1);

                }else if (pilihan == 5){
                    System.out.println("===[ Trapesium ]===");
                    System.out.print("Sisi atas: ");
                    a = input.nextInt();
                    System.out.print("Sisi bawah: ");
                    b = input.nextInt();
                    System.out.print("Tinggi: ");
                    c = input.nextInt();
                    hasil1 = (a+b)/2*c;
                    System.out.println("Luas Trapesium: " + hasil1);

                }else{
                    System.out.println("===[ Layang-layang ]===");
                    System.out.print("Diagonal 1: ");
                    a = input.nextInt();
                    System.out.print("Diagonal 2: ");
                    b = input.nextInt();
                    hasil1 = a*b/2;
                    System.out.println("Luas Layang-layang: " + hasil1);

                }

            //Bagian Volume
            }else{
                System.out.println("Silahkan memilih");
                System.out.printf("[1] Kubus \n[2] Balok \n[3] Tabung \n[4] Prisma Segitiga \n[5] Limas Segitiga \n[6] Kerucut \n");
                System.out.print("Masukan pilihan -> ");
                pilihan = input.nextInt();

                if (pilihan == 1){
                    System.out.println("===[ Kubus ]===");
                    System.out.print("Panjang sisi: ");
                    a = input.nextInt();
                    System.out.print("Tinggi: ");
                    t = input.nextInt();
                    hasil1 = a*a*t;
                    System.out.println("Volume Kubus: " + hasil1);

                }else if (pilihan == 2){
                    System.out.println("===[ Balok ]===");
                    System.out.print("Panjang: ");
                    a = input.nextInt();
                    System.out.print("Lebar: ");
                    b = input.nextInt();
                    System.out.print("Tinggi: ");
                    t = input.nextInt();
                    hasil1 = a*b*t;
                    System.out.println("Volume Balok: " + hasil1);

                }else if (pilihan == 3){
                    System.out.println("===[ Tabung ]===");
                    System.out.print("Jari - jari: ");
                    a = input.nextInt();
                    System.out.print("Tinggi: ");
                    t = input.nextInt();
                    hasil2 = (float) Math.PI*a*a*t;
                    System.out.println("Volume Tabung: " + hasil2);

                }else if (pilihan == 4){
                    System.out.println("===[ Prisma Segitiga ]===");
                    System.out.print("Alas: ");
                    a = input.nextInt();
                    System.out.print("Tinggi Alas: ");
                    b = input.nextInt();
                    System.out.print("Tinggi: ");
                    t = input.nextInt();
                    hasil1 = a*b/2*t;
                    System.out.println("Volume Tabung: " + hasil1);

                }else if (pilihan == 5){
                    System.out.println("===[ Limas Segita ]===");
                    System.out.print("Alas: ");
                    a = input.nextInt();
                    System.out.print("Tinggi Alas: ");
                    b = input.nextInt();
                    System.out.print("Tinggi: ");
                    t = input.nextInt();
                    hasil1 = a*b/2*t/3;
                    System.out.println("Volume Limas Segita: " + hasil1);

                }else{
                    System.out.println("===[ Krucut ]===");
                    System.out.print("Diameter: ");
                    a = input.nextInt();
                    System.out.print("Tinggi: ");
                    t = input.nextInt();
                    hasil2 = (float) Math.PI*a*a*t/3;
                    System.out.println("Volume Limas Segita: " + hasil2);

                }
            }

        }else{
            System.out.println("Program Berakhir");

        }

    }
}
