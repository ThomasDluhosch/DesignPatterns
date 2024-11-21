package BuilderPattern;

import BuilderPattern.Components.CPUType;
import BuilderPattern.Components.CoolingSystem;

public class Director {
    
    public void ConstructHighEndAMD(ComputerBuilder computerBuilder){
        computerBuilder.setGPU("Nvidia RTX 4090");
        computerBuilder.setCPUType(CPUType.AMD);
        computerBuilder.setCPUName("Ryzen 9 7950X3D");
        computerBuilder.setRAM("64GB DDR5");
        computerBuilder.setStorage("4TB NVMe SSD");
        computerBuilder.setCoolingSystem(CoolingSystem.WATER);
        computerBuilder.setPSU("1000W");
        computerBuilder.setMotherboard("ASUS ROG Crosshair VIII Dark Hero");
        computerBuilder.setCase("Phanteks NV9");
    }

    public void ConstructMidEndAMD(ComputerBuilder computerBuilder){
        computerBuilder.setGPU("Nvidia RTX 3070");
        computerBuilder.setCPUType(CPUType.AMD);
        computerBuilder.setCPUName("Ryzen 7 5700G");
        computerBuilder.setRAM("32GB DDR4");
        computerBuilder.setStorage("2TB NVMe SSD");
        computerBuilder.setCoolingSystem(CoolingSystem.AIR);
        computerBuilder.setPSU("750W");
        computerBuilder.setMotherboard("ASUS TUF Gaming B550M-Plus");
        computerBuilder.setCase("NZXT H510");
    }

    public void ConstructLowEndIntel(ComputerBuilder computerBuilder){
        computerBuilder.setGPU("Nvidia GTX 1650");
        computerBuilder.setCPUType(CPUType.INTEL);
        computerBuilder.setCPUName("Core i3-10100F");
        computerBuilder.setRAM("16GB DDR4");
        computerBuilder.setStorage("1TB NVMe SSD");
        computerBuilder.setCoolingSystem(CoolingSystem.AIR);
        computerBuilder.setPSU("500W");
        computerBuilder.setMotherboard("ASUS Prime H410M-E");
        computerBuilder.setCase("Cooler Master MasterBox Q300L");
    }
}
