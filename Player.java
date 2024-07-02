package MonkePlayer;

import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Player
{
	public void playmusic(String a, String b,String c, String d, String e)
	{
		try
		{
			Scanner input = new Scanner(System.in);
			
			File musicpath = new File(a);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicpath);
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			
			File musicpath1 = new File(b);
			AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(musicpath1);
			Clip clip1 = AudioSystem.getClip();
			clip1.open(audioStream1);
			
			File musicpath2 = new File(c);
			AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(musicpath2);
			Clip clip2 = AudioSystem.getClip();
			clip2.open(audioStream2);
			
			File musicpath3 = new File(d);
			AudioInputStream audioStream3 = AudioSystem.getAudioInputStream(musicpath3);
			Clip clip3 = AudioSystem.getClip();
			clip3.open(audioStream3);
			
			File musicpath4 = new File(e);
			AudioInputStream audioStream4 = AudioSystem.getAudioInputStream(musicpath4);
			Clip clip4 = AudioSystem.getClip();
			clip4.open(audioStream4);
			
			String response = "";
			
			while(!response.equals("Q"))
			{
				System.out.println();
				System.out.println("***WELCOME TO MONKE PLAYER***\n\nP1 = Play Song 1\nP2 = Play Song 2\nP3 = Play Song 3\nP4 = Play Song 4\nP5 = Play Song 5\nPP = Pause Song\nS = Stop Song\nR = Reset\nQ = Quit");
				System.out.println("\nEnter your choice: ");
				
				response = input.next();
				response = response.toUpperCase();
				
				switch(response)
				{
				case("P1"):
					System.out.println("\nPlaying *Ami parina ar parina*");
					clip.start();
					clip1.stop();
					clip1.setMicrosecondPosition(0);
					clip2.stop();
					clip2.setMicrosecondPosition(0);
					clip3.stop();
					clip3.setMicrosecondPosition(0);
					clip4.stop();
					clip4.setMicrosecondPosition(0);
				break;
				
				case("P2"):
					System.out.println("\nPlaying *Tokyo Ghoul - Licht und Schatten - Yutaka Yamada*\n");
		    		clip.stop();
		    		clip.setMicrosecondPosition(0);
		    		clip1.start();
		    		clip2.stop();
		    		clip2.setMicrosecondPosition(0);
		    		clip3.stop();
		    		clip3.setMicrosecondPosition(0);
		    		clip4.stop();
		    		clip4.setMicrosecondPosition(0);
		    	break;
		    	
		    	case("P3"):
			    	System.out.println("\nPlaying *Uchiha Itachi - On my own*\n");
			    	clip.stop();
			    	clip.setMicrosecondPosition(0);
			    	clip1.stop();
			    	clip1.setMicrosecondPosition(0);
			    	clip2.start();
			    	clip3.stop();
			    	clip3.setMicrosecondPosition(0);
			    	clip4.stop();
			    	clip4.setMicrosecondPosition(0);
			    break;
			    
		    	case("P4"):
			    	System.out.println("\nPlaying *Hashte dekho Gaite dekho*\n");
			    	clip.stop();
			    	clip.setMicrosecondPosition(0);
			    	clip1.stop();
			    	clip1.setMicrosecondPosition(0);
			    	clip2.stop();
			    	clip2.setMicrosecondPosition(0);
			    	clip3.start();
			    	clip4.stop();
			    	clip4.setMicrosecondPosition(0);
			    break;
			    
		    	case("P5"):
			    	System.out.println("\nPlaying *Tarai Tarai*\n");
			    	clip.stop();
			    	clip.setMicrosecondPosition(0);
			    	clip1.stop();
			    	clip1.setMicrosecondPosition(0);
			    	clip2.stop();
			    	clip2.setMicrosecondPosition(0);
			    	clip3.stop();
			    	clip3.setMicrosecondPosition(0);
			    	clip4.start();
			    break;
			    
		    	case ("PP"):
			    	System.out.println("\nSong Paused\n");
			    	long clipTimePosition = clip.getMicrosecondPosition();
			    	clip.stop();
			    	long clipTimePosition1 = clip1.getMicrosecondPosition();
			    	clip1.stop();
			    	long clipTimePosition2 = clip2.getMicrosecondPosition();
			    	clip2.stop();
			    	long clipTimePosition3 = clip3.getMicrosecondPosition();
			    	clip3.stop();
			    	long clipTimePosition4 = clip4.getMicrosecondPosition();
			    	clip4.stop();
			    break;
			    
		    	case ("S"):
			    	System.out.println("\nSong Stopped\n");
			    	clip.stop();
			    	clip.setMicrosecondPosition(0);
			    	clip1.stop();
			    	clip1.setMicrosecondPosition(0);
			    	clip2.stop();
			    	clip2.setMicrosecondPosition(0);
			    	clip3.stop();
			    	clip3.setMicrosecondPosition(0);
			    	clip4.stop();
			    	clip4.setMicrosecondPosition(0);
			    break;
			    
		    	case ("R"):
			    	System.out.println("\nPlayer reseted\n");
			    	clip.setMicrosecondPosition(0);
			    	clip1.setMicrosecondPosition(0);
			    	clip2.setMicrosecondPosition(0);
			    	clip3.setMicrosecondPosition(0);
			    	clip4.setMicrosecondPosition(0);
			    break;
			    
		    	case ("Q"):
			    	System.out.println("\nPlayer Stopped\n");
			    	clip.close();
			    	clip1.close();
			    	clip2.close();
			    	clip3.close();
			    	clip4.close();
			    break;
			    
			    default:
			    	System.out.println("Not a valid option");
				}
			}
			System.out.println("\n**GG MONKE**");
		}
		catch(Exception p)
		{
			System.out.println(p);
		}
	}
}
