import java.util.*;
public class Main
{

    public static void main(String[] args)
    {
	AnswerCard one = new AnswerCard("erica", 100);
	AnswerCard two = new AnswerCard("edison", 200);
	Map<Integer, String> m = new HashMap<>();

	m.put(one.getAmount(), one.getContent());

	for(Map.Entry<Integer, String> entry : m.entrySet())
	{
	    System.out.println("Value: " + entry.getKey() + ". Answer: " + entry.getValue());
	}
	
	Column c = new Column("People", m);
	
	System.out.println(c.getFirst());
	
	Board b = new Board();
	b.addColumn(c);
	
	
    }

}
