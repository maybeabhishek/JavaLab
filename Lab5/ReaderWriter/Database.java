
public class Database
{
  private int readers; // number of active readers

  public Database()
  {
    this.readers = 0;
  }
 
  public void read(int number)
  {
    synchronized(this)
    {
      this.readers++;
      System.out.println("Reader " + number + " starts reading.");
    }
 
    final int DELAY = 1000;
    try
    {
      Thread.sleep((int) (DELAY));
    }
    catch (InterruptedException e) {}
 
    synchronized(this)
    {
      System.out.println("Reader " + number + " stops reading.");
      this.readers--;
      if (this.readers == 0)
      {
        this.notifyAll();
      }
    }
  }
 

  public synchronized void write(int number)
  {
    while (this.readers != 0)
    {
      try
      {
        this.wait();
      }
      catch (InterruptedException e) {}
    }
    System.out.println("Writer " + number + " starts writing.");
 
    final int DELAY = 1000;
    try
    {
      Thread.sleep((int) (DELAY));
    }
    catch (InterruptedException e) {}
 
    System.out.println("Writer " + number + " stops writing.");
    this.notifyAll();
 }
}