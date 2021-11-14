package homework11;

public class MyResource implements AutoCloseable{
	  @Override
	  public void close() throws Exception {
		  System.out.println("Closing");
		  }    
}
