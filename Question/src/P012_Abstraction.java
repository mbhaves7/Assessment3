

abstract class RBI {
	abstract public void interest();//function declaration
	abstract public void HL();
	public static void repoRate() {
		System.out.println("reporate : +-4%");
	}
	public void call() {
		
	}
}
class xyz{
	
}
class SBI extends RBI {
	public void interest() {
		System.out.println("SBI interest : 7%");
	}
	public void HL() {
		System.out.println("SBI HL : 8%");
	}
}
class PNB extends RBI {
	public void interest() {
		System.out.println("PNB interest : 8%");
	}
	public void HL() {
		System.out.println("SBI HL : 9%");
	}
}
class JAVA extends RBI {
	public void interest() {
		System.out.println("JAVA interest : 9%");
	}
	public void HL() {
		System.out.println("JAVA HL : 10%");
	}
}
public class P012_Abstraction {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.HL();
		SBI.repoRate();
		PNB p = new PNB();
		p.interest();
		p.HL();
		PNB.repoRate();
		JAVA j = new JAVA();
		j.interest();
		j.HL();
		JAVA.repoRate();
	}
}