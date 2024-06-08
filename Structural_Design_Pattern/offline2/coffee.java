public class coffee {
    decorator coffee;
    public coffee(){
        coffee = new mug();
    }

    public void makeCoffee(String coffeeName){
        if(coffeeName.equalsIgnoreCase("Americano")){
            coffee = new water(coffee);
            coffee = new grinded_coffee_beans(coffee);
            coffee = new grinded_coffee_beans(coffee);
        }
        if(coffeeName.equalsIgnoreCase("Espresso")){
            coffee = new water(coffee);
            coffee = new grinded_coffee_beans(coffee);
            coffee = new dairy_cream(coffee);
        }
        if(coffeeName.equalsIgnoreCase("Cappuccino")){
            coffee = new milk(coffee);
            coffee = new grinded_coffee_beans(coffee);
            coffee = new cinnamon_powder(coffee);
        }
        if(coffeeName.equalsIgnoreCase("Mocha")){
            coffee = new milk(coffee);
            coffee = new grinded_coffee_beans(coffee);
            coffee = new chocolate_sauce(coffee);
        }
    }

    public int print(){
        int price=0;
        System.out.println("ingredients:");
        while(coffee!=null){
            System.out.println(coffee.name());
            price+=coffee.price();
            coffee = coffee.getcoffee();
        }
        System.out.println("price : "+price);
        System.out.println();
        return price;
    }
}
