public class PhoneApp {
    public static void main(String[] args) throws Exception {
        
        SmartPhone smartPhone1 = new SmartPhone(1, "Apple iPhone 14 Pro Max", 1199, 1234567890, 256, 6, 48);
        SmartPhone smartPhone2 = new SmartPhone(2, "Xiaomi 13 Pro", 963, 1234567890, 512, 12, 50);
        SmartPhone smartPhone3 = new SmartPhone(3, "Samsung Galaxy S22 Ultra", 1050, 1234567890, 256, 8, 108);
        SmartPhone smartPhone4 = new SmartPhone(4, "Oppo Reno10 Pro+", 682, 1234567890, 256, 12, 64);
        SmartPhone smartPhone5 = new SmartPhone(5, "Huawei P60 Pro", 1199, 1234567890, 256, 12, 48);
        SmartPhone[] smartPhones = {smartPhone1, smartPhone2, smartPhone3, smartPhone4, smartPhone5};

        System.out.println("The total price is in dollars: " + calculateTotalPrice(smartPhones));
        
    }

    public static double calculateTotalPrice(SmartPhone[] smartPhones) {
        double totalPrice = 0;
        for (SmartPhone smartPhone : smartPhones) {
            totalPrice += smartPhone.getPrice();
        }
        return totalPrice;
    }
}