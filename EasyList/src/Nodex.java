import javax.swing.*;

public class Nodex {

    public int id;
    public String name;
    public String  eps;
    public String gender;
    public int day;
    public int month;
    public int year;
    public float weight;
    public float height;
    public int glucose;
    public float hemoglobine;
    //body mass index
    public float bmi;

    Nodex js;

    public Nodex(int id, String name, String eps,
                 String gender, int day, int month,
                 int year, float weight, float height,
                 int glucose, float hemoglobine , float bmi) {

        this.id = id;
        this.name = name;
        this.eps = eps;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.weight = weight;
        this.height = height;
        this.glucose = glucose;
        this.hemoglobine = hemoglobine;
        this.bmi = bmi;
        js = null;

    }


    public void getseeNode(){

        int age;

        age = ((year-2020)*-1);

        String info="The patient information is: \n";

        info += "Patient Id: "+ id +"\n";

        info += "Patient name: "+ name +"\n";

        info += "Patient health provider: "+ eps +"\n";

        info += "Patient Gender: "+ gender +"\n";

        info += "Patient birth information: "+ eps +"\n";

        info += "Patient birthDay: "+ day +"\n";

        info += "Patient birthMonth: "+ month +"\n";

        info += "Patient birthYear: "+ year +"\n";

        info += "Patient current Age: "+ age +"\n";

        info += "Patient Weight: "+ weight +"\n";

        info += "Patient Height: "+ height +"\n";

         if ((glucose >= 75)&&(glucose <= 100))
             info += "Glucose: "+ glucose +"g/dl"+ "Optimum" + "\n";

         else if ((glucose > 100) && (glucose <= 125))
             info += "Glucose: "+ glucose+"g/dl" + "PreDiabetes" + "\n";

         else if (glucose > 125)
             info += "Glucose: " + glucose+"g/dl" + "Diabetes" + "\n";


        if ((gender.equals("M") && (hemoglobine < 13)))
            info += "Hemoglobin: "+ hemoglobine+"g/dl" + "low level" + "\n";

        else if ((gender.equals("M") && (hemoglobine > 13 && hemoglobine <=17)))
            info += "Hemoglobin: "+ hemoglobine+"g/dl" + "Optimum level" + "\n";

        else if(gender.equals("M") && (hemoglobine > 17))
            info += "Hemoglobin: "+ hemoglobine+"g/dl" + "high level" + "\n";

        if ((gender.equals("F") && (hemoglobine < 12)))
            info += "Hemoglobin: "+ hemoglobine +"g/dl"+ "low level" + "\n";

        else if ((gender.equals("F") && (hemoglobine > 12 && hemoglobine <=15)))
            info += "Hemoglobin: "+ hemoglobine +"g/dl"+ "Optimum level" + "\n";

        else if(gender.equals("F") && (hemoglobine > 15))
            info += "Hemoglobin: "+ hemoglobine +"g/dl"+ "high level" + "\n";


        if (bmi >15 && bmi<=18.4)

            info += "BMI: "+ bmi+"Kg/m²"  +"Insufficient Weight "+"\n";

        else if (bmi >= 18.5 && bmi <=24.9)

            info += "BMI: "+ bmi+"Kg/m²"  +" normal weight"+"\n";

        else  if (bmi >= 25 && bmi <= 29.9)
            info += "BMI: "+ bmi +"Kg/m²" +" Overweight"+"\n";

        else  if (bmi >= 30 && bmi <= 39.9)
            info += "BMI: "+ bmi +"Kg/m²" +" Clinical Obesity"+"\n";

        else  if (bmi >= 40 && bmi <= 49.9)
            info += "BMI: "+ bmi+"Kg/m²"  +"Morbid Obesity"+"\n";

        else  if (bmi >= 50 && bmi <= 59.9)
            info += "BMI: "+ bmi+"Kg/m²" +"Super  morbid obesity"+"\n";

        else  if (bmi >= 60 && bmi <= 64.9)
            info += "BMI: "+ bmi+"Kg/m²" +"Super super obesity "+"\n";

        else  if (bmi > 65)
            info += "BMI: "+ bmi+"Kg/m²" +"Triple obesity"+"\n";

        JOptionPane.showMessageDialog(null, info);
    }


}
