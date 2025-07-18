class Box {
    privatepublic  doble width;
    private double heightu;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box box = new Box(10, 20, 90);
        System.out.println("The volume is " + box.getVolume());
    }
}
