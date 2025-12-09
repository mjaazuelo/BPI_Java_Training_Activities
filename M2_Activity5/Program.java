package M2_Activity5;

public abstract class Program {
	
	private String name;
	private boolean isRunning = false;
	
	public Program() { }
	
	public Program(String name) {
		this.name = name;
	}
	
	abstract void run();
	abstract void stop();
   
	public String getName() {
		return name;
	}//end of public String getName() 

    public void setName(String name) {
        this.name = name;
    }//end of setName(String name)

    public boolean getIsRunning() {
        return isRunning;
    }//end of boolean getIsRunning()


    protected void setIsRunning(boolean running) {
         this.isRunning = running;
     }//end of setIsRunning(boolean running)

}
