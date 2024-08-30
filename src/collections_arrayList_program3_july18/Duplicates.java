package collections_arrayList_program3_july18;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
private List<Integer> numberList;

public Duplicates() {
	super();
	numberList=new ArrayList<Integer>();
}

public Duplicates(List<Integer> numberList)
{
	this.numberList=numberList;
}

public List<Integer> getNumberList() {
	return numberList;
}

public void setNumberList(List<Integer> numberList) {
	this.numberList = numberList;
}
public List<Integer> getDuplicatesList()
{
	if(numberList==null||numberList.isEmpty())
	{
		return null;
	}
	List<Integer> duplicatesList=new ArrayList<Integer>();
	for(int i=0;i<numberList.size();i++)
	{
		int number=numberList.get(i);
		if(duplicatesList.contains(number))
		{
			continue;
		}
		for(int j=i+1;j<numberList.size();j++)
		{
			if(numberList.get(j).equals(number))
			{
				duplicatesList.add(number);
				break;
			}
		}
	}
	return duplicatesList;
}

}
