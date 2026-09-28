package multipleInheritance;

public interface Mobile extends Camera{
	void makeACall(long phone);
	void dropCall(long phone);
	void record(long phone);
}
