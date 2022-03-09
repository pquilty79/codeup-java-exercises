public class Child {
    private final String name = "Mila";
    private int age = 7;
    private String hair = "long curly blonde";
    private String disposition =  "fussy";

    public double feedChild(double foodMass){
        double speedofConsumption = foodMass * 299792458;
        double energy = Math.pow(speedofConsumption, 2);
        return energy;
    }
// started but did not finish
//    public void rideHorse() {
//        if(name)
//    }


    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }







}
