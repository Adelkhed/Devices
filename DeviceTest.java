public class DeviceTest {
    public static void main(String[] args) {
        Phone myPhone = new Phone();

        
        myPhone.makeCall(); // 1er appel
        myPhone.makeCall(); // 2ème appel
        myPhone.makeCall(); // 3ème appel

        myPhone.playGame(); // 1er jeu
        myPhone.playGame(); // 2ème jeu

        myPhone.charge(); // Charge

        myPhone.playGame();
        myPhone.playGame();
        myPhone.playGame();
        myPhone.playGame();
        myPhone.makeCall(); 
        myPhone.makeCall(); 
        myPhone.makeCall(); 
        myPhone.makeCall(); 
       
}
}