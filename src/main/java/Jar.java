import java.util.Random;
public class Jar {
    String item;
    int maxItems;
    Random random = new Random();
    
    public void setItem(String item){
        this.item = item;
    }
    public void setItemCount(int maxItems){
        this.maxItems = maxItems;
    }
    public String getItem(){
        return this.item;
    }
    public int getItemCount(){
        return random.nextInt(this.maxItems);
    }

}