package ArrayInJava.Exam2;
import java.util.Scanner;
;

public class Main {
    static ContactList contactlist = new ContactList();
    //	static Scanner input = new Scanner(System.in);
//	static String name, phone;
    private static  String inputString() {
        Scanner input = new Scanner(System.in);
        String inputs = input.nextLine();
        return inputs;
    }
    private static  int inputInteger() {
        Scanner input = new Scanner(System.in);
        int inputs = input.nextInt();
        return inputs;
    }
    private static void searchPhone() {
        System.out.println("Moi ban nhap ten nguoi dung    : ");
        String name = inputString();
        contactlist.searchPhone(name);
    }

    private static void addPhone() {
        System.out.println("Moi nhap ten nguoi dung : ");

        String name = inputString();

        System.out.println("Moi ban nhap so dien thoai moi : ");

        String phone = inputString();
        contactlist.addPhone(name, phone);
    }

    private static void updatePhone() {
        System.out.println("Moi ban nhap ten nguoi dung    : ");
        String  name = inputString();
        System.out.println("Moi ban nhap so dien thoai moi : ");
        String phone = inputString();
        contactlist.updatePhone(name, phone);
    }

    private static void Print() {
        contactlist.Print();
    }

    private static void removePhone() {
        System.out.println("Moi ban nhap ten nguoi dung muon xoa :");
        String name = inputString();
        contactlist.removePhone(name);
    }

    static void menu() {
        System.out.print("1. Them So Lien Lac \n" + "2. Xoa So Lien Lac \n" + "3. Thay Doi Lien Lac \n"
                + "4. Tim Kiem Lien Lac \n" + "5. Hien Thi Lien Lac \n" + "6. Thoat\n");
    }

    public static void main(String[] args) {
        int choice;
        menu();
        while (true) {
            try {
                System.out.println("Moi ban chon 1 muc: ");
                choice = inputInteger();
//				input.nextInt();
                switch (choice) {
                    case 1: {
                        addPhone();
                        break;
                    }
                    case 2: {

                        removePhone();
                        break;
                    }
                    case 3: {
                        updatePhone();
                        break;
                    }
                    case 4: {
                        searchPhone();
                        break;

                    }

                    case 5: {
                        Print();
                        break;
                    }
                    case 6:
                        return;

                }
            } catch (Exception e) {
                System.out.println("cólỗi  ");
                e.printStackTrace();
            }

        }
    }
}
