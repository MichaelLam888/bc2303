package week1;

public class Switch {
    public static void main(String[] args) {

        //int numericGrade = 90;
        //char letterGrade = ' ';
        String student = "Michael";

        switch(student){
            case "Tom" : {
                System.out.println("Tom");
                break;
            }
            case "Mary" : {
                System.out.println("Mary");
                break;
            }
            case "Michael" : {
                System.out.println("Michael");
                break;
            }
            case "Ben" : {
                System.out.println("Ben");
                break;
            }
            default : {
                System.out.println("Nobody");
                break;
            }
        }
        



    }
}
