package smart_tv;

public class Usur {

	public static void main(String[] args) {
		SmartTv tv = new SmartTv();
		tv.turn("turn on");
		tv.changeVolume(20);
		tv.changeChannel(59);

		if (!tv.state) {
			System.out.printf("A TV está desligada, o ultimo canal visto foi o %s, no volume %s\n", tv.channel,
					tv.volume);
		} else {
			System.out.printf("A TV está ligada, no canal %s, no volume %s\n", tv.channel, tv.volume);
		}
	}

}
