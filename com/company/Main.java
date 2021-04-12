package com.company;
import  com.company.packetOfMilk;
public class Main {
    public static void main (String []args)
    {
        packetOfMilk selyanochka =  new packetOfMilk();
        System.out.println(selyanochka.toString());
        packetOfMilk molokiya = new packetOfMilk("MOLOKIYA", 12 , 500, 376);
        System.out.println(molokiya.toString());
        packetOfMilk prostokvashyno = new packetOfMilk("Prostokvasha",15, 890 ,
                499, "CowMilk", 0, "none",
                28.75F, "none", "eco", 21, 4.2F);
        System.out.println(prostokvashyno.toString());
        packetOfMilk.printStaticShelfLife();
        selyanochka.printShelfLife();
    }
}
