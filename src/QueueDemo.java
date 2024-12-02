// Demonstration of the use of class Queue
public class QueueDemo {
    public static void main(String[] args) {
        // Create an empty queue of 10 elements
        Queue queue1 = new Queue(10);
        char [] name = {'T', 'o', 'm'};

        // Create a queue from an array
        Queue queue2 = new Queue(name);
        char ch;
        int i;

        // Put a series of characters into queue1
        for (i = 0; i < 10; i++)
            queue1.putChar((char)('A' + i));

        // Create a queue from another queue
        Queue queue3 = new Queue(queue1);

        // Display the contents of the queue
        System.out.print("Contents of queue1: ");
        for (i = 0; i < 10; i++){
            ch = queue1.retrievesChar();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.print("Contents of queue2: ");
        for (i = 0; i < 3; i++){
            ch = queue2.retrievesChar();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.print("Contents of queue3: ");
        for (i = 0; i < 10; i++){
            ch = queue3.retrievesChar();
            System.out.print(ch);
        }
    }
}