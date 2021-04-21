package com.company;

import com.company.PacketOfMilk;

public class App {
    public static void main(String[] args) {
        PacketOfMilk selyanochka = new PacketOfMilk();
        System.out.println(selyanochka);
        PacketOfMilk molokiya = new PacketOfMilk("MOLOKIYA", 12, 500, 376);
        System.out.println(molokiya);
        PacketOfMilk prostokvashyno = new PacketOfMilk("Prostokvasha", 15, 890,
                499, "CowMilk", 0, "none",
                28.75, "none", "eco", 21, 4.2F);
        System.out.println(prostokvashyno);
        PacketOfMilk.printStaticShelfLife();
        selyanochka.printShelfLife();
    }
}
