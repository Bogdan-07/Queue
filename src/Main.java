import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean x = true;
        Node temp;
        while (x) {
            System.out.print("1.Add a node to the queue \n2.Remove a node from the queue \n3.Show the entire queue\n4.Exit\n\nHow would you like to interact with the queue?: ");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.print("Enter your ID: ");
                    int tempID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the description: ");
                    String tempDesc = scanner.nextLine();
                    Payload tempPayload = new Payload(tempID, tempDesc);
                    temp = new Node(tempPayload, null);
                    queue.enQueue(temp);
                    System.out.print("\n");
                    break;
                case 2:
                    if(queue.isEmpty())
                        System.out.println("The queue is empty");
                    else
                        System.out.println(queue.deQueue());
                    break;
                case 3:
                    if(queue.isEmpty())
                        System.out.println("The queue is empty");
                    else
                        System.out.println(queue.printQueue());
                    break;
                case 4:
                    x = false;
                    break;
                default:
                    System.out.println("Error! Invalid option, try again.");
            }
        }
    }
}