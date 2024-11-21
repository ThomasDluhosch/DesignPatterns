package BuilderPattern;

import BuilderPattern.Components.CPUType;
import BuilderPattern.Components.CoolingSystem;

public interface Builder {
    void setGPU(String GPU);
    void setCPUType(CPUType CPUType);
    void setCPUName(String CPUName);
    void setRAM(String RAM);
    void setStorage(String storage);
    void setCoolingSystem(CoolingSystem coolingSystem);
    void setPSU(String PSU);
    void setMotherboard(String motherboard);
    void setCase(String computerCase);
    Computer build();
}
