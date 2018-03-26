package com.example.android.buss_app;

/**
 * Created by sam on 19/06/2017.
 */

public class ReportCard {
    /**
     * All grade declared as global variable and private that mean they can be accessed
     * only within class or througt gettter or setters methods
     */
    private int mGradeMath;
    private int mGradeLogique;
    private int mGradeJava;
    private int mGradeAlgebra;
    private int mGradePhysique;
    private int mGradeDataStructure;
    private String Name="No name provided";
    private String ID;
    private static final int N_SUBJECTS=6;


    /**
     * Constructor for reportCard class
     */
    public ReportCard(int Math,int Logique,int Java,int Algebra,int Physique,int DataS) {
        this.mGradeMath=Math;
        this.mGradeLogique=Logique;
        this.mGradeJava=Java;
        this.mGradeAlgebra=Algebra;
        this.mGradePhysique=Physique;
        this.mGradeDataStructure=DataS;
    }
    /**
     * @return the current number of Math grades.
     */
    public int getMgradesMath(){
        return this.mGradeMath;
    }

    /**
     *Set the MathGrade
     */
    public void setMgradesMath(int math){this.mGradeMath=math;}


    /**
     * @return the current number of LogiqueGrades
     */
    public int getMgradesLogique(){
        return this.mGradeLogique;
    }

    /**
     *Set the logiqueGrade
     */
    public void setMgradesLogique(int logique){this.mGradeLogique=logique;}

    /**
     * @return the current number of JavaGrades
     */
    public int getMgradesJava(){
        return this.mGradeJava;
    }

    /**
     *Set the logiqueGrade
     */
    public void setMgradesJava(int java){this.mGradeJava=java;}


    /**
     * @return the current number of AlgebraGrades.
     */
    public int getMgradesAlgebra(){
        return this.mGradeAlgebra;
    }

    /**
     *Set  algebraGrade
     */
    public void setMgradesAlgebra(int algebra){this.mGradeAlgebra=algebra;}


    /**
     * @return the current number of PhysiqueGrades.
     */
    public int getMgradesPhysique(){
        return this.mGradePhysique;
    }

    /**
     *Set physiqueGrade
     */
    public void setMgradesPhysique(int physique){this.mGradePhysique=physique;}


    /**
     * @return the current number of DataStructureGrade .
     */
    public int getMgradesDataSructure(){
        return this.mGradeDataStructure;
    }

    /**
     *Set dataStrucure Grade
     */
    public void getMgradesDataSructure(int datas){this.mGradeDataStructure=datas;}


    /**
     *Set name student
     */
    public void setName(String name){
        this.Name=name;
    }


    /**
     * @return the current Name of the Student
     */
    public String getName(){
        return this.Name;
    }


    /**
     * Set the ID;
     */
    public void setId(String id){this.ID=id;}

    /**
     * @return the current ID
     */
    public String getId(){
        return this.ID;
    }


    /**
     * @return the current number of subjects/grades.
     */
    private int computeAverage(){
        int total=0;
        total=(mGradeMath+mGradeLogique+mGradeJava+mGradeAlgebra+mGradePhysique+mGradeDataStructure)/N_SUBJECTS;
        return total;
    }


    /**
     * Get the grade of the student
     * @return grade, according to the average grade got
     */
    public char getGrade(){
        if(computeAverage()>=9){
            return 'A';
        }else if(computeAverage()>=8){
            return 'B';
        }else if(computeAverage()>=7){
            return 'C';
        }else if(computeAverage()>=6) {
            return'D';
        }else {return 'F';}
    }


    /**
     * Return data of all variable of the class
     * @return String
     */
    @Override
    public String toString() {
        return  "Student's Name: " + Name + "\n" +
                "ID: " + ID + "\n" +
                "Physics: " + mGradePhysique+ "\n" +
                "Logique:"+mGradeLogique + "\n" +
                "Math: " + mGradeMath + "\n" +
                "DataStructure: " + mGradeDataStructure + "\n" +
                "Algebra: " + mGradeAlgebra+ "\n" +
                "Logique:"+mGradeJava + "\n" +
                "Average: " + computeAverage() + "\n" +
                "DataStructure: " + getGrade();
    }
}