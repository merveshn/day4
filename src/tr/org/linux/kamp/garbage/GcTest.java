package tr.org.linux.kamp.garbage;

public class GcTest {
	int value;
	

	 protected void finalize() throws Throwable   {
		//TODO Auto-generated method stub 
		 super.finalize();
		 System.out.println("garbage collector çalıştı");
	 }
}
