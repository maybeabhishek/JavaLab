import java.util.Random;

class ClassVotes {
    public volatile Integer[] votes = new Integer[240];
    public volatile Boolean[] isCounted = new Boolean[240];
    public volatile int totalCount;
    public volatile int countA;
    public volatile int countB;
    public volatile int countC;

    ClassVotes() {
        generateRandom();
        totalCount = 0;
    }

    public void generateRandom() {
        Random rand = new Random();
        for (int i = 0; i < votes.length; i++) {
            votes[i] = rand.nextInt(3) + 1;
            isCounted[i] = false;
        }
    }

    public synchronized void increment() {
        totalCount++;
    }

    public synchronized void incrementA() {
        countA++;
    }

    public synchronized void incrementB() {
        countB++;
    }

    public synchronized void incrementC() {
        countC++;
    }

    public void print() {
        System.out.println("Count of A is " + countA);
        System.out.println("Count of B is " + countB);
        System.out.println("Count of C is " + countC);
        int d = countC > (countA > countB ? countA : countB) ? countC : ((countC > countB) ? countA : countB);
        if (countA == d)
            System.out.println("\nThe PR of this semester is A with " + d + " votes");
        if (countB== d)
            System.out.println("\nThe PR of this semester is B with " + d + " votes");
        if (countC == d)
            System.out.println("\nThe PR of this semester is C with " + d + " votes");
    }
}

class countingThreads implements Runnable {
    ClassVotes c;

    countingThreads(ClassVotes c) {
        this.c = c;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 240; i++) {

                if (c.totalCount != 240 && !c.isCounted[i]) {
                    c.isCounted[i] = true;
                    if (c.votes[i] == 1)
                        c.incrementA();
                    if (c.votes[i] == 2)
                        c.incrementB();
                    if (c.votes[i] == 3)
                        c.incrementC();
                    c.increment();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
    }
}

public class question1 {

    public static void main(String args[]) {
        ClassVotes c = new ClassVotes();
        countingThreads t1 = new countingThreads(c);
        countingThreads t2 = new countingThreads(c);
        countingThreads t3 = new countingThreads(c);
        countingThreads t4 = new countingThreads(c);
        t1.run();
        t2.run();
        t3.run();
        t4.run();
        c.print();
    }
}
