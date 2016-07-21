package com.bimapalma.day2;

public class SudutLingkaran {
	private int angle = 45;

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		if(angle > 360) {
			this.angle = 360;
		} else {
			this.angle = angle;
		}
		//int x = fullAngle / 2;
	}
	
	public int calculateOtherAngle() {
		int fullAngle = 360;
		int othher = fullAngle - this.getAngle();
		return othher;
	}
}
