interface Shape3D {
    double getVolume();
}

class Cuboid implements Shape3D {
    private double breadth, length, height;

    public double getVolume() {
        return breadth*length*height;
    }

    Cuboid(double breadth, double length, double height) {
        this.length = length;
        this.breadth = breadth; 
        this.height = height;
    }
}

interface Solid3D extends Shape3D{
    double getMass();
    double getDensity();
}

class SolidCuboid extends Cuboid implements Solid3D {
    private double density;

    public double getMass(){
        return getVolume() * density;
    }

    public double getDensity(){
        return density;
    }

    SolidCuboid(double breadth, double length, double height){
        super(breadth, length, height);
        this.density = 1;
    }

    SolidCuboid(double breadth, double length, double height, double density){
        super(breadth, length, height);
        this.density = density;
    }
}