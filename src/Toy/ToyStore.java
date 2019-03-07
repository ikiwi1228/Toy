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
            loadToys(toys);
        }
        
	public void loadToys( String toys )
	{
            Scanner input = new Scanner(toys);
            while(input.hasNext()){
                String x = input.next();
                for (Toy t: toyList){
                    if(t.getName().equals(x)){
                        getThatToy(x);
                }
                    else{
                        toyList.add(new Toy(x));
                    }
                }
            }
        }
  
  	public Toy getThatToy( String nm )
  	{
            int ct = 1;
            Toy git;
            for (Toy t : toyList){
                if (nm.equals(t.getName())){
                    t.setCount(ct);
                    ct++;
                    git = t;
                }
            }
            return git;

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
            
  	}  
  	  
	public String toString()
	{
	   return toyList+"\n"+"max == "+getMostFrequentToy();
	}
}