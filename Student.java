public class Student{

private String id;
private String name;
private Contact contactInfo;
private double[] marks = new double[3];
private double GPA;

public Student (String ID, String Name, Contact conInfo, double[] Marks, double gpa){
if(ID.length()>3){
System.out.println("The id " + ID + " length is more than 3, the extra characters must be skipped!");
id = ID.substring(0,3);
}
else
id = ID;
boolean hasNonDigit = false;
for(int i =0 ; i<3; i++){
if(!Character.isDigit(id.charAt(i))){
id = id.replace(id.charAt(i), '0');
hasNonDigit = true;
}
}
if(hasNonDigit)
System.out.println("The id "+ ID.substring(0,2) +" contains non-digit characters, the non-digits must be replaced!");

name = Name; 
contactInfo = conInfo;
marks = Marks;
GPA = gpa;
}

public double getFinal(){

return marks[2];

}

public Contact getContactInfo(){
return contactInfo;
}

public void updateMark(double newMark, int index){

if(index == 0 || index == 1)
if(newMark<=30)
marks[index] = newMark;
else
System.out.println("The new value for the Mid is more than 30, so cannot update!");
else if(index == 2)
if(newMark<=40)
marks[index] = newMark;
else
System.out.println("The new value for the Final is more than 40, so cannot update!");

}

public void printStudent(){

System.out.printf("id:%-9s name:%6s GPA:%6.2f%n", id, name, GPA );
System.out.printf("email: %s mobile: %s%n", contactInfo.getEmail(), contactInfo.getMobile());
System.out.printf("mid1= %.1f mid2= %.1f mid3=%.1f%n", marks[0], marks[1], marks[2]);
System.out.println("--------------------------------");
}
}