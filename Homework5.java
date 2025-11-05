public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer cp = new PersonalComputer(new Computer("Core i7", "32GB", "2TB", "흰색", "700W"),
                new Monitor("32인치", "검은색", "45W"));
        System.out.println(cp.turnOn() + cp.printInfo());
    }
}
class PersonalComputer{
    private Computer computer;
    private Monitor monitor;
    public PersonalComputer(Computer computer, Monitor monitor){
        this.computer = computer;
        this.monitor = monitor;
    }
    public String turnOn(){
        return computer.turnOn() + "\n" + monitor.turnOn();
    }
    public String printInfo(){
        return computer.printInfo() + "\n" + monitor.printInfo();
    }
}

class Monitor{
    private String monitorSize, color, power;
    public Monitor(String m, String c, String p){
        monitorSize = m;
        color = c;
        power = p;
    }
    public String getMonitorsize(){
        return monitorSize;
    }
    public String getcolor(){
        return color;
    }
    public String getpoewr(){
        return power;
    }
    public String turnOn(){
        return "Turning on the monitor";
    }
    public String printInfo(){
        return "The spec of the monitor\n" + "Size: " + monitorSize + "\nColor: " + color + "\nPower: " + power;
    }
}

class Computer{
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;
    public Computer(String cp, String m, String h, String c, String p){
        cpu = cp;
        memory = m;
        hd = h;
        color = c;
        power = p;
    }
    public String getcpu(){
        return cpu;
    }
    public String getmemory(){
        return memory;
    }
    public String gethd(){
        return hd;
    }
    public String getcolor(){
        return color;
    }
    public String getpower(){
        return power;
    }
    public String turnOn(){
        return "Turning on the computer";
    }
    public String printInfo(){
        return "The spec of the computer\nCPU: " + cpu + "\nMemory: " + memory + "\nHDD: " + hd + "\nColor: " + color + "\nPower: " + power;
    }
}