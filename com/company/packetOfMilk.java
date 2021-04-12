package com.company;

class packetOfMilk {
    private static int shelfLifeMonths = 0;
    private String manufacturer = "none";
    private int fatness = 0;
    private int volumeInMll = 0;
    private int caloriesPer100Grams = 0;
    private String typeOfMilk = "default";

    private int sweetnessInPercents = 0;
    private String toppings = "default";
    private float price = 0;
    private String lactose = "default";
    private String typeOfCarton = "default";

    protected int priceFromManufacturer = 0;
    protected float pHLevel = 0;

    packetOfMilk() {
        shelfLifeMonths += 1;

    }

    packetOfMilk(String manufacturer, int fatness, int volumeInMll, int caloriesPer100Grams) {
        this();
        this.manufacturer = manufacturer;
        this.fatness = fatness;
        this.volumeInMll = volumeInMll;
        this.caloriesPer100Grams = caloriesPer100Grams;
    }

    packetOfMilk(String manufacturer, int fatness, int volumeInMll, int caloriesPer100Grams, String typeOfMilk,
                 int sweetnessInPercents, String toppings, float price, String lactose, String typeOfCarton,
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
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
        System.out.println("Shelf life is " + shelfLifeMonths + "months");
    }

    public void printShelfLife() {
        System.out.println("Shelf life is " + shelfLifeMonths + "months");
    }

    public void resetValues(String manufacturer, int fatness, int volumeInMll, int caloriesPer100Grams, String typeOfMilk,
                            int sweetnessInPercents, String toppings, float price, String lactose, String typeOfCarton,
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

