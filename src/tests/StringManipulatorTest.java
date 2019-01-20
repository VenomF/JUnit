package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.StringManipulator;

public class StringManipulatorTest {

    @Test
    public void stringLength_passString_returnsLength() {
    int result=StringManipulator.stringLength("aRfAgDuIasdfr");
	assertEquals(13, result);
    }
    
    @Test
    public void evenChars_passString_returnsEvenPlacedCharacters() {
    	String result=StringManipulator.evenChars("aRfAgDuIasdfr");
	assertEquals("RADIsf", result);
    }
    @Test
    public void oddChars_passString_returnsOddPlacedCharacters() {
    String result=StringManipulator.oddChars("RfAgDuIa");
	assertEquals("RADI", result);
    }
    
    @Test
    public void uppercseCharCounter() {
    int result=StringManipulator.uppercaseCharCounter("aRfAgDuIa");
	assertEquals(4, result);
    }
    @Test
    public void shouldReturnLowercaseLettersWhenPassedAString() {
    int result=StringManipulator.lowercaseCharCounter("rFaGdUiA");
	assertEquals(4, result);
    }
    
    @Test
    public void shouldReturnNoncharsWhenPassedAString() {
    String result=StringManipulator.nonLetterCharacters("&Rf#AgDu.Ia");
	assertEquals("&#.", result);
    }
}
