import java.util.List;

public class Student {
    //Створити клас Student, що містить такі характеристики – ім'я, група, курс, оцінки з предметів.
    //Створити колекцію, яка містить об'єкти класу Student.
    //Написати метод, який видаляє студентів із середнім балом <3.
    //Якщо середній бал>=3, студент переводиться на наступний курс.
    //Напишіть метод printStudents(List<Student> students, int course), який отримує список студентів
    // та номер курсу. А також друкує на консоль імена тих студентів зі списку, які навчаються на цьому курсі.
    String name, group;
    int mark;
    int couse;

    public Student(String name, String group, int mark, int couse) {
        this.name = name;
        this.group = group;
        this.mark = mark;
        this.couse = couse;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getMark() {
        return mark;
    }

    public int getCouse() {
        return couse;
    }

    public static void printStudents(List<Student> students, int course){
        for (Student s : students){
            if (s.couse == course){
                System.out.println(s.getName() + " навчається на курсі - " + course);
            }
        }
    }
}
