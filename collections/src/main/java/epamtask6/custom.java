package epamtask6;
import java.util.*;
public  class custom implements Collection<String >
{   custom()
	{
	
	}


	ArrayList<String> al=new ArrayList<String>(Arrays.asList("one","two","three","4","five","6","seven","8","9","10"));

	public boolean add(String e) 
	{    
	
				return al.add(e);
	}
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return al.remove(o);
	}
	public void printAll()
	{
		System.out.println(al);
	}
	public void fetch(String i) {
		int in=al.indexOf(i);
		System.out.println(in);
	}
	
	
	
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	//public boolean addAll(Collection<? extends String> c) {
		// TODO Auto-generated method stub
	//	return al.addAll(Arrays.asList());
	//}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}
	public boolean addAll(Collection<? extends String> c) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}

