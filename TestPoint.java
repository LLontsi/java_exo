public class TestPoint {
    public static void main(String[] args){
        Object[] tab= new Object[5];
        Pointcol p1;
        p1 = new Pointcol(2,3,(byte)(1));
        p1.colorer((byte)(2));
        tab[0]=p1;
        tab[1]=new Point(1,4);
        tab[2]=new Point();
        tab[3]=new Pointcol(4,5,(byte)(3));
        tab[4]=new Pointcol(0,1,(byte)(1));
        for ( Object element : tab){
           if(element instanceof Point){
               Point a=(Point)(element);
               a.afficher();
           }
           else{
            Pointcol b=(Pointcol)(element);
            b.afficher();
           }
        }
        
    }
}
