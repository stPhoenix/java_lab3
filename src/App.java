public class App {
    public static void main(String[] args) throws Exception {
        Car[] cars = {new Car(1, "Cheval", "Asea", 2002, "white", 24000, "AX1111MP"),
                      new Car(2, "Albany", "Asea", 1980, "grey", 10000, "AX2222MP"),
                      new Car(3, "Enus", "Cognoscenti", 1993, "black", 40000, "AX3333MP"),
                      new Car(4, "Enus", "Bentover", 1995, "yellow", 34000, "AX4444MP"),
                      new Car(5, "Karin", "Asterope", 2004, "red", 26000, "AX5555MP"),
                      new Car(6, "Declasse", "Asea", 1995, "red", 12000, "AX6666MP"),
                      new Car(7, "Declasse", "Premier", 1995, "blue", 10000, "AX7777MP"),
                      new Car(8, "Karin", "Intruder", 1986, "grey", 16000, "AX8888MP"),
                      new Car(9, "Vulcar", "Ingot", 1983, "grey", 8000, "AX9999MP"),
                      new Car(10, "Benefactor", "Glendale", 1950, "grey", 150000, "AX7777XA"),
                    };

        
        System.out.println("Car of mark Enus: ");
        showCarsOnMark(cars, "Enus");
        System.out.println("Cars of model Asea and 10 years old");
        showCarsOnModelAndOld(cars, "Asea", 10);
        System.out.println("Cars of year and price:");
        showCarsOnYearAndPrice(cars, 1995, 11000);
    }

    public static void showCarsOnMark(Car[] cars, String mark)
    {
        for (Car car : cars)
        {
            if (car.getMark().equalsIgnoreCase(mark))
            {
                System.out.println(car.toString());
            }
        }
    }
    public static void showCarsOnModelAndOld(Car[] cars, String model, int year)
    {
        int old = 2020 - year;
        for (Car car : cars)
        {
            if (car.getModel().equalsIgnoreCase(model) & car.getYear() < old) 
            {
                System.out.println(car.toString());
            }
        }
    }
    public static void showCarsOnYearAndPrice(Car[] cars, int year, int price)
    {
        for (Car car : cars)
        {
            if (car.getYear() == year & car.getPrice() > price)
            {
                System.out.println(car.toString());
            }
        }
    }
}
