import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];
        students[0] = new Student("Иванов Иван Иванович", 2023, "Москва, ул. Пушкина, д. 1", "88005553535", 3, "Информатика");
        students[1] = new Student("Петров Петр Петрович", 2024, "Москва, ул. Лермонтова, д. 2", "99002252525", 4, "Математика");
        students[2] = new Student("Сидоров Сидор Сидорович", 2025, "Москва, ул. Чехова, д. 3", "98003352535", 2, "Информатика");

        // Вывод ФИО всех студентов
        System.out.println("ФИО всех студентов:");
        for (Student student : students) {
            System.out.println(student.getFIO());
        }

        System.out.print("Введите факультет: ");
        String facultet = sc.nextLine();
        System.out.print("Введите год поступления: ");
        int year = sc.nextInt();

        // Список студентов заданного факультета
        System.out.println("Список студентов факультета " + facultet + ":");
        for (Student student : students) {
            if (student.getFacultet().equals(facultet)) {
                System.out.println(student.getFIO());
            }
        }
        // Список студентов, поступивших после заданного года
        System.out.println("Список студентов, поступивших после " + year + " года:");
        for (Student student : students) {
            if (student.getPostuplenie() > year) {
                System.out.println(student.getFIO());
            }
        }
        sc.close();
    }
    static class Student {
        public String FIO;
        public int postuplenie;
        public String adress;
        public String phone;
        public int curs;
        public String facultet;

        public Student(String FIO, int postuplenie, String adress, String phone, int course, String facultet) {
            this.FIO = FIO;
            this.postuplenie = postuplenie;
            this.adress = adress;
            this.phone = phone;
            this.curs = curs;
            this.facultet = facultet;
        }

        public String getFIO() {

            return FIO;
        }

        public int getPostuplenie() {

            return postuplenie;
        }

        public String getAdress() {

            return adress;
        }

        public String getPhone() {

            return phone;
        }

        public void setPhone(String phone) {

            this.phone = phone;
        }

        public int getCurs() {

            return curs;
        }

        public void setCurs(int curs) {

            this.curs = curs;
        }

        public String getFacultet() {

            return facultet;
        }
    }
}

