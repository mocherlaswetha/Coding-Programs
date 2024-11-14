package oopscocept;
interface playable{
	void play();
}
class guitar implements playable{
	public void play() {
		System.out.println("guitar");
	}
}
class piano implements playable{
	public void play() {
		System.out.println("piano");
	}
}
public class InterfaceExample {
  public static void main(String args[]) {
	  playable inst1 = new guitar();
      inst1.play();
      playable inst2 = new piano();
      inst2.play();
  }
}
