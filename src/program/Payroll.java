package entities;

public class Payroll {
    public static void main(String[] args){

        System.out.println("Hello, World!");
        Employee[] employers = new Employee[3];
        employers[0] = new HourlyEmployee("shuva", "danziger",222454, 6, 10 );
        // String firstName, String lastName, int id, float grossSales, int commision
        employers[1] = new CommissionEmployee("noa", "fridman", 222455, 8, 150);
        employers[2] = new BasePlusCommissionEmployee("nognog", "ilan", 222456, 9, 151, 89);
        for(int i = 0; i <3; i++)
        {
            System.out.println("name" + employers[i].getFirstName() + "Lname" + employers[i].getLastName() + "Id" + employers[i].getId() + "earninces" +employers[i].earnings() );
        }

    }


}
