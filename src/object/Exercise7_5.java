package object;

class MyTv{
    private boolean isPowerOn;
    private int channel;
    private int volume;

    public int gotoPrevChannel(){
        return this.channel;
    }

    public boolean isIsPowerOn() {
        return this.isPowerOn;
    }

    public void setIsPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }

    public int getChannel() {
        return this.channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 0;


    //여기 코드 넣기

}

public class Exercise7_5 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("VOL: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("VOL: " + t.getChannel());
    }
}
