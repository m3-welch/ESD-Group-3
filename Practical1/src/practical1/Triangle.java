/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

/**
 *
 * @author sam
 */
public class Triangle {
    int sides = 3;
    double lSide1;
    double lSide2;
    double lSide3;
    
    public double getSide1(){
        return lSide1;
    }
    public void setSide1(double newL){
        this.lSide1 = newL;
    }
    
    public double getSide2(){
        return lSide2;
    }
    public void setSide2(double newL){
        this.lSide2 = newL;
    }
    
    public double getSide3(){
        return lSide3;
    }
    public void setSide3(double newL){
        this.lSide3 = newL;
    }
    
    private boolean validate() {
        if (
                (this.lSide1 + this.lSide2 > this.lSide3)
                && (this.lSide2 + this.lSide3 > this.lSide1) 
                && (this.lSide1 + this.lSide3 > this.lSide2)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String triangleType(double lSide1, double lSide2, double lSide3){
        String type = "Unknown";
        
        if ((lSide1 == lSide2) && (lSide2 == lSide3) && (lSide1 == lSide3)) {
            type = "Equilateral";
        } else if ((lSide1 == lSide2) || (lSide2 == lSide3) || (lSide1 == lSide3)) {
            type = "Isoscoles";
        } else {
            type = "Scalene";
        }

        if (!this.validate()) {
            type = "Invalid";
        }
        
        return type;
    }
    
}
