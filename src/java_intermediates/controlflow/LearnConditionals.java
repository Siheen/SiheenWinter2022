package java_intermediates.controlflow;

public class LearnConditionals {


    public static void main(String[] args) {

        LearnConditionals month= new LearnConditionals();
        int monthNum= 34;

        System.out.println(month.getNameOfMonth(monthNum));


    }
//       int x = 100;
//        int y = 20;
//
//        LearnConditionals sub= new LearnConditionals();
//        System.out.println(sub.doSubtraction(x,y));

//        int studentExam1=87;
//        int studentExam2=64;
//        int studentExam3=96;
//        int studentExam4=42;
//        int studentExam5=78;
//
//
//        LearnConditionals student= new LearnConditionals();
//        System.out.println(student.getLetterGrade(studentExam1));
//        System.out.println(student.getLetterGrade(studentExam2));
//        System.out.println(student.getLetterGrade(studentExam3));
//        System.out.println(student.getLetterGrade(studentExam4));
//        System.out.println(student.getLetterGrade(studentExam5));
//
//    }
//    //If STATEMENT
//    // I don;t want this method to return any negative integer
//    // RETURNING 0 IS ALLOWED
//    public int doSubtraction(int num1, int num2){
//        int difference;
//
//        if (num1>=num2) {
//        difference= num1-num2;
//            return difference;
//
//        }
//         difference= num2-num1;
//        return difference;
//    }
//    /*
//      IF-ELSE IF -ELSE STATEMENT
//        Used when multiple conditions
//     */
//
//    public String getLetterGrade(int grade){
//        String letterGrade=" ";
//
//        if(grade< 65){
//            letterGrade="F";
//        }else if (grade < 75){
//            letterGrade="D";
//        }else if (grade < 80){
//            letterGrade="C";
//        }else if( grade< 90){
//            letterGrade="B";
//        } else {
//            letterGrade="A";
//        }
//        return letterGrade;
//    }

        /*
        SWITCH: Case statement
        Write a method that accepts a number of a month, and returns the name of the month. If the past argument does not
        fall within the range of month(1-12), then return "ERROR"

 */

        public String getNameOfMonth(int monthNum) {
            String month= " ";

//            if (monthNum < 1  || monthNum> 12) {
//                return "ERROR";
//            }
// Now we know the argument falls within the valid/allowed range (1-12)

            switch (monthNum){
                case 1:
                    month= "January";
                    break;
                case 2:
                    month= "February";
                    break;
                case 3:
                    month= "March";
                    break;
                case 4:
                    month= "April";
                    break;
                case 5:
                    month= "May";
                    break;
                case 6:
                    month= "June";
                    break;
                case 7:
                    month= "July";
                    break;
                case 8:
                    month= "August";
                    break;
                case 9:
                    month= "September";
                    break;
                case 10:
                    month= "October";
                    break;
                case 11:
                    month= "November";
                    break;
                case 12:
                    month="December";
                    break;
                default:
                    return "ERROR";

             }

                return month;

        }




    }






