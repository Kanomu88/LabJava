public class Cube extends Object3D{
    private double edge;
    public Cube(String _name, Material _matType, double _edge){
        super(_name, _matType);
        this.edge = _edge;
    }

    public double getEdge() {
        return this.edge;
    }
    @Override
    public double getVolume(){
        return edge*edge*edge;
    } 
    @Override
    public double getSurface(){
        return (edge*edge)*6;
    }
}
