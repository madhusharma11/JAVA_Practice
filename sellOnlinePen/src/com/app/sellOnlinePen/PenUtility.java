package com.app.sellOnlinePen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PenUtility {
	public static Map<Integer,Pen> map = new HashMap<>();
	
	public static void addNewPen(Pen pen)
	{
		map.put(pen.getId(), pen);
	}
	public static List<Pen> getListOfAllPens(Pen pen)
	{
		map.get(pen.getBrand()+pen.getColor()+pen.getInkColor()+pen.getMaterial());
		return null;
		
	}

}