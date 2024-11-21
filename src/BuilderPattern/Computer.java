package BuilderPattern;

import BuilderPattern.Components.CoolingSystem;
import BuilderPattern.Components.CPUType;

public class Computer {
    private String GPU;
    private CPUType CPUType;
    private String CPUName;
    private String RAM;
    private String storage;
    private CoolingSystem coolingSystem;
    private String PSU;
    private String motherboard;
    private String computerCase;


    public Computer(String GPU, CPUType CPUType, String CPUName, String RAM, String storage, CoolingSystem coolingSystem, String PSU, String motherboard, String computerCase) {
        this.GPU = GPU;
        this.CPUType = CPUType;
        this.CPUName = CPUName;
        this.RAM = RAM;
        this.storage = storage;
        this.coolingSystem = coolingSystem;
        this.PSU = PSU;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }


    public String getGPU() {
        return GPU;
    }

    public CPUType getCPUType() {
        return CPUType;
    }

    public String getCPUName() {
        return CPUName;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public CoolingSystem getCoolingSystem() {
        return coolingSystem;
    }

    public String getPSU() {
        return PSU;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getComputerCase() {
        return computerCase;
    }

    public void printComputer(){
        System.out.println( 
            "----------------------------------------------------------" + "\n" +
            "CPU: " +getCPUType() + " " + getCPUName() + "\n" +
            "GPU: " + getGPU() + "\n" +
            "RAM: " + getRAM() + "\n" +
            "Storage: " + getStorage() + "\n" +
            "Cooling System: " + getCoolingSystem() + "\n" +
            "PSU: " + getPSU() + "\n" +
            "Motherboard: " + getMotherboard() + "\n" +
            "Case: " + getComputerCase() + "\n" +
            "----------------------------------------------------------");
        }

}
