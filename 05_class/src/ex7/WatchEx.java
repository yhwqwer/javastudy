package ex7;

public class WatchEx {

  public static void main(String[] args) {

    Watch watch = new Watch(9, 0, 0);
    watch.addHour(25);
    watch.addMinute(90);
    watch.addSecond(3690);
    watch.see();
  }

}
