import javax.swing.*;

public class List {

    //Attribute
    Nodex header;

    //Constructor method: Creates the list.
    public List(){ header=null; }

    //Determinate the amount of elements of the list
    public int getLonglist(){
        
        int cont=0;
        
        Nodex p=header;
        
        if(header==null)
            
            return 0;
        
        else{
            
            while(p!=null){
                
                cont++;
                p=p.js;
            }
            
            return cont;
        }
    }

    //Este método retorna un apuntador donde se encuentre
    //un código de producto dado.
    public Nodex getSearchId(int id){

        Nodex buscar=null;

        if(header==null)

            return null;

        else{

            buscar=header;
            while(buscar!=null){
                if( buscar.id == id )
                    return buscar;
                buscar = buscar.js;

            }
            return null;
        }
    }

    public Nodex getCreateNode(){

        int id;
        String name;
        String  eps;
        String gender;
        int day = 0;
        int month;
        int year;
        int weight;
        int height;
        int h2;
        int glucose;
        float hemoglobine;


        Nodex b=null;

        do{

            id = Integer.parseInt(JOptionPane.showInputDialog(
                    "Enter the patient id: "));
            b=getSearchId(id);

            if(b!=null)

                JOptionPane.showMessageDialog(null,
                        "The code exists ,ty again!");


        }while(b!=null);

        name = JOptionPane.showInputDialog("Enter the patient name: ");

        eps = JOptionPane.showInputDialog("Enter the patient eps: ");

        Object[] tyGender = new Object[]{"M","F"};

        Object xGender = JOptionPane.showInputDialog(null,
                "Please choose the employee gender",
                "Gender Selection",
                JOptionPane.QUESTION_MESSAGE,null,tyGender ,tyGender[0]);

        gender = xGender.toString();

        if (gender.equals("M"))


        day = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the patient birthday"));

        month = Integer.parseInt(JOptionPane.showInputDialog("Please enter the patient birthmonth"));

        year = Integer.parseInt(JOptionPane.showInputDialog("Please enter the patient birthyear"));

        weight = Integer.parseInt(JOptionPane.showInputDialog("Please enter the patient weight"));

        height = Integer.parseInt(JOptionPane.showInputDialog("Please enter the patient height"));

        glucose = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the glucose leve"));

        hemoglobine = Float.parseFloat(JOptionPane.showInputDialog(null,
                "Please enter the patient hemoglobine level "));

        h2 = (height* height);

       float bmi = (float)(weight / (h2));

        Nodex info = new Nodex(id, name, eps, gender , day , month , year , weight ,height , glucose , hemoglobine ,bmi);

        return info;
    }

    public void setAddBegin(){

        Nodex info = getCreateNode();

        if(header==null){

            header=info;
            JOptionPane.showMessageDialog(null,
                    "New element added, the list was empty");

        }else{

            info.js = header;
            header = info;
            JOptionPane.showMessageDialog(null,
                    "Element added at the begin of the list");


        }
    }

    public void setAddEnd(){

        Nodex info=getCreateNode();
        Nodex p=null;

        if(header==null){

            header=info;
            JOptionPane.showMessageDialog(null,
                    "Element added , the list was empty!");

        }else{

            p=header;
            while(p.js!=null)
                p=p.js;
            p.js=info;
            JOptionPane.showMessageDialog(null,
                    "Element added at the end of the list!");

        }
    }

    public boolean getIsEmpty(){

        return header==null?true:false;

    }

    public void getSeeAll(){

        Nodex p=null;

        if(getIsEmpty())

            JOptionPane.showMessageDialog(null,
                    "The list is empty!");

        else{

            p=header;
            while(p!=null){
                p.getseeNode();
                p=p.js;

            }

            JOptionPane.showMessageDialog(null,
                    "All the elements of the list has been shown, "
                            + "The list has : "+ getLonglist()+" elements.");

        }
    }

    public void getSeeInfo(int id){

        if(header==null)

            JOptionPane.showMessageDialog(null,
                    "La lista esta vacía!!!");

        else{

            Nodex p=getSearchId(id);
            if(p==null)
                JOptionPane.showMessageDialog(null,
                        "The element does not exist!");
            else
                p.getseeNode();

        }
    }

    //Este método retonar un nodo apuntando detrás de p.
    public Nodex getBack(Nodex p){

       Nodex  q=header;
        while(q.js!=p)
            q=q.js;
        return q;

    }

    public void setDeleteNode(int id){

        if(getIsEmpty())

            JOptionPane.showMessageDialog(null,
                    "Nothing to delete, the list is empty!");

        else{

            Nodex q=null;

            Nodex p=getSearchId(id);

            if(p==null)

                JOptionPane.showMessageDialog(null,
                        "Nothing to delete!");

            else{

                if((p==header)&&(header.js==null)){

                    header=null;

                    JOptionPane.showMessageDialog(null,
                            "Just was one element on the list,"
                                    + " the list is empty!!");

                }

                else if((header.js != null) && ( p==header )){

                    header=header.js;

                    p.js=null;

                    p=null;

                    JOptionPane.showMessageDialog(null,
                            "Element deleted at the beginning of the list!!");

                }
                else if(p.js==null){

                    q=getBack(p);
                    q.js=null;
                    p=null;

                    JOptionPane.showMessageDialog(null,
                            "Element deleted at the end of the list!!");

                }else{

                    q=getBack(p);
                    q.js=p.js;
                    p.js=null;
                    p=null;

                    JOptionPane.showMessageDialog(null,
                            "Element deleted between two nodes!!");


                }
            }
        }
    }

    void setSortAsc(){

        if(header==null)

            JOptionPane.showMessageDialog(null,
                    "Empty list, impossible sort it.");

        else{

            Nodex p, q, temp=null;

            p=header;

            while(p!=null){

                q=header;

                while(q.js != null){

                    if((q.id)>(q.js.id)){

                        //Copio la información del menor que esta en el nodo
                        //al que apunta q
                        temp=new Nodex(q.id, q.name, q.eps , q.gender , q.day , q.month , q.year ,
                                       q.weight , q.height , q.glucose
                                       , q.hemoglobine , q.bmi);
                        //Asigno a q la información del mayor
                        //al que apunta q.sig
                        q.id = q.js.id;
                        q.name = q.js.name;
                        q.eps = q.js.eps;
                        q.gender = q.js.gender;
                        q.day = q.js.day;
                        q.month = q.js.month;
                        q.year= q.js.year;
                        q.weight = q.js.weight;
                        q.height = q.js.height;
                        q.glucose = q.js.glucose;
                        q.hemoglobine = q.js.hemoglobine;
                        q.bmi = q.js.bmi;

                        //Ahorar asignamos a q.sig la información
                        //del menor que estaba en q y que almacenamos en temp
                        q.js.id = temp.id;
                        q.js.name = temp.name;
                        q.js.eps = temp.eps;
                        q.js.gender = temp.gender;
                        q.js.day = temp.day;
                        q.js.month = temp.month;
                        q.js.year = temp.year;
                        q.js.weight = temp.weight;
                        q.js.height = temp.height;
                        q.js.glucose = temp.glucose;
                        q.js.hemoglobine = temp.hemoglobine;
                        q.js.bmi = temp.bmi;

                    }
                    q=q.js;
                }
                p=p.js;
            }
            JOptionPane.showMessageDialog(null, "List sorted in asc order by id!");
        }
    }

    void setInvert(){

        Nodex aux, p;

        aux=p=null;

        if(header==null)

            JOptionPane.showMessageDialog(null,
                    "Lista vacia!");

        else if( header.js == null )

            JOptionPane.showMessageDialog(null,
                    "Impossible, the list has just one element!");

        else{
            while(header != null){

                if(header.js != null){

                    p=header;
                    header=header.js;
                    p.js=null;

                }
                else{

                    p=header;
                    header=null;

                }

                if(aux==null)
                    aux=p;
                else{
                    p.js=aux;
                    aux=p;

                }
            }
            header=aux;
            JOptionPane.showMessageDialog(null,
                    "The list has been inverted!");
        }
    }

    float getSumIbm(){

        float sum=0;

        if(header==null)
            return 0;
        else{
            Nodex p=header;
            while(p!=null){
                sum+=p.bmi;
                p=p.js;
            }
            return sum;
        }
    }

    float getIbmAverage(){

        if (header==null)
            return 0;

        else{

            float sum=getSumIbm();
            float n=(float) getLonglist();
            return (sum/n);

        }
    }

    float getSumGlucose(){

        float sum=0;

        if(header==null)
            return 0;
        else{
            Nodex p=header;
            while(p!=null){
                sum+=p.glucose;
                p=p.js;
            }
            return sum;
        }
    }

    float getGlucoseAverage(){

        if (header==null)
            return 0;

        else{

            float sum=getSumGlucose();
            float n=(float) getLonglist();
            return (sum/n);

        }
    }

    float getSumHemoglobine(){

        float sum=0;

        if(header==null)
            return 0;
        else{
            Nodex p=header;
            while(p!=null){
                sum+=p.hemoglobine;
                p=p.js;
            }
            return sum;
        }
    }

    float getHemoglobineAverage(){

        if (header==null)
            return 0;

        else{

            float sum=getSumHemoglobine();
            float n=(float) getLonglist();
            return (sum/n);

        }
    }

    public  void Average(){


        JOptionPane.showMessageDialog(null, "Te average of ibm is: " + getIbmAverage() + "\n" +
                                    "Te average of glucose is: " + getGlucoseAverage() + "\n" +
                                    "Te average of hemoglobine is: " + getHemoglobineAverage());
    }
}
