import entitites.ContaPessoa;

import java.util.Locale;
import java.util.Scanner;

public class Client {

    public static void mostrar_dados(){
        System.out.format("%10s %15s %15s", "ACCOUNT", "HOLDER" , "BALANCE");
        System.out.println("\n-------------------------------------------------------");
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaPessoa holder;


        System.out.print("Enter account number: ");
        int numbAccount = sc.nextInt();
        System.out.print("\nEnter account holder: ");
        sc.nextLine();
        String name = sc.nextLine().toUpperCase();
        System.out.print("\nIs there initial deposit? (1 yes /2 no)");
        int opc = sc.nextInt();

        if (opc == 1){
            System.out.print("\nEnter initial deposit value: ");
            double initialDeposit = sc.nextDouble();

            holder = new ContaPessoa(numbAccount, name, initialDeposit);
        } else{
            holder = new ContaPessoa(numbAccount, name);
        }

        mostrar_dados();
        System.out.print(holder);
        System.out.println("\n-----------------------------------------------------");

        System.out.println("Enter a deposit value: ");
        double v = sc.nextDouble();

        holder.deposit(v);
        mostrar_dados();
        System.out.print(holder);
        System.out.println("\n-----------------------------------------------------");

        System.out.println("Enter a withdraw value: ");
        double n = sc.nextDouble();

        holder.withdraw(n);

        mostrar_dados();
        System.out.print(holder);
        System.out.println("\n-----------------------------------------------------");


    }

}