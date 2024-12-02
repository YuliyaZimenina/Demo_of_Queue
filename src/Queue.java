// Queue class for characters
public class Queue {
    private char[] symbolsQueue; // An array that store queue data
    private int putLocation, getLocation; // Indexes for insertion and extraction positions

    /*
    A constructor that creates an empty Queue object
    based on the specified size
     */
    Queue(int size) {
        symbolsQueue = new char[size];
        putLocation = getLocation = 0;
    }

    /*
    A constructor that creates an object Queue
    based on the object Queue
     */
    Queue(Queue obj) {
        putLocation = obj.putLocation;
        getLocation = obj.getLocation;
        symbolsQueue = new char[obj.symbolsQueue.length];
        // Copy the elements
        for (int i = getLocation; i < putLocation; i++)
            symbolsQueue[i] = obj.symbolsQueue[i];
    }

    /*
    A constructor that creates a Queue object with initial values
     */
    Queue(char[] a) {
        putLocation = 0;
        getLocation = 0;
        symbolsQueue = new char[a.length];
        for (int i = 0; i < a.length; i++)
            putChar(a[i]);
    }

    //Method that places a character into a queue
    void putChar(char ch){
        if (putLocation == symbolsQueue.length){
            System.out.println(" - The queue is overcrowded");
            return;
        }
        symbolsQueue[putLocation++] = ch;
    }
    // A method that retrieves a character from the queue
    char retrievesChar(){
        if (getLocation == putLocation){
            System.out.println("- The queue is empty");
            return (char) 0;
        }
        return symbolsQueue[getLocation++];
    }
}
