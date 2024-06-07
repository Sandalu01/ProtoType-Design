import java.util.ArrayList;

public class Inizilizer {
    public static void main(String[] args) throws CloneNotSupportedException {

                 ComputerShop shop=new ComputerShop();
                 shop.setShop("colombo");
                 shop.InizilizeComputur();
                 System.out.println(shop);

                 ComputerShop shop1=new ComputerShop();
                 shop1.setShop("Kandy");
                 shop1.InizilizeComputur();
                 System.out.println(shop1);

                 //changing instance of clone
                 //when changing the instance of clone which we design the shallow copy
                 //is not suitable for the prototype design





                 ComputerShop shop2=(ComputerShop) shop1.clone();
                 shop1.setShop("Anuradhapura");

                  shop1.setComputure(new ArrayList<>());
                 // java shallow copy
                 //get same copy of the instance for each shop


                  //   shop1.InizilizeComputur();
                 // without   shop2.InizilizeComputur(); is worked



                 System.out.println(shop2);
    }


    // deep copy -get copy and give new instance
    // shallow copy -get copy and give same instance

}
