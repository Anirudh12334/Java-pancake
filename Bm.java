public class Bm implements Bluetooth, wired{
  
// BM because it implements both Bluetooth and wired interfaces

@Override
    public void isMousebluetooth() {
         System.out.println("This is a Bluetooth mouse.");
    } 
   
   @Override
    public void isMousewired() {
         System.out.println("This is a wired mouse.");
    }
    
}
