package entities;

public class Product {
    //Com o private estou emcapsulando este e os outros atributos, sendo necessário que eu coloque metodos set para alterar o valor do produto e get para ler o valor do atributo
    private String name;
    private double price;
    private int quantity;

    //construtor padrao, para que seja possivel instanciar um objeto produto sem precisar passar os atributos.
    public Product(){}

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // esse é um construtor de sobrecarga, onde uma nova instancia de produto pode iniciar somente com a inicialização dos atributos name e price, sendo que quantity tera o valor iniciado em zero, pela especificação de variaveis int.
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    //metodos geter e seter podem ter logicas mais elaboradas para retirar o dado de algum membro do objeto.
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    //Também não será feito o metodo  set de quantity, já que como uma regra de negocio a quantidade não sera alterada de forma alguma que nao seja o metodo especifico de adicionar ou retirar unidades do produto em especifico.

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $ "+ String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
