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