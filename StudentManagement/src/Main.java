

public class Main{
    public static void main(String[] args){
        StudentRecord student = new StudentRecord();


        student.addLast("RA2111003011288", "Naman Coubey" , 22 , "A+");
        student.addLast("RA2111003011388", "Rupesh Sahoo" , 20 , "O");
        student.addBeginning("RA2111003011488", "Rahul Sharma" , 23 , "B+");
        student.insertAtPosition("RA2111003011267","Ananya Pandey",21,"A", 1);

        student.display();
    }
}