public class Classroom {
    private String roomNumber;
    private int capacity;
    private Subject subject; // Один предмет

    public Classroom(String roomNumber, int capacity, Subject subject) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.subject = subject;
    }

    public void roomInfo() {
        System.out.println("Номер аудиторії: " + roomNumber);
        System.out.println("Місткість аудиторії: " + capacity);
        System.out.println("Предмет: " + subject.getName());
    }
}
