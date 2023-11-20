import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ввести з клавіатури 5 строк. додати їх до списку. Вивести їх складову на екран.
//        Scanner scanner = new Scanner(System.in);
//        int enterNum1 = 5;
//        System.out.print("Введите " + enterNum1 + " целое число: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        int num4 = scanner.nextInt();
//        int num5 = scanner.nextInt();
//
//        System.out.println("-----------------------");
//
//        List<Integer> myArray1 = new ArrayList<>(5);
//
//        myArray1.add(num1);
//        myArray1.add(num2);
//        myArray1.add(num3);
//        myArray1.add(num4);
//        myArray1.add(num5);
//
//        for (int i = 0; i < myArray1.size();  i++) {
//            System.out.print(myArray1.get(i) + " ");
//        }
//
//        System.out.println();
//        System.out.println("-----------------------");

        //Ввести з клавіатури 10 строк. Додавати строки не в кінець, а на початок списку
//        int arraySize = 10;
//        ArrayList<Integer> myArray2 = new ArrayList<>(arraySize);
//         Scanner scanner1 = new Scanner(System.in);
//        System.out.print("Введите 10 целых чисел: ");
//
//        int[] num11 = new int[arraySize];
//
//        num11[0] = scanner1.nextInt();
//        num11[1] = scanner1.nextInt();
//        num11[2] = scanner1.nextInt();
//        num11[3] = scanner1.nextInt();
//        num11[4] = scanner1.nextInt();
//        num11[5] = scanner1.nextInt();
//        num11[6] = scanner1.nextInt();
//        num11[7] = scanner1.nextInt();
//        num11[8] = scanner1.nextInt();
//        num11[9] = scanner1.nextInt();
//
//        int count = num11.length - 1;
//        System.out.println();
//        for (int i = 0; i < num11.length;  i++) {
//            myArray2.add(i, num11[count]);
//            count--;
//        }
//
//        for (int i = 0; i < num11.length;  i++) {
//            System.out.print(myArray2.get(i) + " ");
//        }
//        System.out.println();
//        System.out.println();

        // Створити список. Додати 5 строк. Видалити останню та додати її на початок списку.
//        ArrayList<Integer> myArray3 = new ArrayList<>();
//        myArray3.add(1);
//        myArray3.add(2);
//        myArray3.add(3);
//        myArray3.add(4);
//        myArray3.add(5);
//        int numList = myArray3.getLast();
//        myArray3.removeLast();
//        myArray3.add(0, numList);
//
//        for (Integer integer : myArray3) {
//            System.out.print(integer + " ");
//        }
//        System.out.println();
        //Ввести з клавіатури 5 чисел. Парні додаємо в кінець списку, непарні у початок списку.
//        ArrayList<Integer> myArray4 = new ArrayList<>();
//        Scanner scanner2 = new Scanner(System.in);
//        int l = 5;
//        System.out.print("Введите " + l + " целых чисел: ");
//        int[] number = new int[l];
//        number[0] = scanner2.nextInt();
//        number[1] = scanner2.nextInt();
//        number[2] = scanner2.nextInt();
//        number[3] = scanner2.nextInt();
//        number[4] = scanner2.nextInt();
//
//        for (int i = 0; i < number.length; i++) {
//            if (number[i]%2 == 0) {
//                myArray4.addFirst(number[i]);
//            }
//            else
//            {
//                myArray4.addLast(number[i]);
//            }
//        }
//        for (Integer integer : myArray4) {
//            System.out.print(integer + " ");
//        }
//        System.out.println();
//        System.out.println("---------Next task---------");
//        Ввести з клавіатури 5 чисел. Видалити числа, які більше 6.
//        ArrayList<Integer> myArray5 = new ArrayList<>();
//        Scanner scanner3 = new Scanner(System.in);
//        int enterNum2 = 5;
//        System.out.print("Введите " + enterNum2 + " целых чисел: ");
//
//        myArray5.add(scanner3.nextInt());
//        myArray5.add(scanner3.nextInt());
//        myArray5.add(scanner3.nextInt());
//        myArray5.add(scanner3.nextInt());
//        myArray5.add(scanner3.nextInt());
//
//        System.out.println();
//        int countAll = 6;
//
//        for(int i = 0; i < myArray5.size(); i++) {
//            if (myArray5.get(i) > countAll) {
//                myArray5.remove(i);
//            }
//        }
//
//        if (myArray5.getLast() > countAll){
//            myArray5.removeLast();
//        }
//
//        for (Integer integer : myArray5) {
//            System.out.print(integer + " ");
//        }
//        System.out.println();
//        System.out.println("---------Next task---------");
        //Створіть клас Fruits з полем name, конструктором (в якому ініціалізується це поле) та гетером
        // для цього поля. Створіть 5 його нащадків (на ваш вибір). Реалізуйте у цих класах все, що є у
        // батьківського вносячи відповідні зміни. Створіть клас Main, в якому створіть список фруктів.
        // Додайте по одному виду фруктів до списку. Роздрукуйте назву усіх фруктів.
//        ArrayList<Fruits> fruits = new ArrayList<>();
//        Apple apple = new Apple("Apple");
//        Pineapple pineapple = new Pineapple("pineapple");
//        Plum plum = new Plum("Plum");
//        Kiwi kiwi = new Kiwi("Kiwi");
//        Banana banana= new Banana("Banana");
//
//        fruits.add(apple);
//        fruits.add(pineapple);
//        fruits.add(plum);
//        fruits.add(kiwi);
//        fruits.add(banana);
//
//        for(Fruits s : fruits){
//            System.out.print(s.getName() + " ");
//        }
//        System.out.println();
//        System.out.println("---------Next task---------");

        //Створити клас Box. В нього мають бути поле вага, конструктор (в якому ініціалізується це поле)
        // та гетер. Створіть список, в який додайте 10 коробок. Створіть ще два додаткові списки для меншої
        // і більшої ваги. Якщо вага коробки менше 300 грамм - додайте у відповідний список. Усі інші -
        // до списку, в якому зберігаються коробки з більшою вагою.
//        ArrayList<Box> boxes = new ArrayList<>();
//
//        Box box1 = new Box((int) 300);
//        Box box2 = new Box(400);
//        Box box3 = new Box(200);
//        Box box4 = new Box(250);
//        Box box5 = new Box(350);
//
//        boxes.add(box1);
//        boxes.add(box2);
//        boxes.add(box3);
//        boxes.add(box4);
//        boxes.add(box5);
//
//        ArrayList<Integer> boxesMore = new ArrayList<>();
//        ArrayList<Integer> boxesLess = new ArrayList<>();
//
//        for(Box s : boxes){
//            if (s.getWeight() > 300){
//                boxesMore.add(s.getWeight());
//            }
//            if (s.getWeight() < 300) {
//                boxesLess.add(s.getWeight());
//            }
//        }
//        for (int f : boxesMore){
//            System.out.print("Більше 300 гр" + f + " ");
//        }
//        for (int f : boxesLess){
//            System.out.print("Менше 300 гр" + f + " ");
//        }
//        System.out.println();
//        System.out.println("---------Next task---------");
        //Створити клас Student, що містить такі характеристики – ім'я, група, курс, оцінки з предметів.
        //Створити колекцію, яка містить об'єкти класу Student.
        //Написати метод, який видаляє студентів із середнім балом <3.
        //Якщо середній бал>=3, студент переводиться на наступний курс.
        //Напишіть метод printStudents(List<Student> students, int course), який отримує список студентів
        // та номер курсу. А також друкує на консоль імена тих студентів зі списку, які навчаються на цьому
        // курсі.

//        ArrayList<Student> students = new ArrayList<>();
//
//        Student student1 = new Student("Surname_1", "MG-08-1", 77, 4);
//        Student student2 = new Student("Surname_2", "MG-09-1", 66, 5);
//        Student student3 = new Student("Surname_3", "MG-02-1", 48, 3);
//        Student student4 = new Student("Surname_4", "MG-10-1", 60, 1);
//        Student student5 = new Student("Surname_5", "MG-11-1", 67, 2);
//
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//        students.add(student5);
//
//        int mark = 65;
//
//        System.out.print("Студент переводиться на наступний курс ");
//
//        for (int i = 0; i < students.size(); i++){
//            if (students.get(i).getMark() < mark){
//                students.remove(i);
//            }
//            else {
//                System.out.print(students.get(i).getName() + " ");
//            }
//        }
//
//        System.out.println();
//        Student.printStudents(students,4);
//        System.out.println();
//        System.out.println("---------Next task---------");

        Tshirt tshirt = new Tshirt(100, "white", Size.S);
        Tie tie = new Tie(120, "blue", Size.XXS);
        Pants pants = new Pants(140, "grey", Size.XS);;
        Skirt skirt =  new Skirt(160, "pink", Size.XXS);;

        Cloth[] arrClothes = {tie,tshirt,pants,skirt};

        Atelie atelier = new Atelie();
        atelier.dressTheMan(arrClothes);
        System.out.println();
        atelier.dressTheMan(arrClothes);

    }
}
