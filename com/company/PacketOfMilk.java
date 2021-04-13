package com.company;

public class PacketOfMilk {
    private static int shelfLifeMonths = 0;
    private String manufacturer;
    private int fatness;
    private int volumeInMll;
    private int caloriesPer100Grams;
    private String typeOfMilk;

    private int sweetnessInPercents;
    private String toppings;
    private double price;
    private String lactose;
    private String typeOfCarton;

    protected int priceFromManufacturer;
    protected float pHLevel;

    PacketOfMilk() {
        shelfLifeMonths += 1;
        manufacturer = "none";
        fatness = 0;
        volumeInMll = 0;
        caloriesPer100Grams = 0;
        typeOfMilk = "default";

        sweetnessInPercents = 0;
        toppings = "default";
        price = 0;
        lactose = "default";
        typeOfCarton = "default";

        priceFromManufacturer = 0;
        pHLevel = 0;

    }

    PacketOfMilk(String manufacturer, int fatness, int volumeInMll, int caloriesPer100Grams) {
        this();
        this.manufacturer = manufacturer;
        this.fatness = fatness;
        this.volumeInMll = volumeInMll;
        this.caloriesPer100Grams = caloriesPer100Grams;
    }

    PacketOfMilk(String manufacturer, int fatness, int volumeInMll, int caloriesPer100Grams, String typeOfMilk,
                 int sweetnessInPercents, String toppings, double price, String lactose, String typeOfCarton,
                 int priceFromManufacturer, float pHLevel) {
        this(manufacturer, fatness, volumeInMll, caloriesPer100Grams);
        this.typeOfMilk = typeOfMilk;
        this.sweetnessInPercents = sweetnessInPercents;
        this.toppings = toppings;
        this.price = price;
        this.lactose = lactose;
        this.typeOfCarton = typeOfCarton;
        this.priceFromManufacturer = priceFromManufacturer;
        this.pHLevel = pHLevel;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getFatness() {
        return fatness;
    }

    public void setFatness(int fatness) {
        this.fatness = fatness;
    }

    public int getVolumeInMll() {
        return volumeInMll;
    }

    public void setVolumeInMll(int volumeInMll) {
        this.volumeInMll = volumeInMll;
    }

    public int getCaloriesPer100Grams() {
        return caloriesPer100Grams;
    }

    public void setCaloriesPer100Grams(int caloriesPer100Grams) {
        this.caloriesPer100Grams = caloriesPer100Grams;
    }

    public String getTypeOfCarton() {
        return typeOfCarton;
    }

    public void setTypeOfCarton(String typeOfCarton) {
        this.typeOfCarton = typeOfCarton;
    }

    public String getTypeOfMilk() {
        return typeOfMilk;
    }

    public void setTypeOfMilk(String typeOfMilk) {
        this.typeOfMilk = typeOfMilk;
    }

    public int getSweetnessInPercents() {
        return sweetnessInPercents;
    }

    public void setSweetnessInPercents(int sweetnessInPercents) {
        this.sweetnessInPercents = sweetnessInPercents;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLactose() {
        return lactose;
    }

    public void setLactose(String lactose) {
        this.lactose = lactose;
    }

    public int getPriceFromManufacturer() {
        return priceFromManufacturer;
    }

    public void setPriceFromManufacturer(int priceFromManufacturer) {
        this.priceFromManufacturer = priceFromManufacturer;
    }

    public float getpHLevel() {
        return pHLevel;
    }

    public void setpHLevel(float pHLevel) {
        this.pHLevel = pHLevel;
    }

    @Override
    public String toString() {
        return "packetOfMilk{" +
                "manufacturer='" + manufacturer + '\'' +
                ", fatness=" + fatness +
                ", volumeInMll=" + volumeInMll +
                ", caloriesPer100Grams=" + caloriesPer100Grams +
                ", typeOfMilk='" + typeOfMilk + '\'' +
                ", sweetnessInPercents=" + sweetnessInPercents +
                ", toppings='" + toppings + '\'' +
                ", price=" + price +
                ", lactose='" + lactose + '\'' +
                ", typeOfCarton='" + typeOfCarton + '\'' +
                ", priceFromManufacturer=" + priceFromManufacturer +
                ", pHLevel=" + pHLevel +
                '}';
    }

    public static void printStaticShelfLife() {
        System.out.println("Shelf life is " + shelfLifeMonths + " months");
    }

    public void printShelfLife() {
        System.out.println("Shelf life is " + shelfLifeMonths + " months");
    }

    public void resetValues(String manufacturer, int fatness, int volumeInMll, int caloriesPer100Grams, String typeOfMilk,
                            int sweetnessInPercents, String toppings, double price, String lactose, String typeOfCarton,
                            int priceFromManufacturer, float pHLevel) {
        this.manufacturer = manufacturer;
        this.fatness = fatness;
        this.volumeInMll = volumeInMll;
        this.caloriesPer100Grams = caloriesPer100Grams;
        this.typeOfMilk = typeOfMilk;
        this.sweetnessInPercents = sweetnessInPercents;
        this.toppings = toppings;
        this.price = price;
        this.lactose = lactose;
        this.typeOfCarton = typeOfCarton;
        this.priceFromManufacturer = priceFromManufacturer;
        this.pHLevel = pHLevel;
    }
}

