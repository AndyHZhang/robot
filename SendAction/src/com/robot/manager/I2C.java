package com.robot.manager;

public class I2C {
	public native static long  open();
	public native static int   send(long fd, short val);
	public native static short read_interrupt(long fd);
	public native static int   close(long fd);
	
	public static void sendCommand(int code) {
		short c = (short)code;
		long fd = I2C.open();
		I2C.send(fd, c);
		I2C.close(fd);
	}
}
