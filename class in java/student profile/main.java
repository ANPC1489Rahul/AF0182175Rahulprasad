public class main{

      public static void main(String[] args) {
        String firstname;
        String lastname;
        String declaredMajor;
        String gpa;
        int expectedYearToGraduate;
        studentprofile profileone=new studentprofile(firstname:"Wheel", lastname:"Salmon", declaredMajor:"Computer Science", gpa:"3.75", expectedYearToGraduate:2021);
        studentprofile profiletwo=new studentprofile(firstname:"MAX", lastname:"Major", declaredMajor:"Flim", gpa:"3.85", expectedYearToGraduate:2022);

        profiletwo.incrementExpectedGraduationYear();
        System.out.println(" profiletwo.incrementExpectedGraduationYear");

    }    
}


output:
2022
