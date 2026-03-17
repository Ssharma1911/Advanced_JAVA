class Car2{
    Car2(){
        System.out.println("Model: ");
        System.out.println("Year: ");
        System.out.println("Price: ");          
    }
    Car2(String model,int year,int price){
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Price: "+price);          
    }
    public static void main(String[] args) {
        Car2 c1=new Car2("BMW",2020,5000000);
        Car2 c2=new Car2();
    }
}