package homework35.todoappl.model;

public enum Menu {
    Turn(1, "Включить компьютер"),
    GoTo(2, "Сходить в магазин"),
    Work(3, "Сходить на работу"),
    Out(4, "Выйти гулять"),
    EXIT(5, "выход");

    private int id;
    private String task;

    Menu(int id, String task) {
        this.id = id;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "Task1{" +
                "id=" + id +
                ", task='" + task + '\'' +
                '}';
    }
}