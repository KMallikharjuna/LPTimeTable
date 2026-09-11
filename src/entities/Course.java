package entities;
public class Course {
	private int id;
	private String name;
	private int duration;
	private String mode;
	private String teachingMedium;
	private double fee;
	private boolean status;
	
	public Course(int id, String name, int duration, 
			String mode, String teachingMedium, double fee,
			boolean status) {
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.status = status;
		this.duration = duration;
		this.mode = mode;
		this.teachingMedium = teachingMedium;
	}
	
	public int getId() {
		return id;
	}
	public String getTeachingMedium() {
		return teachingMedium;
	}
	public String getName() {
		return name;
	}
	public String getMode() {
		return mode;
	}
	public int getDuration() {
		return duration;
	}
	public boolean getStatus() {
		return status;
	}
	public double getFee() {
		return fee;
	}
	
	public String getCourseDetails() {
		return "Course: ["+id+", "+name+", "+duration+
				", "+mode+", "+teachingMedium+", "+fee+
				", "+status+"]";
	}
	
	//Expected output for getCourseDetails
	//Course: [101, Java, 4, offline/online, English & Telugu, 30000.00, true]
}
