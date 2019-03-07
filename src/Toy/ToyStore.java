package Toy;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
            loadToys("");
	}

        public ToyStore(String toys){
            toyList = new ArrayList<Toy>();
            for (String t: toys.split(" ")){
                loadToys(t);
            }
        }
        
	public void loadToys( String toys )
	{
            Toy that = getThatToy(toys);
            if (that == null){
                toyList.add(new Toy(toys));
            }
            else{
                that.setCount(that.getCount()+1);
            }
        }
  
  	public Toy getThatToy( String nm )
  	{
            for (Toy toys:toyList){
                if (toys.getName().equals(nm)){
                    return toys;
                }
            }
            return null;
        }
  
  	public Toy getMostFrequentToy()
  	{
            Toy max = toyList.get(0);
            for (Toy t:toyList){
                int m = toyList.get(0).getCount();
                if (t.getCount()>m){
                    max = t;
                    m=t.getCount();
                }
            }
            return max;
     	}  
  
  	public void sortToysByCount()
  	{
            Collections.sort(toyList,Collections.reverseOrder());
            
  	}  
  	  
	public String toString()
	{
	   return toyList+"\n"+"max == "+getMostFrequentToy();
	}
}