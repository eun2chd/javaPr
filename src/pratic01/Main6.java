package pratic01;

interface Music {
	void play();
	void stop();
}

class Mp3Player implements Music {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("MP3 플레이어에서 아이유 블루밍 음악을 재생합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("MP3 플레이어에서 '아이유 블루밍 음악을 정지합니다.");
	}
}

class Cdplayer implements Music {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("CD 플레이어에서 아이유 블루밍 음악을 재생합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CD 플레이어에서 '아이유 블루밍 음악을 정지합니다.");
	}
}


public class Main6 {
	
	public static void main(String[] args) {
		
		Music m1 = new Mp3Player();
		m1.play();
		m1.stop();
		System.out.println("=====================");
		Music m2 = new Cdplayer();
		m2.play();
		m2.stop();
		
	}

}

