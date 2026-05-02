public class Toshiba implements Laptop {
    private int volume;
    private boolean is_power_on;

    public Toshiba() {
        this.volume = 40; 
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop Toshiba Menyala...");
        System.out.println("Leading Innovation.");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Toshiba Shutdown.");
    }

    @Override
    public void volumeUp() {
        if (is_power_on) {
            if (this.volume >= MAX_VOL) {
                System.out.println("Volume Full (100%)");
            } else {
                this.volume += 10;
                System.out.println("Volume Toshiba sekarang: " + this.volume);
            }
        } else {
            System.out.println("Nyalakan laptop terlebih dahulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (is_power_on) {
            if (this.volume <= MIN_VOL) {
                System.out.println("Volume 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume Toshiba sekarang: " + this.volume);
            }
        } else {
            System.out.println("Nyalakan laptop terlebih dahulu!");
        }
    }
}