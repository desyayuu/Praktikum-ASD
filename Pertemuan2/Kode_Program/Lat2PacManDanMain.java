import java.util.Scanner;
class Lat2PacMan{
    int x,y, width, height;
    void moveLeft(){
            x =x-1;
    }
    void moveRight(){
            x =x+1;
    }
    void moveUp(){
            y =y-1;

    }
    void moveDown(){
            y =y+1;

    }
    void printPosition(){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == y && j == x) {
                    System.out.print(" * ");
                    j++;
                }
                if(j!=height) {
                    System.out.print(" . ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("\nPosisi saat ini: (" +x +"," +y + ")");
    }
}

public class Lat2PacManDanMain {
    public static void main(String[] args) {
        Lat2PacMan l1= new Lat2PacMan();
        Scanner sc = new Scanner(System.in);
        l1.x=0;
        l1.y=0;

        System.out.println("==============PROGRAM PACMAN==============");
        System.out.print("Masukkan batas lebar = ");
        l1.width= sc.nextInt();
        System.out.print("Masukkan batas panjang = ");
        l1.height= sc.nextInt();
        System.out.println("==========================================");
        l1.printPosition();

        for (; ; ) {
            String pergerakan;
            System.out.println("Pilih pergerakan : \n>> Ketik L untuk ke kiri \n>> Ketik R untuk ke kanan \n>> Ketik U untuk ke atas \n>> Ketik D untuk ke bawah \n>> Ketik Stop untuk mengakhiri");
            pergerakan = sc.next();

            if (pergerakan.equalsIgnoreCase("L")) {
                l1.moveLeft();
                if (l1.x < 0 || l1.y < 0 || l1.y >= l1.width || l1.x >= l1.height) {
                    l1.x = 0;
                    l1.printPosition();
                } else{
                    l1.printPosition();
                }
            } else if (pergerakan.equalsIgnoreCase("R")) {
                l1.moveRight();
                if(l1.x<0 || l1.y<0 || l1.y>=l1.width || l1.x>=l1.height ){
                    l1.x=l1.height-1;
                    l1.printPosition();
                }else{
                    l1.printPosition();
                }

            } else if (pergerakan.equalsIgnoreCase("U")) {
                l1.moveUp();
                if(l1.x<0 || l1.y<0 || l1.y>=l1.width || l1.x>=l1.height ) {
                    l1.y = 0;
                    l1.printPosition();
                }else{
                    l1.printPosition();
                }
            } else if (pergerakan.equalsIgnoreCase("D")) {
                l1.moveDown();
                if(l1.x<0 || l1.y<0 || l1.y>=l1.width || l1.x>=l1.height){
                    l1.y=l1.width-1;
                    l1.printPosition();
                }else{
                    l1.printPosition();
                }
            } else if (pergerakan.equalsIgnoreCase("STOP")) {
                break;
            } else {
                System.out.println("Inputan salah!");
            }
        }
    }
}
