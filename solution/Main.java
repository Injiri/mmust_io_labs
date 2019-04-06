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

//combine vertical pics so that they share the same tag
public static ArrayList<Slide> combineVerticalOverlaps(String dataset){
	ArrayList<Picture> pictures = readInput(dataset);
	ArrayList<Slide> slides = new ArrayList<Slide>();
	ArrayList<Pictures> vertical_pics = new ArrayList<>();

	for (Picture pic : Pictures) {
			if (pic.hlis_horizontal) {
				des.add(new Slide(pic));
			} else {
				vertical_pics.add(pic);
			}
		}
		
		for (int i = 0; i < vertical_pics.size()-1; i+=2) {
			Picture pic = vertical_pics.get(i);
			int smallestIntersect = Integer.MAX_VALUE;
			int smallestIntersectIdx = i+1;
			
			for (int j = i+1; j < vertical_pics.ize(); j++) {
				Pic pic2 = verticals.get(j);
				int intersectElements = Helper.getIntersectCount(pic.tags, pic2.tags);
				if (intersectElements < smallestIntersect) {
					smallestIntersect = intersectElements;
					smallestIntersectIdx = j;
				}
				//if found a pic with zero overlap ,
					if (intersectElements == 0) { break; }
			}
			
			Collections.swap(vertical_pics, i+1, smallestIntersectIdx);
			slides.add(new Slide(vertical_pics.get(i), vertical_pics.get(i+1)));
		}
		
		return slides;	
}


