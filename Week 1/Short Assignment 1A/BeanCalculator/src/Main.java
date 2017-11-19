
public class Main {

	public static void main(String[] args) {
		VideoBean myBean = new VideoBean();
		myBean.setVideoDuration(60);
		myBean.setVideoQuality(720);
		System.out.println(myBean.calculateStorageSize(
				myBean.getVideoQuality(), 
				myBean.getVideoDuration()));
	}
}
