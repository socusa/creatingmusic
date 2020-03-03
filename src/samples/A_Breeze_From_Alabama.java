package samples;

import songs.Song;

import static music.CreatingMusic.*;
import static music.Util.*;

public class A_Breeze_From_Alabama extends Song {

	@Override
	public void measures() {
		// TODO Auto-generated method stub
		
		setTempo(90);
		
		measure(0);
		
		addNotes("C5i+G5i",T);
		addNote("C5i",A,B);
		
		measure(1);
		
		addNotes("D5i+C6i A5s G#5s A5s B5s",T);
		addNotes("F#4i+A4i+C5i A4s G#4s A4s B4s",B);
		
		measure(2);
		
		tie(D,T,"E5i","E5s");
		tie(A,T,"C6i","C6s");
		addNotes("G5s E5s D#5s E5s F5s",T);
		tie(D,B,"Gn4i","Gn4s");
		tie(A,B,"C5i","C5s");
		addNotes("G4s E4s D#4s E4s F4s",B);
		
		measure(3);
		
		tie(A,T,"G5i","G5s");
		addNotes("F5s D5s C#5s E5s D5s B4s A4s",T);
		tie(A,B,"G4i","G4s");
		addNotes("F4s D4s C#4s E4s D4s B3s A3s",B);
		
		measure(4);
		
		addNote("G4i",A,T);
		addRest("i",T);
		addNotes("G5i+B5i+D6i+G6i G5i",T);
	    addNote("G3i",A,B);
	    addRest("i",B);
	    addNotes("G2i+G3i",B);
	    addRest("i",B);
	    
	    measure(5);
	    
	    addNotes("G5s+E6s F#5s+D#6s G5s+E6s",T);
	    tie(D,T,"E5s","E5s");
	    tie(A,T,"C6s","C6s");
	    addNotes("E5s F5s F#5s",T);
	    addNotes("C4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
	    
	    measure(6);
	    
	    addNotes("G5s C6s E6s",T);
	    tie(D,T,"G5s","G5s");
	    tie(D,T,"E6s","E6s");
	    tie(A,T,"G6s","G6s");
	    addNotes("F#5s+D#6s+F#6s G5i+E6i+G6i",T);
	    addNotes("C4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
	    
	    measure(7);
	    
	    addNotes("G5s+E6s F#5s+D#6s G5s+E6s",T);
	    tie(D,T,"F5s","F5s");
	    tie(A,T,"C6s","C6s");
	    addNotes("G5s F5s F#5s",T);
	    addNotes("C4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
	    
	    measure(8);
	    
	    addNotes("G5s C6s E6s",T);
	    tie(D,T,"G5s","G5s");
	    tie(D,T,"E6s","E6s");
	    tie(A,T,"G6s","G6s");
	    addNotes("F#5s+D#6s+F#6s G5s+E6i+G6i",T);
	    addNotes("C4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
	    
	    measure(9);
	    
	    addNotes("G5s+G6s G#5s+F#6s+G6s A5s+F6s+A6s",T);
	    tie(D,T,"B5s","B5s");
	    tie(D,T,"F6s","F6s");
	    tie(A,T,"B6s","B6s");
	    addNotes("G5s+F6s+G6s A5s+F6s+A6s B5s+F6s+B6s",T);
	    addNotes("D4i G4i+B4i+F5i G3i G4i+B4i+F5i",B);

	    measure(10);
	    
	    addNotes("C6s+E6s+C7s B5s+E6s+B6s C6s+E6s+C7s",T);
	    tie(D,T,"E6s","E6s");
	    tie(D,T,"G6s","G6s");
	    tie(A,T,"E6s","E6s");
	    addNotes("D#6s+D#7s E6i+E7i",T);
	    addNotes("C4i G4i+C5i+E5i C#4i A#4i+G5i",B);
	    
	    measure(11);
	    
	    addNotes("E7s D7s C#7s",T);
	    tie(A,T,"D7s","D7s");
	    addNotes("E6s+C7s D6s+B6s C6s+A6s",T);
	    addNotes("D4i B4i+D5i+G5i D4i C5i+D5i+F#5i",B);
	    
        measure(12);
        
        tie(D,T,"B5q","B5s");
        tie(A,T,"G6q","G6i");
        addNotes("G5i+B5i+D6i+F6i",T);
        tie(D,T,T,"D5q","D5i");
        tie(A,T,T,"G5q","G5i");
        addRest("i",T,T);
        addNotes("G4i Fn4s",B);
        tie(A,B,"D4s","D4s");
        addNotes("B4s G3i",B);
        
        measure(13);
        
        addNotes("G5s+C6s+E6s F#6s+D#6s G5s+E6s",T);
        tie(D,T,"E5s","E5s");
        tie(A,T,"C6s","C6s");
        addNotes("E5s Fn5s F#5s",T);
        addNotes("C4i G4i+E5i+G5i G3i G4i+E5i+G5i",B);
        
        measure(14);
        
        addNotes("G5s C6s E6s",T);
        tie(D,T,"G5s","G5s");
        tie(D,T,"E6s","E6s");
        tie(A,T,"G6s","G6s");
        addNotes("F#5s+D#6s+F#6s G5i+E6i+G6i",T);
        addNotes("C4i G4i+C5i+E5i G3i G4i+C5i+E5i",B);
        
        measure(15);
        
        addNotes("G5s+E6s F#5s+D#6s G5s+E6s",T);
        tie(A,T,"G5s","G5s");
        addNotes("Bb5s A5s G#5s",T);
        addNotes("C4i G4i+C5i+E5i C#4i G4i+A4i+E5i",B);
        
        measure(16);
        
        addNotes("A5s D6s F6s",T);
        tie(D,T,"A5s","A5s");
        tie(D,T,"F6s","F6s");
        tie(A,T,"A6s","A6s");
        addNotes("F6s D6s A5s",T);
        addNotes("D4i F4i+A4i+D5i F4i A4i+D5i",B);
        
        measure(17);
        
        

	}

}
