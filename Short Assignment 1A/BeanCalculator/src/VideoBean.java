import java.io.Serializable;

public class VideoBean implements Serializable{

	//Default ID
	private static final long serialVersionUID = 1L;
	//Empty, no argument, constructor
	public VideoBean () {}
	//Private VideoBean quality field
	private int videoQuality = 0;
	//Private VideoBean duration field
	private int videoDuration = 0;
	
	public void setVideoQuality (int quality){
		this.videoQuality = quality;
	}
	public int getVideoQuality (){
		return this.videoQuality;
	}
	public void setVideoDuration (int duration){
		this.videoDuration = duration;
	}
	public int getVideoDuration (){
		return videoDuration;
	}
	public String calculateStorageSize (int quality, int duration){
		double storageSize = 0;
		double frameSize = 0;
		
		if (quality == 720) 
			frameSize = 1280 * 720 * 3;
		else
			frameSize = 1920 * 1080 * 3;
		
		storageSize = (frameSize * 30 * duration);
		
		if (storageSize > 1000000000)
			return "Size of video is " + (storageSize/1000000000) + " GB.";
		else if (storageSize > 1000000 && storageSize < 1000000000)
			return "Size of video is " + (storageSize/1000000) + " MB.";
		else
			return "There was an error.";
	}
}
