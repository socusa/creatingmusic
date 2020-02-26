package samples;

import static music.CreatingMusic.*;
import static music.Util.*;

import songs.Song;

public class Pachelbels_Canon_In_D extends Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub
		
		factor=30000;

		player.setTempoInBPM(90*factor);
		
		key = "D";
		
		measure(0);
		
		addNotes("F6h E6h",T);
		addNotes("D4i A4i D5i F5i A3i E4i A4i C5i",B);
		
		measure(1);
		
		addNotes("D6h C6h",T);
		addNotes("B3i F4i B4i D5i F3i C4i F4i A4i",B);
		
		measure(2);
		
		addNotes("B5h A5h",T);
		addNotes("G3i D4i G4i B4i D3i A3i D4i F4i",B);
		
		measure(3);
		
		addNotes("B5h C6h",T);
		addNotes("G3i D4i G4i B4i A3i E4i A4i C5i",B);
		
		measure(4);
		
		addNotes("D6h+F6h C6h+E6h",T);
		addNotes("D4i A4i D5i F5i A3i E4i A4i C5i",B);
		
		measure(5);
		
		addNotes("B5h+D6h A5h+C6h",T);
		addNotes("B3i F4i B4i D5i F3i C4i F4i A4i",B);
		
		measure(6);
		
		addNotes("G5h+B5h F5h+A5h",T);
		addNotes("G3i D4i G4i B4i D3i A3i D4i F4i",B);
		
		measure(7);
		
		addNotes("G5h+B5h A5h+C6h",T);
		addNotes("G3i D4i G4i B4i A3i E4i A4i C5i",B);
		
		speed = 3/4.0;
		
		measure(8);
		
		addNotes("D6i+F6i C6i D6i F5i E5i+E6i A5i G5i A5i",T);
		addNotes("D4i A4i D5i A4i A3i E4i A4i E4i",B);
		
		measure(9);
		
		addNotes("F5i+D6i D6i C6i B5i A5i+C6i F6i C6i+A6i B6i",T);
		addNotes("B3i F4i B4i F4i F3i C4i A4i C4i",B);
		
		measure(10);
		
		addNotes("B5i+G6i F6i E6i G6i A5i+F6i E6i D6i C6i",T);
		addNotes("G3i D4i B4i D4i D3i A3i D4i F4i",B);
		
		measure(11);
		
		addNotes("G5i+B5i A5i B5i D6i E5q+D6q E5q+C6q",T);
		addNotes("G3i D4i G4i B4i A3i E4i A4i E4i",B);
		
		measure(12);
		
		addNotes("A6i F6s G6s A6i F6s G6s A6s A5s B5s C6s D6s E6s F6s G6s",T);
		addNotes("D4i A4i D5i A4i A3i E4i A4i E4i",B);
		
		measure(13);
		
		addNotes("F6i D6s E6s F6i F5s G5s A5s B5s A5s G5s A5s F5s G5s A5s",T);
		addNotes("B3i F4i B4i F4i F3i C4i A4i C4i",B);
		
		measure(14);
		
		addNotes("G5i B5s A5s G5i F5s E5s F5s E5s D5s E5s F5s G5s A5s B5s",T);
		addNotes("G3i D4i G4i D4i D3i A3i D4i A3i",B);
		
		measure(15);
		
		addNotes("G5i B5s A5s B5i C6s D6s C6s B5s A5s B5s C6s D6s E6s F6s",T);
		addNotes("G3i D4i G4i D4i A3i E4i A4i E4i",B);
		
		measure(16);
		
		addNotes("F6i+A6i D6s+F6s E6s+G6s F6i+A6i D6s+F6s E6s+G6s C6s+A6s A5s B5s C6s D6s E6s F6s G6s",T);
		addNotes("D4i A4i D5i A4i A3i E4i A4i E4i",B);
		
		measure(17);
		
		addNotes("D6i+F6i B5s+D6s C6s+E6s D6i+F6i F5s G5s F5s+A5s B5s A5s G5s A5s D6s C6s D6s",T);
		addNotes("B3i F4i B4i F4i F3i C4i A4i C4i",B);
		
		measure(18);
		
		addNotes("G5i+B5i B5s+D6s A5s+C6s G5i+B5i A5s G5s F5s+A5s G5s F5s G5s A5s B5s C6s D6s",T);
		addNotes("G3i D4i G4i D4i D3i A3i D4i A3i",B);
		
		measure(19);
		
		addNotes("G5i+B5i B5s+D6s A5s+C6s B5i+D6i C6s B5s C6s D6s E6s D6s C6s D6s B5s C6s",T);
		addNotes("G3i D4i G4i D4i A3i E4i A4i E4i",B);
		
		measure(20);
		
		addNotes("F6q+A6q F6i A6i E6i+A6i B6i C6i+A6i G6i",T);
		addNotes("D4i A4i D5i A4i A3i E4i A4i E4i",B);
		
		measure(21);
		
		addNotes("D6q+F6q D6i F6i C6i+F6i G6i A5i+F6i E6i",T);
		addNotes("B3i F4i B4i F4i F3i C4i A4i C4i",B);
		
		measure(22);
		
		addNotes("B5q+D6q B5i D6i A5q+D6q F5i D6i",T);
		addNotes("G3i D4i G4i D4i D3i A3i D4i A3i",B);
		
		measure(23);
		
		addNotes("G5i+D6i Cn6i B5i Cn6i A5h+C#6h",T);
		addNotes("G3i D4i G4i D4i A3i E4i A4i C5i",B);
		
		measure(24);
		
		addNotes("F6q+A6q F6i A6i E6i+A6i B6i C6i+A6i G6i",T);
		addNotes("D4s A4s D5s F5s D5s A4s D4s A4s A3s E4s A4s C5s A4s E4s A3s E4s",B);
		
		measure(25);
		
		addNotes("D6q+F6q D6i F6i C6i+F6i G6i A5i+F6i E6i",T);
		addNotes("B3s F4s B4s D5s B4s F4s B3s F4s F3s C4s F4s A4s F4s C4s F3s C4s",B);
		
		measure(26);
		
		addNotes("B5q+D6q B5i D6i A5q+D6q F5i D6i",T);
		addNotes("G3s D4s G4s B4s G4s D4s G3s D4s D3s A3s D4s F4s D4s A3s D3s A3s",B);
		
		measure(27);
		
		addNotes("G5i+D6i Cn6i B5i C6i A5q+C#6q D6i E6i",T);
		addNotes("G3s D4s G4s B4s G4s D4s G3s D4s A3s E4s A4s C5s A4s E4s A3s E4s",B);
		
		measure(28);
		
		addNotes("F6q D6i+D7i F6i F6i G6i C6i+F6i+C7i E6i",T);
		addNotes("D4s A4s D5s F5s D5s A4s D4s A4s A3s E4s A4s C5s A5s E4s A3s E4s",B);
		
		measure(29);
		
		addNotes("D6q B5i+B6i D6i D6i E6i A5i+D6i+A6i C6i",T);
		addNotes("B3s F4s B4s D5s B4s F4s B3s F4s F3s C4s F4s A4s F4s C4s F3s C4s",B);
		
		measure(30);
		
		addNotes("B5q G5q+G6q F6q+D7q D6q+A6q",T);
		addNotes("G3s D4s G4s B4s G4s D4s G3s D4s D3s A3s D4s F4s D4s A3s D3s A3s",B);
		
		measure(31);
		
		addNotes("D6q+B6q B5q+G6q C6q+A6q F5i+F6i G5i+G6i",T);
		addNotes("G3s D4s G4s B4s G4s D4s G3s D4s A3s E4s A4s C5s A4s E4s A3s E4s",B);
		
		measure(32);
		
		addNotes("A6s A5s D6s F6s A6s F6s D6s A5s A6s A5s B6s B5s A6s A5s G6s G5s",T);
		addNotes("D4s A4s D5s F5s D5s A4s D4s A4s A3s E4s A4s C5s A4s E4s A3s E4s",B);
		
		measure(33);
		
		addNotes("F6s F5s B5s D6s F6s D6s B5s F5s F6s F5s G6s G5s F6s F5s E6s E5s",T);
		addNotes("B3s F4s B4s D5s B4s F4s B3s F4s F3s C4s F4s A4s F4s C4s F3s C4s",B);
		
		measure(34);
		
		addNotes("D6s D5s G5s B5s D6s B5s G5s F3s D6s D5s F5s A5s F6s F5s A5s D6s",T);
		addNotes("G3s D4s G4s B4s G4s D4s G3s D4s D3s A3s D4s F4s D4s A3s D3s A3s",B);
		
		measure(35);
		
		addNotes("G6s G5s B5s D6s B6s B5s D6s G6s A6s A5s C6s E6s B6s B5s C7s C6s",T);
		addNotes("G3s D4s G4s B4s G4s D4s G3s D4s A3s E4s A4s C5s A4s E4s A3s E4s",B);
		
		measure(36);
		
		addNotes("D7s D6s F6s A6s D7s A6s F6s D6s D7s D6s E6s A6s C7s C6s E6s A6s",T);
		addNotes("D4s A4s D5s F5s D5s A4s B3s A4s A3s E4s A4s C5s A4s E4s A3s E4s",B);
		
		measure(37);
		
		addNotes("C7s C6s D6s F6s B6s B5s D6s F6s B6s B5s C6s F6s A6s A5s C6s F6s",T);
		addNotes("B3s F4s B4s D5s B4s F4s B3s F4s F3s C4s F4s A4s F4s C4s F3s C4s",B);
		
		measure(38);
		
		addNotes("A6s A5s B5s D6s G6s G5s B5s D6s G6s G5s A5s D6s F6s F5s A5s D6s",T);
		addNotes("G3s D4s G4s B4s G4s D4s G3s D4s D3s A3s D4s F4s D4s A3s D3s A3s",B);
		
		measure(39);
		
		addNotes("F6s F5s G5s B5s E6s E5s G6s G5s A6s A5s C6s E6s B5i+B6i C6i+C7i",T);
		addNotes("G3s D4s G4s B4s G4s D4s G3s D4s A3s E4s A4s C5s A4s E4s A3s E4s",B);
		
		measure(40);
		
		addNotes("D6q+F6q+A6q+D7q F5q+A5q+D6q C5i.+E5i.+A5i.+C6i. E6s+C7s A6s E6s C6s E6s",T);
		addNotes("D4s A4s D5s F5s D5s A4s D4s A4s A3s E4s A4s C5s A4s E4s A3s E4s",B);
		
		measure(41);
		
		addNotes("B5q+D6q+F6q+B6q D5q+F5q+B5q A4i.+C5i.+F5i.+A5i. C6s+A6s F6s C6s A5s C6s",T);
		addNotes("B3s F4s B4s D5s B4s F4s B3s F4s F3s C4s F4s A4s F4s C4s F3s C4s",B);
		
		measure(42);
		
		addNotes("G5q+B5q+D6q+G6q E4q+G4q+D5q+G5q F4q+A4q+D5q+F5q F5q+A5q+D6q+F6q",T);
		addNotes("G3s D4s G4s B4s G4s D4s G3s D4s D3s A3s D4s F4s D4s A3s D3s A3s",B);
		
		measure(43);
		
		addNotes("E4q+G4q+D5q+G5q B5q+D6q+G6q+B6q C5i+E5i+A5i+C6i E5i+A5i+C6i+E6i A5i+C6i+E6i+A6i C6i+E6i+A6i+C7i",T);
		addNotes("G3s D4s G4s B4s G4s D4s G3s D4s A3s E4s A4s C5s A4s E4s A3s D4s",B);
		
		measure(44);
		
		addNotes("F6h+D7h+F7h D5i F5i A5i",T);
		addNotes("D3i A3i D4i F4i A4i",B);
		addRest("i",B);
		addRest("q",B);
		
		measure(45);
		
		addNotes("D6w",T);
		addRest("w",B);
		
		measure(46);
		
		
		
		
		
	}

}

