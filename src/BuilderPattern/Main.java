package BuilderPattern;

public class Main {
    
    public static void main(String[] args) {
        Director director = new Director();
        ComputerBuilder computerBuilder = new ComputerBuilder();

        director.ConstructHighEndAMD(computerBuilder);
        Computer pc1 = computerBuilder.build();

        director.ConstructLowEndIntel(computerBuilder);
        Computer pc2 = computerBuilder.build();

        director.ConstructMidEndAMD(computerBuilder);
        Computer pc3 = computerBuilder.build();

        pc1.printComputer();
        pc2.printComputer();
        pc3.printComputer();
    }

}
