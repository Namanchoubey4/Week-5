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