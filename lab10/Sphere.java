public  class Sphere extends Object3D {
    private double radius;
    public Sphere(String _name, Material _matType, double _radius){
        super(_name, _matType);
        this.radius = _radius;

    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public double getVolume(){
        return (4.0/3.0)*Math.PI*(radius*radius*radius);
    } 
    @Override
    public double getSurface(){
        return 4.0*Math.PI*(radius*radius);
    }
}
