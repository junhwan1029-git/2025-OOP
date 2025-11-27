import java.util.*;
import java.io.*;

class Homework9{
    public static void main(String[] args) {
        Map<String, String> IdAndPassword = new HashMap<>();
        String ID;
        String Password;
        try {
            Scanner scanner = new Scanner(new File("db.txt"));
            while (scanner.hasNext()) {
                ID = scanner.next();
                Password = scanner.next();
                IdAndPassword.put(ID, Password);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("id와 password를 입력해주세요.\n");
            System.out.println("id: ");
            ID = sc.next().trim();
            if (!IdAndPassword.containsKey(ID)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            System.out.println("password: ");
            Password = sc.next().trim();
            if (IdAndPassword.get(ID).equals(Password)) {
                System.out.println("아이디와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요:\n");
            }
        }
    }
}