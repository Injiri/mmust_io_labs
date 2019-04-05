import java.io.*;
import java.util.*;

public class Main {
public static ArrayList<Picture> readDataset(string datasetFile){
	File inputFile = new File( "./inputs/"+ datasetFile +".txt");
       ArrayList<Picture> readResult = new ArrayList<>();
	
	try{
		Scanner in  = new Scanner(inputFile);
		int numberOfPictures = in.nextInt();
		
		for (for int i=0; i<numberOfPictures; i++)
		{
		boolean is_horizontal = in.next().equals("H");

		int numberOfTags = in.nextInt();
		Hashset<String> tags = new HashSet<>();
		for (int j =0; j<numberOfTags; j++){
			pic_tags.add(in.next());
		}
		readResult.add(new Picture(i, pic_tags ,is_horizontal));
		
		}
		in.close;


	
	} catch(IOException e){
		e.printStackTrace();
			
		}
	return readResult;
}

public static void writeOutputToFile(String inputFile,  ArrayList<Slides slides>)
{
String fileName = "./outputs" + inputFile".txt";

try{
	File outputFile = new File(fileName);
	FileWritter output = new FileWritter(outputFile);
	BufferdWriter brd = new BufferdWriter(output);
	brd.write(Integer.toString(slides.size()));
	for (Slide slide : slides){
		brd.newLine();
		bw.write(slide.outputString)
	}
	brd.close();
	out.close();
	} catch(IOException e)
	{
	e.printStackTrace();
	}

}


}
