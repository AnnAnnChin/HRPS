package com.hrps.control;

import java.util.ArrayList;
import com.hrps.entity.Guest;

public class GuestManager {
	private ArrayList<Guest> guestList;

	public GuestManager() {
		
	}
	
	public boolean createGuest(Guest guest) {
		return guestList.add(guest);
	}
	
	public boolean updateGuest(Guest guest) {
		guestList.add(guest);
		return true;
	}
	
	public boolean updateGuest(Guest guest) {
		guestList.add(guest);
		return true;
	}
	
	public Guest searchGuest(String name) {
		for (int i = 0; i < guestList.size(); i ++) {
			Guest guest = guestList.get(i);
			
			if (name.equalsIgnoreCase(guest.getName())) {
				return guest;
			}
		}
		
		return null;
	}
}
