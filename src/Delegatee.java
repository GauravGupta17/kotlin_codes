/*public class Delegateex{
    public static void main(String[] args) {

         Employee e = new Employee(new FastCoder(),new GoodDesigner());

         e.code();
         e.design();

    }



}

interface WhoCanCode{

    void code();
}

interface WhoCanDesign{

    void design();
}

class Employee implements WhoCanDesign,WhoCanCode{

     WhoCanCode coder;
     WhoCanDesign design;

    public Employee(WhoCanCode coder, WhoCanDesign design) {
        this.coder = coder;
        this.design = design;
    }

    @Override
    public void code(){
       coder.code();
    }

    @Override
    public void design(){
      design.design();

    }


}
class FastCoder implements WhoCanCode{


    @Override
    public void code() {

System.out.println("coding");
    }
}
class GoodDesigner implements WhoCanDesign{

    @Override
    public void design() {
System.out.println("Design by Good Design");
    }
}
*/