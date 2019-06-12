/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytasks;

/**
 *
 * @author 92019304
 */
public class ArrayTasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String[] studentGrades;
        studentGrades = new String[5];
        
        studentGrades[0] = "A";
        studentGrades[1] = "B";
        studentGrades[2] = "D";
        studentGrades[3] = "F";
        
        for (String studentGrade : studentGrades) {
            System.out.println(studentGrade);
        }
    }    
}
