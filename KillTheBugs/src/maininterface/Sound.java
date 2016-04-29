/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maininterface;

import sun.audio.*;
import java.io.*;

public class Sound
{
		AudioPlayer mgp = AudioPlayer.player;
		AudioStream bgm;
		AudioData md;
		ContinuousAudioDataStream loop;
		String filename;

		Sound(String filename) throws FileNotFoundException, IOException
		{
				this.filename = filename;
				bgm = new AudioStream(new FileInputStream(filename));
				md =bgm.getData();
				loop = new ContinuousAudioDataStream(md);	
				mgp.start(loop);
				
		}
		
	
		public void stopmusic()
		{
			mgp.stop();
		}
}
