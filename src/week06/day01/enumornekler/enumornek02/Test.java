package week06.day01.enumornekler.enumornek02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);
    static List<User> userDB = new ArrayList<>();

    public static void main(String[] args) {

        User user = new User();
        user.setUsername("alperen");
        user.setPassword("12345678");
        user.setRole(ERole.ADMIN);
        userDB.add(user);

        User user1 = new User();
        user1.setUsername("ahmet");
        user1.setPassword("12345678");
        user1.setRole(ERole.USER);
        userDB.add(user1);

        User user2 = new User();
        user2.setUsername("mehmet");
        user2.setPassword("12345678");
        user2.setRole(ERole.USER);
        userDB.add(user2);
        welcomeInterface();
    }
    public static void welcomeInterface(){
        int secim = -1;
        do {
            System.out.println("1- Giris yap.");
            System.out.println("0- Cikis");
            System.out.print("Seciminiz : ");
            secim = scanner.nextInt();
            scanner.nextLine();
            welcomeFunctions(secim);
        } while (secim!=0);
    }

    private static void welcomeFunctions(int secim) {
        switch (secim){
            case 1:{
                User user = girisYap();
                break;
            }
            case 0:{
                System.out.println("Gule gule...");
                break;
            }
            default:{
                System.out.println("Lutfen gecerli bir secim yapiniz.");
                break;
            }
        }
    }

    private static User girisYap() {
        System.out.print("username : ");
        String username = scanner.nextLine();
        System.out.print("password : ");
        String password = scanner.nextLine();
        User user;
        if(checkCredentials(username,password)){
            user = findByUsernameAndPassword(username,password);
            if(user!=null){
                if(user.getRole().equals(ERole.USER)){
                    userMenu(user);
                } else if(user.getRole().equals(ERole.ADMIN)){
                    adminMenu(user);
                }
            }
        }
        return null;
    }

    private static void adminMenu(User user) {
        int secim = -1;
        do {
            System.out.println("### ADMIN MENU ###");
            System.out.println("1- Sifremi degistir.");
            System.out.println("2- Kullanici engelle.");
            System.out.println("0- Cikis");
            System.out.print("Seciminiz : ");
            secim = scanner.nextInt();
            scanner.nextLine();
            adminFunctions(secim);
        } while (secim!=0);
    }

    private static void adminFunctions(int secim) {
        switch (secim){
            case 1:{
                System.out.println("Sifremi degistir");
                break;
            }
            case 2:{
                System.out.println("Kullanici engelle");
                break;
            }
            case 0:{
                System.out.println("Ana menuye donuluyor...");
                break;
            }
            default:{
                System.out.println("Lutfen gecerli bir secim yapiniz.");
                break;
            }
        }
    }

    private static void userMenu(User user) {
        int secim = -1;
        do {
            System.out.println("### STANDARD USER MENU ###");
            System.out.println("1- Sifremi degistir.");
            System.out.println("0- Cikis");
            System.out.print("Seciminiz : ");
            secim = scanner.nextInt();
            scanner.nextLine();
            userFunctions(secim);
        } while (secim!=0);
    }

    private static void userFunctions(int secim) {
        switch (secim){
            case 1:{
                System.out.println("Sifremi degistir");
                break;
            }
            case 0:{
                System.out.println("Ana menuye donuluyor...");
                break;
            }
            default:{
                System.out.println("Lutfen gecerli bir secim yapiniz.");
                break;
            }
        }
    }

    private static boolean checkCredentials(String username, String password) {
        for(User user : userDB){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    private static User findByUsernameAndPassword(String username, String password){
        for(User user : userDB){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    };
}
