public class Computure  {

    private  String barnd;
    private long model;
    public void setBarnd(String barnd) {
        this.barnd = barnd;
    }

    public void setModel(long model) {
        this.model = model;
    }



    public String getBarnd() {
        return barnd;
    }

    public long getModel() {
        return model;
    }





    @Override
    public String toString() {
        return "Computure{" +
                "barnd='" + barnd + '\'' +
                ", model=" + model +
                '}';
    }
}
