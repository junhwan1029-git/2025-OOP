import java.util.Scanner;

class Student{
    long Stnumber, Phnumber;
    String name, major;

    long getStnumber(){return Stnumber;}
    void setStnumber(long Stnumber){this.Stnumber = Stnumber;}
    String getPhnumber(){
        String phone = "0" + Phnumber;

        String first = phone.substring(0,3);
        String middle = phone.substring(3,7);
        String last = phone.substring(7);

        return first + "-" + middle + "-" + last;
    }
    void setPhnumber(long Phnumber){this.Phnumber = Phnumber;}
    String getname(){return name;}
    void setname(String name){this.name = name;}
    String getmajor(){return major;}
    void setmajor(String major){this.major = major;}
}

class Homework2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Student[] student = new Student[3];
        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student student1 = new Student();
        student1.setStnumber(scanner.nextLong());
        student1.setname(scanner.next());
        student1.setmajor(scanner.next());
        student1.setPhnumber(scanner.nextLong());
        student[0] = student1;
        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student student2 = new Student();
        student2.setStnumber(scanner.nextLong());
        student2.setname(scanner.next());
        student2.setmajor(scanner.next());
        student2.setPhnumber(scanner.nextLong());
        student[1] = student2;
        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Student student3 = new Student();
        student3.setStnumber(scanner.nextLong());
        student3.setname(scanner.next());
        student3.setmajor(scanner.next());
        student3.setPhnumber(scanner.nextLong());
        student[2] = student3;

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.\n");

        System.out.printf("첫번째 학생: %d %s %s %s\n", student[0].getStnumber(), student[0].getname(), student[0].getmajor(), student[0].getPhnumber());
        System.out.printf("두번째 학생: %d %s %s %s\n", student[1].getStnumber(), student[1].getname(), student[1].getmajor(), student[1].getPhnumber());
        System.out.printf("세번째 학생: %d %s %s %s\n", student[2].getStnumber(), student[2].getname(), student[2].getmajor(), student[2].getPhnumber());
    }
}