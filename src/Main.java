import java.util.*;
public class Main
{

    public static void main(String[] args)
    {
	AnswerCard one = new AnswerCard("erica", 100);
	AnswerCard two = new AnswerCard("edison", 200);
	AnswerCard three = new AnswerCard("myself", 300);
	AnswerCard four = new AnswerCard("a", 400);
	AnswerCard five  = new AnswerCard("b", 500);
	
	Map<Integer, String> m = new HashMap<>();
	

	m.put(one.getAmount(), one.getContent());
	m.put(two.getAmount(), two.getContent());
	m.put(three.getAmount(), three.getContent());
	m.put(four.getAmount(), four.getContent());
	m.put(five.getAmount(), five.getContent());

	for(Map.Entry<Integer, String> entry : m.entrySet())
	{
	    System.out.println("Value: " + entry.getKey() + ". Answer: " + entry.getValue());
	}
	
	Column c1 = new Column("People", m);
	
	System.out.println(c1.getFirst());
	
	Board b = new Board();
	b.addColumn(c1);
	
	
    }

}
