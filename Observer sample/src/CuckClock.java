public class CuckClock implements TimeAdmin{
    public void update(Subject subject){
        ((concreteSubject)subject).getHour();

        for (i=0;i<h;i++){
            System.out.println("ぽっぽー!");
        }
    }
}
