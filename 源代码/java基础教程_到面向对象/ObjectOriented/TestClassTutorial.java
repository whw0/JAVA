package ObjectOriented;

public class TestClassTutorial {
	int i;
	//this¹Ø¼ü×Ö
	public TestClassTutorial(){
		this(1);
	}
	public TestClassTutorial(int i){
		this.i=i;
	}
	
	
	
	
	
	String name="abc";
	public void showName(String name) {
		System.out.println(this.name);
		System.out.println(name);
	}
}
