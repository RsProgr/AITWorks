package homework35.todoappl.model;

public enum Menu {
    ADD(1, "Добавить запись"),
    VIEW(2, "Посмотреть все записи"),
    DELETE(3, "Удалить запись(по номеру)"),
    EDIT(4, "Отредактировать задачу"),
    EXIT(5, "Выйти");

    private int menuItem;
    private String action;

    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    public static void printMenu() {
        Menu[] menu = Menu.values();
        for (Menu item : menu) {
            System.out.println(item.menuItem + " - " + item.action);
        }
    }
}