import java.util.ArrayList;
import java.util.List;

public class Board
{
    List<Column> columns = new ArrayList<>();
    
    public Board(List columns)
    {
	this.columns = columns;
    }
    
    public void addColumn(Column c)
    {
	columns.add(c);
    }
}
