package mor.edu.module2.inheritance;

import java.util.Objects;

/**
 * @author Antonina Moroz
 * @version 1.0.0
 * @project vsem
 * @class Student
 * @since 22.03.2021 - 07.34
 **/
public class Student extends Person {

    //child fields

    private String university;
    private String group;
    private String chair;
    private String department;
    private String course;
    private String fieldOfStudy;
    private boolean FullTime;
    private String specialty;
    private String englishSkills;
    private String socialNetworks;

    //child constructors

    public Student(String university, String group, String chair, String department, String course, String fieldOfStudy,
                   boolean fullTime, String specialty, String englishSkills, String socialNetworks) {
        this.university = university;
        this.group = group;
        this.chair = chair;
        this.department = department;
        this.course = course;
        this.fieldOfStudy = fieldOfStudy;
        FullTime = fullTime;
        this.specialty = specialty;
        this.englishSkills = englishSkills;
        this.socialNetworks = socialNetworks;
    }

    public Student(String firstName, String lastName, String patronynicName, String address, String passportID, String nationality,
                   int age, double height, double wight, String profession, boolean ismarried, boolean ishavingСhildren, String phoneNumber,
                   String email, String hobby, String university, String group, String chair, String department, String course, String fieldOfStudy,
                   boolean fullTime, String specialty, String englishSkills, String socialNetworks) {
        super(firstName, lastName, patronynicName, address, passportID, nationality, age, height, wight, profession, ismarried, ishavingСhildren, phoneNumber, email, hobby);
        this.university = university;
        this.group = group;
        this.chair = chair;
        this.department = department;
        this.course = course;
        this.fieldOfStudy = fieldOfStudy;
        FullTime = fullTime;
        this.specialty = specialty;
        this.englishSkills = englishSkills;
        this.socialNetworks = socialNetworks;
    }

    //child getter and setter

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public boolean isFullTime() {
        return FullTime;
    }

    public void setFullTime(boolean fullTime) {
        FullTime = fullTime;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getEnglishSkills() {
        return englishSkills;
    }

    public void setEnglishSkills(String englishSkills) {
        this.englishSkills = englishSkills;
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
                super.toString() + '\'' +
                "university='" + university + '\'' +
                ", group='" + group + '\'' +
                ", chair='" + chair + '\'' +
                ", department='" + department + '\'' +
                ", course='" + course + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", FullTime=" + FullTime +
                ", specialty='" + specialty + '\'' +
                ", englishSkills='" + englishSkills + '\'' +
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
        Student student = (Student) o;
        return isFullTime() == student.isFullTime() && Objects.equals(getUniversity(), student.getUniversity()) && Objects.equals(getGroup(),
                student.getGroup()) && Objects.equals(getChair(), student.getChair()) && Objects.equals(getDepartment(),
                student.getDepartment()) && Objects.equals(getCourse(), student.getCourse()) && Objects.equals(getFieldOfStudy(),
                student.getFieldOfStudy()) && Objects.equals(getSpecialty(), student.getSpecialty()) && Objects.equals(getEnglishSkills(),
                student.getEnglishSkills()) && Objects.equals(getSocialNetworks(), student.getSocialNetworks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUniversity(), getGroup(), getChair(), getDepartment(), getCourse(), getFieldOfStudy(), isFullTime(), getSpecialty(), getEnglishSkills(), getSocialNetworks());
    }
}
