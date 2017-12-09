
public class HelloWorld {
	
	private String helloMsg;

	public String getHelloMsg() {
		return helloMsg;
	}
	
	
	public void setHelloMsg(String helloMsg) {
		this.helloMsg = helloMsg;
	}


	public void showMsg(){
		
		System.out.println("Message: " + helloMsg);
	}

}
