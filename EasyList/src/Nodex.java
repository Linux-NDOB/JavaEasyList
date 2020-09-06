import javax.swing.*;
//ID PACIENTE - NOMBRE – EPS – GENERO - FECHA DE NACIMIENTO – PESO – ESTATURA -NIVELES DE GLUCOSA Y HEMOGLOBINA.

public class Nodex {

    public int id;
    public String name;
    public String  eps;
    public String gender;
    public int day;
    public int month;
    public int year;
    public int weight;
    public int height;
    public int glucose;
    public float hemoglobine;

    Nodex js;

    //body mass index
    public float bmi;

    public Nodex(int id, String name, String eps,
                 String gender, int day, int month,
                 int year, int weight, int height,
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

        info += "ID: "+ id +"\n";

        info += "Name: "+ name +"\n";

        info += "EPS: "+ eps +"\n";

        info += "Gender: "+ gender +"\n";

        info += "Patient born information: "+ eps +"\n";

        info += "Day: "+ day +"\n";

        info += "Month: "+ month +"\n";

        info += "Year: "+ year +"\n";

        info += "Age: "+ age +"\n";

        info += "Weight: "+ weight +"\n";

        info += "Height: "+ height +"\n";

         if ((glucose >= 75)&&(glucose <= 100))
             info += "Glucose: "+ glucose + "Optimo" + "\n";

         else if ((glucose > 100) && (glucose <= 125))
             info += "Glucose: "+ glucose + "PreDiabetes" + "\n";

         else if (glucose > 125)
             info += "Glucose: " + glucose + "Diabetes" + "\n";


        if ((gender.equals("M") && (hemoglobine < 13)))
            info += "Hemoglobine: "+ hemoglobine + "Bajo" + "\n";

        else if ((gender.equals("M") && (hemoglobine > 13 && hemoglobine <17)))
            info += "Hemogloibe: "+ hemoglobine + "Optimo" + "\n";

        else if(gender.equals("M") && (hemoglobine > 17))
            info += "Hemogloibe: "+ hemoglobine + "Alto" + "\n";

        if ((gender.equals("F") && (hemoglobine < 12)))
            info += "Hemoglobine: "+ hemoglobine + "Bajo" + "\n";

        else if ((gender.equals("F") && (hemoglobine > 12 && hemoglobine <15)))
            info += "Hemogloibe: "+ hemoglobine + "Optimo" + "\n";

        else if(gender.equals("F") && (hemoglobine > 15))
            info += "Hemogloibe: "+ hemoglobine + "Alto" + "\n";


        if (bmi >15 && bmi<=18.4)

            info += "BMI: "+ bmi +"Weight Insuficiente"+"\n";

        else if (bmi >= 18.5 && bmi <=24.9)

            info += "BMI: "+ bmi +"Peso normal"+"\n";

        else  if (bmi >= 25 && bmi <= 29.9)
            info += "BMI: "+ bmi +"SobrePeso"+"\n";

        else  if (bmi >= 30 && bmi <= 39.9)
            info += "BMI: "+ bmi +"Obesidad clinica"+"\n";

        else  if (bmi >= 40 && bmi <= 49.9)
            info += "BMI: "+ bmi +"Obesidad Mordiba"+"\n";

        else  if (bmi >= 50 && bmi <= 59.9)
            info += "BMI: "+ bmi +"Super obesidad mordiba"+"\n";

        else  if (bmi >= 60 && bmi <= 64.9)
            info += "BMI: "+ bmi +"Super super obesidad "+"\n";

        else  if (bmi > 65)
            info += "BMI: "+ bmi +"Triple obesidad"+"\n";



        JOptionPane.showMessageDialog(null, info);
    }


}
