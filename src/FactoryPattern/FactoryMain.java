package FactoryPattern;

import FactoryPattern.ComputerFactory;
import FactoryPattern.Computer;

public class FactoryMain {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","8 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","32 GB", "1000 GB", "2.9 GHz");
        System.out.println("Factory PC Config: " +pc);
        System.out.println("Factory Server Config: " +server);

    }

}
