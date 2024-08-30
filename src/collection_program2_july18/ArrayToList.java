package collection_program2_july18;

import java.util.Arrays;
import java.util.*;

public class ArrayToList {
public static List convertToList(String[] inputArray)
{
	if(inputArray==null||inputArray.length==0)
	{
		return null;
	}
		return new ArrayList<>(Arrays.asList(inputArray));
}
}
