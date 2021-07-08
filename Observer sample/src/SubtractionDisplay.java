public class SubtractionDisplay implements TimeAdmin{
    private int countDownValue=100;

    public void update(Subject subject){
        countDownValue--;
        System.out.print(countDownValue);
    }
}
