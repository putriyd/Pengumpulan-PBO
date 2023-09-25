public class TodoList {

    public static String[] model = new String[10];

    public static void main(String[] args) {
        TestShowToDoList();

    }

    // Menampilkan To Do List
    public static void ShowToDoList() {
        for (var i = 0; i < model.length; i++) {
            var ToDo = model[i];
            var no = i + 1;

            if (ToDo != null) {
                System.out.println(no + ". " + ToDo);
            }
        }
    }

    public static void TestShowToDoList() {
        model[0] = "Tugas Jarkomdat";
        model[1] = "Tugas Bahasa Inggris";
        model[2] = "Tugas Pemweb II";
        ShowToDoList();
        ;

    }

    // Menambah To Do List
    public static void AddToDoList() {

    }

    // Menghapus To Do List
    public static void RemoveToDoList() {

    }

    // Menampilkan View To Do List
    public static void ViewShowToDoList() {

    }

    // Menampilakn View menambah To Do List
    public static void ViewAddToDoList() {

    }

    // Menampilkan View menghapus To Do List
    public static void ViewRemoveToDoList() {

    }
}