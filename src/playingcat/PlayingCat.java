package playingcat;

public class PlayingCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// test
		//System.out.println(isCatPlaying(true, 10)); // false
		//System.out.println(isCatPlaying(false, 36)); // false
		System.out.println(isCatPlaying(true, 36));// true 25-35

	}

	public static boolean isCatPlaying(boolean summer, int temperature) {

		int min = 25;
		int max = 45;
		
		if ((temperature >= min) && (temperature <= max) && (summer == true)) {
			return true;
		}
		return false;

	}

}
