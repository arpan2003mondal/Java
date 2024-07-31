package learning;
interface Camera{
	void takePic();
	void recordVideo();
	/*default void nightMode(){					// default is used to make immediate implementation
		System.out.println("Night Mode On");
	}*/
}

interface MediaPlayer{
	String[] songs();
	void playSong();
	void pauseSong();
}
class CellPhone{
	void callNumber(int phoneNumber){
		System.out.println("Calling..."+phoneNumber);
	}
	void pickCall(){
		System.out.println("Connecting...");
	}
}

class NewSmartPhone extends CellPhone implements Camera,MediaPlayer{
	public void takePic(){
		System.out.println("Taking Picture");
	}
	public void recordVideo(){
		System.out.println("Recording Video");
	}
	public String[] songs(){
		String []list={"Mercy","Alone","Rock"};
		return list;
	}
	public void playSong(){
		System.out.println("Playing...");
	}
	public void pauseSong(){
		System.out.println("Paused...");
	}
	
}
public class PolymorphismInInterfaces {

	public static void main(String args[]){  
		Camera useCam=new NewSmartPhone();
		/* using this we can only access to camera methods only but we cannot access 
		smartPhone methods...camera is used as reference to create usecam only to take photos
		other things are restricted*/
		useCam.takePic();
		useCam.recordVideo();
		//useCam.playSong();-- this will generate error
	}
}
