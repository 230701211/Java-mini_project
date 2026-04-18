import service.TaskService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskService service = new TaskService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- TASK MANAGER ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Complete");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    service.addTask(sc.nextLine());
                    break;
                case 2:
                    service.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    service.markTask(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    service.deleteTask(sc.nextInt());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}