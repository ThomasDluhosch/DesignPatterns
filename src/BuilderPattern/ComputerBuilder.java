package BuilderPattern;

import BuilderPattern.Components.CoolingSystem;
import BuilderPattern.Components.CPUType;

public class ComputerBuilder implements Builder {

    private String GPU;
    private CPUType CPUType ;
    private String CPUName;
    private String RAM;
    private String storage;
    private CoolingSystem coolingSystem;
    private String PSU;
    private String motherboard;
    private String computerCase;
    
    @Override
    public void setGPU(String GPU) {
        this.GPU = GPU;
    }
    @Override
    public void setCPUType(CPUType CPUType) {
        this.CPUType = CPUType;
    }
    @Override
    public void setCPUName(String CPUName) {
       this.CPUName = CPUName;
    }
    @Override
    public void setRAM(String RAM) {
        this.RAM = RAM;
    }
    @Override
    public void setStorage(String storage) {
        this.storage = storage;
    }
    @Override
    public void setCoolingSystem(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }
    @Override
    public void setPSU(String PSU) {
        this.PSU = PSU;
    }
    @Override
    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }
    @Override
    public void setCase(String computerCase) {
        this.computerCase = computerCase;
    }

    @Override
    public Computer build() {
        return new Computer(GPU, CPUType, CPUName, RAM, storage, coolingSystem, PSU, motherboard, computerCase);
    }

    
    
}
