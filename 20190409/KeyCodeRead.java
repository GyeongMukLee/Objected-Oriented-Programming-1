public class KeyCodeRead{
    public static void main(String[] args) throws Exception {
        boolean run=true;
        int speed=0;

        while(run){
            int keyCode=System.in.read(); 
            switch(keyCode){
            case 49:
                speed++;
                System.out.println("speed: "+speed);
                break;
            case 50:
                speed--;
                System.out.println("speed: "+speed);
                break;
            case 51:
                run=false;
                break;
            }
        }
        
    }
}