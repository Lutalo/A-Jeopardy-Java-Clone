import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
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
	
	List<Column> columnList = new ArrayList<>();
	columnList.add(new Column("People", m));
	
	Board b = new Board(columnList);
	
	JSONParser parser = new JSONParser();
	
	try
	{
	    Object obj = parser.parse(new FileReader("/home/steven/Downloads/sampleJSON.json"));
	    
	    JSONObject jsonObject = (JSONObject) obj;
	    System.out.println(jsonObject);
	    
	    JSONObject column = (JSONObject) jsonObject.get("column");
	    
	    String title = (String) column.get("title");
	    System.out.println("Title: " + title);

	    JSONObject cards = (JSONObject) column.get("cards");
	    System.out.println(cards.entrySet().iterator().next());
	    String card1 = (String) cards.get("100");
	    System.out.println(card1);
	    
//	    JSONArray cards = (JSONArray) column.get("cards");
//	    Iterator<String> iterator = cards.iterator();
//	    while(iterator.hasNext())
//	    {
//		System.out.println(iterator.next());
//	    }
	    
	}
	catch (FileNotFoundException e) {}
	catch (IOException e) {}
	catch (ParseException e) {}
	
    }
    
    public static Column parseJSON(String filename)
    {
	Column c;
	JSONParser parser = new JSONParser();
	
	try
	{
	    Object obj = parser.parse(new FileReader(filename));
	    JSONObject jsonObject = (JSONObject) obj;
	    
	    JSONObject column = (JSONObject) jsonObject.get("column");
	}
	catch (Exception e)
	{
	}
	
	return null;
    }
}
