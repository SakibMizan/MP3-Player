package MonkePlayer;

public class Songs
{
	public static void main(String[] args)
	{
		try
		{
			String file1 = "E:/wav/amk.wav";
			String file2 = "E:/wav/TG.wav";
			String file3 = "E:/wav/Uchiha Itachi - On My Own.wav";
			String file4 = "E:/wav/Haste Dekho Gaite Dekho.wav";
			String file5 = "E:/wav/Tarai Tarai.wav";
			
			Player music = new Player();
			music.playmusic(file1, file2, file3, file4, file5);
		}
		catch(Exception s)
		{
			System.out.println(s);
		}
	}
}
