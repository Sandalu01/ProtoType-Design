import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ComputerShop implements Cloneable {

    //clonable marker interface -no even one methods
    // functional interface- have only one method

    private  String Shop;
    private ArrayList<Computure>Computure=new ArrayList<>();



    public void InizilizeComputur(){

        for (int i = 0; i < 50; i++) {
            Computure com=new Computure();
            com.setBarnd("Computer"+(i+1));
            com.setModel(i);
            getComputure().add(com);

        }
    }

    public void setShop(String shop) {
        Shop = shop;
    }

    public void setComputure(ArrayList<Computure> computure) {
        Computure = computure;
    }

    public String getShop() {
        return Shop;
    }

    public ArrayList<Computure> getComputure() {
        return Computure;
    }

    // shallow copy-come from object class
    // by default implements


    @Override
    protected Object clone() throws CloneNotSupportedException {

        //shalow copy
        // return super.clone();

        //dee-copy

       ComputerShop c=new ComputerShop();


       for (Computure temp:getComputure()){
           c.getComputure().add(temp);
       }
        return c;
    }

    @Override
    public String toString() {
        return "ComputerShop{" +
                "Shop='" + Shop + '\'' +
                ", Computure=" + Computure +
                '}';
    }
}
