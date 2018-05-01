import java.util.Random;
public class Jar {
    String item;
    int maxItems;
    int itemsInJar;
    Random random = new Random();
    
    public void setItem(String item){
        this.item = item;
    }
    public void setItemCount(int maxItems){
        this.maxItems = maxItems;
    }
    public int getMaxItems(){
        return maxItems;
    }
    public String getItem(){
        return this.item;
    }
    public void fill(){
        itemsInJar = random.nextInt(this.maxItems);
        if (itemsInJar == 0){
            itemsInJar = 1;
        }
    }
    public int getItemCount(){
        return itemsInJar;
    }
}