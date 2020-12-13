import java.util.Scanner;

public class tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gia tri can tim: ");
        String input_name = sc.nextLine();

        boolean isExist = false;
        for(int i = 0; i < students.length; i++){
            if (students[i].equals(input_name)){
                System.out.println("Co ton tai gia tri can tim: " + input_name + "tai vi tri: " + (i+1));
                isExist = true;
                break;
            }
        }
        if (!isExist) System.out.println("Khong ton tai gia tri can tim trong mang");
    }
}
