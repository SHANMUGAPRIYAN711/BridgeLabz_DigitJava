public class SnakeLadder {
    static  int position = 0;
    static  int count = 0;
    public static void main(String[] args) {
        startgame();
        playgame();
        printstats();
    }
    public static void startgame(){
        position = 0;
        System.out.println("Game Started . Initial position :" + position);
    }
    public static int rooldiece(){
        return (int)(Math.random() * 6) + 1;
    }
    public static int checkoption(){
        return (int)(Math.random() * 3);
    }
    public static void checkexactwin(int diece){
        if(position > 100){
            position -= diece;
        }
    }
    public static void playgame(){
        while (position < 100){
            int diece = rooldiece();
            int option = checkoption();
            count++;
            System.out.println("\n Diece : "+ diece);
            switch (option){
                case 0 :
                    System.out.println("No Play");
                    break;

                case 1 :
                    position += diece;
                    System.out.println("Ladder ->" + position);
                    break;

                    case 2:
                        position -= diece;
                        System.out.println("Snake ->" + position);
                        break;
            }
            if(position < 0){
                position = 0;
            }
            checkexactwin(diece);
            System.out.println("Current Position : " + position);
        }
    }
    public static void printstats(){
        System.out.println("Player reached 100!");
        System.out.println("Total diece roll" + count);
    }
}
