package mor.edu.module2.builder;

import mor.edu.module2.inheritance.Person;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class Student
 * @since 22.03.2021 - 07.34
 **/
public class Student2 extends Person2 {

    //child fields

    private String university;
    private int course;
    private String group;
    private String chair;
    private String department;
    private String fieldOfStudy;
    private boolean isFullTime;
    private String educationalProgram;
    private String levelOfEnglish;
    private String socialNetworks;

    //child constructors

    public Student2() {
    }

    public Student2(String university, int course, String group, String chair, String department, String fieldOfStudy, boolean isfullTime, String educationalProgram, String levelOfEnglish, String socialNetworks) {
        this.university = university;
        this.course = course;
        this.group = group;
        this.chair = chair;
        this.department = department;
        this.fieldOfStudy = fieldOfStudy;
        this.isFullTime = isfullTime;
        this.educationalProgram = educationalProgram;
        this.levelOfEnglish = levelOfEnglish;
        this.socialNetworks = socialNetworks;
    }

    public Student2(String firstName, String lastName, String patronynicName, String address, String passportID, String identificationСode, LocalDate dateOfBirth, double height, double wight, String profession, String maritalStatus, boolean ishavingСhildren, String phoneNumber, String email, String hobby, String university, int course, String group, String chair, String department, String fieldOfStudy, boolean isfullTime, String educationalProgram, String levelOfEnglish, String socialNetworks) {
        super(firstName, lastName, patronynicName, address, passportID, identificationСode, dateOfBirth, height, wight, profession, maritalStatus, ishavingСhildren, phoneNumber, email, hobby);
        this.university = university;
        this.course = course;
        this.group = group;
        this.chair = chair;
        this.department = department;
        this.fieldOfStudy = fieldOfStudy;
        this.isFullTime = isfullTime;
        this.educationalProgram = educationalProgram;
        this.levelOfEnglish = levelOfEnglish;
        this.socialNetworks = socialNetworks;
    }

    //child getter and setter

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public boolean isIsfullTime() {
        return isFullTime;
    }

    public void setIsfullTime(boolean isfullTime) {
        this.isFullTime = isfullTime;
    }

    public String getEducationalProgram() {
        return educationalProgram;
    }

    public void setEducationalProgram(String educationalProgram) {
        this.educationalProgram = educationalProgram;
    }

    public String getLevelOfEnglish() {
        return levelOfEnglish;
    }

    public void setLevelOfEnglish(String levelOfEnglish) {
        this.levelOfEnglish = levelOfEnglish;
    }

    public String getSocialNetworks() {
        return socialNetworks;
    }

    public void setSocialNetworks(String socialNetworks) {
        this.socialNetworks = socialNetworks;
    }

    //// Override toString () method


    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "university='" + university + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", chair='" + chair + '\'' +
                ", department='" + department + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", isfullTime=" + isFullTime +
                ", educationalProgram='" + educationalProgram + '\'' +
                ", levelOfEnglish='" + levelOfEnglish + '\'' +
                ", socialNetworks='" + socialNetworks + '\'' +
                '}';
    }

    public void toConsole() {
        System.out.println(super.toString());
        System.out.println(this.toString());

    }

    //Override hash() and equals() methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student2 student = (Student2) o;
        return getCourse() == student.getCourse() && isIsfullTime() == student.isIsfullTime() && Objects.equals(getUniversity(), student.getUniversity()) && Objects.equals(getGroup(), student.getGroup()) && Objects.equals(getChair(), student.getChair()) && Objects.equals(getDepartment(), student.getDepartment()) && Objects.equals(getFieldOfStudy(), student.getFieldOfStudy()) && Objects.equals(getEducationalProgram(), student.getEducationalProgram()) && Objects.equals(getLevelOfEnglish(), student.getLevelOfEnglish()) && Objects.equals(getSocialNetworks(), student.getSocialNetworks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUniversity(), getCourse(), getGroup(), getChair(), getDepartment(), getFieldOfStudy(), isIsfullTime(), getEducationalProgram(), getLevelOfEnglish(), getSocialNetworks());
    }

    //Create a builder for the class Student

    public static class Builder {
        private Student2 studentToBuild;

        public Builder() {
            this.studentToBuild = new Student2();
        }

        public Builder setSimilarTo(Student2 student){
            this.studentToBuild.university= student.university;

            this.studentToBuild.course = student.course;

            this.studentToBuild.group = student.group;

            this.studentToBuild.chair = student.chair;

            this.studentToBuild.department = student.department;

            this.studentToBuild.fieldOfStudy = student.fieldOfStudy;

            this.studentToBuild.isFullTime = student.isFullTime;

            this.studentToBuild.educationalProgram = student.educationalProgram;

            this.studentToBuild.levelOfEnglish = student.levelOfEnglish;

            this.studentToBuild.socialNetworks = student.socialNetworks;

            return this;
        }

        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }
        public Builder setLastName(String lastName){
            studentToBuild.setLastName(lastName);
            return this;
        }
        public Builder setPatronynicName(String patronynicName){
            studentToBuild.setPatronynicName(patronynicName);
            return this;
        }
        public Builder setAddress(String address){
            studentToBuild.setAddress(address);
            return this;
        }
        public Builder setPassportID(String passportID){
            studentToBuild.setPassportID(passportID);
            return this;
        }
        public Builder setIdentificationСode(String identificationСode){
            studentToBuild.setIdentificationСode(identificationСode);
            return this;

        }  public Builder setDateOfBirth(LocalDate dateOfBirth){
            studentToBuild.setDateOfBirth(dateOfBirth);
            return this;
        }
        public Builder setHeight(double height){
            studentToBuild.setHeight(height);
            return this;
        }
        public Builder setWight(double wight){
            studentToBuild.setWight(wight);
            return this;
        }
        public Builder setProfession(String profession){
            studentToBuild.setProfession(profession);
            return this;
        }
        public Builder setMaritalStatus(String maritalStatus){
            studentToBuild.setMaritalStatus(maritalStatus);
            return this;
        }
        public Builder setIshavingСhildren(boolean ishavingСhildren){
            studentToBuild.setIshavingСhildren(ishavingСhildren);
            return this;
        }
        public Builder setPhoneNumber(String phoneNumber){
            studentToBuild.setPhoneNumber(phoneNumber);
            return this;
        }
        public Builder setEmail(String email){
            studentToBuild.setEmail(email);
            return this;
        }
        public Builder setHobby(String hobby){
            studentToBuild.setHobby(hobby);
            return this;
        }
        public Builder setUniversity(String university){
            studentToBuild.setUniversity(university);
            return this;
        }
        public Builder setCourse(int course){
            studentToBuild.setCourse(course);
            return this;
        }
        public Builder setGroup(String group){
            studentToBuild.setGroup(group);
            return this;
        }
        public Builder setChair(String chair){
            studentToBuild.setChair(chair);
            return this;
        }
        public Builder setDepartment(String department){
            studentToBuild.setDepartment(department);
            return this;
        }
        public Builder setFieldOfStudy(String fieldOfStudy){
            studentToBuild.setFieldOfStudy(fieldOfStudy);
            return this;
        }
        public Builder setIsfullTime(boolean isfullTime){
            studentToBuild.setIsfullTime (isfullTime);
            return this;
        }
        public Builder setEducationalProgram(String educationalProgram){
            studentToBuild.setEducationalProgram(educationalProgram);
            return this;
        }
        public Builder setLevelOfEnglish(String levelOfEnglish){
            studentToBuild.setLevelOfEnglish(levelOfEnglish);
            return this;
        }
        public Builder setSocialNetworks(String socialNetworks){
            studentToBuild.setSocialNetworks(socialNetworks);
            return this;
        }

        public Student2 build(){
            return studentToBuild;
        }
    }
}
