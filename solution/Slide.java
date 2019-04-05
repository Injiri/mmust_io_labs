import java.util.ArrayList;
import java.util.HashSet;

public class Slide {
	public HashSet<String> tags = new HashSet<>();
	public ArrayList(Picture) pictures = new ArrayList<>();
	int id;
	boolean is_used = false;



public Slide (Picture pic1 , Picture pic2){
	tags.addAll(pic1.pic_tags);
	tags.addAll(pic2.pic_tags);
	pictures.add(pic1);
	pictures.add(pic2)
}	
//one paraeter constructor
public Slide(Picture pic){
	this.tags = pic.pic_tag;
	this.pics.add(pic);
	}

//slide Value to output to a file
publlic String output_string(){
	String result = " ";
	for (Picture pic : pictures)
		result += pic.id + " ";
	return result;
}

}

