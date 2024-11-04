

public class QueueSystem {
    private static QueuingSystem instance;
    private int queueNumber;

    private QueuingSystem()
    {
        queueNumber = 1;
    }

    public static synchronized QueuingSystem getInstance()
    {
        if(instance == null)
            instance = new QueuingSystem();

        return instance;
    }

    public synchronized int getQueueNumber()
    {
        System.out.println("---------------------------");
        System.out.println("Displaying Queue Number ["+queueNumber+"] ");
        System.out.println("---------------------------");
        return queueNumber;
    }

    public synchronized void resetQueueNumber(int newQueueNumber)
    {
        queueNumber = newQueueNumber;
        System.out.println("Queue Number Reset!\n");
    }

    public synchronized void incrementQueueNumber()
    {
        queueNumber++;
        System.out.println("---------------------------");
        System.out.println("Displaying Queue Number ["+queueNumber+"] ");
        System.out.println("---------------------------");
    }
}
