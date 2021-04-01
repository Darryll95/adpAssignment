/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpgroupassignment;

/**
 *
 * @author User
 */
public class Numbers {
     private int num1, num2, num3;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    @Override
    public String toString() {
        return "Numbers{" + "num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + '}';
    }
    
}


