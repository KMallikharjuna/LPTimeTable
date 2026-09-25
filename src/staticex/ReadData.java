package staticex;

public class ReadData {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		IO io = new IO(LaunchpadIO.input);
		LaunchpadIO.show("Enter the first number ");
		int x = io.readInt();
		LaunchpadIO.show("Enter the second number ");
		int y = io.readInt();
		
		LaunchpadIO.show("The sum is "+(x+y));
	}
}
