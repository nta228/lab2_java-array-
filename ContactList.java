package ArrayInJava.Exam2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
public class ContactList implements Phone {
    ArrayList<Contact> ContactList = new ArrayList<>();
    @Override
    public void addPhone(String name, String phone) {
        Contact contact = new Contact();
        boolean had = false;
        boolean find = false;
        if (ContactList.size() > 0) {
            for (Contact ct : ContactList) {
                if (ct.name.equals(name)) {
                    if (!ct.phone.contains(phone)) {
                        ct.phone = ct.phone + " :" + phone;
                        had = true;
                        find = true;
                        break;
                    }
                }
            }
            if (find == false) {
                contact.name = name;
                contact.phone = phone;
                ContactList.add(contact);
                had = true;
            }
        } else {
            contact.name = name;
            contact.phone = phone;
            ContactList.add(contact);
            had = true;
        }
        if (had) {
            System.out.println("Them thanh cong.");
        } else {
            System.out.println("Ten nguoi dung va so dien thoai da co san.");
        }

    }

    @Override
    public void updatePhone(String name, String newphone) {
        boolean had = false;
        for (Contact ct : ContactList) {
            if (ct.name.equals(name)) {
                ct.phone = newphone;
                had = true;
            }
        }
        if (had) {
            System.out.println("Sua thanh cong.");
        } else {
            System.out.println("Khong tim thay.");
        }
    }

    @Override
    public void removePhone(String name) {
        boolean had = false;
        for (Contact ct : ContactList) {
            if (ct.name.equals(name)) {
                ContactList.remove(ct);
                had = true;
            }
        }
        if (had) {
            System.out.println("Xoa thanh cong.");
        } else {
            System.out.println("Khong tim thay.");
        }
    }

    @Override
    public void searchPhone(String name) {
        boolean had = false;
        for (Contact ct : ContactList) {
            if (ct.name.equals(name)) {
                System.out.println("So dien thoai cua nguoi dung '" + ct.name + "' la :" + ct.phone);
                had = true;
                break;
            }
        }
        if (!had) {
            System.out.println("Khong tim thay nguoi dung co ten ' " + name + " '");
        }
    }

    @Override
    public void Print() {
        Collections.sort(ContactList, new SortPrint());
        ContactList.forEach((ct) -> {
            ct.viewInfo();
        });

    }

    class SortPrint implements Comparator<Contact> {
        public int compare(Contact c1, Contact c2) {
            if (c1.name.compareToIgnoreCase(c2.name) > 0) {
                return 1;
            }
            return 0;
        }
    }
}
