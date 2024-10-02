public class Student {
    private String name;
    private int studentID;
    private Subject subject;
    private int grade; // Оцінка за предмет

    public Student(String name, int studentID, Subject subject) {
        this.name = name;
        this.studentID = studentID;
        this.subject = subject;
        this.grade = 0; // Початково без оцінки
    }

    // Метод для виконання завдання
    public void completeTask(String task) {
        System.out.println(name + " виконав(ла) завдання: " + task + " з предмету " + subject.getName());
    }

    // Метод для отримання оцінки
    public void receiveGrade(int grade) {
        this.grade = grade;
        //System.out.println(name + " отримав(ла) оцінку: " + grade + " за предмет " + subject.getName());
    }

    // Метод для перевірки успішності
    public void checkProgress() {
        if (grade == 0) {
            System.out.println(name + " ще не отримав(ла) оцінки за предмет " + subject.getName());
        } else if (grade <= 2) {
            System.out.println(name + " виконав(ла) завдання неправильно або незадовільно. Оцінка: " + grade);
        } else {
            System.out.println(name + " має оцінку " + grade + " за предмет " + subject.getName() + ". Виконання завдання було успішним.");
        }
    }
}

