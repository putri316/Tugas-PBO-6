import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Laptop myLaptop;
        
        // Memilih laptop di awal
        System.out.println("=== APLIKASI KONTROL LAPTOP ===");
        System.out.println("1. Lenovo\n2. Toshiba\n3. MacBook");
        System.out.print("Pilih Merk Laptop (1-3): ");
        int pilihan = input.nextInt();
        
        if (pilihan == 1) {
            myLaptop = new Lenovo();
        } else if (pilihan == 2) {
            myLaptop = new Toshiba();
        } else {
            myLaptop = new MacBook();
        }

        LaptopUser andri = new LaptopUser(myLaptop);
        String action;

        System.out.println("\n--- INSTRUKSI ---");
        System.out.println("Ketik: ON, OFF, UP, DOWN, atau EXIT");

        // Loop ini yang bikin program nungguin input kamu terus-terusan
        while (true) {
            System.out.print("\nMasukkan perintah: ");
            action = input.next().toUpperCase(); 

            if (action.equals("ON")) {
                andri.turnOnLaptop();
            } else if (action.equals("OFF")) {
                andri.turnOffLaptop();
            } else if (action.equals("UP")) {
                andri.makeLaptopLouder();
            } else if (action.equals("DOWN")) {
                andri.makeLaptopSilence();
            } else if (action.equals("EXIT")) {
                System.out.println("Keluar dari program...");
                break;
            } else {
                System.out.println("Perintah salah!");
            }
        }
        input.close();
    }
}