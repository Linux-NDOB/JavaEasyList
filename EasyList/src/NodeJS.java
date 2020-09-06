import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class NodeJS {

        public static void main (String[] args){

            try{


                int Option,Exit;

               List main = new List();

                do {

                    UIManager.put("OptionPane.messageFont", new Font("Montserrat", Font.BOLD, 14));
                    UIManager.put("OptionPane.buttonFont", new Font("Montserrat", Font.PLAIN, 12));
                    //rgb(0,150,136)
                    //rgb(120,144,156)
                    UIManager UI=new UIManager();
                    UIManager.put("OptionPane.background",new ColorUIResource(0,150,136));
                    UIManager.put("Panel.background",new ColorUIResource(238,238,238));



                    Option=Integer.parseInt(JOptionPane.showInputDialog(

                            "     ----------------Main Menu----------------\n"+"\n"+

                                    "1. Add at the beginning  \n"+"\n"+

                                    "2. Add at the end	\n"+"\n"+

                                    "3. Search by id.  \n"+"\n"+

                                    "4. Show all sorted by id." +  "\n"+"\n"+

                                    "5. Delete by id  \n"+"\n"+

                                    "6. Show average of ibm, hemoglobine and glucose \n"+"\n"+

                                    "7. Invert List \n"+"\n"+

                                    "8. Exit.\n"+"\n"+

                                    " Please enter an option : "));


                    switch(Option){
                        case 1:

                            try{

                                main.setAddBegin();

                            }catch(NegativeArraySizeException a){

                                JOptionPane.showMessageDialog(null, "DO NOT INSERT NEGATIVE NUMBERS "
                                        + "FOR THE ARRAY LENGHT");

                            }catch(NumberFormatException b){

                                JOptionPane.showMessageDialog(null, " DO NOT INSERT LETTERS,SIGNS \n"
                                        + " OR AN EXAGGERATED AMOUNT OF  \n"
                                        + " NUMBERS IN THE ARRAY PLEASE ");
                            }catch(NullPointerException d){

                                d.printStackTrace();

                                JOptionPane.showMessageDialog(null, "please be logic ");
                            }

                            break;

                        case 2:

                                main.setAddEnd();

                            break;

                        case 3:


                                try{

                                   int  id =Integer.parseInt(JOptionPane.showInputDialog(
                                            "Enter the id to search: "));
                                    main.getSeeInfo(id);

                                } catch(NumberFormatException b){
                                    JOptionPane.showMessageDialog(null, "DO NOT INSERT LETERS, SIGNS\n"
                                            + "OR EXAGGERATE AMOUNT OF NUMBERS \n"
                                            +" IN THE LICENSE PLATE PLEASE");
                                }

                            break;

                        case 4:

                                try{

                                    main.setSortAsc();
                                    main.getSeeAll();

                                }catch(ArrayIndexOutOfBoundsException c){
                                    JOptionPane.showMessageDialog(null,"Please dont do it");
                                }

                            break;

                        case 5:


                                try{

                                    int  id =Integer.parseInt(JOptionPane.showInputDialog(
                                            "Enter the id to Delete: "));
                                    main.setDeleteNode(id);



                                }catch(ArrayIndexOutOfBoundsException c){
                                    JOptionPane.showMessageDialog(null,"Please be logic");
                                }

                            break;

                        case 6:


                            try{

                              main.Average();



                            }catch(ArrayIndexOutOfBoundsException c){
                                JOptionPane.showMessageDialog(null,"Please be logic");
                            }

                            break;

                        case 7:


                            try{

                               main.setInvert();
                               main.getSeeAll();



                            }catch(ArrayIndexOutOfBoundsException c){
                                JOptionPane.showMessageDialog(null,"Please be logic");
                            }

                            break;

                        case 8:
                            Exit=JOptionPane.showConfirmDialog(null, "¿Do you want to exit from the Menu?");
                            if (Exit==0) {


                                break;
                            }
                        default:

                            JOptionPane.showMessageDialog(null, "Non valid option ");

                            break;

                    }


                }while (Option != 8);


                System.exit(0);


            } catch(NumberFormatException a){

                JOptionPane.showMessageDialog(null, "BE LOGIC PLEASE");


            }
        }
    }


