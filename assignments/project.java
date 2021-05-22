class project {
    public static void main(String args[])
    {
        int x=0,y=0,z=0,p=0,index=0;
        String name="",des="",dep="",date="";
        char c;

        int empno[]={1001,1002,1003,1004,1005,1006,1007};
        String empname[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
        String joindate[]={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/12/2006"};
        char designation_code[]={'e','c','k','r','m','e','c'};
        String department[]={"R&D","PM","Acct","Front Desk","Engg","Manfacturing","PM"};
        int basic[]={20000,30000,10000,12000,50000,23000,29000};
        int hra[]={8000,12000,8000,6000,20000,9000,12000};
        int it[]={3000,9000,1000,2000,20000,4400,10000};
        String designation[]={"Engineer","Consultant","Clerk","Receiptionist","Manager"};
        int da[]={20000,32000,12000,15000,40000};
        int a=Integer.parseInt(args[0]);
        for(int i=0;i<7;i++)
        {
            if(empno[i]==a)
            {
                index=i;
                p=1;
                break;
            }
        }
        if(p==0)
        {
            System.out.println("There is no employee with empid: "+a);
        }
        else
        {
            name=empname[index];
            dep=department[index];
            c=designation_code[index];
            switch(c)
            {
                case 'e':des=designation[0];
                          y=basic[index]+hra[index]+da[0]-it[index];
                        break;
                case 'c': des=designation[1];
                          y=basic[index]+hra[index]+da[1]-it[index];
                           break;
                case 'k': des=designation[2];
                          y=basic[index]+hra[index]+da[2]-it[index];
                           break;
                case 'r': des=designation[3];
                          y=basic[index]+hra[index]+da[3]-it[index];
                           break;
                case 'm': des=designation[4];
                          y=basic[index]+hra[index]+da[4]-it[index];
                           break;
            }
            System.out.println("Emp No.\t\t\t Emp Name \t\t\t Department \t\t\t Designation \t\t\t Salary");
            System.out.println(a+" \t\t\t\t "+name+"\t\t\t \t"+dep+"\t\t\t \t "+des+"  \t\t\t "+y);

        
        }

    }    
}
