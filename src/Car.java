public class Car {
    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private int price;
    private String rNumber;

    public Car(int id, String mark, String model, int year, String color, int price, String rNumber)
    {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.rNumber = rNumber;
    }

    public Car(int id, String mark, String model, int year)
    {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = "undefined";
        this.price = 0;
        this.rNumber = "undefined";
    }


    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return String return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return int return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return int return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return String return the rNumber
     */
    public String getRNumber() {
        return rNumber;
    }

    /**
     * @param rNumber the rNumber to set
     */
    public void setRNumber(String rNumber) {
        this.rNumber = rNumber;
    }

    @Override
    public String toString()
    {
        return new String("Mark: "+this.mark+" Model: "+this.model+" Year: "+this.year+" Color: "+this.color+" Price: "+this.price+" Number: "+this.rNumber);
    }

}
