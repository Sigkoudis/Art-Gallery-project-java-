package com.mycompany.lab10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;
/**
 *
 * @author danar
 */
public class Lab10 {      
    public static int ergon=1;
    public static void displaymenu (){
        System.out.println("======Menu========");
        System.out.println("1. Enter work of art");
        System.out.println("2. Prepare work of art for delivery");
        System.out.println("3. Delivered work of art");
        System.out.println("4. Display all avaiable photogaphs");
        System.out.println("5. Display all avaiable paintings");
        System.out.println("6. Display all avaiable works of art");
        System.out.println("7. Display all works of art to be delivered");
        System.out.println("8. End programm");
        System.out.println("Enter choice(1-8)  ");
    }
    public static void insertergo(ProsPolisi []A){
        Scanner scanner= new Scanner(System.in);
        int e;
        for(int i=0;i<A.length;i++){
            if(A[i]==null){
                System.out.println("Choose type");
                System.out.println("1. Photograph");
                System.out.println("2. Painting");
                System.out.println("Enter your choice: ");
                e=scanner.nextInt();
                if (e==1){
                    A[ergon-1]=new Photograph();
                    System.out.println("\nEisagogi stoixion "+ ergon  + "ou Ergou texnis");
                    System.out.println("Titlos ergou");
                    ((Photograph)A[ergon-1]).setPerigrafh(scanner.nextLine());
                    System.out.println("Timi");
                    ((Photograph)A[ergon-1]).setTimi(scanner.nextDouble());
                    System.out.println("Einai egxromi");
                    ((Photograph)A[ergon-1]).setEnxromi(scanner.nextBoolean());
                }else if(e==2){
                    A[ergon-1]=new Painting();
                    System.out.println("\nEisagogi stoixion "+ ergon  + "ou Ergou texnis");
                    System.out.println("Titlos ergou");
                    ((Painting)A[ergon-1]).setPerigrafh(scanner.nextLine());
                    System.out.println("Timi");
                    ((Painting)A[ergon-1]).setTimi(scanner.nextDouble());
                    System.out.println("Texnotropia");
                    ((Painting)A[ergon-1]).setTexnotropia(scanner.nextLine());
                }
                ++e;
                break;
            }
        }
    }
    public static void displayergaProsPolisi (ProsPolisi []A){
        System.out.println("\nStoixia ergon pros polisi: ");
        for (ProsPolisi A1:A){
            if(A1==null){
                System.out.println(A1);
            }
        }
    }
    public static void displayergaProsMetafora(AgoraParadosi []B){
        System.out.println("\nStoixia ergon pros metafora: ");
        for (ProsPolisi A1:B){
            if(A1==null){
                System.out.println(A1);
            }
        }
    }
    public static void displayPhotographs (ProsPolisi []A){
        System.out.println("\nStoixia phtographs ");
        for (ProsPolisi B1:A){
            if(B1==null){
                if(B1 instanceof Photograph){
                System.out.println(B1);
                }
            }
        }
    }
    public static void displayPaintings(ProsPolisi []A){
        System.out.println("\nStoixia paintings: ");
        for (ProsPolisi B1:A){
            if(B1==null){
                if(B1 instanceof Painting){
                System.out.println(B1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int e1;
        ProsPolisi[] A=new ProsPolisi[10];
        AgoraParadosi []B=new AgoraParadosi[10];
        do{
            displaymenu();
            e1=scanner.nextInt();
            switch (e1){
                case 1:insertergo(A);
                       break;
                case 2:if (ergon!=1){
                    System.out.println("Plithos ergon texnis: "+(ergon-1));
                    displayergaProsPolisi(A);
                    System.out.println("dose thesi ergou pros metafora");
                    int pos=scanner.nextInt();
                    for (int i=0;i<B.length;i++){
                        if (B[i]==null){
                            B[i]=new AgoraParadosi();
                            B[i].setErgo(A[pos]);
                            A[pos]=null;
                            --ergon;
                            break;
                        }
                        else {
                            System.out.println("den yparxoyn kataxorimena stoixia ergon");
                            break;
                        }
                    }
                }
                case 3:if (B.length!=0){
                    displayergaProsMetafora(B);
                    System.out.println("dose thesi ergou poy paradothike");
                    int pos=scanner.nextInt();
                    B[pos]=null;
                    break;
                }else {
                    System.out.println("den yparxoyn kataxorimena erga pros metafora");
                    break;
                }
                case 4:if (ergon!=1){
                    displayPhotographs(A);
                }else {
                    System.out.println("den yparxoyn kataxorimena erga pros polisi");
                }
                case 5:if (ergon!=1){
                    displayPaintings(A);
                }else {
                    System.out.println("den yparxoyn kataxorimena erga pros polisi");
                }
                case 6:if (ergon!=1){
                    System.out.println("\nstoixia ergon");
                    for (ProsPolisi A1 : A){
                        if (A1!=null){
                            System.out.println(A1);
                        }else {
                            System.out.println("den yparxoyn kataxorimena erga pros polisi");
                            break;
                        }
                    }
                }
                case 7: if(B.length!=0){
                    displayergaProsMetafora(B);
                }else {
                    System.out.println("den yparxoyn kataxorimena erga pros metafora");
                    break;
                }
                case 8:System.out.println("\n\t.....Telos Programmatos....");
                break;
                default:System.out.println("\n\tLathos epilogi, eisagete arithmo 1-4: \n");
            }
        }while (e1!=8);
    }
}
