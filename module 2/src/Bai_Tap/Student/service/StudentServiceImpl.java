package Bai_Tap.Student.service;

import Bai_Tap.Student.model.Student;
import  Bai_Tap.Student.service.StudentService;

public class StudentServiceImpl extends StudentService {
    private static Student[] studentsList = new Student[3];


    static {
        studentsList[0] = new Student("SV001","ngoc",
                "27/06/97","Nu","C10","fulltime");
        studentsList[1] = new Student("SV002","xiu",
                "29/06/97","Nu","C10","fulltime");
        studentsList[2] = new Student("SV003","koi",
                "31/06/97","Nu","C10","fulltime");
    }

    @Override
    public void add(Student student) {
        Student[] studentListNew = new Student[studentsList.length + 1];
        studentListNew[studentListNew.length - 1] = student;
        for(int i = 0; i < studentsList.length; i++) {
            studentListNew[i] = studentsList[i];
        }
        studentsList = studentListNew;
    }

    @Override
    public void remove(int p) {

        if( p >= studentsList.length || p < 0) return;
        Student[] studentsListNew = new Student[studentsList.length-1];

        for(int i = 0; i < studentsList.length; i++) {
            if(i != p ) {
                studentsListNew[i] = studentsList[i];
            }
        }
        studentsList = studentsListNew;
    }

    @Override
    public void remove(String mssv) {
        int p;
        for(p = 0; p < studentsList.length; p++) {
            if(studentsList[p].getMSSV().equals( mssv)) {
                break;
            }
        }
        if(p == studentsList.length) return;

        Student[] studentsListNew = new Student[studentsList.length-1];
        int j = 0;
        for(int i = 0; i < studentsList.length; i++) {
            if(i != p ) {
                studentsListNew[j] = studentsList[i];
                j++;
            }
        }
        studentsList = studentsListNew;
    }

    @Override
    public int Search(String s) {
        int p;
        for(p = 0; p < studentsList.length; p++) {
            if(studentsList[p].getMSSV() == s) {
                break;
            }
        }
        if(p < studentsList.length) return p;

        for(p = 0; p < studentsList.length; p++) {
            if(studentsList[p].getName() == s) {
                break;
            }
        }
        if(p < studentsList.length) return p;

        return -1;
    }

    @Override
    public Student[] findAll() {
        return studentsList;
    }
}
