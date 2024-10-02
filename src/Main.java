public class Main {
    public static void main(String[] args) {
        System.out.println("===Навчальні предмети===");
        // Створюємо об'єкт класу Subject
        Subject OOP = new Subject("Об`єктно-орієнтоване програмування", "Назар Ю.С.", 195);
        OOP.subjectInfo();

        System.out.println();//розділення в консолі

        // Створюємо об'єкт класу SeminarSubject
        SeminarSubject Rhetoric = new SeminarSubject("Риторика", "Хлипавка Г.Г", 0);
        Rhetoric.subjectInfo();
        Rhetoric.startDiscussion(" <<Сила слова: як риторика змінює світ>> ");

        System.out.println();//розділення в консолі

        PracticalSubject Math =new PracticalSubject("Математичні методи дослідження операцій","Чмир О.Ю.", 105,16,16);
        Math.subjectInfo();

        System.out.println();//розділення в консолі
        System.out.println("===Номери аудиторій===");
        Classroom room304 = new Classroom("304", 30, OOP);
        Classroom room212 = new Classroom("212", 20, Rhetoric);
        room304.roomInfo();
        System.out.println();//розділення в консолі
        room212.roomInfo();

        System.out.println();//розділення в консолі
        System.out.println("===Успішність студентів===");
        System.out.println();//розділення в консолі
        Student student1 = new Student("Юрій Піп",152,Rhetoric);
        Student student2 = new Student("Марія Дубко",182,OOP);
        Student student3 = new Student("Олег Кінов",122,Math);

        // Студент(-ка) виконує (не виконує, виконує незадовільно або неправильно)
        // завдання і відповідно отримує або не отримує оцінку
        student1.completeTask("Доповідь на семінарі");
        student1.receiveGrade(5);
        student1.checkProgress();
        System.out.println();//розділення в консолі
        student2.completeTask("Лабораторна №1");
        student2.receiveGrade(4);
        student2.checkProgress();
        System.out.println();//розділення в консолі
        student3.completeTask("Практичне завдання №1");
        student3.receiveGrade(2);
        student3.checkProgress();

    }
}