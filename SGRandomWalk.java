
/**
 * Write a description of class SGRandomWalk here.
 *
 * Jake Preble
 * @version (a version number or a date)
 */
public class SGRandomWalk {

    public static void main(String[] args) {
        Rectangle field = new Rectangle(0, 0, 300, 300);
        field.setColor(Color.BLACK);
        field.fill();
        Ellipse walker = new Ellipse(145,145, 10, 10);
        walker.setColor(Color.YELLOW);
        walker.fill();
        Ellipse c = new Ellipse(50, 50, 200, 200);
        c.setColor(Color.WHITE);
        c.draw();
        
        int steps = 0;
        while(Math.pow((walker.getX()-150), 2) + Math.pow((walker.getY() -150), 2) < Math.pow(100,2)){
           walker.translate((int)(Math.random() * 20) - 10, (int)(Math.random() * 20) - 10);
           System.out.println("(" + walker.getX() + "," + walker.getY() + ")");
           try { Thread.sleep(100);}
           catch(Exception ex) {};
           
           steps++;
           


        }
        System.out.println("Escaped in " + steps + " steps\n");
    }

}
