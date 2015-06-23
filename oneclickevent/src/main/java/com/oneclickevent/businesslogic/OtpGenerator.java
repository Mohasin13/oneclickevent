package com.oneclickevent.businesslogic;

import java.util.Random;

public class OtpGenerator {
	
private int min = 1000;
private int max = 9999;

public int generateOtp()
{
	Random rand = new Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;

}
}