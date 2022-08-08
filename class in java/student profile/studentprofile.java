public class studentprofile {
    String firstname;
    String lastname;
    String declaredMajor;
    double gpa;
    int expectedYearToGraduate;

    public studentprofile( String firstname,String lastname,String declaredMajor,double gpa,int expectedYearToGraduate){
        this.firstname=firstname;
        this.lastname=lastname;
        this.declaredMajor=declaredMajor;
        this.gpa=gpa;
        this.expectedYearToGraduate=expectedYearToGraduate;

    }

    public void incrementExpectedGraduationYear(){
        this.expectedYearToGraduate=this.expectedYearToGraduate +1;

    }

}
