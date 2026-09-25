package staticex;

public class StaticExample {
	public static void main(String[] args) {
		LaunchpadIO.show("Welcome to the Main Function...");
		{
			LaunchpadIO.show("Welcome to the Separate Block..");
		}
	}
	static {
		try {
			for(int i=10; i>=1 ; i--) {
				LaunchpadIO.show("Main App will starts in "+i+" seconds....");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			
		}
	}
}
