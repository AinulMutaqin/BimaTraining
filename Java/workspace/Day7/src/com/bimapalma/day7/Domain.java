package com.bimapalma.day7;

public class Domain {
	public int calculateAngle(int angle) throws NumberNotValidException {
		if(angle > 360)
			//angle = 0;
			throw new NumberNotValidException();
		return 360 - angle;
	}
}
