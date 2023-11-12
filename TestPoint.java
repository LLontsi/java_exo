public class TestPoint {
    public static void main(String[] args){
        Pointcol p1;
        p1 = new Pointcol(2,3,(byte)(1));
        Point p= new Point(2,3);
        p1.colorer((byte)(2));
        p1.deplacer(3, 4);
        p1.identifie();
        p.identifie();
    }
}
