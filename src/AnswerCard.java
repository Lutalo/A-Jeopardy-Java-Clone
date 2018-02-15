
public class AnswerCard
{
    private String content;
    private int amount;
<<<<<<< HEAD
=======
    
    public AnswerCard(String display, String content, int amount)
    {
	this.display = display;
	this.content = content;
	this.amount = amount;
    }
>>>>>>> branch 'master' of https://github.com/Lutalo/A-Jeopardy-Java-Clone.git
    
    public AnswerCard(String content, int amount)
    {
	this.content = content;
	this.amount = amount;
    }
    public String getContent()
    {
        return content;
    }
    public void setContent(String content)
    {
        this.content = content;
    }
    public int getAmount()
    {
        return amount;
    }
    public void setAmount(int amount)
    {
        this.amount = amount;
    }
    
    
}
