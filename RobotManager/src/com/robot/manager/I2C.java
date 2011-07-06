package com.robot.manager;

public class I2C {
	public native static long  open();
	public native static int   send(long fd, short val);
	public native static short read_interrupt(long fd);
	public native static int   close(long fd);
}
