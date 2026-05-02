public class MacBook implements Laptop {
    private int volume;
    private boolean is_power_on;

    public MacBook() {
        this.volume = 60; 
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("MacBook Menyala (Ding! Sound)");
        System.out.println("Welcome to macOS");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("MacBook Berhasil Dimatikan.");
    }

    @Override
    public void volumeUp() {
        if (is_power_on) {
            if (this.volume >= MAX_VOL) {
                System.out.println("Volume Maximum");
            } else {
                this.volume += 5; // MacBook naik per 5
                System.out.println("Volume MacBook: " + this.volume);
            }
        } else {
            System.out.println("Gagal! Laptop mati.");
        }
    }

    @Override
    public void volumeDown() {
        if (is_power_on) {
            if (this.volume <= MIN_VOL) {
                System.out.println("Mute");
            } else {
                this.volume -= 5;
                System.out.println("Volume MacBook: " + this.volume);
            }
        } else {
            System.out.println("Gagal! Laptop mati.");
        }
    }
}