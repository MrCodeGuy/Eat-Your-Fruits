// Main Class
public class Main {

    // Creates Attribute
     final double fruitType = Math.random() * 10 + 1;

     // Creates Function that generates fruit can be called in other classes
     public String genFruit(){

         // Creates Object
         Main fruitObj = new Main();

         // Creates int version of fruitType
         int intFruitObj = (int) fruitObj.fruitType;

         // Switch Statement to generate str with int
         switch (intFruitObj){

             case 1:
                 return "apple";

             case 2:
                 return "orange";

             case 3:
                 return "banana";

             case 4:
                 return "pear";

             case 5:
                 return "blueberrie";

             case 6:
                 return "grape";

             case 7:
                 return "apricot";

             case 8:
                 return "peach";

             case 9:
                 return "mango";

             case 10:
                 return "pineapple";

             default:
                 return "(Try Again)";

         }

     }

    public static void main(String[] args) {
        Main mainObj = new Main();
        System.out.println("The computer requests that you eat " + mainObj.genFruit() + "s.");
    }
}
