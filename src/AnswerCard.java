
public class AnswerCard
{
    private String display;
    private String content;
    private int amount;
    
    public AnswerCard(String display, String content, int amount)
    {
	this.display = display;
	this.content = content;
	this.amount = amount;
    }
    
    public String getDisplay()
    {
        return display;
    }
    public void setDisplay(String display)
    {
        this.display = display;
    }
    public String getContent()
    {
        return content;
    }
    public void setContent(String content)
    {
        this.content = content;
    }
    
    
}
