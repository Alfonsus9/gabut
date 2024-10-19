import java.util.Scanner;

class ATMsederhana {

    int saldo = 4000000;
    Scanner s = new Scanner(System.in);

    public void cekSaldo() {
        System.out.println("Saldo Anda = " + saldo);
    }

    public void tampilkanMenu() {
        System.out.println("--------------------------------");
        System.out.println("======== SELAMAT DATANG ========");
        System.out.println("--------------------------------");
        System.out.println("================================");
        System.out.println("          1. Cek saldo          ");
        System.out.println("          2. Transfer uang      ");
        System.out.println("          3. Tarik tunai        ");
        System.out.println("          4. Tambah saldo       ");
        System.out.println("          4. Keluar             ");
        System.out.println("--------------------------------");
        System.out.print("Pilih Menu (1/2/3/4) = ");
    }

    public void transfer() {
        System.out.print("Rekening tujuan = ");
        int tujuanTransfer = s.nextInt();
        System.out.print("Jumlah transfer = ");
        int jumlah = s.nextInt();

        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            System.out.println("Transfer berhasil.");
            System.out.println("Rekening penerima = " + tujuanTransfer);
            System.out.println("Jumlah transfer = " + jumlah);
            System.out.println("Sisa saldo = " + saldo);
        }
        System.out.println("Terima kasih telah menggunakan pelayanan kami.");
    }

    public void tarikTunai() {
        System.out.print("Jumlah penarikan = ");
        int penarikan = s.nextInt();

        if (penarikan > saldo) {
            System.out.println("Saldo tidak mencukupi.");
        } else {
            saldo -= penarikan;
            System.out.println("Penarikan berhasil.");
            System.out.println("Jumlah penarikan = " + penarikan);
            System.out.println("Sisa saldo = " + saldo);
        }
        System.out.println("Terima kasih telah menggunakan pelayanan kami.");
    }

    public void tambahSaldo() {
        System.out.print("Jumlah yang ingin ditambahkan ke saldo = ");
        int tambah = s.nextInt();

        if (tambah > 0) {
            saldo += tambah;
            System.out.println("Saldo berhasil ditambahkan.");
            System.out.println("Saldo baru = " + saldo);
        } else {
            System.out.println("Jumlah tidak valid. Masukkan jumlah yang lebih besar dari 0.");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ATMsederhana atm = new ATMsederhana();

        System.out.println("--------------------------------");
        System.out.println("======== SELAMAT DATANG ========");
        System.out.println("--------------------------------");

        System.out.print("Masukkan nomor rekening = ");
        int rekening = s.nextInt();

        System.out.print("Masukkan PIN = ");
        int pin = s.nextInt();

        if (rekening == 2382023 && pin == 9306) {
            boolean keluar = false;

            while (!keluar) {
                atm.tampilkanMenu();
                int pilihan = s.nextInt();

                switch (pilihan) {
                    case 1:
                        atm.cekSaldo();
                        break;
                    case 2:
                        atm.transfer();
                        break;
                    case 3:
                        atm.tarikTunai();
                        break;
                    case 4:
                        atm.tambahSaldo();
                        break;
                    case 5:
                        System.out.println("Terima kasih telah menggunakan pelayanan kami.");
                        keluar = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }

                if (!keluar) {
                    System.out.println();
                    System.out.println("Kembali ke menu utama...");
                    System.out.println();
                }
            }
        } else {
            System.out.println("Nomor rekening atau PIN salah.");
        }
    }
}
