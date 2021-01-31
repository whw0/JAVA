package ObjectOriented;

/*
 * 私有构造方法
 * */
public class TestClassTutorial_Static {
     private TestClassTutorial_Static() {
    	 System.out.println("执行私有构造方法");
     }
     
     static public TestClassTutorial_Static Start() {
    	 return new TestClassTutorial_Static();
     }
     
     static public int water=0;
     
     public void outlet() {
    	 if(water>=2) {
    		 water=water-2;
    	 }
    	 else {
    		 water=0;
    	 }
     }
     
     public void inlet() {
    	 water=water+3;
     }
     
     static public void staticMethod() {
    	 System.out.println("静态方法!");
     }
}
