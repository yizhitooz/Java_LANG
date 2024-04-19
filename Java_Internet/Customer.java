package Internet;

public class Customer {
	
    private String name;
    private String id;
    private String mima;
    
    public Customer(String name,String id,String mima){
        this.name = name;
        this.id = id;
        this.mima = mima;
    }

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
