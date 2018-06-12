package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class KataRomanNumeralsTest {

	@Test
	public void testNormalToRomanFunction() {
		
		Assert.assertEquals("1492 should be MCDXCII", "MCDXCII" , KataRomanNumerals.normalToRoman(1492));
		Assert.assertEquals("9 should be IX", "IX" , KataRomanNumerals.normalToRoman(9));
		Assert.assertEquals("2334 should be MMCCCXXXIV", "MMCCCXXXIV" , KataRomanNumerals.normalToRoman(2334));
		
	}


@Test
public void testRomanToNormalFunction() {
	
	Assert.assertEquals(" MCDXCII should be 1492 ", 1492, KataRomanNumerals.romanToNormal("MCDXCII"));
	Assert.assertEquals("IX should be 9", 9, KataRomanNumerals.romanToNormal("IX"));
	Assert.assertEquals("MMCCCXXXIV should be 2334", 2334, KataRomanNumerals.romanToNormal("MMCCCXXXIV"));
		
	
}



}
