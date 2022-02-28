class Lat2PacMan{
    int x,y, width, height;

    Lat2PacMan(){
    }
    Lat2PacMan(int x2, int y2, int width2, int height2){
        x=x2;
        y=y2;
        width=width2;
        height=height2;
    }
    void moveLeft(){
        x = x-1;
    }
    void moveRight(){
        x = x+1;
    }
    void moveUp(){
        if(y>=0 && y<=height){
            y =y-1;
        }

    }
    void moveDown(){
        if(y>=0 && y<=height){
            y =y+1;
        }

    }
    void printPosition(int ab , int cd ){
        if(y>=0 && y<height){
            System.out.println("Posisi Akhir Pacman (x,y)\t: " + "(" + ab + ", " + cd + ")");
        }else if(y<0){
            System.out.println("Maaf, tidak bisa menampilkan posisi akhir \nNilai y kurang dari 0");
        }else{
            System.out.println("Maaf, tidak bisa menampilkan posisi akhir \nNilai y melebihi nilai height");
        }

    }
}


public class Lat2PacManDanMain {
    public static void main(String[] args) {
        Lat2PacMan l1= new Lat2PacMan();

        l1.x=1;
        l1.y=2;
        l1.width=10;
        l1.height=20;

        System.out.println("==============PROGRAM PACMAN==============");
        System.out.println("Posisi Awal Pacman (x,y)\t: " + "(" + l1.x + ", " + l1.y + ")");
        System.out.println("Width\t\t\t\t\t\t: "+l1.width);
        System.out.println("Height\t\t\t\t\t\t: "+l1.height);
        l1.moveLeft();
        l1.moveRight();
        l1.moveDown();
        System.out.println("Pergerakan\t\t\t\t\t: move left, move right, move down");
        l1.printPosition(l1.x, l1.y);
        System.out.println("==========================================");

        Lat2PacMan l2 = new Lat2PacMan(12, 26, 15, 25);
        System.out.println("Posisi Awal Pacman (x,y)\t: " + "(" + l2.x + ", " + l2.y + ")");
        System.out.println("Width\t\t\t\t\t\t: "+l2.width);
        System.out.println("Height\t\t\t\t\t\t: "+l2.height);
        System.out.println("Pergerakan\t\t\t\t\t: move right, move up");
        l2.moveRight();
        l2.moveUp();
        l2.printPosition(l2.x, l2.y);

    }
}
