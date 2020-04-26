package HomeWork;

public class Main {
    public static void main(String[] args) {
        Smartphone Iphone = new Smartphone("IphoneXR", 600);
        Smartphone Galaxy = new Smartphone("Samsung Galaxy S10", 700);
        Notebook HP = new Notebook("HP ProBook 840", "Intel i5", "black", 800);
        ElectronicStore store = new ElectronicStore("from 8 am to 6 pm", "Pushkin str.55");

        //добавляем партию товара в магазин

        store.addQuantity(Iphone,1);
        store.addQuantity(HP,2);
        store.addQuantity(Galaxy,2);

        store.printAllProducts();

        //продаем товар

        store.soldToCustomer(HP);
        store.soldToCustomer(Galaxy);
        store.soldToCustomer(HP);
        System.out.println("");

        //сумма проданного товара

        store.sumOfSold();


    }
}
