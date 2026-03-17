class Car{
    Car(String model,int year,int price){
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Price: "+price);          
    }
    public static void main(String[] args) {
        Car c1=new Car("BMW",2020,5000000);
        Car c2=new Car("Audi",2021,6000000);
    }
}