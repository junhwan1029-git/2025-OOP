public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}

abstract class Printer{
    public String model;
    public int printedCount, availableCount;
    public abstract boolean print();
    public Printer(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
    }
}

class InkjetPrinter extends Printer{
    private int printedCount = 0;
    public InkjetPrinter(String model, int availableCount){
        super(model, availableCount);
    }
    public boolean print(){
        if(availableCount == 0){
            ++printedCount;
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족\n", model, printedCount);
            return false;
        }
        else{
            availableCount--;
            printedCount++;
            return true;
        }
    }
}

class LaserPrinter extends Printer{
    private int printedCount = 0;
    public LaserPrinter(String model, int availableCount){
        super(model, availableCount);
    }
    public boolean print(){
        if(availableCount == 0){
            ++printedCount;
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족\n", model, printedCount);
            return false;
        }
        else{
            availableCount--;
            printedCount++;
            return true;
        }
    }
}

