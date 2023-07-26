public class SmartPhone extends Phone {

    private int storage;
    private int ram;
    private int camera;

    public SmartPhone() {
        super();
        this.storage = 0;
        this.ram = 0;
        this.camera = 0;
    }

    public SmartPhone(int id, String name, double price, long phoneNumber, int storage, int ram, int camera) {
        super(id, name, price, phoneNumber);
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}