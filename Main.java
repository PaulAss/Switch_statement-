import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a command:");
    String  text = input.nextLine();
    //System.out.println("Command is "+ text);
    switch(text){
      case "start":
        System.out.println("Machine started");
        break;
      case "stop":
        System.out.println("Machine stopped");
        break;
      default:
        System.out.println("Command not recognized");
    }
   

  }
}