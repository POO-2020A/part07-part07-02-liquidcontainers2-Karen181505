
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        
        while (true) {
            System.out.println("First: " + container1);
        System.out.println("Second: " + container2);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }else{
            String [] parts = input.split(" ");
            String comando = parts [0];
            int value = Integer.valueOf(parts [1]);
            if(comando.equals("add")){
                container1.add(value);
                System.out.println();
            }else if(comando.equals("remove")){
                container2.remove(value);
                
            }else if(comando.equals("move")){
               System.out.println("Conta: " + container1.contains());
                if (container1.contains() >= value) {
                    container2.add(value);
                    container1.remove(value);

                } else {
                    container2.add(container1.contains());
                    container1.remove(container1.contains());

                }
                System.out.println();
            }
            }
        }
    }

}
