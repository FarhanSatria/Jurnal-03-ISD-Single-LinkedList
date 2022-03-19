package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Pegawai> linkedList = new LinkedList<>();
        Scanner inputUser = new Scanner(System.in);
        boolean finish = true;

        while (finish) {
            System.out.println("""
                    Pilihlah Menu:
                    1. Input data
                    2. Hapus data
                    3. Cetak list pegawai
                    4. Keluar
                    """);
            int input = inputUser.nextInt();
            if (input == 1 || input == 2 || input == 3 || input == 4) {
                switch (input) {
                    case 1 -> {
                        System.out.println("Tuliskan nip, nama dan divisi pegawai");
                        String nip = inputUser.next();
                        String nama = inputUser.next();
                        String divisiPegawai = inputUser.next();
                        System.out.println();
                        System.out.println("Tambahkan data di awal list? (y/n)");
                        String check = inputUser.next();
                        System.out.println();
                        if (check.equalsIgnoreCase("y")) {
                            linkedList.insertAtFront(new Pegawai(nip, nama, divisiPegawai));
                        } else if (check.equalsIgnoreCase("n")) {
                            System.out.println("Tambahkan data di akhir list? (y/n)");
                            check = inputUser.next();
                            if (check.equalsIgnoreCase("y")) {
                                linkedList.insertAtBack(new Pegawai(nip, nama, divisiPegawai));
                                System.out.println();
                            }
                        } else {
                            System.out.println("silahkan input y/n");
                        }
                    }
                    case 2 -> {
                        System.out.println("Hapus data di awal list? (y/n)");
                        String check = inputUser.next();
                        System.out.println();
                        if (check.equalsIgnoreCase("y")) {
                            linkedList.removeFromFront();
                        } else if (check.equalsIgnoreCase("n")) {
                            System.out.println("Hapus data di akhir list? (y/n)");
                            check = inputUser.next();
                            if (check.equalsIgnoreCase("y")) {
                                linkedList.removeFromBack();
                                System.out.println();
                            }
                        } else {
                            System.out.println("silahkan input y/n");
                        }
                    }
                    case 3 -> {
                        linkedList.print();
                        System.out.println();
                    }
                    case 4 -> finish = false;
                }
            } else {
                System.out.println("silahkan input 1/2/3/4");
                System.out.println();
            }
        }
    }
}