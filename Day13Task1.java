package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

class ListCollection{
	public static void ListType1() {
		System.out.println("Array List");
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		a.add(60);
		a.add(70);
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);
	}
	public static void ListType2() {
		System.out.println("Linked List");
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		a.add(60);
		a.add(70);
		for(Integer i : a) {
			System.out.println(i);
		}
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);
	}
}

class SetCollection{
	public static void SetType1() {
		System.out.println("Hash Set");
		HashSet<String> h = new HashSet<>();
		h.add("v1");
		h.add("v4");
		h.add("hello");
		h.add("v2");
		h.add("v3");
		h.add("hi");
		h.add("v1");
		System.out.println(h);
		h.removeAll(h);
		System.out.println(h);
	}
	public static void SetType2() {
		System.out.println("Linked Hash Set");
		LinkedHashSet<String> h = new LinkedHashSet<>();
		h.add("v1");
		h.add("v4");
		h.add("hello");
		h.add("v2");
		h.add("v3");
		h.add("hi");
		h.add("v1");
		System.out.println(h);
		h.removeAll(h);
		System.out.println(h);
	}
	public static void SetType3() {
		System.out.println(" Tree Set");
		TreeSet<String> h = new TreeSet<>();
		h.add("v1");
		h.add("v4");
		h.add("hello");
		h.add("v2");
		h.add("v3");
		h.add("hi");
		h.add("v1");
		System.out.println(h);
		h.removeAll(h);
		System.out.println(h);
	}
}
class MapCollection{
	public static void MapType1() {
		System.out.println("Hash Map");
		HashMap<Integer,String> m = new HashMap<>();
		m.put(1, "Mounika");
		m.put(2, "Prathika");
		m.put(4, "Hari");
		m.put(6, "Vinodhini");
		m.put(3, "Kio");
		m.put(5, null);
		System.out.println(m);
		m.remove(1);
		System.out.println(m);
	}
	public static void MapType2() {
		System.out.println("Linked Hash Map");
		LinkedHashMap<Integer,String> m = new LinkedHashMap<>();
		m.put(1, "Mounika");
		m.put(2, "Prathika");
		m.put(4, "Hari");
		m.put(6, "Vinodhini");
		m.put(3, "Kio");
		m.put(5, null);
		System.out.println(m);
		m.remove(1);
		System.out.println(m);
	}
	public static void MapType3() {
		System.out.println("TreeMap");
		TreeMap<Integer,String> m = new TreeMap<>();
		m.put(1, "Mounika");
		m.put(2, "Prathika");
		m.put(4, "Hari");
		m.put(6, "Vinodhini");
		m.put(3, "Kio");
		m.put(5, null);
		System.out.println(m);
		m.remove(1);
		System.out.println(m);
	}
}
class StackCollection{
	public static void StackType1() {
		System.out.println("Stack");
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.peek());
		System.out.println(s);
		s.pop();
		System.out.println(s.peek());
		System.out.println(s);
		s.pop();
		System.out.println(s.peek());
		System.out.println(s);
		s.pop();
		System.out.println(s.peek());
		System.out.println(s);
		s.pop();
//		System.out.println(s.peek());
		System.out.println(s);
	}
}

class QueueCollection{
	public static void QueueType1() {
		System.out.println("Queue");
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q.peek());
		System.out.println(q);
		q.remove();
		System.out.println(q.peek());
		System.out.println(q);
		q.remove();
		System.out.println(q.peek());
		System.out.println(q);
		q.remove();
		
	}
}
public class c1 {

	public static void main(String[] args) {
//		ListCollection l1 = new ListCollection();
//		l1.ListType1();
//		l1.ListType2();
		
//		SetCollection s1 = new SetCollection();
//		s1.SetType1();
//		s1.SetType2();
//		s1.SetType3();
		
//		MapCollection m1 = new MapCollection();
//		m1.MapType1();
//		m1.MapType2();
//		m1.MapType3();
		
//		StackCollection st1 = new StackCollection();
//		st1.StackType1();
		
		QueueCollection q = new QueueCollection();
		q.QueueType1();
	}

}
