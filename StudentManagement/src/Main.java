class StudentNode{
    String rollNumber;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(String rollNumber,String name,int age,String grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;

    }
}
class StudentRecord{
    StudentNode head;

    public void addLast(String rollNumber,String name,int age , String grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);

        if (head == null) {
            head = newNode;
        } else {
            StudentNode current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;

        }
    }
    public void addBeginning(String rollNumber, String name , int age , String grade){
        StudentNode newNode = new StudentNode(rollNumber,name,age,grade);

        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAtPosition(String rollNumber,String name , int age , String grade,int position){
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);

        if(position == 0){
            newNode.next = head;
            head = newNode;
        }
        StudentNode current = head;
        int count = 0;

        while(current != null && count<position-1){
            current = current.next;
            count++;
        }
        if(current == null){
            System.out.println("Position out of bound.");
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void display(){
        StudentNode current = head;

        if(head == null){
            System.out.println("NO Student Found");
        }
        System.out.println("Student's Record :-");

        while(current != null) {
            System.out.println("RollNumber : " + current.rollNumber + " Name : " + current.name + " Age : " + current.age + " Grade : " + current.grade+ "->");
            current = current.next;
        }
        System.out.println("Null");
    }
}
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