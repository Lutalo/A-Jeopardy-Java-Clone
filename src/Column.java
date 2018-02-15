import java.util.*;

public class Column
{
    private String topic;
    Map<Integer, String> cards;
    
    public Column(String topic, Map<Integer,String> cards)
    {
	this.topic = topic;
	this.cards = cards;
    }
    
    public String getFirst()
    {
	return cards.get(100);
    }
    
    
}
