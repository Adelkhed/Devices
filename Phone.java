public class Phone extends Device {

    public void makeCall() {
        if (battery >= 5) {
            battery -= 5;
            System.out.println("You make a call.");
        } else {
            System.out.println("battery critical");
        }
        displayBattery();
    }

    
    public void playGame() {
        if (battery < 25) {
            System.out.println("Battery too low to play a game.");
        } else {
            battery -= 20;
            System.out.println("You play a game.");
        }
        displayBattery();
        if (battery < 10) {
            System.out.println("Battery critical!");
        }
    }

    
    public void charge() {
        battery = Math.min(battery + 50, 100); 
        System.out.println("You charge the phone.");
        displayBattery();
    }
}
