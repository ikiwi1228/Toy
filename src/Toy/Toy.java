package Toy;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
            setCount(0);
            setName("");
	}

	public Toy( String nm )
	{
            setName(nm);
            setCount(1);
	}
	
	public int getCount()
	{
            return this.count;
	}
	
	public void setCount( int cnt )
	{
            this.count=cnt;
	}
	
	public String getName()
	{
            return this.name;
	}
	
	public void setName( String nm )
	{
            this.name = nm;
	}

	public String toString()
	{
	   return this.name+" "+this.count;
	}
}