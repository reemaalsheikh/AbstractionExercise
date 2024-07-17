//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainQ2 {
    public static void main(String[] args) {

        MovablePoint mp = new MovablePoint(6,8,3,4);
        mp.moveUp();
        mp.moveDown();
        mp.moveRight();
        mp.moveLeft();
        System.out.println();

        MovablePoint mp1 = new MovablePoint(2,5,1,5);
        mp1.moveUp();
        mp1.moveDown();
        mp1.moveRight();
        mp1.moveLeft();
        System.out.println();

        MovablePoint mp2 = new MovablePoint(15,20,10,7);
        mp2.moveUp();
        mp2.moveDown();
        mp2.moveRight();
        mp2.moveLeft();
        System.out.println();


    }
}