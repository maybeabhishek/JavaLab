public class Reader extends Thread
{
  private static int readers = 0; // number of readers
 
  private int number;
  private Database database;
 
 
  public Reader(Database database)
  {
    this.database = database;
    this.number = Reader.readers++;
  }

  public void run()
  {
    while (true)
    {
      final int DELAY = 1000;
      try
      {
        Thread.sleep((int) (DELAY));
      }
      catch (InterruptedException e) {}
      this.database.read(this.number);
    }
  }
}