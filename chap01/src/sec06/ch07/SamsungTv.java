package sec06.ch07;

public class SamsungTv implements RemoteControl{
	private int sound;
	
	@Override
	public void volumeUp() {
		sound+=2;
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		sound-=2;
	}

	@Override
	public void chkVolume() {
		// TODO Auto-generated method stub
		System.out.println("volume : "+sound);
	}

	

}
