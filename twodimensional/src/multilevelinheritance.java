class College {
    void colleage(String collname,int afflicate){
        System.out.println("the college name is:"+collname+"   "+"the affilication number is"+" "+afflicate);
    }

    }
    class Student extends College {
        void student(String name, long rollno) {
            System.out.println("the student name is:" + name + " " + "the roll no of student is" +" "+ rollno);

        }
    }
    class Exam extends Student{
        void exam(String examcentre,int papercode){
            System.out.println("the exam center address is:"+examcentre+" "+"the code of paper is"+" "+papercode);

        }
        public static void main(String[] args) {
            Exam e1=new Exam();
            e1.colleage("RCET",3050);
            e1.student("Yathesth",30130222);
            e1.exam("bhilai",20);
        }
    }




