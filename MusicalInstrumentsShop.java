class MusicalInstrumentsShop{

public static void main(String a[]){

String musicalInstruments[]={"Guitar","Flute","Harp","Cello","Drums","Saxophone","Piano","Accordion","Clarinet","Trombone","Trumpet","Violin","Oboe","Sitar","Xylophone","Harmonica","Mandolin","Organ",""};
System.out.println("Toy Names:");
// System.out.println(musicalInstruments[0]+" || "+musicalInstruments[1]+" || "+musicalInstruments[2]+" || "+musicalInstruments[3]+" || "+musicalInstruments[4]+" || "+musicalInstruments[5]+" || "+musicalInstruments[6]+" || "+musicalInstruments[7]+" || "+musicalInstruments[8]+
// " || \n"+musicalInstruments[10]+" || "+musicalInstruments[11]+" || "+musicalInstruments[12]+" || "+musicalInstruments[13]+" || "+musicalInstruments[14]+" || "+musicalInstruments[15]+" || "+musicalInstruments[16]+" || "+musicalInstruments[17]);
for(int song=0;song<musicalInstruments.length;song++){
	String ref = musicalInstruments[song];
	System.out.println(ref);
}
}

}