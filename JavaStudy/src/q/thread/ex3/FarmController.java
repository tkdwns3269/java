package q.thread.ex3;

import java.util.ArrayList;
import java.util.HashMap;

public class FarmController {
	private HashMap<Farm, Integer> hMap;
	private ArrayList<Farm> list;

	

	public FarmController() {
		super();
		this.hMap = new HashMap<>();
		this.list = new ArrayList<>();
	}

	public boolean addNewKind(Farm f, int amount) {
		return false;
	}

	public boolean removeKind(Farm f) {
		return false;
	}

	public boolean changeAmount(Farm f, int amount) {
		return false;
	}

	public HashMap<Farm, Integer> printFarm() {
		return hMap;

	}

	public boolean buyFarm(Farm f) {
		return false;
	}

	public boolean removeFarm(Farm f) {
		return false;
	}

	public ArrayList<Farm> printBuyFarm() {
		return list;

	}

}
