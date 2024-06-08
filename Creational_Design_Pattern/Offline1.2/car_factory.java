public class car_factory {

    private String countryName;
    public car_factory(String countryName){
        this.countryName = countryName;
    }
    public car getCar(){
        car c;
        if(countryName.equalsIgnoreCase("Asia")){
            c = new Toyota();
        }
        else if(countryName.equalsIgnoreCase("Europe")){
            c = new BMW();
        }
        else{
            c = new Tesla();
        }

        return c;
    }

}
