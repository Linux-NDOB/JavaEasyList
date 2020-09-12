import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class NodeJS {

        public static void main (String[] args){

            try{


                int Option,Exit;
                String kali;

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

                                    "1. Add at the beginning or at the end \n"+"\n"+

                                    "2. Search by id.  \n"+"\n"+

                                    "4. Show all sorted by id." +  "\n"+"\n"+

                                    "5. Delete by id  \n"+"\n"+

                                    "6. Show average of ibm, hemoglobine and glucose \n"+"\n"+

                                    "7. Invert List \n"+"\n"+

                                    "8. Exit.\n"+"\n"+

                                    " Please enter an option : "));


                    switch(Option){
                        case 1:

                            try{
                                Object[] tyAdd = new Object[]{"Beginning","End"};

                                Object xAdd = JOptionPane.showInputDialog(null,
                                        "Please choose at the beginbing or at the end",
                                        "Gender Selection",
                                        JOptionPane.QUESTION_MESSAGE,null,tyAdd ,tyAdd[0]);

                                kali = xAdd.toString();

                                if (kali.equals("Beginning"))

                                main.setAddBegin();

                                else
                                     if (kali.equals("End"));

                                main.setAddEnd();


                            }catch(NullPointerException d){

                                d.printStackTrace();

                                JOptionPane.showMessageDialog(null, "please be logic ");
                            }

                            break;


                        case 2:


                                try{

                                   int  id =Integer.parseInt(JOptionPane.showInputDialog(
                                            "Enter the id to search: "));
                                    main.getSeeInfo(id);

                                } catch(NumberFormatException b){
                                    JOptionPane.showMessageDialog(null, "DO NOT INSERT LETERS, SIGNS\n"
                                            + "OR EXAGGERATE AMOUNT OF NUMBERS \n"
                                            +" IN THE LICENSE PLATE PLEASE");
                                }catch(NullPointerException d){

                                    d.printStackTrace();

                                    JOptionPane.showMessageDialog(null, "please be logic ");
                                }

                            break;

                        case 3:

                                try{

                                    main.setSortAsc();
                                    main.getSeeAll();

                                }catch(ArrayIndexOutOfBoundsException c){
                                    JOptionPane.showMessageDialog(null,"Please dont do it");
                                }

                            break;

                        case 4:


                                try{

                                    int  id =Integer.parseInt(JOptionPane.showInputDialog(
                                            "Enter the id to Delete: "));
                                    main.setDeleteNode(id);



                                }catch(ArrayIndexOutOfBoundsException c){
                                    JOptionPane.showMessageDialog(null,"Please be logic");
                                }

                            break;

                        case 5:

                              main.Average();

                            break;

                        case 6:


                            try{

                               main.setInvert();
                               main.getSeeAll();



                            }catch(ArrayIndexOutOfBoundsException c){
                                JOptionPane.showMessageDialog(null,"Please be logic");
                            }

                            break;

                        case 7:
                            Exit=JOptionPane.showConfirmDialog(null, "¿Do you want to exit from the Menu?");
                            if (Exit==0) {


                                break;
                            }
                        default:

                            JOptionPane.showMessageDialog(null, "Non valid option ");

                            break;

                    }


                }while (Option != 7);


                System.exit(0);


            } catch(NumberFormatException a){

                JOptionPane.showMessageDialog(null, "BE LOGIC PLEASE");


            }
        }
    }


