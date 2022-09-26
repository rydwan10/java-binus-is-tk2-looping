import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isProgramRunning = true;
        String studentName = "", NIM = "";
        int studentChosenNumber = 0;

        Scanner scanner = new Scanner(System.in);

        while (isProgramRunning) {

            // Validate student name
            boolean isStudentNameValid = false;
            while (!isStudentNameValid) {
            System.out.print("Masukkan Nama Anda [1...25] : ");
                studentName = scanner.nextLine();
                boolean checkStudentName = Validators.validateNameLength(studentName);
                if (!checkStudentName) {
                    System.out.println("Nama mahasiswa minimal 1 dan maksimal 25 karakter!");
                } else {
                    isStudentNameValid = true;
                }
            }

            // Validate NIM
            boolean isNIMValid = false;
            while (!isNIMValid) {
                System.out.print("Masukkan NIM Anda [karus 10 karakter] : ");
                NIM = scanner.nextLine();
                boolean checkStudentNIM = Validators.validateNIMLength(NIM);
                if (!checkStudentNIM) {
                    System.out.println("NIM Harus diisi dan harus 10 karakter!");
                } else {
                    isNIMValid = true;
                }
            }
            System.out.println("\n");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("\n");

            System.out.println("Registrasi Sukses..");
            System.out.println("Selamat datang " + studentName + " [NIM : " + NIM + "].. ^^v");

            System.out.println("\n");
            System.out.println("Mari belajar macam-macam deret bilangan..");

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            boolean isChosenNumberValid = false;
            while(!isChosenNumberValid) {
                System.out.print("Masukkan Sembarang Angka [5..20] : ");
                studentChosenNumber = Integer.parseInt(scanner.nextLine());

                boolean checkStudentNumber = Validators.validateStudentChoosedNumber(studentChosenNumber);
                if(!checkStudentNumber) {
                    System.out.println("Angka yang dimasukkan harus 5 sampai 20!");
                } else {
                    isChosenNumberValid = true;
                }
            }

            System.out.println("Deret bilangan");
            System.out.println("##############");
            CalculateFunction resultEvenNumber = CalculateFunction.generateAndCalculateEvenNumber(studentChosenNumber);

            System.out.println("20 Bilangan Genap");
            System.out.println(resultEvenNumber.getResultArr());
            System.out.print("Hasil penjumlahan  = " + resultEvenNumber.getResultCalculation());
            System.out.println("\n");

            CalculateFunction resultOddNumber = CalculateFunction.generateAndCalculateOddNumber(studentChosenNumber);
            System.out.println("20 Bilangan Ganjil");
            System.out.println(resultOddNumber.getResultArr());
            System.out.print("Hasil penjumlahan  = " + resultOddNumber.getResultCalculation());
            System.out.println("\n");

            CalculateFunction resultFibonacciNumber = CalculateFunction.generateAndCalculateFibonacciNumber(studentChosenNumber);
            System.out.println("20 Bilangan Fibonacci");
            System.out.println(resultFibonacciNumber.getResultArr());
            System.out.print("Hasil penjumlahan  = " + resultFibonacciNumber.getResultCalculation());
            System.out.println("\n");

            System.out.print("Anda ingin mengulangi? [y/t] : ");
            boolean isConfirmationValid = false;

            while(!isConfirmationValid) {
                String confirmation = scanner.nextLine();
                if(confirmation.toLowerCase(Locale.ROOT).equals("t")) {
                    return;
                } else if(confirmation.toLowerCase(Locale.ROOT).equals("y")) {
                    isConfirmationValid = true;
                } else {
                    System.out.println("Input tidak valid! silahkan ketika y untuk ulangi dan t untuk akhiri program");
                }
            }
        }
    }
}