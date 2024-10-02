class Subject {
    private String name;
    private String teacher;
    private int time;

    public Subject(String name, String teacher, int time) { // Конструктор
        this.name = name;
        this.teacher = teacher;
        this.time = time;
    }

    public String getName() { // Гетери
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getTime() {
        return time;
    }

    public void setName(String name) { //сетери
        this.name = name;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void subjectInfo() { // Метод виведення інформації
        System.out.println("Назва предмету: " + name);
        System.out.println("Викладач: " + teacher);
        System.out.println("К-сть академічних годин: " + time);
    }

}

// Клас SeminarSubject
class SeminarSubject extends Subject {
    public SeminarSubject(String name, String teacher, int time) {
        super(name, teacher, time); // Викликаємо конструктор батьківського класу
    }

    @Override
    public void subjectInfo() { // Перевизначений метод для семінарського заняття
        System.out.println("Семінарське заняття з предмету: " + getName());
        System.out.println("Викладач: " + getTeacher());
    }

    public void startDiscussion(String topic) { // Метод для розпочатку дискусії
        System.out.println("Розпочинаємо дискусію на тему: " + topic);
    }

}

// Клас PracticalSubject
class PracticalSubject extends Subject {
    private int practicalHours;
    private int labHours;

    public PracticalSubject(String name, String teacher, int time, int practicalHours,int labHours) {
        super(name, teacher, time); // Викликаємо конструктор батьківського класу
        this.practicalHours = practicalHours;
        this.labHours=labHours;
    }

    @Override
    public void subjectInfo() { // Перевизначений метод для практичного заняття
        super.subjectInfo(); // Викликаємо метод з батьківського класу
        System.out.println("К-сть практичних годин: " + practicalHours);
        System.out.println("К-сть лаборатнорих годин: " + labHours);
    }
}